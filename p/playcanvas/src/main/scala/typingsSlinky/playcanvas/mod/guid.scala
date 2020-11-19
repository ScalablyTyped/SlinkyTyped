package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basically a very large random number (128-bit) which means the probability of creating two that clash is vanishingly small.
  * GUIDs are used as the unique identifiers for Entities.
  */
@JSImport("playcanvas", "guid")
@js.native
object guid extends js.Object {
  
  /**
    * Create an RFC4122 version 4 compliant GUID.
    * @returns A new GUID.
    */
  def create(): String = js.native
}
