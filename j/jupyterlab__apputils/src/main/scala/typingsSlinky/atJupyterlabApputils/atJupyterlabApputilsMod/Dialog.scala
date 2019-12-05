package typingsSlinky.atJupyterlabApputils.atJupyterlabApputilsMod

import typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog.IButton
import typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog.IOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
/**
  * Create a dialog panel instance.
  *
  * @param options - The dialog setup options.
  */
class Dialog[T] ()
  extends typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog[T] {
  def this(options: Partial[IOptions[T]]) = this()
}

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
object Dialog extends js.Object {
  /**
    * The default implementation of a dialog renderer.
    */
  @js.native
  class Renderer ()
    extends typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog.Renderer
  
  /**
    * The default renderer instance.
    */
  val defaultRenderer: typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog.Renderer = js.native
  /**
    * The dialog widget tracker.
    */
  val tracker: typingsSlinky.atJupyterlabApputils.libWidgettrackerMod.WidgetTracker[typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog[js.Any]] = js.native
  /**
    * Create a reject button.
    */
  def cancelButton(): IButton = js.native
  def cancelButton(options: Partial[IButton]): IButton = js.native
  /**
    * Create a button item.
    */
  def createButton(value: Partial[IButton]): IButton = js.native
  /**
    * Disposes all dialog instances.
    *
    * #### Notes
    * This function should only be used in tests or cases where application state
    * may be discarded.
    */
  def flush(): Unit = js.native
  /**
    * Create an accept button.
    */
  def okButton(): IButton = js.native
  def okButton(options: Partial[IButton]): IButton = js.native
  /**
    * Create a warn button.
    */
  def warnButton(): IButton = js.native
  def warnButton(options: Partial[IButton]): IButton = js.native
}

