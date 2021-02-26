package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumConflictMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumConflictMode")
@js.native
object EnumConflictMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumConflictMode with Double] = js.native
  
  @js.native
  sealed trait CM_IGNORE extends EnumConflictMode
  /* 1 */ val CM_IGNORE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumConflictMode.CM_IGNORE with Double = js.native
  
  @js.native
  sealed trait CM_OVERWRITE extends EnumConflictMode
  /* 2 */ val CM_OVERWRITE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumConflictMode.CM_OVERWRITE with Double = js.native
}
