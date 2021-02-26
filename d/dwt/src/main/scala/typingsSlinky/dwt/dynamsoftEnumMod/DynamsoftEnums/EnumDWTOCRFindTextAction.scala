package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTOCRFindTextAction extends StObject
/** OCRPro Find Text Action */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_OCRFindTextAction")
@js.native
object EnumDWTOCRFindTextAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTOCRFindTextAction with Double] = js.native
  
  @js.native
  sealed trait OCRFT_HIGHLIGHT extends EnumDWTOCRFindTextAction
  /* 0 */ val OCRFT_HIGHLIGHT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction.OCRFT_HIGHLIGHT with Double = js.native
  
  @js.native
  sealed trait OCRFT_MARKFORREDACT extends EnumDWTOCRFindTextAction
  /* 2 */ val OCRFT_MARKFORREDACT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction.OCRFT_MARKFORREDACT with Double = js.native
  
  @js.native
  sealed trait OCRFT_STRIKEOUT extends EnumDWTOCRFindTextAction
  /* 1 */ val OCRFT_STRIKEOUT: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction.OCRFT_STRIKEOUT with Double = js.native
}
