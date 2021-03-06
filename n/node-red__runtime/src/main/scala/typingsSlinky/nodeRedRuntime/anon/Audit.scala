package typingsSlinky.nodeRedRuntime.anon

import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.debug
import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.error
import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.fatal
import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.info
import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.off
import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.trace
import typingsSlinky.nodeRedRuntime.nodeRedRuntimeStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audit extends StObject {
  
  /**
    * Whether or not to include audit events in the log output
    */
  var audit: Boolean = js.native
  
  /**
    * Level of logging to be recorded. Options are:
    * fatal - only those errors which make the application unusable should be recorded
    * error - record errors which are deemed fatal for a particular request + fatal errors
    * warn - record problems which are non fatal + errors + fatal errors
    * info - record information about the general running of the application + warn + error + fatal errors
    * debug - record information which is more verbose than info + info + warn + error + fatal errors
    * trace - record very detailed logging + debug + info + warn + error + fatal errors
    * off - turn off all logging (doesn't affect metrics or audit)
    */
  var level: fatal | error | warn | info | debug | trace | off = js.native
  
  /**
    * Whether or not to include metric events in the log output
    */
  var metrics: Boolean = js.native
}
object Audit {
  
  @scala.inline
  def apply(audit: Boolean, level: fatal | error | warn | info | debug | trace | off, metrics: Boolean): Audit = {
    val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audit]
  }
  
  @scala.inline
  implicit class AuditMutableBuilder[Self <: Audit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudit(value: Boolean): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: fatal | error | warn | info | debug | trace | off): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: Boolean): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
  }
}
