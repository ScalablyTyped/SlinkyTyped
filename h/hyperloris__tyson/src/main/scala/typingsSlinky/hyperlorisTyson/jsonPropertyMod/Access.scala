package typingsSlinky.hyperlorisTyson.jsonPropertyMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Access extends js.Object
@JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", "Access")
@js.native
object Access extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Access with String] = js.native
  
  /**
    * Access setting that means that the property may only be used
    * for deserialization: json -> class
    */
  @js.native
  sealed trait FROMJSON_ONLY extends Access
  /* "FROMJSON_ONLY" */ @js.native
  object FROMJSON_ONLY extends TopLevel[FROMJSON_ONLY with String]
  
  /**
    * Access setting that means that the property may only be used
    * for serialization: class -> json
    */
  @js.native
  sealed trait TOJSON_ONLY extends Access
  /* "TOJSON_ONLY" */ @js.native
  object TOJSON_ONLY extends TopLevel[TOJSON_ONLY with String]
}
