package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `EditorPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait EditorQuestion[T /* <: Answers */] extends Question[T] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_EditorQuestion: editor = js.native
}

object EditorQuestion {
  @scala.inline
  def apply[T](`type`: editor): EditorQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorQuestion[T]]
  }
  @scala.inline
  implicit class EditorQuestionOps[Self[t] <: EditorQuestion[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withType(value: editor): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

