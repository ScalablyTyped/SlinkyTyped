package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database Instance truncate log context.
  */
@js.native
trait SchemaTruncateLogContext extends StObject {
  
  /**
    * This is always sql#truncateLogContext.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The type of log to truncate. Valid values are MYSQL_GENERAL_TABLE and
    * MYSQL_SLOW_TABLE.
    */
  var logType: js.UndefOr[String] = js.native
}
object SchemaTruncateLogContext {
  
  @scala.inline
  def apply(): SchemaTruncateLogContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTruncateLogContext]
  }
  
  @scala.inline
  implicit class SchemaTruncateLogContextMutableBuilder[Self <: SchemaTruncateLogContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
