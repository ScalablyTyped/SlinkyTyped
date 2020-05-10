package typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea

import typingsSlinky.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsSlinky.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An output area widget content factory.
  *
  * The content factory is used to create children in a way
  * that can be customized.
  */
@js.native
trait IContentFactory extends js.Object {
  /**
    * Create an output prompt.
    */
  def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create an stdin widget.
    */
  def createStdin(options: typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputPrompt: () => IOutputPrompt,
    createStdin: typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin))
    __obj.asInstanceOf[IContentFactory]
  }
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateOutputPrompt(value: () => IOutputPrompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOutputPrompt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateStdin(value: typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStdin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

