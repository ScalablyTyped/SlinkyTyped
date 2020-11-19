package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure describes the memory layout of a bitmap having floating point color channels.
  *
  * This structure collects all necessary information to describe the memory layout of a bitmap having floating point color channels
  * @since OOo 2.0
  */
@js.native
trait FloatingPointBitmapLayout extends js.Object {
  
  var ColorSpace: XColorSpace = js.native
  
  /**
    * Endianness of the pixel values.
    *
    * This value must be one of the Endianness constants
    */
  var Endianness: Double = js.native
  
  /**
    * Format type of this bitmap.
    *
    * This value must be one of the {@link FloatingPointBitmapFormat} constants.
    */
  var Format: Double = js.native
  
  /**
    * Number of color components per pixel.
    *
    * This value must not be negative
    */
  var NumComponents: Double = js.native
  
  /**
    * Byte offset between the start of two consecutive planes.
    *
    * This value is permitted to be negative. If this value is zero, the bitmap is assumed to be in chunky format, otherwise it is assumed to be planar. The
    * difference between chunky and planar layout lies in the way how color channels are interleaved. For a chunky format, all channel data for a single
    * pixel lies consecutively in memory. For a planar layout, the first channel of all pixel is stored consecutive, followed by the second channel, and so
    * forth.
    */
  var PlaneStride: Double = js.native
  
  /**
    * Number of data bytes per scanline.
    *
    * This value must not be negative
    */
  var ScanLineBytes: Double = js.native
  
  /**
    * Byte offset between the start of two consecutive scanlines.
    *
    * This value is permitted to be negative, denoting a bitmap whose content is flipped at the x axis.
    */
  var ScanLineStride: Double = js.native
  
  /**
    * Number of scanlines for this bitmap.
    *
    * This value must not be negative
    */
  var ScanLines: Double = js.native
}
object FloatingPointBitmapLayout {
  
  @scala.inline
  def apply(
    ColorSpace: XColorSpace,
    Endianness: Double,
    Format: Double,
    NumComponents: Double,
    PlaneStride: Double,
    ScanLineBytes: Double,
    ScanLineStride: Double,
    ScanLines: Double
  ): FloatingPointBitmapLayout = {
    val __obj = js.Dynamic.literal(ColorSpace = ColorSpace.asInstanceOf[js.Any], Endianness = Endianness.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], NumComponents = NumComponents.asInstanceOf[js.Any], PlaneStride = PlaneStride.asInstanceOf[js.Any], ScanLineBytes = ScanLineBytes.asInstanceOf[js.Any], ScanLineStride = ScanLineStride.asInstanceOf[js.Any], ScanLines = ScanLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingPointBitmapLayout]
  }
  
  @scala.inline
  implicit class FloatingPointBitmapLayoutOps[Self <: FloatingPointBitmapLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColorSpace(value: XColorSpace): Self = this.set("ColorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndianness(value: Double): Self = this.set("Endianness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Double): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumComponents(value: Double): Self = this.set("NumComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaneStride(value: Double): Self = this.set("PlaneStride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanLineBytes(value: Double): Self = this.set("ScanLineBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanLineStride(value: Double): Self = this.set("ScanLineStride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanLines(value: Double): Self = this.set("ScanLines", value.asInstanceOf[js.Any])
  }
}
