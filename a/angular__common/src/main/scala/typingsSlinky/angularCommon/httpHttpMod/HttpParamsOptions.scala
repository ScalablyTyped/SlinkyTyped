package typingsSlinky.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used to construct an `HttpParams` instance.
  *
  * @publicApi
  */
@js.native
trait HttpParamsOptions extends StObject {
  
  /** Encoding codec used to parse and serialize the parameters. */
  var encoder: js.UndefOr[HttpParameterCodec] = js.native
  
  /** Object map of the HTTP parameters. Mutually exclusive with `fromString`. */
  var fromObject: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  
  /**
    * String representation of the HTTP parameters in URL-query-string format.
    * Mutually exclusive with `fromObject`.
    */
  var fromString: js.UndefOr[String] = js.native
}
object HttpParamsOptions {
  
  @scala.inline
  def apply(): HttpParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpParamsOptions]
  }
  
  @scala.inline
  implicit class HttpParamsOptionsMutableBuilder[Self <: HttpParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoder(value: HttpParameterCodec): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
    
    @scala.inline
    def setFromObject(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "fromObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromObjectUndefined: Self = StObject.set(x, "fromObject", js.undefined)
    
    @scala.inline
    def setFromString(value: String): Self = StObject.set(x, "fromString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromStringUndefined: Self = StObject.set(x, "fromString", js.undefined)
  }
}
