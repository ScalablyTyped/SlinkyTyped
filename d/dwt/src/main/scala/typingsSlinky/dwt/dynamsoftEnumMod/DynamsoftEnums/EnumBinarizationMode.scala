package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBinarizationMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBinarizationMode")
@js.native
object EnumBinarizationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBinarizationMode with Double] = js.native
  
  @js.native
  sealed trait BM_AUTO extends EnumBinarizationMode
  /* 1 */ val BM_AUTO: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBinarizationMode.BM_AUTO with Double = js.native
  
  @js.native
  sealed trait BM_LOCAL_BLOCK extends EnumBinarizationMode
  /* 2 */ val BM_LOCAL_BLOCK: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBinarizationMode.BM_LOCAL_BLOCK with Double = js.native
  
  @js.native
  sealed trait BM_SKIP extends EnumBinarizationMode
  /* 0 */ val BM_SKIP: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBinarizationMode.BM_SKIP with Double = js.native
}
