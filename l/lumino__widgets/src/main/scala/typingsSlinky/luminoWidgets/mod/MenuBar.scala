package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.menubarMod.MenuBar.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object MenuBar {
  
  /**
    * The default implementation of `IRenderer`.
    *
    * #### Notes
    * Subclasses are free to reimplement rendering methods as needed.
    */
  @JSImport("@lumino/widgets", "MenuBar.Renderer")
  @js.native
  /**
    * Construct a new renderer.
    */
  class Renderer ()
    extends typingsSlinky.luminoWidgets.menubarMod.MenuBar.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "MenuBar.defaultRenderer")
  @js.native
  val defaultRenderer: typingsSlinky.luminoWidgets.menubarMod.MenuBar.Renderer = js.native
}
