package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTConvertMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ConvertMode")
@js.native
object EnumDWTConvertMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTConvertMode with Double] = js.native
  
  @js.native
  sealed trait CM_DEFAULT extends EnumDWTConvertMode
  /* 0 */ val CM_DEFAULT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTConvertMode.CM_DEFAULT with Double = js.native
  
  @js.native
  sealed trait CM_RENDERALL extends EnumDWTConvertMode
  /* 1 */ val CM_RENDERALL: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTConvertMode.CM_RENDERALL with Double = js.native
}
