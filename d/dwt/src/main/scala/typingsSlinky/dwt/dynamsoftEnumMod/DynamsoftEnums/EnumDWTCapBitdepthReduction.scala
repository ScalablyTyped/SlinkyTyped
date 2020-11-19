package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapBitdepthReduction extends js.Object
/** ICAP_BITDEPTHREDUCTION values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapBitdepthReduction")
@js.native
object EnumDWTCapBitdepthReduction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapBitdepthReduction with Double] = js.native
  
  @js.native
  sealed trait TWBR_CUSTHALFTONE extends EnumDWTCapBitdepthReduction
  /* 2 */ @js.native
  object TWBR_CUSTHALFTONE extends TopLevel[TWBR_CUSTHALFTONE with Double]
  
  @js.native
  sealed trait TWBR_DIFFUSION extends EnumDWTCapBitdepthReduction
  /* 3 */ @js.native
  object TWBR_DIFFUSION extends TopLevel[TWBR_DIFFUSION with Double]
  
  @js.native
  sealed trait TWBR_HALFTONE extends EnumDWTCapBitdepthReduction
  /* 1 */ @js.native
  object TWBR_HALFTONE extends TopLevel[TWBR_HALFTONE with Double]
  
  @js.native
  sealed trait TWBR_THRESHOLD extends EnumDWTCapBitdepthReduction
  /* 0 */ @js.native
  object TWBR_THRESHOLD extends TopLevel[TWBR_THRESHOLD with Double]
}
