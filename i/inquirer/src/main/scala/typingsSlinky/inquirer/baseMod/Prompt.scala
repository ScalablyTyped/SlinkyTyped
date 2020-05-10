package typingsSlinky.inquirer.baseMod

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.prompts.PromptBase
import typingsSlinky.inquirer.mod.prompts.PromptEventPipes
import typingsSlinky.inquirer.mod.prompts.PromptOptions
import typingsSlinky.inquirer.mod.prompts.PromptState
import typingsSlinky.node.readlineMod.Interface
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt.
  *
  * @template TQuestion
  * The options for the question.
  */
@js.native
trait Prompt[TQuestion /* <: Question */] extends PromptBase {
  /**
    * Gets or sets an object which contains the answers.
    */
  var answers: Answers = js.native
  /**
    * Gets or sets the options of the prompt.
    */
  var opt: PromptOptions[TQuestion] = js.native
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface = js.native
  /**
    * Gets or sets an object for managing the console-screen.
    */
  var screen: typingsSlinky.inquirer.screenManagerMod.^ = js.native
  /**
    * Runs the prompt.
    *
    * @param callback
    * The callback for resolving the result.
    */
  /* protected */ def _run(callback: js.Function1[/* callback */ js.Any, Unit]): Unit = js.native
  /**
    * Releases all unmanaged resources.
    */
  /* protected */ def close(): Unit = js.native
  /**
    * Generates the question-string.
    *
    * @returns
    * The question-string.
    */
  /* protected */ def getQuestion(): String = js.native
  /**
    * Handles the submit-event.
    *
    * @param observable
    * The observable submit-event flow.
    */
  /* protected */ def handleSubmitEvents[T](observable: Observable_[T]): PromptEventPipes[T] = js.native
  /**
    * Throws an error for a missing param.
    *
    * @param name
    * The name of the missing param.
    */
  /* protected */ def throwParamError(name: String): Unit = js.native
}

object Prompt {
  @scala.inline
  def apply[TQuestion](
    _run: js.Function1[/* callback */ js.Any, Unit] => Unit,
    answers: Answers,
    close: () => Unit,
    getQuestion: () => String,
    handleSubmitEvents: Observable_[js.Any] => PromptEventPipes[js.Any],
    opt: PromptOptions[TQuestion],
    rl: Interface,
    run: () => js.Promise[_],
    screen: typingsSlinky.inquirer.screenManagerMod.^,
    status: PromptState,
    throwParamError: String => Unit
  ): Prompt[TQuestion] = {
    val __obj = js.Dynamic.literal(_run = js.Any.fromFunction1(_run), answers = answers.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), getQuestion = js.Any.fromFunction0(getQuestion), handleSubmitEvents = js.Any.fromFunction1(handleSubmitEvents), opt = opt.asInstanceOf[js.Any], rl = rl.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), screen = screen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwParamError = js.Any.fromFunction1(throwParamError))
    __obj.asInstanceOf[Prompt[TQuestion]]
  }
  @scala.inline
  implicit class PromptOps[Self[tquestion] <: Prompt[tquestion], TQuestion] (val x: Self[TQuestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TQuestion] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TQuestion]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TQuestion] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TQuestion] with Other]
    @scala.inline
    def with_run(value: js.Function1[/* callback */ js.Any, Unit] => Unit): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnswers(value: Answers): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQuestion(value: () => String): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuestion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleSubmitEvents(value: Observable_[js.Any] => PromptEventPipes[js.Any]): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSubmitEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpt(value: PromptOptions[TQuestion]): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRl(value: Interface): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen(value: typingsSlinky.inquirer.screenManagerMod.^): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowParamError(value: String => Unit): Self[TQuestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwParamError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

