package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_PDFCompressionType extends js.Object

/** PDF file compression type. */
@JSGlobal("EnumDWT_PDFCompressionType")
@js.native
object EnumDWT_PDFCompressionType extends js.Object {
  /** Auto mode. */
  @js.native
  sealed trait PDF_AUTO extends EnumDWT_PDFCompressionType
  
  /** CCITT Group 3 fax encoding. */
  @js.native
  sealed trait PDF_FAX3 extends EnumDWT_PDFCompressionType
  
  /** CCITT Group 4 fax encoding */
  @js.native
  sealed trait PDF_FAX4 extends EnumDWT_PDFCompressionType
  
  /** JPEG compression. */
  @js.native
  sealed trait PDF_JPEG extends EnumDWT_PDFCompressionType
  
  /** Lempel Ziv and Welch */
  @js.native
  sealed trait PDF_LZW extends EnumDWT_PDFCompressionType
  
  /** CCITT modified Huffman RLE. */
  @js.native
  sealed trait PDF_RLE extends EnumDWT_PDFCompressionType
  
  /* 0 */ val PDF_AUTO: typingsSlinky.dwt.EnumDWT_PDFCompressionType.PDF_AUTO with Double = js.native
  /* 1 */ val PDF_FAX3: typingsSlinky.dwt.EnumDWT_PDFCompressionType.PDF_FAX3 with Double = js.native
  /* 2 */ val PDF_FAX4: typingsSlinky.dwt.EnumDWT_PDFCompressionType.PDF_FAX4 with Double = js.native
  /* 5 */ val PDF_JPEG: typingsSlinky.dwt.EnumDWT_PDFCompressionType.PDF_JPEG with Double = js.native
  /* 3 */ val PDF_LZW: typingsSlinky.dwt.EnumDWT_PDFCompressionType.PDF_LZW with Double = js.native
  /* 4 */ val PDF_RLE: typingsSlinky.dwt.EnumDWT_PDFCompressionType.PDF_RLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_PDFCompressionType with Double] = js.native
}

