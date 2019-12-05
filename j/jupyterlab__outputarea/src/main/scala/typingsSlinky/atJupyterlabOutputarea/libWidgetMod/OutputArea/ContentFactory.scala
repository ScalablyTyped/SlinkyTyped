package typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea

import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.ContentFactory")
@js.native
class ContentFactory () extends IContentFactory {
  /**
    * Create an output prompt.
    */
  /* CompleteClass */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  override def createStdin(options: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
}

