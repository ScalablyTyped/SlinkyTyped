package typingsSlinky.pdfjsDist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pdfjsDist.pdfjsDistStrings.decode
import typingsSlinky.pdfjsDist.pdfjsDistStrings.display
import typingsSlinky.pdfjsDist.pdfjsDistStrings.none
import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFSource extends js.Object {
  /**
    * The factory that will be
    * used when reading built-in CMap files. Providing a custom factory is useful
    * for environments without `XMLHttpRequest` support, such as e.g. Node.js.
    * The default value is {DOMCMapReaderFactory}.
    */
  var CMapReaderFactory: js.UndefOr[js.Any] = js.native
  /**
    * Specifies if the Adobe CMaps are
    * binary packed. */
  var cMapPacked: js.UndefOr[Boolean] = js.native
  /**
    * The URL where the predefined
    * Adobe CMaps are located. Include trailing slash. */
  var cMapUrl: js.UndefOr[String] = js.native
  /**
    * Binary PDF data. Use typed arrays
    * (Uint8Array) to improve the memory usage. If PDF data is BASE64-encoded,
    * use atob() to convert it to a binary string first.
    */
  var data: js.UndefOr[js.typedarray.Uint8Array | BufferSource | String] = js.native
  /**
    * Disable pre-fetching of PDF
    *   file data. When range requests are enabled PDF.js will automatically keep
    *   fetching more data even if it isn't needed to display the current page.
    *   The default value is `false`.
    *   NOTE: It is also necessary to disable streaming, see above,
    *         in order for disabling of pre-fetching to work correctly.
    */
  var disableAutoFetch: js.UndefOr[Boolean] = js.native
  /**
    * Disable the use of
    *   `URL.createObjectURL`, for compatibility with older browsers.
    *   The default value is `false`.
    */
  var disableCreateObjectURL: js.UndefOr[Boolean] = js.native
  /**
    * By default fonts are
    *   converted to OpenType fonts and loaded via font face rules. If disabled,
    *   fonts will be rendered using a built-in font renderer that constructs the
    *   glyphs with primitive path commands. The default value is `false`.
    */
  var disableFontFace: js.UndefOr[Boolean] = js.native
  /**
    * Disable range request loading
    *   of PDF files. When enabled, and if the server supports partial content
    *   requests, then the PDF will be fetched in chunks.
    *   The default value is `false`.
    */
  var disableRange: js.UndefOr[Boolean] = js.native
  /**
    * Disable streaming of PDF file
    *   data. By default PDF.js attempts to load PDFs in chunks.
    *   The default value is `false`.
    */
  var disableStream: js.UndefOr[Boolean] = js.native
  /**
    * The base URL of the document,
    * used when attempting to recover valid absolute URLs for annotations, and
    * outline items, that (incorrectly) only specify relative URLs.
    */
  var docBaseUrl: js.UndefOr[String] = js.native
  /**
    * Basic authentication headers.
    */
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.native
  /*
    * A typed array with the first portion or
    * all of the pdf data. Used by the extension since some data is already
    * loaded before the switch to range requests.  */
  var initialData: js.UndefOr[js.typedarray.Uint8Array | BufferSource] = js.native
  /**
    * Determines if we can eval
    * strings as JS. Primarily used to improve performance of font rendering,
    * and when parsing PDF functions. The default value is `true`.
    */
  var isEvalSupported: js.UndefOr[Boolean] = js.native
  /*
    * The PDF file length. It's used for progress
    * reports and range requests operations.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed image size
    * in total pixels, i.e. width * height. Images above this value will not be
    * rendered. Use -1 for no limit, which is also the default value.
    */
  var maxImageSize: js.UndefOr[Double] = js.native
  /**
    * Strategy for
    * decoding certain (simple) JPEG images in the browser. This is useful for
    * environments without DOM image and canvas support, such as e.g. Node.js.
    * Valid values are 'decode', 'display' or 'none'; where 'decode' is intended
    * for browsers with full image/canvas support, 'display' for environments
    * with limited image support through stubs (useful for SVG conversion),
    * and 'none' where JPEG images will be decoded entirely by PDF.js.
    * The default value is 'decode'.
    */
  var nativeImageDecoderSupport: js.UndefOr[decode | display | none] = js.native
  /**
    * For decrypting password-protected PDFs.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Enables special hooks for debugging
    * PDF.js (see `web/debugger.js`). The default value is `false`.
    */
  var pdfBug: js.UndefOr[Boolean] = js.native
  /** range */
  var range: js.UndefOr[PDFDataRangeTransport] = js.native
  /**
    * Optional parameter to specify
    * maximum number of bytes fetched per range request. The default value is
    * 2^16 = 65536. */
  var rangeChunkSize: js.UndefOr[Double] = js.native
  /**
    * Reject certain promises, e.g.
    * `getOperatorList`, `getTextContent`, and `RenderTask`, when the associated
    * PDF data cannot be successfully parsed, instead of attempting to recover
    * whatever possible of the data. The default value is `false`.
    */
  var stopAtErrors: js.UndefOr[Boolean] = js.native
  /** The URL of the PDF. */
  var url: js.UndefOr[String] = js.native
  /**
    * Controls the logging level; the
    * constants from {VerbosityLevel} should be used.
    */
  var verbosity: js.UndefOr[Double] = js.native
  /**
    * Indicates whether or not cross-site
    * Access-Control requests should be made using credentials such as cookies
    * or authorization headers. The default is false.
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
  /**
    * The worker that will be used for
    * the loading and parsing of the PDF data.
    */
  var worker: js.UndefOr[PDFWorker] = js.native
}

object PDFSource {
  @scala.inline
  def apply(): PDFSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFSource]
  }
  @scala.inline
  implicit class PDFSourceOps[Self <: PDFSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCMapReaderFactory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMapReaderFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCMapReaderFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMapReaderFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withCMapPacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cMapPacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCMapPacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cMapPacked")(js.undefined)
        ret
    }
    @scala.inline
    def withCMapUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cMapUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCMapUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cMapUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDataUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.Uint8Array | BufferSource | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoFetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFetch")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCreateObjectURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCreateObjectURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCreateObjectURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCreateObjectURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFontFace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFontFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFontFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFontFace")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStream")(js.undefined)
        ret
    }
    @scala.inline
    def withDocBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDataUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialDataArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialData(value: js.typedarray.Uint8Array | BufferSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialData")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEvalSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEvalSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEvalSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEvalSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxImageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeImageDecoderSupport(value: decode | display | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeImageDecoderSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeImageDecoderSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeImageDecoderSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfBug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfBug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdfBug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfBug")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: PDFDataRangeTransport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAtErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopAtErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbosity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withWorker(value: PDFWorker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(js.undefined)
        ret
    }
  }
  
}

