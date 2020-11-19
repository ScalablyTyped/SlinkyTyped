package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRDownloadType extends js.Object
/** OCR Download Type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRDownloadType")
@js.native
object EnumDWTOCRDownloadType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRDownloadType with Double] = js.native
  
  @js.native
  sealed trait OCRDT_Dll extends EnumDWTOCRDownloadType
  /* 0 */ @js.native
  object OCRDT_Dll extends TopLevel[OCRDT_Dll with Double]
  
  @js.native
  sealed trait OCRDT_LANGUAGE extends EnumDWTOCRDownloadType
  /* 1 */ @js.native
  object OCRDT_LANGUAGE extends TopLevel[OCRDT_LANGUAGE with Double]
}
