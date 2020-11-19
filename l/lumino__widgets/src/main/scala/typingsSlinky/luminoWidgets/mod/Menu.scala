package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "Menu")
@js.native
class Menu protected ()
  extends typingsSlinky.luminoWidgets.menuMod.Menu {
  /**
    * Construct a new menu.
    *
    * @param options - The options for initializing the menu.
    */
  def this(options: IOptions) = this()
}
@JSImport("@lumino/widgets", "Menu")
@js.native
object Menu extends js.Object {
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typingsSlinky.luminoWidgets.menuMod.Menu.Renderer = js.native
  
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
    extends typingsSlinky.luminoWidgets.menuMod.Menu.Renderer
}
