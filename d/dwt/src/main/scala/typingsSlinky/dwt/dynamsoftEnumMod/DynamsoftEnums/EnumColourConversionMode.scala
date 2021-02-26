package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumColourConversionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumColourConversionMode")
@js.native
object EnumColourConversionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumColourConversionMode with Double] = js.native
  
  @js.native
  sealed trait CICM_GENERAL extends EnumColourConversionMode
  /* 1 */ val CICM_GENERAL: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumColourConversionMode.CICM_GENERAL with Double = js.native
  
  @js.native
  sealed trait CICM_SKIP extends EnumColourConversionMode
  /* 0 */ val CICM_SKIP: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumColourConversionMode.CICM_SKIP with Double = js.native
}
