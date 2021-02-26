package typingsSlinky.jsqrcode

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.ImageData
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`0`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`0x5412`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`10`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`11`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`12`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`13`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`14`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`16`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`1`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`2`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`3`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`4`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`8`
import typingsSlinky.jsqrcode.jsqrcodeNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AlignmentPattern")
  @js.native
  class AlignmentPattern protected ()
    extends typingsSlinky.jsqrcode.AlignmentPattern {
    def this(posX: Double, posY: Double, estimatedModuleSize: Double) = this()
  }
  
  @JSGlobal("AlignmentPatternFinder")
  @js.native
  class AlignmentPatternFinder protected ()
    extends typingsSlinky.jsqrcode.AlignmentPatternFinder {
    def this(
      image: js.typedarray.Uint8Array,
      startX: Double,
      startY: Double,
      width: Double,
      height: Double,
      moduleSize: Double,
      resultPointCallback: ResultPointCallback
    ) = this()
  }
  
  @JSGlobal("BITS_SET_IN_HALF_BYTE")
  @js.native
  val BITS_SET_IN_HALF_BYTE: js.Tuple16[`0`, `1`, `1`, `2`, `1`, `2`, `2`, `3`, `1`, `2`, `2`, `3`, `2`, `3`, `3`, `4`] = js.native
  
  @JSGlobal("BitMatrix")
  @js.native
  class BitMatrix protected ()
    extends typingsSlinky.jsqrcode.BitMatrix {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
  }
  
  @JSGlobal("BitMatrixParser")
  @js.native
  class BitMatrixParser protected ()
    extends typingsSlinky.jsqrcode.BitMatrixParser {
    def this(bitMatrix: typingsSlinky.jsqrcode.BitMatrix) = this()
  }
  
  @JSGlobal("CENTER_QUORUM")
  @js.native
  val CENTER_QUORUM: Double = js.native
  
  @JSGlobal("DataBlock")
  @js.native
  class DataBlock protected ()
    extends typingsSlinky.jsqrcode.DataBlock {
    def this(numDataCodewords: Double, codewords: js.Array[Double]) = this()
  }
  object DataBlock {
    
    /* static member */
    @JSGlobal("DataBlock.getDataBlocks")
    @js.native
    def getDataBlocks(
      rawCodewords: js.Array[Double],
      version: typingsSlinky.jsqrcode.Version,
      ecLevel: typingsSlinky.jsqrcode.ErrorCorrectionLevel
    ): js.Array[typingsSlinky.jsqrcode.DataBlock] = js.native
  }
  
  @JSGlobal("DataMask")
  @js.native
  abstract class DataMask ()
    extends typingsSlinky.jsqrcode.DataMask
  object DataMask {
    
    @JSGlobal("DataMask")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("DataMask.DATA_MASKS")
    @js.native
    def DATA_MASKS: js.Array[typingsSlinky.jsqrcode.DataMask] = js.native
    @scala.inline
    def DATA_MASKS_=(x: js.Array[typingsSlinky.jsqrcode.DataMask]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_MASKS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("DataMask.forReference")
    @js.native
    def forReference(reference: Double): typingsSlinky.jsqrcode.DataMask = js.native
  }
  
  @JSGlobal("DataMask000")
  @js.native
  class DataMask000 ()
    extends typingsSlinky.jsqrcode.DataMask000
  
  @JSGlobal("DataMask001")
  @js.native
  class DataMask001 ()
    extends typingsSlinky.jsqrcode.DataMask001
  
  @JSGlobal("DataMask010")
  @js.native
  class DataMask010 ()
    extends typingsSlinky.jsqrcode.DataMask010
  
  @JSGlobal("DataMask011")
  @js.native
  class DataMask011 ()
    extends typingsSlinky.jsqrcode.DataMask011
  
  @JSGlobal("DataMask100")
  @js.native
  class DataMask100 ()
    extends typingsSlinky.jsqrcode.DataMask100
  
  @JSGlobal("DataMask101")
  @js.native
  class DataMask101 ()
    extends typingsSlinky.jsqrcode.DataMask101
  
  @JSGlobal("DataMask110")
  @js.native
  class DataMask110 ()
    extends typingsSlinky.jsqrcode.DataMask110
  
  @JSGlobal("DataMask111")
  @js.native
  class DataMask111 ()
    extends typingsSlinky.jsqrcode.DataMask111
  
  object Decoder {
    
    @JSGlobal("Decoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Decoder.correctErrors")
    @js.native
    def correctErrors(codewordBytes: js.Array[Double], numDataCodewords: Double): Unit = js.native
    
    @JSGlobal("Decoder.decode")
    @js.native
    def decode(bits: typingsSlinky.jsqrcode.BitMatrix): typingsSlinky.jsqrcode.QRCodeDataBlockReader = js.native
    
    @JSGlobal("Decoder.rsDecoder")
    @js.native
    def rsDecoder: typingsSlinky.jsqrcode.ReedSolomonDecoder = js.native
    @scala.inline
    def rsDecoder_=(x: typingsSlinky.jsqrcode.ReedSolomonDecoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsDecoder")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Detector")
  @js.native
  class Detector protected ()
    extends typingsSlinky.jsqrcode.Detector {
    def this(image: js.typedarray.Uint8Array) = this()
  }
  
  @JSGlobal("DetectorResult")
  @js.native
  class DetectorResult protected ()
    extends typingsSlinky.jsqrcode.DetectorResult {
    def this(
      bits: typingsSlinky.jsqrcode.BitMatrix,
      points: js.Tuple3[
            typingsSlinky.jsqrcode.DetectorResult, 
            typingsSlinky.jsqrcode.DetectorResult, 
            typingsSlinky.jsqrcode.DetectorResult
          ]
    ) = this()
    def this(
      bits: typingsSlinky.jsqrcode.BitMatrix,
      points: js.Tuple4[
            typingsSlinky.jsqrcode.DetectorResult, 
            typingsSlinky.jsqrcode.DetectorResult, 
            typingsSlinky.jsqrcode.DetectorResult, 
            typingsSlinky.jsqrcode.DetectorResult
          ]
    ) = this()
  }
  
  @JSGlobal("ECB")
  @js.native
  class ECB protected ()
    extends typingsSlinky.jsqrcode.ECB {
    def this(count: Double, dataCodewords: Double) = this()
  }
  
  @JSGlobal("ECBlocks")
  @js.native
  class ECBlocks protected ()
    extends typingsSlinky.jsqrcode.ECBlocks {
    def this(ecCodewordsPerBlock: Double, ecBlocks1: typingsSlinky.jsqrcode.ECB) = this()
    def this(
      ecCodewordsPerBlock: Double,
      ecBlocks1: typingsSlinky.jsqrcode.ECB,
      ecBlocks2: typingsSlinky.jsqrcode.ECB
    ) = this()
  }
  
  @JSGlobal("ErrorCorrectionLevel")
  @js.native
  class ErrorCorrectionLevel protected ()
    extends typingsSlinky.jsqrcode.ErrorCorrectionLevel {
    def this(ordinal: Double, bits: Double, name: String) = this()
  }
  object ErrorCorrectionLevel {
    
    /* static member */
    @JSGlobal("ErrorCorrectionLevel.forBits")
    @js.native
    def forBits(bits: Double): typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  }
  
  @JSGlobal("FORMAT_INFO_DECODE_LOOKUP")
  @js.native
  val FORMAT_INFO_DECODE_LOOKUP: js.Array[js.Any] = js.native
  
  @JSGlobal("FORMAT_INFO_MASK_QR")
  @js.native
  val FORMAT_INFO_MASK_QR: `0x5412` = js.native
  
  @JSGlobal("FOR_BITS")
  @js.native
  val FOR_BITS: js.Array[typingsSlinky.jsqrcode.ErrorCorrectionLevel] = js.native
  
  @JSGlobal("FinderPattern")
  @js.native
  class FinderPattern protected ()
    extends typingsSlinky.jsqrcode.FinderPattern {
    def this(posX: Double, posY: Double, estimatedModuleSize: Double) = this()
  }
  
  @JSGlobal("FinderPatternFinder")
  @js.native
  class FinderPatternFinder ()
    extends typingsSlinky.jsqrcode.FinderPatternFinder
  
  @JSGlobal("FinderPatternInfo")
  @js.native
  class FinderPatternInfo protected ()
    extends typingsSlinky.jsqrcode.FinderPatternInfo {
    def this(patternCenters: js.Tuple3[
            typingsSlinky.jsqrcode.AlignmentPattern, 
            typingsSlinky.jsqrcode.AlignmentPattern, 
            typingsSlinky.jsqrcode.AlignmentPattern
          ]) = this()
  }
  
  @JSGlobal("FormatInformation")
  @js.native
  class FormatInformation ()
    extends typingsSlinky.jsqrcode.FormatInformation
  object FormatInformation {
    
    /* static member */
    @JSGlobal("FormatInformation.decodeFormatInformation")
    @js.native
    def decodeFormatInformation(maskedFormatInfo: Double): typingsSlinky.jsqrcode.FormatInformation = js.native
    
    /* static member */
    @JSGlobal("FormatInformation.doDecodeFormatInformation")
    @js.native
    def doDecodeFormatInformation(maskedFormatInfo: Double): typingsSlinky.jsqrcode.FormatInformation = js.native
    
    /* static member */
    @JSGlobal("FormatInformation.numBitsDiffering")
    @js.native
    def numBitsDiffering(a: Double, b: js.Tuple2[Double, Double]): Double = js.native
  }
  
  @JSGlobal("GF256")
  @js.native
  class GF256 protected ()
    extends typingsSlinky.jsqrcode.GF256 {
    def this(primitive: Double) = this()
  }
  object GF256 {
    
    /* static member */
    @JSGlobal("GF256.DATA_MATRIX_FIELD")
    @js.native
    val DATA_MATRIX_FIELD: typingsSlinky.jsqrcode.GF256 = js.native
    
    /* static member */
    @JSGlobal("GF256.QR_CODE_FIELD")
    @js.native
    val QR_CODE_FIELD: typingsSlinky.jsqrcode.GF256 = js.native
    
    /* static member */
    @JSGlobal("GF256.addOrSubtract")
    @js.native
    def addOrSubtract(a: Double, b: Double): Double = js.native
  }
  
  @JSGlobal("GF256Poly")
  @js.native
  class GF256Poly protected ()
    extends typingsSlinky.jsqrcode.GF256Poly {
    def this(field: typingsSlinky.jsqrcode.GF256, coefficients: js.Array[Double]) = this()
  }
  
  object GridSampler {
    
    @JSGlobal("GridSampler.checkAndNudgePoints")
    @js.native
    def checkAndNudgePoints(image: js.typedarray.Uint8Array, points: js.Array[Double]): Unit = js.native
    
    @JSGlobal("GridSampler.sampleGrid3")
    @js.native
    def sampleGrid3(
      image: js.typedarray.Uint8Array,
      dimension: Double,
      transform: typingsSlinky.jsqrcode.PerspectiveTransform
    ): typingsSlinky.jsqrcode.BitMatrix = js.native
    
    @JSGlobal("GridSampler.sampleGridx")
    @js.native
    def sampleGridx(
      image: js.typedarray.Uint8Array,
      dimension: Double,
      p1ToX: Double,
      p1ToY: Double,
      p2ToX: Double,
      p2ToY: Double,
      p3ToX: Double,
      p3ToY: Double,
      p4ToX: Double,
      p4ToY: Double,
      p1FromX: Double,
      p1FromY: Double,
      p2FromX: Double,
      p2FromY: Double,
      p3FromX: Double,
      p3FromY: Double,
      p4FromX: Double,
      p4FromY: Double
    ): typingsSlinky.jsqrcode.BitMatrix = js.native
  }
  
  @JSGlobal("H")
  @js.native
  val H: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("INTEGER_MATH_SHIFT")
  @js.native
  val INTEGER_MATH_SHIFT: Double = js.native
  
  @JSGlobal("L")
  @js.native
  val L: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("M")
  @js.native
  val M: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("MAX_MODULES")
  @js.native
  val MAX_MODULES: Double = js.native
  
  @JSGlobal("MIN_SKIP")
  @js.native
  val MIN_SKIP: Double = js.native
  
  @JSGlobal("PerspectiveTransform")
  @js.native
  class PerspectiveTransform protected ()
    extends typingsSlinky.jsqrcode.PerspectiveTransform {
    def this(
      a11: Double,
      a21: Double,
      a31: Double,
      a12: Double,
      a22: Double,
      a32: Double,
      a13: Double,
      a23: Double,
      a33: Double
    ) = this()
  }
  object PerspectiveTransform {
    
    /* static member */
    @JSGlobal("PerspectiveTransform.quadrilateralToQuadrilateral")
    @js.native
    def quadrilateralToQuadrilateral(
      x0: Double,
      y0: Double,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x0p: Double,
      y0p: Double,
      x1p: Double,
      y1p: Double,
      x2p: Double,
      y2p: Double,
      x3p: Double,
      y3p: Double
    ): typingsSlinky.jsqrcode.PerspectiveTransform = js.native
    
    /* static member */
    @JSGlobal("PerspectiveTransform.quadrilateralToSquare")
    @js.native
    def quadrilateralToSquare(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typingsSlinky.jsqrcode.PerspectiveTransform = js.native
    
    /* static member */
    @JSGlobal("PerspectiveTransform.squareToQuadrilateral")
    @js.native
    def squareToQuadrilateral(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typingsSlinky.jsqrcode.PerspectiveTransform = js.native
  }
  
  @JSGlobal("Q")
  @js.native
  val Q: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("QRCodeDataBlockReader")
  @js.native
  class QRCodeDataBlockReader protected ()
    extends typingsSlinky.jsqrcode.QRCodeDataBlockReader {
    def this(blocks: js.Array[Double], version: Double, numErrorCorrectionCode: Double) = this()
  }
  
  @JSGlobal("ReedSolomonDecoder")
  @js.native
  class ReedSolomonDecoder protected ()
    extends typingsSlinky.jsqrcode.ReedSolomonDecoder {
    def this(field: typingsSlinky.jsqrcode.GF256) = this()
  }
  
  @JSGlobal("URShift")
  @js.native
  def URShift(number: Double, bits: Double): Double = js.native
  
  @JSGlobal("Version")
  @js.native
  class Version protected ()
    extends typingsSlinky.jsqrcode.Version {
    def this(
      versionNumber: Double,
      alignmentPatternCenters: js.Array[Double],
      ecBlocks1: typingsSlinky.jsqrcode.ECBlocks,
      ecBlocks2: typingsSlinky.jsqrcode.ECBlocks,
      ecBlocks3: typingsSlinky.jsqrcode.ECBlocks,
      ecBlocks4: typingsSlinky.jsqrcode.ECBlocks
    ) = this()
  }
  object Version {
    
    /* static member */
    @JSGlobal("Version.VERSIONS")
    @js.native
    val VERSIONS: js.Array[typingsSlinky.jsqrcode.Version] = js.native
    
    /* static member */
    @JSGlobal("Version.VERSION_DECODE_INFO")
    @js.native
    val VERSION_DECODE_INFO: js.Array[js.Any] = js.native
    
    /* static member */
    @JSGlobal("Version.decodeVersionInformation")
    @js.native
    def decodeVersionInformation(versionBits: Double): typingsSlinky.jsqrcode.Version = js.native
    
    /* static member */
    @JSGlobal("Version.getProvisionalVersionForDimension")
    @js.native
    def getProvisionalVersionForDimension(dimension: Double): typingsSlinky.jsqrcode.Version = js.native
    
    /* static member */
    @JSGlobal("Version.getVersionForNumber")
    @js.native
    def getVersionForNumber(versionNumber: Double): typingsSlinky.jsqrcode.Version = js.native
  }
  
  @JSGlobal("buildVersions")
  @js.native
  def buildVersions(): js.Array[typingsSlinky.jsqrcode.Version] = js.native
  
  object qrcode {
    
    @JSGlobal("qrcode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("qrcode.binarize")
    @js.native
    def binarize(th: Double): js.Array[Boolean] = js.native
    
    @JSGlobal("qrcode.callback")
    @js.native
    def callback(result: String): Unit = js.native
    
    @JSGlobal("qrcode.captureToCanvas")
    @js.native
    def captureToCanvas(): Unit = js.native
    
    @JSGlobal("qrcode.debug")
    @js.native
    def debug: Boolean = js.native
    @scala.inline
    def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSGlobal("qrcode.decode")
    @js.native
    def decode(): Unit = js.native
    @JSGlobal("qrcode.decode")
    @js.native
    def decode(src: String): Unit = js.native
    
    @JSGlobal("qrcode.decode_url")
    @js.native
    def decodeUrl(s: String): String = js.native
    
    @JSGlobal("qrcode.decode_utf8")
    @js.native
    def decodeUtf8(s: String): String = js.native
    
    @JSGlobal("qrcode.getMiddleBrightnessPerArea")
    @js.native
    def getMiddleBrightnessPerArea(image: js.Array[Double]): js.Array[js.Array[Double]] = js.native
    
    @JSGlobal("qrcode.getPixel")
    @js.native
    def getPixel(x: Double, y: Double): Double = js.native
    
    @JSGlobal("qrcode.grayScaleToBitmap")
    @js.native
    def grayScaleToBitmap(grayScale: js.Array[Double]): js.typedarray.Uint8Array = js.native
    
    @JSGlobal("qrcode.grayscale")
    @js.native
    def grayscale(): js.typedarray.Uint8Array = js.native
    
    @JSGlobal("qrcode.height")
    @js.native
    def height: Double = js.native
    @scala.inline
    def height_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSGlobal("qrcode.imagedata")
    @js.native
    def imagedata: ImageData = js.native
    @scala.inline
    def imagedata_=(x: ImageData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagedata")(x.asInstanceOf[js.Any])
    
    @JSGlobal("qrcode.isUrl")
    @js.native
    def isUrl(s: String): Boolean = js.native
    
    @JSGlobal("qrcode.maxImgSize")
    @js.native
    def maxImgSize: Double = js.native
    @scala.inline
    def maxImgSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxImgSize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("qrcode.orderBestPatterns")
    @js.native
    def orderBestPatterns(patterns: js.Array[typingsSlinky.jsqrcode.AlignmentPattern]): Unit = js.native
    
    @JSGlobal("qrcode.process")
    @js.native
    def process(ctx: CanvasRenderingContext2D): String = js.native
    
    @JSGlobal("qrcode.qrCodeSymbol")
    @js.native
    def qrCodeSymbol: js.Any = js.native
    @scala.inline
    def qrCodeSymbol_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qrCodeSymbol")(x.asInstanceOf[js.Any])
    
    @JSGlobal("qrcode.setWebcam")
    @js.native
    def setWebcam(videoId: String): Unit = js.native
    
    @JSGlobal("qrcode.sizeOfDataLengthInfo")
    @js.native
    val sizeOfDataLengthInfo: js.Tuple3[
        js.Tuple4[`10`, `9`, `8`, `8`], 
        js.Tuple4[`12`, `11`, `16`, `10`], 
        js.Tuple4[`14`, `13`, `16`, `12`]
      ] = js.native
    
    @JSGlobal("qrcode.vidError")
    @js.native
    def vidError(): Unit = js.native
    @JSGlobal("qrcode.vidError")
    @js.native
    def vidError(error: js.Any): Unit = js.native
    
    @JSGlobal("qrcode.width")
    @js.native
    def width: Double = js.native
    @scala.inline
    def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
}
