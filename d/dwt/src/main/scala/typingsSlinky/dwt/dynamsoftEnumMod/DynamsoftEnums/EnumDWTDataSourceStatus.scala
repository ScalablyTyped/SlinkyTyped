package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDataSourceStatus extends StObject
/** Data source status. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_DataSourceStatus")
@js.native
object EnumDWTDataSourceStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDataSourceStatus with Double] = js.native
  
  /** Indicate the data source is acquiring image. */
  @js.native
  sealed trait TWDSS_ACQUIRING extends EnumDWTDataSourceStatus
  /* 3 */ val TWDSS_ACQUIRING: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_ACQUIRING with Double = js.native
  
  /** Indicate the data source is closed.  */
  @js.native
  sealed trait TWDSS_CLOSED extends EnumDWTDataSourceStatus
  /* 0 */ val TWDSS_CLOSED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_CLOSED with Double = js.native
  
  /** Indicate the data source is enabled.  */
  @js.native
  sealed trait TWDSS_ENABLED extends EnumDWTDataSourceStatus
  /* 2 */ val TWDSS_ENABLED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_ENABLED with Double = js.native
  
  /** Indicate the data source is opened. */
  @js.native
  sealed trait TWDSS_OPENED extends EnumDWTDataSourceStatus
  /* 1 */ val TWDSS_OPENED: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_OPENED with Double = js.native
}
