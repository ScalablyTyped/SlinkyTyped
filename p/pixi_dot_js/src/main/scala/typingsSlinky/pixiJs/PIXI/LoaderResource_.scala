package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to **{@link https://github.com/englercj/resource-loader
  * resource-loader}**'s Resource class.
  * @see http://englercj.github.io/resource-loader/Resource.html
  * @class LoaderResource
  * @memberof PIXI
  */
@js.native
trait LoaderResource_ extends js.Object {
  
  def abort(): Unit = js.native
  def abort(message: String): Unit = js.native
  
  var children: js.Array[LoaderResource] = js.native
  
  def complete(): Unit = js.native
  
  var crossOrigin: Boolean | String = js.native
  
  var data: js.Any = js.native
  
  var error: js.Error = js.native
  
  var extension: String = js.native
  
  var isComplete: Boolean = js.native
  
  var isDataUrl: Boolean = js.native
  
  var isLoading: Boolean = js.native
  
  //tslint:disable-next-line:ban-types forbidden-types
  def load(): Unit = js.native
  def load(cb: js.Function): Unit = js.native
  
  var loadType: Double = js.native
  
  var metadata: js.Any = js.native
  
  var name: String = js.native
  
  var progressChunk: Double = js.native
  
  var spineAtlas: js.Any = js.native
  
  var spineData: js.Any = js.native
  
  var spritesheet: js.UndefOr[Spritesheet] = js.native
  
  var texture: Texture = js.native
  
  var textures: js.UndefOr[ITextureDictionary] = js.native
  
  var `type`: Double = js.native
  
  var url: String = js.native
  
  var xhr: XMLHttpRequest | Null = js.native
  
  var xhrType: String = js.native
}
