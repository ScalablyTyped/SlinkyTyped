package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.menubarMod.MenuBar.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/widgets", "MenuBar")
@js.native
/**
  * Construct a new menu bar.
  *
  * @param options - The options for initializing the menu bar.
  */
class MenuBar ()
  extends typingsSlinky.luminoWidgets.menubarMod.MenuBar {
  def this(options: IOptions) = this()
}

@JSImport("@lumino/widgets", "MenuBar")
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
    extends typingsSlinky.luminoWidgets.menubarMod.MenuBar.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typingsSlinky.luminoWidgets.menubarMod.MenuBar.Renderer = js.native
}

