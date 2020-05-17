package typingsSlinky.bitcoinjsLib.psbtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress
  - typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript
*/
trait PsbtOutputExtended extends js.Object

object PsbtOutputExtended {
  @scala.inline
  implicit def apply(value: PsbtOutputExtendedAddress): PsbtOutputExtended = value.asInstanceOf[PsbtOutputExtended]
  @scala.inline
  implicit def apply(value: PsbtOutputExtendedScript): PsbtOutputExtended = value.asInstanceOf[PsbtOutputExtended]
}

