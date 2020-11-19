package typingsSlinky.bell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AuthedRequest = js.Function2[
    /* uri */ java.lang.String, 
    /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]], 
    js.Promise[js.Object]
  ]
  
  type ProfileGetter[C /* <: typingsSlinky.bell.mod.Credentials */] = js.ThisFunction3[
    /* this */ typingsSlinky.bell.mod.CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
    /* get */ typingsSlinky.bell.mod.AuthedRequest, 
    js.Promise[scala.Unit]
  ]
  
  type RequestPassThrough = js.Function1[
    /* request */ typingsSlinky.hapi.mod.Request, 
    js.Thenable[typingsSlinky.hapi.mod.AuthCredentials] | typingsSlinky.hapi.mod.AuthCredentials
  ]
  
  type StringLikeMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
