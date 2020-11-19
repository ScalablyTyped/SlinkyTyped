package typingsSlinky.pixiJs.mod

import typingsSlinky.pixiJs.PIXI.ILoaderPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link PIXI.Loader Loader} middleware for loading texture atlases that have been created with
  * TexturePacker or similar JSON-based spritesheet.
  *
  * This middleware automatically generates Texture resources.
  *
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSImport("pixi.js", "SpritesheetLoader")
@js.native
class SpritesheetLoader () extends ILoaderPlugin
/* static members */
@JSImport("pixi.js", "SpritesheetLoader")
@js.native
object SpritesheetLoader extends js.Object {
  
  /**
    * Get the spritesheets root path
    * @param {PIXI.LoaderResource} resource - Resource to check path
    * @param {string} baseUrl - Base root url
    */
  def getResourcePath(resource: typingsSlinky.pixiJs.PIXI.LoaderResource, baseUrl: String): Unit = js.native
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  def use(resource: typingsSlinky.pixiJs.PIXI.LoaderResource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}
