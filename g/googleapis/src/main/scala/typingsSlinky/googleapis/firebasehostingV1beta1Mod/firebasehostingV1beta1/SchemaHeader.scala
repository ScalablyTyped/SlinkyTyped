package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [`header`](/docs/hosting/full-config#headers) defines custom headers to
  * add to a response should the request URL path match the pattern.
  */
@js.native
trait SchemaHeader extends StObject {
  
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.native
  
  /**
    * Required. The additional headers to add to the response.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaHeader {
  
  @scala.inline
  def apply(): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeader]
  }
  
  @scala.inline
  implicit class SchemaHeaderMutableBuilder[Self <: SchemaHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
