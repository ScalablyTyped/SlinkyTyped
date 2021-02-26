package typingsSlinky.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basically a very large random number (128-bit) which means the probability of creating two that clash is vanishingly small.
  * GUIDs are used as the unique identifiers for Entities.
  */
object guid {
  
  /**
    * Create an RFC4122 version 4 compliant GUID.
    * @returns A new GUID.
    */
  @JSGlobal("pc.guid.create")
  @js.native
  def create(): String = js.native
}
