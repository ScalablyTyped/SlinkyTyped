package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object postal {
  
  type ICallback[T] = js.Function2[/* data */ T, /* envelope */ typingsSlinky.postal.IEnvelope[T], scala.Unit]
}
