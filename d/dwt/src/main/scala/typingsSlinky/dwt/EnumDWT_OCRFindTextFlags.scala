package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_OCRFindTextFlags extends js.Object

@JSGlobal("EnumDWT_OCRFindTextFlags")
@js.native
object EnumDWT_OCRFindTextFlags extends js.Object {
  @js.native
  sealed trait OCRFT_FUZZYMATCH extends EnumDWT_OCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_MATCHCASE extends EnumDWT_OCRFindTextFlags
  
  @js.native
  sealed trait OCRFT_WHOLEWORD extends EnumDWT_OCRFindTextFlags
  
  /* 4 */ val OCRFT_FUZZYMATCH: typingsSlinky.dwt.EnumDWT_OCRFindTextFlags.OCRFT_FUZZYMATCH with Double = js.native
  /* 2 */ val OCRFT_MATCHCASE: typingsSlinky.dwt.EnumDWT_OCRFindTextFlags.OCRFT_MATCHCASE with Double = js.native
  /* 1 */ val OCRFT_WHOLEWORD: typingsSlinky.dwt.EnumDWT_OCRFindTextFlags.OCRFT_WHOLEWORD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_OCRFindTextFlags with Double] = js.native
}

