package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AlertType extends StObject
@JSImport("azdata", "AlertType")
@js.native
object AlertType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlertType with Double] = js.native
  
  @js.native
  sealed trait nonSqlServerEvent extends AlertType
  /* 3 */ val nonSqlServerEvent: typingsSlinky.azdata.mod.AlertType.nonSqlServerEvent with Double = js.native
  
  @js.native
  sealed trait sqlServerEvent extends AlertType
  /* 1 */ val sqlServerEvent: typingsSlinky.azdata.mod.AlertType.sqlServerEvent with Double = js.native
  
  @js.native
  sealed trait sqlServerPerformanceCondition extends AlertType
  /* 2 */ val sqlServerPerformanceCondition: typingsSlinky.azdata.mod.AlertType.sqlServerPerformanceCondition with Double = js.native
  
  @js.native
  sealed trait wmiEvent extends AlertType
  /* 4 */ val wmiEvent: typingsSlinky.azdata.mod.AlertType.wmiEvent with Double = js.native
}
