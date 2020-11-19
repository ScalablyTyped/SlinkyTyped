package typingsSlinky.babylonjs.sceneLoaderMod

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.fileRequestMod.IFileRequest
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.webRequestMod.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderPluginBase extends js.Object {
  
  /**
    * The callback that returns true if the data can be directly loaded.
    * @param data string containing the file data
    * @returns if the data can be loaded directly
    */
  var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.native
  
  /**
    * The callback that returns the data to pass to the plugin if the data can be directly loaded.
    * @param scene scene loading this data
    * @param data string containing the data
    * @returns data to pass to the plugin
    */
  var directLoad: js.UndefOr[js.Function2[/* scene */ Scene, /* data */ String, _]] = js.native
  
  /**
    * The file extensions supported by this plugin.
    */
  var extensions: String | ISceneLoaderPluginExtensions = js.native
  
  /**
    * The friendly name of this plugin.
    */
  var name: String = js.native
  
  /**
    * The callback called when loading from a file object.
    * @param scene scene loading this file
    * @param file defines the file to load
    * @param onSuccess defines the callback to call when data is loaded
    * @param onProgress defines the callback to call during loading process
    * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
    * @param onError defines the callback to call when an error occurs
    * @returns a file request object
    */
  var readFile: js.UndefOr[
    js.Function6[
      /* scene */ Scene, 
      /* file */ File, 
      /* onSuccess */ js.Function1[/* data */ js.Any, Unit], 
      /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent, _]], 
      /* useArrayBuffer */ js.UndefOr[Boolean], 
      /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]], 
      IFileRequest
    ]
  ] = js.native
  
  /**
    * The callback called when loading from a url.
    * @param scene scene loading this url
    * @param url url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    */
  var requestFile: js.UndefOr[
    js.Function6[
      /* scene */ Scene, 
      /* url */ String, 
      /* onSuccess */ js.Function2[/* data */ js.Any, /* request */ js.UndefOr[WebRequest], Unit], 
      /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent, Unit]], 
      /* useArrayBuffer */ js.UndefOr[Boolean], 
      /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]], 
      IFileRequest
    ]
  ] = js.native
  
  /**
    * The callback that allows custom handling of the root url based on the response url.
    * @param rootUrl the original root url
    * @param responseURL the response url if available
    * @returns the new root url
    */
  var rewriteRootURL: js.UndefOr[js.Function2[/* rootUrl */ String, /* responseURL */ js.UndefOr[String], String]] = js.native
}
object ISceneLoaderPluginBase {
  
  @scala.inline
  def apply(extensions: String | ISceneLoaderPluginExtensions, name: String): ISceneLoaderPluginBase = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLoaderPluginBase]
  }
  
  @scala.inline
  implicit class ISceneLoaderPluginBaseOps[Self <: ISceneLoaderPluginBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtensions(value: String | ISceneLoaderPluginExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDirectLoad(value: /* data */ String => Boolean): Self = this.set("canDirectLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanDirectLoad: Self = this.set("canDirectLoad", js.undefined)
    
    @scala.inline
    def setDirectLoad(value: (/* scene */ Scene, /* data */ String) => _): Self = this.set("directLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDirectLoad: Self = this.set("directLoad", js.undefined)
    
    @scala.inline
    def setReadFile(
      value: (/* scene */ Scene, /* file */ File, /* onSuccess */ js.Function1[/* data */ js.Any, Unit], /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent, _]], /* useArrayBuffer */ js.UndefOr[Boolean], /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]]) => IFileRequest
    ): Self = this.set("readFile", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    
    @scala.inline
    def setRequestFile(
      value: (/* scene */ Scene, /* url */ String, /* onSuccess */ js.Function2[/* data */ js.Any, /* request */ js.UndefOr[WebRequest], Unit], /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent, Unit]], /* useArrayBuffer */ js.UndefOr[Boolean], /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]]) => IFileRequest
    ): Self = this.set("requestFile", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteRequestFile: Self = this.set("requestFile", js.undefined)
    
    @scala.inline
    def setRewriteRootURL(value: (/* rootUrl */ String, /* responseURL */ js.UndefOr[String]) => String): Self = this.set("rewriteRootURL", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRewriteRootURL: Self = this.set("rewriteRootURL", js.undefined)
  }
}
