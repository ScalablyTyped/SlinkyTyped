package typingsSlinky.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiMod {
  
  type APIEndpoint = typingsSlinky.googleapisCommon.endpointMod.Endpoint with js.Any
  
  type BodyResponseCallback[T] = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* res */ js.UndefOr[typingsSlinky.gaxios.commonMod.GaxiosResponse[T] | scala.Null], 
    scala.Unit
  ]
}
