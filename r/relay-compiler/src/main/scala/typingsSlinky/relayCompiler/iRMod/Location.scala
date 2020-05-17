package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.SourceLocation
  - typingsSlinky.relayCompiler.iRMod.GeneratedLocation
  - typingsSlinky.relayCompiler.iRMod.DerivedLocation
  - typingsSlinky.relayCompiler.iRMod.UnknownLocation
*/
trait Location extends js.Object

object Location {
  @scala.inline
  implicit def apply(value: DerivedLocation): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: GeneratedLocation): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: SourceLocation): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: UnknownLocation): Location = value.asInstanceOf[Location]
}

