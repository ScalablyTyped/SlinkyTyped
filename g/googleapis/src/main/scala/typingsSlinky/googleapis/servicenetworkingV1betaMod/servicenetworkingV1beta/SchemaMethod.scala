package typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Method represents a method of an API interface.
  */
@js.native
trait SchemaMethod extends StObject {
  
  /**
    * The simple name of this method.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Any metadata attached to the method.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  
  /**
    * If true, the request is streamed.
    */
  var requestStreaming: js.UndefOr[Boolean] = js.native
  
  /**
    * A URL of the input message type.
    */
  var requestTypeUrl: js.UndefOr[String] = js.native
  
  /**
    * If true, the response is streamed.
    */
  var responseStreaming: js.UndefOr[Boolean] = js.native
  
  /**
    * The URL of the output message type.
    */
  var responseTypeUrl: js.UndefOr[String] = js.native
  
  /**
    * The source syntax of this method.
    */
  var syntax: js.UndefOr[String] = js.native
}
object SchemaMethod {
  
  @scala.inline
  def apply(): SchemaMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethod]
  }
  
  @scala.inline
  implicit class SchemaMethodMutableBuilder[Self <: SchemaMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setRequestStreaming(value: Boolean): Self = StObject.set(x, "requestStreaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStreamingUndefined: Self = StObject.set(x, "requestStreaming", js.undefined)
    
    @scala.inline
    def setRequestTypeUrl(value: String): Self = StObject.set(x, "requestTypeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTypeUrlUndefined: Self = StObject.set(x, "requestTypeUrl", js.undefined)
    
    @scala.inline
    def setResponseStreaming(value: Boolean): Self = StObject.set(x, "responseStreaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStreamingUndefined: Self = StObject.set(x, "responseStreaming", js.undefined)
    
    @scala.inline
    def setResponseTypeUrl(value: String): Self = StObject.set(x, "responseTypeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUrlUndefined: Self = StObject.set(x, "responseTypeUrl", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
