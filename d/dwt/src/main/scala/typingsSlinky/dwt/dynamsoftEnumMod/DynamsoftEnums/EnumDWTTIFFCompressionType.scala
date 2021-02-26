package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTTIFFCompressionType extends StObject
/** TIFF file compression type. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_TIFFCompressionType")
@js.native
object EnumDWTTIFFCompressionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTTIFFCompressionType with Double] = js.native
  
  /** Auto mode. */
  @js.native
  sealed trait TIFF_AUTO extends EnumDWTTIFFCompressionType
  /* 0 */ val TIFF_AUTO: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_AUTO with Double = js.native
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait TIFF_FAX3 extends EnumDWTTIFFCompressionType
  /* 3 */ val TIFF_FAX3: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_FAX3 with Double = js.native
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait TIFF_FAX4 extends EnumDWTTIFFCompressionType
  /* 4 */ val TIFF_FAX4: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_FAX4 with Double = js.native
  
  @js.native
  sealed trait TIFF_JPEG extends EnumDWTTIFFCompressionType
  /* 7 */ val TIFF_JPEG: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_JPEG with Double = js.native
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait TIFF_LZW extends EnumDWTTIFFCompressionType
  /* 5 */ val TIFF_LZW: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_LZW with Double = js.native
  
  /** Dump mode. */
  @js.native
  sealed trait TIFF_NONE extends EnumDWTTIFFCompressionType
  /* 1 */ val TIFF_NONE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_NONE with Double = js.native
  
  @js.native
  sealed trait TIFF_PACKBITS extends EnumDWTTIFFCompressionType
  /* 32773 */ val TIFF_PACKBITS: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_PACKBITS with Double = js.native
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait TIFF_RLE extends EnumDWTTIFFCompressionType
  /* 2 */ val TIFF_RLE: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_RLE with Double = js.native
  
  /** CCITT T.4 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T4 extends EnumDWTTIFFCompressionType
  /* 3 */ val TIFF_T4: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_T4 with Double = js.native
  
  /** CCITT T.6 (TIFF 6 name). */
  @js.native
  sealed trait TIFF_T6 extends EnumDWTTIFFCompressionType
  /* 4 */ val TIFF_T6: typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType.TIFF_T6 with Double = js.native
}
