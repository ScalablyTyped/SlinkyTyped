package typingsSlinky.pixiJs.mod

import typingsSlinky.pixiJs.PIXI.ILoaderPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link PIXI.Loader Loader} middleware for loading
  * bitmap-based fonts suitable for using with {@link PIXI.BitmapText}.
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSImport("pixi.js", "BitmapFontLoader")
@js.native
class BitmapFontLoader () extends ILoaderPlugin
/* static members */
@JSImport("pixi.js", "BitmapFontLoader")
@js.native
object BitmapFontLoader extends js.Object {
  
  /**
    * Called when the plugin is installed.
    *
    * @see PIXI.Loader.registerPlugin
    */
  def add(): Unit = js.native
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  def use(resource: typingsSlinky.pixiJs.PIXI.LoaderResource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}
