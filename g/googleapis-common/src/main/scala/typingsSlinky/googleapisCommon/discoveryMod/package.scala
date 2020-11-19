package typingsSlinky.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object discoveryMod {
  
  type EndpointCreator = js.Function2[
    /* options */ typingsSlinky.googleapisCommon.apiMod.GlobalOptions, 
    /* google */ js.Object, 
    typingsSlinky.googleapisCommon.endpointMod.Endpoint
  ]
}
