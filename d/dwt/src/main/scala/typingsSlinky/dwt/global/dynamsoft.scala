package typingsSlinky.dwt.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dynamsoft")
@js.native
object dynamsoft extends js.Object {
  @js.native
  /**
    * Constructs a new KPainter
    */
  class BarcodeReader ()
    extends typingsSlinky.dwt.dynamsoft.BarcodeReader {
    def this(dbrKey: String) = this()
  }
  
  var TaskQueue: typingsSlinky.dwt.TaskQueue = js.native
  var dbrEnv: typingsSlinky.dwt.dbrEnv = js.native
  /**dwtDbrDemo20170613 */
  var initOrder: js.Any = js.native
  var lib: js.Any = js.native
  var managerEnv: js.Any = js.native
  var navInfo: js.Any = js.native
  /* static members */
  @js.native
  object BarcodeReader extends js.Object {
    var length: Double = js.native
    var name: String = js.native
    var version: String = js.native
    def BarcodeReaderException(): js.Any = js.native
    def initServiceConnection(): js.Promise[_] = js.native
    /** Barcode Formats */
    @js.native
    object EnumBarcodeFormat extends js.Object {
      /* 0x10000000 */ val AZTEC: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.AZTEC with Double = js.native
      /* 503317503 */ val All: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.All with Double = js.native
      /* 0x8 */ val CODABAR: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODABAR with Double = js.native
      /* 0x2 */ val CODE_128: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODE_128 with Double = js.native
      /* 0x1 */ val CODE_39: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODE_39 with Double = js.native
      /* 0x4 */ val CODE_93: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODE_93 with Double = js.native
      /* 0x8000000 */ val DATAMATRIX: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.DATAMATRIX with Double = js.native
      /* 0x20 */ val EAN_13: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.EAN_13 with Double = js.native
      /* 0x40 */ val EAN_8: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.EAN_8 with Double = js.native
      /* 0x200 */ val INDUSTRIAL_25: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.INDUSTRIAL_25 with Double = js.native
      /* 0x10 */ val ITF: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.ITF with Double = js.native
      /* 0x3FF */ val OneD: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.OneD with Double = js.native
      /* 0x2000000 */ val PDF417: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.PDF417 with Double = js.native
      /* 0x4000000 */ val QR_CODE: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.QR_CODE with Double = js.native
      /* 0x80 */ val UPC_A: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.UPC_A with Double = js.native
      /* 0x100 */ val UPC_E: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.UPC_E with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat with Double] = js.native
    }
    
