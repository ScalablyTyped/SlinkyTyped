package typingsSlinky.pixiJs.mod

import typingsSlinky.pixiJs.anon.ScaleMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Experimental!
  *
  * Texture pool, used by FilterSystem and plugins
  * Stores collection of temporary pow2 or screen-sized renderTextures
  *
  * If you use custom RenderTexturePool for your filters, you can use methods
  * `getFilterTexture` and `returnFilterTexture` same as in
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "RenderTexturePool")
@js.native
class RenderTexturePool ()
  extends typingsSlinky.pixiJs.PIXI.RenderTexturePool {
  def this(textureOptions: ScaleMode) = this()
}
object RenderTexturePool {
  
  /**
    * Key that is used to store fullscreen renderTextures in a pool
    *
    * @static
    * @const {string}
    */
  /* static member */
  @JSImport("pixi.js", "RenderTexturePool.SCREEN_KEY")
  @js.native
  val SCREEN_KEY: String = js.native
}
