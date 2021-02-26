package typingsSlinky.dv

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dv.dvNumbers.`4`
import typingsSlinky.dv.dvNumbers.`8`
import typingsSlinky.dv.dvStrings.AZTEC
import typingsSlinky.dv.dvStrings.CODE_128
import typingsSlinky.dv.dvStrings.CODE_39
import typingsSlinky.dv.dvStrings.DATA_MATRIX
import typingsSlinky.dv.dvStrings.EAN_13
import typingsSlinky.dv.dvStrings.EAN_8
import typingsSlinky.dv.dvStrings.ITF
import typingsSlinky.dv.dvStrings.None
import typingsSlinky.dv.dvStrings.PDF_417
import typingsSlinky.dv.dvStrings.QR_CODE
import typingsSlinky.dv.dvStrings.UPC_A
import typingsSlinky.dv.dvStrings.UPC_E
import typingsSlinky.dv.dvStrings.auto
import typingsSlinky.dv.dvStrings.auto_only
import typingsSlinky.dv.dvStrings.auto_osd
import typingsSlinky.dv.dvStrings.bg
import typingsSlinky.dv.dvStrings.box
import typingsSlinky.dv.dvStrings.circle_word
import typingsSlinky.dv.dvStrings.clear
import typingsSlinky.dv.dvStrings.fg
import typingsSlinky.dv.dvStrings.flip
import typingsSlinky.dv.dvStrings.gray
import typingsSlinky.dv.dvStrings.hocr
import typingsSlinky.dv.dvStrings.horizontal
import typingsSlinky.dv.dvStrings.jpg
import typingsSlinky.dv.dvStrings.linear
import typingsSlinky.dv.dvStrings.log
import typingsSlinky.dv.dvStrings.max
import typingsSlinky.dv.dvStrings.min
import typingsSlinky.dv.dvStrings.osd_only
import typingsSlinky.dv.dvStrings.plain
import typingsSlinky.dv.dvStrings.png
import typingsSlinky.dv.dvStrings.raw
import typingsSlinky.dv.dvStrings.rgb
import typingsSlinky.dv.dvStrings.rgba
import typingsSlinky.dv.dvStrings.set
import typingsSlinky.dv.dvStrings.single_block
import typingsSlinky.dv.dvStrings.single_block_vert_text
import typingsSlinky.dv.dvStrings.single_char
import typingsSlinky.dv.dvStrings.single_column
import typingsSlinky.dv.dvStrings.single_line
import typingsSlinky.dv.dvStrings.single_word
import typingsSlinky.dv.dvStrings.sparse_text
import typingsSlinky.dv.dvStrings.sparse_text_osd
import typingsSlinky.dv.dvStrings.unlv
import typingsSlinky.dv.dvStrings.vertical
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dv", "Image")
  @js.native
  class Image protected () extends StObject {
    /**
      *  Creates a copy of otherImage.
      */
    def this(otherImage: Image) = this()
    def this(`type`: jpg, buffer: Buffer) = this()
    /**
      * Creates an image from a Buffer object, that contains the PNG/JPG encoded image.
      */
    def this(`type`: png, buffer: Buffer) = this()
    /**
      * Creates a 32 bit imagen from three 8 bit images, where each image represents one channel of RGB or HSV.
      */
    def this(image1: Image, image2: Image, image3: Image) = this()
    /**
      * Creates an empty image with the specified dimensions (!!! note: this constructor is experimental and likely to change).
      */
    def this(width: Double, height: Double, depth: Double) = this()
    def this(`type`: gray, buffer: Buffer, width: Double, height: Double) = this()
    def this(`type`: rgba, buffer: Buffer, width: Double, height: Double) = this()
    def this(`type`: rgb, buffer: Buffer, width: Double, height: Double) = this()
    
    /**
      * If the images are monochrome, dispatches to Leptonica's pixOr. Otherwise, returns the channelwise addition of b to a, clipped at 255.
      */
    def add(otherImage: Image): Image = js.native
    
    /**
      * Returns the (boolean) difference of two images with equal depth, aligning them to the upper left corner.
      */
    def and(otherImage: Image): Image = js.native
    
    /**
      * Available for grayscale and color images. Channelwise maps each pixel of image using mapping, which must be an array of length 256 with integer values between 0 and 255.
      * !!! !!! Note: this function actually changes the image!
      * The mask parameter is optional and must be a monochrome image of same width and height; only pixels where mask is 0 will be modified.
      */
    def applyCurve(mapping: js.Array[Double]): this.type = js.native
    def applyCurve(mapping: js.Array[Double], mask: Image): this.type = js.native
    
    /**
      * !!! Note: this function actually changes the image!
      * Fills a specified rectangle with white.
      */
    def clearBox(box: Box): this.type = js.native
    def clearBox(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    /**
      * Applies a Close Filter and returns the result.
      */
    def close(width: Double, height: Double): Image = js.native
    
    /**
      * Only available for monochrome images. Tries to extract connected components (think of flood fill). The connectivity can be specified as 4 or 8 directions.
      */
    @JSName("connectedComponents")
    def connectedComponents_4(connectivity: `4`): js.Array[Component] = js.native
    @JSName("connectedComponents")
    def connectedComponents_8(connectivity: `8`): js.Array[Component] = js.native
    
    /**
      * Applies a convoltuion kernel with the specified dimensions. Image convolution is an operation where each destination pixel is computed based on a weighted sum of a set of nearby source pixels.
      */
    def convolve(halfWidth: Double, halfHeight: Double): Image = js.native
    
    /**
      * Crops an image from this image by the specified rectangle and returns the resulting image.
      */
    def crop(box: Box): Image = js.native
    def crop(x: Double, y: Double, width: Double, height: Double): Image = js.native
    
    /**
      * The depth of the image in bits per pixel, i.e. one of 32 (color), 8 (grayscale) or 1 (monochrome).
      */
    val depth: Double = js.native
    
    /**
      * Applies a Dilate Filter and returns the result.
      */
    def dilate(width: Double, height: Double): Image = js.native
    
    /**
      * The Distance Function works on 1bpp images. It labels each pixel with the largest distance between this and any other pixel in its connected component. The connectivity is either 4 or 8.
      */
    @JSName("distanceFunction")
    def distanceFunction_4(connectivity: `4`): Image = js.native
    @JSName("distanceFunction")
    def distanceFunction_8(connectivity: `8`): Image = js.native
    
    /**
      * !!! Note: this function actually changes the image!
      * Draws a rectangle to this image with the specified border in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
      */
    def drawBox(box: Box, borderWidth: Double, red: Double, green: Double, blue: Double): this.type = js.native
    def drawBox(box: Box, borderWidth: Double, red: Double, green: Double, blue: Double, frac: Double): this.type = js.native
    def drawBox(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      borderWidth: Double,
      red: Double,
      green: Double,
      blue: Double
    ): this.type = js.native
    def drawBox(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      borderWidth: Double,
      red: Double,
      green: Double,
      blue: Double,
      frac: Double
    ): this.type = js.native
    @JSName("drawBox")
    def drawBox_clear(box: Box, borderWidth: Double, operation: clear): this.type = js.native
    @JSName("drawBox")
    def drawBox_clear(x: Double, y: Double, width: Double, height: Double, borderWidth: Double, operation: clear): this.type = js.native
    @JSName("drawBox")
    def drawBox_flip(box: Box, borderWidth: Double, operation: flip): this.type = js.native
    @JSName("drawBox")
    def drawBox_flip(x: Double, y: Double, width: Double, height: Double, borderWidth: Double, operation: flip): this.type = js.native
    /**
      * !!! Note: this function actually changes the image!
      * Draws a rectangle to this image with the specified border. The possible pixel manipulating operations are set, clear and flip.
      */
    @JSName("drawBox")
    def drawBox_set(box: Box, borderWidth: Double, operation: set): this.type = js.native
    @JSName("drawBox")
    def drawBox_set(x: Double, y: Double, width: Double, height: Double, borderWidth: Double, operation: set): this.type = js.native
    
    /**
      * !!! Note: this function actually changes the image!
      * Draws an image to this image with the specified destination box.
      */
    def drawImage(image: Image, box: Box): this.type = js.native
    def drawImage(image: Image, x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    /**
      * !!! Note: this function actually changes the image!
      * Draws a line between p1 and p2 to this image with the specified line width in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
      */
    def drawLine(p1: Point, p2: Point, width: Double, red: Double, green: Double, blue: Double): this.type = js.native
    def drawLine(p1: Point, p2: Point, width: Double, red: Double, green: Double, blue: Double, frac: Double): this.type = js.native
    @JSName("drawLine")
    def drawLine_clear(p1: Point, p2: Point, width: Double, operation: clear): this.type = js.native
    @JSName("drawLine")
    def drawLine_flip(p1: Point, p2: Point, width: Double, operation: flip): this.type = js.native
    /**
      * !!! Note: this function actually changes the image!
      * Draws a line between p1 and p2 to this image with the specified line width. The possible pixel manipulating operations are set, clear and flip.
      */
    @JSName("drawLine")
    def drawLine_set(p1: Point, p2: Point, width: Double, operation: set): this.type = js.native
    
    /**
      * Applies an Erode Filter and returns the result.
      */
    def erode(width: Double, height: Double): Image = js.native
    
    /**
      * !!! Note: this function actually changes the image!
      * Draws a filled rectangle to this image in the specified color with an optional blending parameter (0.0: transparent; 1.0: no transparency).
      */
    def fillBox(box: Box, r: Double, g: Double, b: Double): this.type = js.native
    def fillBox(box: Box, r: Double, g: Double, b: Double, fraction: Double): this.type = js.native
    /**
      * !!! Note: this function actually changes the image!
      * Draws a filled rectangle to this image with the specified value. Works for 8bpp and 1bpp images.
      */
    def fillBox(box: Box, value: Double): this.type = js.native
    def fillBox(x: Double, y: Double, width: Double, height: Double, r: Double, g: Double, b: Double): this.type = js.native
    def fillBox(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      r: Double,
      g: Double,
      b: Double,
      fraction: Double
    ): this.type = js.native
    def fillBox(x: Double, y: Double, width: Double, height: Double, value: Double): this.type = js.native
    
    /**
      * Only available for monochrome images. Tries to find the skew of this image. The resulting angle is in degree. The confidence is between 0.0 and 1.0.
      */
    def findSkew(): Skew = js.native
    
    val height: Double = js.native
    
    /**
      * Only available for grayscale images. Returns the histogram in an array of length 256, where each entry represents the fraction (0.0 to 1.0) of that color in the image.
      * The mask parameter is optional and must be a monochrome image of same width and height; only pixels where mask is 0 will be counted.
      */
    def histogram(): Image = js.native
    def histogram(mask: Image): Image = js.native
    
    /**
      * Creates a mask by testing if pixels (RGB, HSV, ...) are between lower and upper. Formally speaking:
      * lower1 ≤ pixel1 ≤ upper1
      * ∧ lower2 ≤ pixel2 ≤ upper2
      * ∧ lower3 ≤ pixel3 ≤ upper3
      */
    def inRange(lower1: Double, lower2: Double, lower3: Double, upper1: Double, upper2: Double, upper3: Double): Image = js.native
    
    /**
      * Returns the (boolean) inverse of this image.
      */
    def invert(): Image = js.native
    
    /**
      * Detects Line Segments with the specified accuracy (3 is a good start). The number of found line segments can be limited using maxLineSegments (0 is unlimited).
      */
    def lineSegments(accuracy: Double, maxLineSegments: Double, useWeightedMeanShift: Boolean): js.Array[Segment] = js.native
    
    @JSName("maxDynamicRange")
    def maxDynamicRange_linear(scale: linear): Image = js.native
    /**
      * Scales an 8bpp image for maximum dynamic range. scale must be either log or linear.
      */
    @JSName("maxDynamicRange")
    def maxDynamicRange_log(scale: log): Image = js.native
    
    /**
      * Color image quantization using median cut algorithm.
      * colors must be between 2 and 256.
      * Note that support for the resulting palette image is highly experimental at this point;
      * only toGray() and toBuffer('png') are guaranteed to work.
      */
    def medianCutQuant(colors: Double): Image = js.native
    
    /**
      * Color image quantization using an octree based algorithm.
      * colors must be between 2 and 256.
      * Note that support for the resulting palette image is highly experimental at this point;
      * only toGray() and toBuffer('png') are guaranteed to work.
      */
    def octreeColorQuant(colors: Double): Image = js.native
    
    /**
      * Applies an Open Filter and returns the result.
      */
    def open(width: Double, height: Double): Image = js.native
    
    /**
      * Returns the (boolean) union of two images with equal depth, aligning them to the upper left corner.
      */
    def or(otherImage: Image): Image = js.native
    
    /**
      * Applies Otsu's Method for computing the threshold of a grayscale image.
      * It computes a threshold for each tile of the specified size and performs the threshold operation,
      * resulting in a binary image for each tile. These are stitched into the final result.
      * The smooth size controls the a convolution kernel applied to threshold array (use 0 for no smoothing).
      * The score factor controls the fraction of the max. Otsu score (typically 0.1; use 0.0 for standard Otsu).
      */
    def otsuAdaptiveThreshold(
      tileWidth: Double,
      tileHeight: Double,
      smoothWidth: Double,
      smoothHeight: Double,
      scoreFactor: Double
    ): Image = js.native
    
    /**
      * Computes the horizontal or vertical projection of an 1bpp or 8bpp image.
      */
    @JSName("projection")
    def projection_horizontal(mode: horizontal): js.Array[Double] = js.native
    @JSName("projection")
    def projection_vertical(mode: vertical): js.Array[Double] = js.native
    
    /**
      * Applies a rank (0.0 ... 1.0) filter of the specified width
      * and height (think of it as radius) to this image
      * and returns the result.
      * If you set rank to 0.5 you'll get a Median Filter.
      * Note that this type of filter works best with odd sizes like 3 or 5.
      */
    def rankFilter(width: Double, height: Double, rank: Double): Image = js.native
    
    /**
      * Rotates the image around its center by the specified angle in degrees.
      */
    def rotate(angle: Double): Image = js.native
    
    /**
      * Scales an image by scaleX and scaleY (1.0 = 100%).
      */
    def scale(scaleX: Double, scaleY: Double): Image = js.native
    /**
      * Scales an image proportionally by scale (1.0 = 100%).
      */
    def scale(scale: Double): Image = js.native
    
    /**
      * Sets the specified value to each pixel set in the mask.
      */
    def setMasked(mask: Image, value: Double): Image = js.native
    
    /**
      * If the images are monochrome, dispatches to Leptonica's pixSubtract and is equivalent to a.and(b.invert()).
      * For grayscale images, returns the pixelwise subtraction of b from a, clipped at zero.
      * For color, the entire RGB value is subtracted instead of doing channelwise subtraction (ask Leptonica why).
      * @example:
      * redness = colorImage.toGray(1, 0, 0).subtract(colorImage.toGray(0, 0.5, 0.5))
      */
    def subtract(otherImage: Image): Image = js.native
    
    @JSName("thin")
    def thin_bg(`type`: bg, connectivity: Double, maxIterations: Double): Image = js.native
    /**
      * Applies morphological thinning of type (fg or bg) with the specified connectivitiy (4 or 8) and maxIterations (0 to iterate until complete).
      */
    @JSName("thin")
    def thin_fg(`type`: fg, connectivity: Double, maxIterations: Double): Image = js.native
    
    /**
      * Converts a grayscale image to monochrome using a global threshold. value must be between 0 and 255.
      */
    def threshold(value: Double): Image = js.native
    
    /**
      * Converts the Image in the specified format to a buffer.
      * Specifying raw returns the raw image data as buffer.
      * For color images, the result contains three bytes per pixel in the order R, G, B;
      * for grayscale and monochrome images, it contains one byte per pixel.
      * Specifying png returns a PNG encoded image as buffer.
      * Specifying jpg returns a JPG encoded image as buffer.
      */
    def toBuffer(): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_jpg(format: jpg): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_png(format: png): Buffer = js.native
    @JSName("toBuffer")
    def toBuffer_raw(format: raw): Buffer = js.native
    
    /**
      * Converts a grayscale image to a color image.
      */
    def toColor(): Image = js.native
    
    /**
      * Converts an image to grayscale using default settings. Can be used to convert monochrome images back to grayscale.
      */
    def toGray(): Image = js.native
    /**
      * Converts an RGB image to grayscale using the specified widths for each channel.
      */
    def toGray(redWeight: Double, greenWeight: Double, blueWeight: Double): Image = js.native
    @JSName("toGray")
    def toGray_max(selector: max): Image = js.native
    /**
      * Converts an RGB image to grayscale by selecting either the 'min' or 'max' channel.
      * This can act as a simple color filter: 'max' maps colored pixels towards white,
      * while 'min' maps colored pixels towards black.
      */
    @JSName("toGray")
    def toGray_min(selector: min): Image = js.native
    
    /**
      * Converts from RGB to HSV color space. HSV has the following ranges:
      * Hue: [0 .. 239]
      * Saturation: [0 .. 255]
      * Value: [0 .. 255]
      */
    def toHSV(): Image = js.native
    
    /**
      * Converts from HSV to RGB color space.
      */
    def toRGB(): Image = js.native
    
    /**
      * Unsharp Masking creates an unsharp mask using halfWidth.
      * The fraction determines how much of the edge is added back into image.
      * The resulting image appears clearer, but it is generally less accurate.
      */
    def unsharp(halfWidth: Double, fraction: Double): Image = js.native
    
    val width: Double = js.native
    
    /**
      * Returns the (boolean) exclusive disjunction of two images with equal depth, aligning them to the upper left corner.
      */
    def xor(otherImage: Image): Image = js.native
  }
  
  @JSImport("dv", "Tesseract")
  @js.native
  /**
    * Creates a Tesseract engine with language set to english.
    */
  class Tesseract ()
    extends /* key */ StringDictionary[js.Any] {
    def this(datapath: String) = this()
    /**
      * Creates a Tesseract engine with the specified language.
      */
    def this(lang: String, image: Image) = this()
    /**
      * Creates a Tesseract engine with the specified language and image.
      */
    def this(datapath: String, lang: String, image: Image) = this()
    
    /**
      * Clears the tesseract image and its last results.
      */
    def clear(): Unit = js.native
    
    /**
      * Clears all adaptive classifiers (use this when results vary during scanning).
      */
    def clearAdaptiveClassifier(): Unit = js.native
    
    /**
      * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
      */
    def findParagraphs(recognize: Boolean): js.Array[Paragaph] = js.native
    
    /**
      * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
      */
    def findRegions(recognize: Boolean): js.Array[Region] = js.native
    
    /**
      * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
      */
    def findSymbols(recognize: Boolean): js.Array[js.Symbol] = js.native
    
    /**
      * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
      */
    def findTextLines(recognize: Boolean): js.Array[Textline] = js.native
    
    @JSName("findText")
    def findText_box(format: box, pageNumber: Double): String = js.native
    @JSName("findText")
    def findText_hocr(format: hocr, pageNumber: Double): String = js.native
    /**
      * Returns text in the specified format. Valid formats are: plain, unlv.
      */
    @JSName("findText")
    def findText_plain(format: plain): String = js.native
    @JSName("findText")
    def findText_plain(format: plain, withConfidence: Boolean): String = js.native
    @JSName("findText")
    def findText_unlv(format: unlv): String = js.native
    @JSName("findText")
    def findText_unlv(format: unlv, withConfidence: Boolean): String = js.native
    
    /**
      * Returns an array of objects, You can omit text information by setting recognize = false, which is considerably faster.
      */
    def findWords(recognize: Boolean): js.Array[Word] = js.native
    
    /**
      * Accessor for the input image.
      */
    var image: Image = js.native
    
    /**
      * Accessor for the page segmentation mode.
      */
    var pageSegMode: osd_only | auto_osd | auto_only | auto | single_column | single_block_vert_text | single_block | single_line | single_word | circle_word | single_char | sparse_text | sparse_text_osd = js.native
    
    /**
      * Accessor for the rectangle that specifies a "visible" area on the image.
      */
    var rectangle: Rect = js.native
    
    /**
      * Returns the binarized image Tesseract uses for its recognition.
      */
    def thresholdImage(): Image = js.native
  }
  
  @JSImport("dv", "ZXing")
  @js.native
  class ZXing () extends StObject {
    def this(image: Image) = this()
    
    /**
      * denotes the decoded binary data of the barcode before conversion into another character encoding.
      */
    val buffer: Buffer = js.native
    
    /**
      * denotes the stringified data read from the barcode.
      */
    val data: String = js.native
    
    /**
      * Returns the first barcode found as an object with the following format:
      */
    def findCode(): BarCode = js.native
    
    /**
      * List of barcodes the reader tries to find. It's specified as an object and missing properties account as false
      */
    var formats: Barcodeformat = js.native
    
    /**
      * Accessor for the input image this barcode reader operates on.
      */
    var image: Image = js.native
    
    /**
      * denotes the points in pixels which were used by the barcode reader to detect the barcode.
      */
    val points: js.Array[Point] = js.native
    
    /**
      * If try harder is enabled, the barcode reader spends more time trying to find a barcode (optimize for accuracy, not speed).
      */
    var tryHarder: Boolean = js.native
    
    /**
      * enotes the barcodes type.
      */
    val `type`: None | QR_CODE | DATA_MATRIX | PDF_417 | UPC_E | UPC_A | EAN_8 | EAN_13 | CODE_128 | CODE_39 | ITF | AZTEC = js.native
  }
  
  @js.native
  trait BarCode extends StObject {
    
    var buffer: Buffer = js.native
    
    var data: String = js.native
    
    var points: js.Array[Point] = js.native
    
    var `type`: String = js.native
  }
  object BarCode {
    
    @scala.inline
    def apply(buffer: Buffer, data: String, points: js.Array[Point], `type`: String): BarCode = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarCode]
    }
    
    @scala.inline
    implicit class BarCodeMutableBuilder[Self <: BarCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Barcodeformat extends StObject {
    
    var AZTEC: Boolean = js.native
    
    var CODE_128: Boolean = js.native
    
    var CODE_39: Boolean = js.native
    
    var DATA_MATRIX: Boolean = js.native
    
    var EAN_13: Boolean = js.native
    
    var EAN_8: Boolean = js.native
    
    var ITF: Boolean = js.native
    
    var PDF_417: Boolean = js.native
    
    var QR_CODE: Boolean = js.native
    
    var UPC_A: Boolean = js.native
    
    var UPC_E: Boolean = js.native
  }
  object Barcodeformat {
    
    @scala.inline
    def apply(
      AZTEC: Boolean,
      CODE_128: Boolean,
      CODE_39: Boolean,
      DATA_MATRIX: Boolean,
      EAN_13: Boolean,
      EAN_8: Boolean,
      ITF: Boolean,
      PDF_417: Boolean,
      QR_CODE: Boolean,
      UPC_A: Boolean,
      UPC_E: Boolean
    ): Barcodeformat = {
      val __obj = js.Dynamic.literal(AZTEC = AZTEC.asInstanceOf[js.Any], CODE_128 = CODE_128.asInstanceOf[js.Any], CODE_39 = CODE_39.asInstanceOf[js.Any], DATA_MATRIX = DATA_MATRIX.asInstanceOf[js.Any], EAN_13 = EAN_13.asInstanceOf[js.Any], EAN_8 = EAN_8.asInstanceOf[js.Any], ITF = ITF.asInstanceOf[js.Any], PDF_417 = PDF_417.asInstanceOf[js.Any], QR_CODE = QR_CODE.asInstanceOf[js.Any], UPC_A = UPC_A.asInstanceOf[js.Any], UPC_E = UPC_E.asInstanceOf[js.Any])
      __obj.asInstanceOf[Barcodeformat]
    }
    
    @scala.inline
    implicit class BarcodeformatMutableBuilder[Self <: Barcodeformat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAZTEC(value: Boolean): Self = StObject.set(x, "AZTEC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCODE_128(value: Boolean): Self = StObject.set(x, "CODE_128", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCODE_39(value: Boolean): Self = StObject.set(x, "CODE_39", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDATA_MATRIX(value: Boolean): Self = StObject.set(x, "DATA_MATRIX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEAN_13(value: Boolean): Self = StObject.set(x, "EAN_13", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEAN_8(value: Boolean): Self = StObject.set(x, "EAN_8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setITF(value: Boolean): Self = StObject.set(x, "ITF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDF_417(value: Boolean): Self = StObject.set(x, "PDF_417", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQR_CODE(value: Boolean): Self = StObject.set(x, "QR_CODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUPC_A(value: Boolean): Self = StObject.set(x, "UPC_A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUPC_E(value: Boolean): Self = StObject.set(x, "UPC_E", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Box extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Box {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Box = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Choice extends StObject {
    
    var confidence: Double = js.native
    
    var text: String = js.native
  }
  object Choice {
    
    @scala.inline
    def apply(confidence: Double, text: String): Choice = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    @scala.inline
    implicit class ChoiceMutableBuilder[Self <: Choice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Component extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Component {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Component = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Paragaph = Region
  
  @js.native
  trait Point extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rect extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Rect {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Region extends StObject {
    
    var box: Box = js.native
    
    var confidence: Double = js.native
    
    var text: String = js.native
  }
  object Region {
    
    @scala.inline
    def apply(box: Box, confidence: Double, text: String): Region = {
      val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    @scala.inline
    implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBox(value: Box): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Segment extends StObject {
    
    var error: Double = js.native
    
    var p1: Point = js.native
    
    var p2: Point = js.native
  }
  object Segment {
    
    @scala.inline
    def apply(error: Double, p1: Point, p2: Point): Segment = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Segment]
    }
    
    @scala.inline
    implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP1(value: Point): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP2(value: Point): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Skew extends StObject {
    
    var angle: Double = js.native
    
    var confidence: Double = js.native
  }
  object Skew {
    
    @scala.inline
    def apply(angle: Double, confidence: Double): Skew = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
      __obj.asInstanceOf[Skew]
    }
    
    @scala.inline
    implicit class SkewMutableBuilder[Self <: Skew] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Symbol extends Region {
    
    var choices: js.Array[Choice] = js.native
  }
  object Symbol {
    
    @scala.inline
    def apply(box: Box, choices: js.Array[Choice], confidence: Double, text: String): Symbol = {
      val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Symbol]
    }
    
    @scala.inline
    implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value :_*))
    }
  }
  
  type Text = Choice
  
  @js.native
  trait Textline extends StObject {
    
    var box: Box = js.native
  }
  object Textline {
    
    @scala.inline
    def apply(box: Box): Textline = {
      val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any])
      __obj.asInstanceOf[Textline]
    }
    
    @scala.inline
    implicit class TextlineMutableBuilder[Self <: Textline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBox(value: Box): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    }
  }
  
  type Word = Region
}