    @js.native
    object EnumConflictMode extends js.Object {
      /* 1 */ val ECM_Ignore: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumConflictMode.ECM_Ignore with Double = js.native
      /* 2 */ val ECM_Overwrite: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumConflictMode.ECM_Overwrite with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumConflictMode with Double] = js.native
    }
    
    @js.native
    object EnumErrorCode extends js.Object {
      /* -10017 */ val DBR_1D_LICENSE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_1D_LICENSE_INVALID with Double = js.native
      /* -10009 */ val DBR_BARCODE_FORMAT_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_BARCODE_FORMAT_INVALID with Double = js.native
      /* -10007 */ val DBR_BPP_NOT_SUPPORTED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_BPP_NOT_SUPPORTED with Double = js.native
      /* -10025 */ val DBR_CUSTOM_MODULESIZE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_CUSTOM_MODULESIZE_INVALID with Double = js.native
      /* -10010 */ val DBR_CUSTOM_REGION_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_CUSTOM_REGION_INVALID with Double = js.native
      /* -10024 */ val DBR_CUSTOM_SIZE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_CUSTOM_SIZE_INVALID with Double = js.native
      /* -10020 */ val DBR_DATAMATRIX_LICENSE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_DATAMATRIX_LICENSE_INVALID with Double = js.native
      /* -10041 */ val DBR_DBRERR_AZTEC_LICENSE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_DBRERR_AZTEC_LICENSE_INVALID with Double = js.native
      /* -10018 */ val DBR_DIB_BUFFER_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_DIB_BUFFER_INVALID with Double = js.native
      /* -10039 */ val DBR_DOMAIN_NOT_MATCHED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_DOMAIN_NOT_MATCHED with Double = js.native
      /* -10006 */ val DBR_FILETYPE_NOT_SUPPORTED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_FILETYPE_NOT_SUPPORTED with Double = js.native
      /* -10005 */ val DBR_FILE_NOT_FOUND: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_FILE_NOT_FOUND with Double = js.native
      /* -10012 */ val DBR_IMAGE_READ_FAILED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_IMAGE_READ_FAILED with Double = js.native
      /* -10008 */ val DBR_INDEX_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_INDEX_INVALID with Double = js.native
      /* -10032 */ val DBR_JSON_KEY_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_JSON_KEY_INVALID with Double = js.native
      /* -10034 */ val DBR_JSON_NAME_KEY_MISSING: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_JSON_NAME_KEY_MISSING with Double = js.native
      /* -10037 */ val DBR_JSON_NAME_REFERENCE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_JSON_NAME_REFERENCE_INVALID with Double = js.native
      /* -10035 */ val DBR_JSON_NAME_VALUE_DUPLICATED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_JSON_NAME_VALUE_DUPLICATED with Double = js.native
      /* -10030 */ val DBR_JSON_PARSE_FAILED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_JSON_PARSE_FAILED with Double = js.native
      /* -10031 */ val DBR_JSON_TYPE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_JSON_TYPE_INVALID with Double = js.native
      /* -10033 */ val DBR_JSON_VALUE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_JSON_VALUE_INVALID with Double = js.native
      /* -10004 */ val DBR_LICENSE_EXPIRED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_LICENSE_EXPIRED with Double = js.native
      /* -10003 */ val DBR_LICENSE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_LICENSE_INVALID with Double = js.native
      /* -10011 */ val DBR_MAX_BARCODE_NUMBER_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_MAX_BARCODE_NUMBER_INVALID with Double = js.native
      /* -10001 */ val DBR_NO_MEMORY: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_NO_MEMORY with Double = js.native
      /* -10002 */ val DBR_NULL_REFERENCE: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_NULL_REFERENCE with Double = js.native
      /* -10023 */ val DBR_PAGE_NUMBER_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_PAGE_NUMBER_INVALID with Double = js.native
      /* 10038 */ val DBR_PARAMETER_VALUE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_PARAMETER_VALUE_INVALID with Double = js.native
      /* 10019 */ val DBR_PDF417_LICENSE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_PDF417_LICENSE_INVALID with Double = js.native
      /* -10022 */ val DBR_PDF_DLL_MISSING: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_PDF_DLL_MISSING with Double = js.native
      /* -10021 */ val DBR_PDF_READ_FAILED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_PDF_READ_FAILED with Double = js.native
      /* -10016 */ val DBR_QR_LICENSE_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_QR_LICENSE_INVALID with Double = js.native
      /* -10026 */ val DBR_RECOGNITION_TIMEOUT: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_RECOGNITION_TIMEOUT with Double = js.native
      /* -10040 */ val DBR_RESERVEDINFO_NOT_MATCHED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_RESERVEDINFO_NOT_MATCHED with Double = js.native
      /* 0 */ val DBR_SUCCESS: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_SUCCESS with Double = js.native
      /* 1 */ val DBR_SYSTEM_EXCEPTION: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_SYSTEM_EXCEPTION with Double = js.native
      /* -10036 */ val DBR_TEMPLATE_NAME_INVALID: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_TEMPLATE_NAME_INVALID with Double = js.native
      /* -10013 */ val DBR_TIFF_READ_FAILED: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_TIFF_READ_FAILED with Double = js.native
      /* -10000 */ val DBR_UNKNOWN: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode.DBR_UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumErrorCode with Double] = js.native
    }
    
    @js.native
    object EnumImagePixelFormat extends js.Object {
      /* 7 */ val IPF_ARGB_8888: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_ARGB_8888 with Double = js.native
      /* 0 */ val IPF_Binary: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_Binary with Double = js.native
      /* 1 */ val IPF_BinaryInverted: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_BinaryInverted with Double = js.native
      /* 2 */ val IPF_GrayScaled: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_GrayScaled with Double = js.native
      /* 3 */ val IPF_NV21: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_NV21 with Double = js.native
      /* 5 */ val IPF_RGB_555: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_RGB_555 with Double = js.native
      /* 4 */ val IPF_RGB_565: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_RGB_565 with Double = js.native
      /* 6 */ val IPF_RGB_888: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_RGB_888 with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat with Double] = js.native
    }
    
    @js.native
    object EnumResultType extends js.Object {
      /* 2 */ val EDT_CandidateText: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumResultType.EDT_CandidateText with Double = js.native
      /* 3 */ val EDT_PartialText: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumResultType.EDT_PartialText with Double = js.native
      /* 1 */ val EDT_RawText: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumResultType.EDT_RawText with Double = js.native
      /* 0 */ val EDT_StandardText: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumResultType.EDT_StandardText with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumResultType with Double] = js.native
    }
    
    @js.native
    object EnumTerminateStage extends js.Object {
      /* 1 */ val ETS_Localized: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Localized with Double = js.native
      /* 0 */ val ETS_Prelocalized: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Prelocalized with Double = js.native
      /* 2 */ val ETS_Recognized: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumTerminateStage.ETS_Recognized with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumTerminateStage with Double] = js.native
    }
    
  }
  
  /**dbrMasterPage20170526 */
  @js.native
  object dcp extends js.Object {
    var ifCheck64bitServiceFirst: Boolean = js.native
  }
  
}

