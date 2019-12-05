package typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea

import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An output area widget content factory.
  *
  * The content factory is used to create children in a way
  * that can be customized.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output prompt.
    */
  def createOutputPrompt(): IOutputPrompt
  /**
    * Create an stdin widget.
    */
  def createStdin(options: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputPrompt: () => IOutputPrompt,
    createStdin: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

