package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type of the drive. Can be:
  * - REMOVABLE
  * - FIXED
  * - NETWORK
  * - CD_ROM
  * - RAM
  * - UNKNOWN_TYPE
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.REMOVABLE
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FIXED
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NETWORK
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.CD_ROM
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RAM
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.UNKNOWN_TYPE
*/
trait DriveType extends js.Object

object DriveType {
  @scala.inline
  def CD_ROM: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.CD_ROM = this.cast("CD_ROM")
  @scala.inline
  def FIXED: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FIXED = this.cast("FIXED")
  @scala.inline
  def NETWORK: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NETWORK = this.cast("NETWORK")
  @scala.inline
  def RAM: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RAM = this.cast("RAM")
  @scala.inline
  def REMOVABLE: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.REMOVABLE = this.cast("REMOVABLE")
  @scala.inline
  def UNKNOWN_TYPE: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.UNKNOWN_TYPE = this.cast("UNKNOWN_TYPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

