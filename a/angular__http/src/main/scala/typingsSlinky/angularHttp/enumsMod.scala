package typingsSlinky.angularHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsMod {
  
  @js.native
  sealed trait ContentType extends StObject
  @JSImport("@angular/http/src/enums", "ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
    
    @js.native
    sealed trait ARRAY_BUFFER extends ContentType
    /* 6 */ val ARRAY_BUFFER: typingsSlinky.angularHttp.enumsMod.ContentType.ARRAY_BUFFER with Double = js.native
    
    @js.native
    sealed trait BLOB extends ContentType
    /* 5 */ val BLOB: typingsSlinky.angularHttp.enumsMod.ContentType.BLOB with Double = js.native
    
    @js.native
    sealed trait FORM extends ContentType
    /* 2 */ val FORM: typingsSlinky.angularHttp.enumsMod.ContentType.FORM with Double = js.native
    
    @js.native
    sealed trait FORM_DATA extends ContentType
    /* 3 */ val FORM_DATA: typingsSlinky.angularHttp.enumsMod.ContentType.FORM_DATA with Double = js.native
    
    @js.native
    sealed trait JSON extends ContentType
    /* 1 */ val JSON: typingsSlinky.angularHttp.enumsMod.ContentType.JSON with Double = js.native
    
    @js.native
    sealed trait NONE extends ContentType
    /* 0 */ val NONE: typingsSlinky.angularHttp.enumsMod.ContentType.NONE with Double = js.native
    
    @js.native
    sealed trait TEXT extends ContentType
    /* 4 */ val TEXT: typingsSlinky.angularHttp.enumsMod.ContentType.TEXT with Double = js.native
  }
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("@angular/http/src/enums", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
    
    @js.native
    sealed trait Cancelled extends ReadyState
    /* 5 */ val Cancelled: typingsSlinky.angularHttp.enumsMod.ReadyState.Cancelled with Double = js.native
    
    @js.native
    sealed trait Done extends ReadyState
    /* 4 */ val Done: typingsSlinky.angularHttp.enumsMod.ReadyState.Done with Double = js.native
    
    @js.native
    sealed trait HeadersReceived extends ReadyState
    /* 2 */ val HeadersReceived: typingsSlinky.angularHttp.enumsMod.ReadyState.HeadersReceived with Double = js.native
    
    @js.native
    sealed trait Loading extends ReadyState
    /* 3 */ val Loading: typingsSlinky.angularHttp.enumsMod.ReadyState.Loading with Double = js.native
    
    @js.native
    sealed trait Open extends ReadyState
    /* 1 */ val Open: typingsSlinky.angularHttp.enumsMod.ReadyState.Open with Double = js.native
    
    @js.native
    sealed trait Unsent extends ReadyState
    /* 0 */ val Unsent: typingsSlinky.angularHttp.enumsMod.ReadyState.Unsent with Double = js.native
  }
  
  @js.native
  sealed trait RequestMethod extends StObject
  @JSImport("@angular/http/src/enums", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RequestMethod with Double] = js.native
    
    @js.native
    sealed trait Delete extends RequestMethod
    /* 3 */ val Delete: typingsSlinky.angularHttp.enumsMod.RequestMethod.Delete with Double = js.native
    
    @js.native
    sealed trait Get extends RequestMethod
    /* 0 */ val Get: typingsSlinky.angularHttp.enumsMod.RequestMethod.Get with Double = js.native
    
    @js.native
    sealed trait Head extends RequestMethod
    /* 5 */ val Head: typingsSlinky.angularHttp.enumsMod.RequestMethod.Head with Double = js.native
    
    @js.native
    sealed trait Options extends RequestMethod
    /* 4 */ val Options: typingsSlinky.angularHttp.enumsMod.RequestMethod.Options with Double = js.native
    
    @js.native
    sealed trait Patch extends RequestMethod
    /* 6 */ val Patch: typingsSlinky.angularHttp.enumsMod.RequestMethod.Patch with Double = js.native
    
    @js.native
    sealed trait Post extends RequestMethod
    /* 1 */ val Post: typingsSlinky.angularHttp.enumsMod.RequestMethod.Post with Double = js.native
    
    @js.native
    sealed trait Put extends RequestMethod
    /* 2 */ val Put: typingsSlinky.angularHttp.enumsMod.RequestMethod.Put with Double = js.native
  }
  
  @js.native
  sealed trait ResponseContentType extends StObject
  @JSImport("@angular/http/src/enums", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponseContentType with Double] = js.native
    
    @js.native
    sealed trait ArrayBuffer extends ResponseContentType
    /* 2 */ val ArrayBuffer: typingsSlinky.angularHttp.enumsMod.ResponseContentType.ArrayBuffer with Double = js.native
    
    @js.native
    sealed trait Blob extends ResponseContentType
    /* 3 */ val Blob: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Blob with Double = js.native
    
    @js.native
    sealed trait Json extends ResponseContentType
    /* 1 */ val Json: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Json with Double = js.native
    
    @js.native
    sealed trait Text extends ResponseContentType
    /* 0 */ val Text: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Text with Double = js.native
  }
  
  @js.native
  sealed trait ResponseType extends StObject
  @JSImport("@angular/http/src/enums", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponseType with Double] = js.native
    
    @js.native
    sealed trait Basic extends ResponseType
    /* 0 */ val Basic: typingsSlinky.angularHttp.enumsMod.ResponseType.Basic with Double = js.native
    
    @js.native
    sealed trait Cors extends ResponseType
    /* 1 */ val Cors: typingsSlinky.angularHttp.enumsMod.ResponseType.Cors with Double = js.native
    
    @js.native
    sealed trait Default extends ResponseType
    /* 2 */ val Default: typingsSlinky.angularHttp.enumsMod.ResponseType.Default with Double = js.native
    
    @js.native
    sealed trait Error extends ResponseType
    /* 3 */ val Error: typingsSlinky.angularHttp.enumsMod.ResponseType.Error with Double = js.native
    
    @js.native
    sealed trait Opaque extends ResponseType
    /* 4 */ val Opaque: typingsSlinky.angularHttp.enumsMod.ResponseType.Opaque with Double = js.native
  }
}
