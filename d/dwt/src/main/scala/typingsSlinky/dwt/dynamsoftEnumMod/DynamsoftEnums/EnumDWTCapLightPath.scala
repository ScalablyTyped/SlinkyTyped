package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapLightPath extends StObject
/** ICAP_LIGHTPATH values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapLightPath")
@js.native
object EnumDWTCapLightPath extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapLightPath with Double] = js.native
  
  @js.native
  sealed trait TWLP_REFLECTIVE extends EnumDWTCapLightPath
  /* 0 */ val TWLP_REFLECTIVE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightPath.TWLP_REFLECTIVE with Double = js.native
  
  @js.native
  sealed trait TWLP_TRANSMISSIVE extends EnumDWTCapLightPath
  /* 1 */ val TWLP_TRANSMISSIVE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightPath.TWLP_TRANSMISSIVE with Double = js.native
}
