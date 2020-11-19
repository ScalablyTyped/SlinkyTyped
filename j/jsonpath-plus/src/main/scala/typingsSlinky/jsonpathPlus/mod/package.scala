package typingsSlinky.jsonpathPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JSONPathCallback = js.Function3[/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any, js.Any]
  
  type JSONPathOtherTypeCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type JSONPathType = typingsSlinky.jsonpathPlus.mod.JSONPathCallable with typingsSlinky.jsonpathPlus.mod.JSONPathClass
}
