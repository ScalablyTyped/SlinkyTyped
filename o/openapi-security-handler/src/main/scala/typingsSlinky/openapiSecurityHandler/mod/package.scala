package typingsSlinky.openapiSecurityHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SecurityHandler = js.Function3[
    /* req */ typingsSlinky.openapiTypes.mod.OpenAPI.Request, 
    /* scopes */ js.Array[typingsSlinky.openapiSecurityHandler.mod.SecurityScope], 
    /* definition */ typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  
  type SecurityHandlers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.openapiSecurityHandler.mod.SecurityHandler]
  
  type SecurityScope = java.lang.String
}
