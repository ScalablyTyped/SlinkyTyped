package typingsSlinky.jupyterlabApputils.mod

import typingsSlinky.jupyterlabApputils.anon.PartialIButton
import typingsSlinky.jupyterlabApputils.anon.ReadonlyIButton
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
/**
  * Create a dialog panel instance.
  *
  * @param options - The dialog setup options.
  */
class Dialog[T] ()
  extends typingsSlinky.jupyterlabApputils.dialogMod.Dialog[T] {
  def this(options: Partial[IOptions[T]]) = this()
}
@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
object Dialog extends js.Object {
  
  /**
    * Create a reject button.
    */
  def cancelButton(): ReadonlyIButton = js.native
  def cancelButton(options: PartialIButton): ReadonlyIButton = js.native
  
  /**
    * Create a button item.
    */
  def createButton(value: PartialIButton): ReadonlyIButton = js.native
  
  /**
    * The default renderer instance.
    */
  val defaultRenderer: typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Renderer = js.native
  
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
  def okButton(): ReadonlyIButton = js.native
  def okButton(options: PartialIButton): ReadonlyIButton = js.native
  
  /**
    * The dialog widget tracker.
    */
  val tracker: typingsSlinky.jupyterlabApputils.widgettrackerMod.WidgetTracker[typingsSlinky.jupyterlabApputils.dialogMod.Dialog[js.Any]] = js.native
  
  /**
    * Create a warn button.
    */
  def warnButton(): ReadonlyIButton = js.native
  def warnButton(options: PartialIButton): ReadonlyIButton = js.native
  
  /**
    * The default implementation of a dialog renderer.
    */
  @js.native
  class Renderer ()
    extends typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Renderer
}
