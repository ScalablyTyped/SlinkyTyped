package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextFilterMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextFilterMode")
@js.native
object EnumTextFilterMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextFilterMode with Double] = js.native
  
  @js.native
  sealed trait TFM_AUTO extends EnumTextFilterMode
  /* 1 */ val TFM_AUTO: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextFilterMode.TFM_AUTO with Double = js.native
  
  @js.native
  sealed trait TFM_GENERAL_CONTOUR extends EnumTextFilterMode
  /* 2 */ val TFM_GENERAL_CONTOUR: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextFilterMode.TFM_GENERAL_CONTOUR with Double = js.native
  
  @js.native
  sealed trait TFM_SKIP extends EnumTextFilterMode
  /* 0 */ val TFM_SKIP: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextFilterMode.TFM_SKIP with Double = js.native
}
