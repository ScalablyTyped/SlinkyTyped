package typingsSlinky.activexLibreoffice.com_.sun.star

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tiledrendering {
  
  /** tiled rendering using a system-specific handle to a window */
  @js.native
  trait XTiledRenderable extends XInterface {
    
    /**
      * paint a tile to a system-specific window
      * @param Parent a system-specific handle to a window.  You must check the machine ID and the process ID. ;  WIN32: HWND. ;  WIN16: HWND. ;   JAVA: global
      * @param nOutputWidth horizontal output parameter measured in pixels.
      * @param nOutputHeight vertical output parameter measured in pixels.
      * @param nTilePosX logical X position of the top left corner of the rendered rectangle, in TWIPs.
      * @param nTilePosY logical Y position of the top left corner of the rendered rectangle, in TWIPs.
      * @param nTileWidth logical width of the rendered rectangle, in TWIPs.
      * @param nTileHeight logical height of the rendered rectangle, in TWIPs.
      * @since LibreOffice 5.0
      */
    def paintTile(
      Parent: js.Any,
      nOutputWidth: Double,
      nOutputHeight: Double,
      nTilePosX: Double,
      nTilePosY: Double,
      nTileWidth: Double,
      nTileHeight: Double
    ): Unit = js.native
  }
  object XTiledRenderable {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      paintTile: (js.Any, Double, Double, Double, Double, Double, Double) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XTiledRenderable = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), paintTile = js.Any.fromFunction7(paintTile), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XTiledRenderable]
    }
    
    @scala.inline
    implicit class XTiledRenderableMutableBuilder[Self <: XTiledRenderable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaintTile(value: (js.Any, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "paintTile", js.Any.fromFunction7(value))
    }
  }
}
