package typingsSlinky.hapiInert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RequestHandler[T] = js.Function1[/* request */ typingsSlinky.hapiHapi.mod.Request, T]
}
