package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.tabbarMod.TabBar.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "TabBar")
@js.native
/**
  * Construct a new tab bar.
  *
  * @param options - The options for initializing the tab bar.
  */
class TabBar[T] ()
  extends typingsSlinky.luminoWidgets.tabbarMod.TabBar[T] {
  def this(options: IOptions[T]) = this()
}
@JSImport("@lumino/widgets", "TabBar")
@js.native
object TabBar extends js.Object {
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typingsSlinky.luminoWidgets.tabbarMod.TabBar.Renderer = js.native
  
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
    extends typingsSlinky.luminoWidgets.tabbarMod.TabBar.Renderer
}
