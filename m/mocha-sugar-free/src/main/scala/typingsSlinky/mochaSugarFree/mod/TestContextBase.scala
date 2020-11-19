package typingsSlinky.mochaSugarFree.mod

import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestContextBase extends js.Object {
  
  /**
    * Get whether timeouts are enabled.
    */
  def enableTimeouts(): Boolean = js.native
  /**
    * Set whether timeouts are enabled.
    */
  def enableTimeouts(enabled: Boolean): this.type = js.native
  
  var isHook: `false` = js.native
  
  var isSuite: `false` = js.native
  
  var isTest: `true` = js.native
  
  /**
    * Mark a test as skipped.
    */
  def skip(): scala.Nothing = js.native
  
  /**
    * Get test slowness threshold.
    */
  def slow(): Double = js.native
  /**
    * Set test slowness threshold.
    */
  def slow(ms: String): this.type = js.native
  def slow(ms: Double): this.type = js.native
  
  /**
    * Get test timeout.
    */
  def timeout(): Double = js.native
  /**
    * Set test timeout.
    */
  def timeout(ms: String): this.type = js.native
  def timeout(ms: Double): this.type = js.native
}
