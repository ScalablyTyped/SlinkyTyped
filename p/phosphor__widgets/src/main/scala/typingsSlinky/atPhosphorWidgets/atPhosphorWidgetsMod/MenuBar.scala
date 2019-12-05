package typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod

import typingsSlinky.atPhosphorWidgets.libMenubarMod.MenuBar.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "MenuBar")
@js.native
/**
  * Construct a new menu bar.
  *
  * @param options - The options for initializing the menu bar.
  */
class MenuBar ()
  extends typingsSlinky.atPhosphorWidgets.libMenubarMod.MenuBar {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "MenuBar")
@js.native
object MenuBar extends js.Object {
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @js.native
  /**
    * Construct a new renderer.
    */
  class Renderer ()
    extends typingsSlinky.atPhosphorWidgets.libMenubarMod.MenuBar.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typingsSlinky.atPhosphorWidgets.libMenubarMod.MenuBar.Renderer = js.native
}

