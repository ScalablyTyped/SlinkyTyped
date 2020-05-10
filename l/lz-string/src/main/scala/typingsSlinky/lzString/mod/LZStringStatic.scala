package typingsSlinky.lzString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LZ-based compression algorithm for JavaScript.
  */
@js.native
trait LZStringStatic extends js.Object {
  /**
    * Compresses input string producing an instance of an "invalid" UTF-16 string.
    * Such string could be stored in localStorage only on webkit
    * browsers (tested on Android, Chrome, Safari).
    *
    * @param uncompressed A string which should be compressed.
    */
  def compress(uncompressed: String): String = js.native
  /**
    * Compresses input string producing an instance of a ASCII UTF-16 string,
    * which represents the original string encoded in Base64.
    * The result can be safely transported outside the browser with a
    * guarantee that none of the characters produced need to be URL-encoded.
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToBase64(uncompressed: String): String = js.native
  /**
    * produces ASCII strings representing the original string encoded in Base64 with a few
    * tweaks to make these URI safe. Hence, you can send them to the server without thinking
    * about URL encoding them. This saves bandwidth and CPU
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToEncodedURIComponent(uncompressed: String): String = js.native
  /**
    * Compresses input string producing an instance of a "valid" UTF-16 string,
    * in the sense that all browsers can store them safely.
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToUTF16(uncompressed: String): String = js.native
  /**
    * produces an uint8Array
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToUint8Array(uncompressed: String): js.typedarray.Uint8Array = js.native
  /**
    * Decompresses "invalid" input string created by the method compress().
    *
    * @param compressed A string obtained from a call to compress().
    */
  def decompress(compressed: String): Null | String = js.native
  /**
    * Decompresses ASCII UTF-16 input string created by the method compressToBase64().
    *
    * @param compressed A string obtained from a call to compressToBase64().
    */
  def decompressFromBase64(compressed: String): Null | String = js.native
  /**
    * Decompresses "valid" input string created by the method compressToEncodedURIComponent().
    *
    * @param compressed A string obtained from a call to compressToEncodedURIComponent().
    */
  def decompressFromEncodedURIComponent(compressed: String): Null | String = js.native
  /**
    * Decompresses "valid" input string created by the method compressToUTF16().
    *
    * @param compressed A string obtained from a call to compressToUTF16().
    */
  def decompressFromUTF16(compressed: String): Null | String = js.native
  /**
    * Decompresses "valid" array created by the method compressToUint8Array().
    *
    * @param compressed A string obtained from a call to compressToUint8Array().
    */
  def decompressFromUint8Array(compressed: js.typedarray.Uint8Array): Null | String = js.native
}

object LZStringStatic {
  @scala.inline
  def apply(
    compress: String => String,
    compressToBase64: String => String,
    compressToEncodedURIComponent: String => String,
    compressToUTF16: String => String,
    compressToUint8Array: String => js.typedarray.Uint8Array,
    decompress: String => Null | String,
    decompressFromBase64: String => Null | String,
    decompressFromEncodedURIComponent: String => Null | String,
    decompressFromUTF16: String => Null | String,
    decompressFromUint8Array: js.typedarray.Uint8Array => Null | String
  ): LZStringStatic = {
    val __obj = js.Dynamic.literal(compress = js.Any.fromFunction1(compress), compressToBase64 = js.Any.fromFunction1(compressToBase64), compressToEncodedURIComponent = js.Any.fromFunction1(compressToEncodedURIComponent), compressToUTF16 = js.Any.fromFunction1(compressToUTF16), compressToUint8Array = js.Any.fromFunction1(compressToUint8Array), decompress = js.Any.fromFunction1(decompress), decompressFromBase64 = js.Any.fromFunction1(decompressFromBase64), decompressFromEncodedURIComponent = js.Any.fromFunction1(decompressFromEncodedURIComponent), decompressFromUTF16 = js.Any.fromFunction1(decompressFromUTF16), decompressFromUint8Array = js.Any.fromFunction1(decompressFromUint8Array))
    __obj.asInstanceOf[LZStringStatic]
  }
  @scala.inline
  implicit class LZStringStaticOps[Self <: LZStringStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompressToBase64(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressToBase64")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompressToEncodedURIComponent(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressToEncodedURIComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompressToUTF16(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressToUTF16")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompressToUint8Array(value: String => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressToUint8Array")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecompress(value: String => Null | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecompressFromBase64(value: String => Null | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompressFromBase64")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecompressFromEncodedURIComponent(value: String => Null | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompressFromEncodedURIComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecompressFromUTF16(value: String => Null | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompressFromUTF16")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecompressFromUint8Array(value: js.typedarray.Uint8Array => Null | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompressFromUint8Array")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

