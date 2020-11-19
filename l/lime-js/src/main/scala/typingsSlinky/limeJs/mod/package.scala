package typingsSlinky.limeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ISessionListener = js.Function1[/* session */ typingsSlinky.limeJs.mod.Session, scala.Unit]
  
  type ITransportEnvelopeListener = js.Function1[/* envelope */ typingsSlinky.limeJs.mod.Envelope, scala.Unit]
}
