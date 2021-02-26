package typingsSlinky.kapPlugin

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.got.anon.GotInstanceGotBodyFnnull
import typingsSlinky.got.anon.GotInstanceGotBodyFnstrin
import typingsSlinky.got.anon.GotInstanceGotFormFnnull
import typingsSlinky.got.anon.GotInstanceGotFormFnstrin
import typingsSlinky.got.anon.GotInstanceGotJSONFn
import typingsSlinky.got.anon.Recordgetpostputpatchhead
import typingsSlinky.got.mod.GotBodyOptions
import typingsSlinky.got.mod.GotEmitter
import typingsSlinky.got.mod.GotExtend
import typingsSlinky.got.mod.GotFn
import typingsSlinky.got.mod.GotFormOptions
import typingsSlinky.got.mod.GotJSONOptions
import typingsSlinky.got.mod.GotOptions
import typingsSlinky.got.mod.GotPromise
import typingsSlinky.got.mod.GotStreamFn
import typingsSlinky.got.mod.GotUrl
import typingsSlinky.kapPlugin.mod.Format
import typingsSlinky.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FileType extends StObject {
    
    var fileType: Format = js.native
  }
  object FileType {
    
    @scala.inline
    def apply(fileType: Format): FileType = {
      val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileType]
    }
    
    @scala.inline
    implicit class FileTypeMutableBuilder[Self <: FileType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileType(value: Format): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeof extends StObject {
    
    def apply(url: GotUrl): GotPromise[String] = js.native
    def apply(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def apply(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def apply(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
    
    var CancelError: Instantiable0[typingsSlinky.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typingsSlinky.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typingsSlinky.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typingsSlinky.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typingsSlinky.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typingsSlinky.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typingsSlinky.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typingsSlinky.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[String] = js.native
    def delete(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def delete(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def delete(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
    @JSName("delete")
    var delete_Original: GotFn = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def get(url: GotUrl): GotPromise[String] = js.native
    def get(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def get(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def get(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
    @JSName("get")
    var get_Original: GotFn = js.native
    
    def head(url: GotUrl): GotPromise[String] = js.native
    def head(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def head(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def head(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
    @JSName("head")
    var head_Original: GotFn = js.native
    
    def patch(url: GotUrl): GotPromise[String] = js.native
    def patch(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def patch(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def patch(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
    @JSName("patch")
    var patch_Original: GotFn = js.native
    
    def post(url: GotUrl): GotPromise[String] = js.native
    def post(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def post(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def post(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
    @JSName("post")
    var post_Original: GotFn = js.native
    
    def put(url: GotUrl): GotPromise[String] = js.native
    def put(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def put(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def put(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
    @JSName("put")
    var put_Original: GotFn = js.native
    
    def stream(url: GotUrl): GotEmitter with Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  }
  
  @js.native
  trait Typeofgot extends Typeof
}
