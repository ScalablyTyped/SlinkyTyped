package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTInitMsg extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_InitMsg")
@js.native
object EnumDWTInitMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTInitMsg with Double] = js.native
  
  @js.native
  sealed trait DownloadError extends EnumDWTInitMsg
  /* 4 */ val DownloadError: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInitMsg.DownloadError with Double = js.native
  
  @js.native
  sealed trait DownloadNotRestartError extends EnumDWTInitMsg
  /* 5 */ val DownloadNotRestartError: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInitMsg.DownloadNotRestartError with Double = js.native
  
  @js.native
  sealed trait Error extends EnumDWTInitMsg
  /* 2 */ val Error: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInitMsg.Error with Double = js.native
  
  @js.native
  sealed trait Info extends EnumDWTInitMsg
  /* 1 */ val Info: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInitMsg.Info with Double = js.native
  
  @js.native
  sealed trait NotInstalledError extends EnumDWTInitMsg
  /* 3 */ val NotInstalledError: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInitMsg.NotInstalledError with Double = js.native
}
