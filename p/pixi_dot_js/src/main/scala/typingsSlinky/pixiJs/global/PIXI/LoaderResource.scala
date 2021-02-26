package typingsSlinky.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
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
@JSGlobal("PIXI.LoaderResource")
@js.native
class LoaderResource ()
  extends typingsSlinky.pixiJs.PIXI.LoaderResource
object LoaderResource {
  
  @JSGlobal("PIXI.LoaderResource")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("PIXI.LoaderResource.EMPTY_GIF")
  @js.native
  def EMPTY_GIF: String = js.native
  @scala.inline
  def EMPTY_GIF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_GIF")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PIXI.LoaderResource.LOAD_TYPE")
  @js.native
  object LOAD_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.LoaderResource.LOAD_TYPE with Double] = js.native
    
    /* 3 */ val AUDIO: typingsSlinky.pixiJs.PIXI.LoaderResource.LOAD_TYPE.AUDIO with Double = js.native
    
    /* 2 */ val IMAGE: typingsSlinky.pixiJs.PIXI.LoaderResource.LOAD_TYPE.IMAGE with Double = js.native
    
    /* 4 */ val VIDEO: typingsSlinky.pixiJs.PIXI.LoaderResource.LOAD_TYPE.VIDEO with Double = js.native
    
    /* 1 */ val XHR: typingsSlinky.pixiJs.PIXI.LoaderResource.LOAD_TYPE.XHR with Double = js.native
  }
  
  @JSGlobal("PIXI.LoaderResource.STATUS_FLAGS")
  @js.native
  object STATUS_FLAGS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.LoaderResource.STATUS_FLAGS with Double] = js.native
    
    /* 1 << 1 */ val COMPLETE: typingsSlinky.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.COMPLETE with Double = js.native
    
    /* 1 << 0 */ val DATA_URL: typingsSlinky.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.DATA_URL with Double = js.native
    
    /* 1 << 2 */ val LOADING: typingsSlinky.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.LOADING with Double = js.native
    
    /* 0 */ val NONE: typingsSlinky.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.NONE with Double = js.native
  }
  
  @JSGlobal("PIXI.LoaderResource.TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE with Double] = js.native
    
    /* 4 */ val AUDIO: typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE.AUDIO with Double = js.native
    
    /* 3 */ val IMAGE: typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE.IMAGE with Double = js.native
    
    /* 1 */ val JSON: typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE.JSON with Double = js.native
    
    /* 6 */ val TEXT: typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE.TEXT with Double = js.native
    
    /* 0 */ val UNKNOWN: typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE.UNKNOWN with Double = js.native
    
    /* 5 */ val VIDEO: typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE.VIDEO with Double = js.native
    
    /* 2 */ val XML: typingsSlinky.pixiJs.PIXI.LoaderResource.TYPE.XML with Double = js.native
  }
  
  @JSGlobal("PIXI.LoaderResource.XHR_RESPONSE_TYPE")
  @js.native
  object XHR_RESPONSE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE with String] = js.native
    
    /* "blob" */ val BLOB: typingsSlinky.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.BLOB with String = js.native
    
    /* "arraybuffer" */ val BUFFER: typingsSlinky.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.BUFFER with String = js.native
    
    /* "text" */ val DEFAULT: typingsSlinky.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.DEFAULT with String = js.native
    
    /* "document" */ val DOCUMENT: typingsSlinky.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.DOCUMENT with String = js.native
    
    /* "json" */ val JSON: typingsSlinky.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.JSON with String = js.native
    
    /* "text" */ val TEXT: typingsSlinky.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.TEXT with String = js.native
  }
  
  @JSGlobal("PIXI.LoaderResource.setExtensionLoadType")
  @js.native
  def setExtensionLoadType(extname: String, loadType: Double): Unit = js.native
  
  @JSGlobal("PIXI.LoaderResource.setExtensionXhrType")
  @js.native
  def setExtensionXhrType(extname: String, xhrType: String): Unit = js.native
}
