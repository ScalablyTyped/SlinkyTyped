package typingsSlinky.helmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object contentSecurityPolicyMod {
  
  type ContentSecurityPolicyDirectiveValue = java.lang.String | typingsSlinky.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectiveValueFunction
  
  type ContentSecurityPolicyDirectiveValueFunction = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    java.lang.String
  ]
  
  type ContentSecurityPolicyDirectives = org.scalablytyped.runtime.StringDictionary[
    js.Iterable[
      typingsSlinky.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectiveValue
    ]
  ]
}
