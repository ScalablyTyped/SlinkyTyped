package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerPoint2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerRectangle2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a specialized interface for bitmaps having integer color channels. In contrast to {@link XIntegerBitmap} , this interface only permits
  * read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XIntegerReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link IntegerBitmapLayout} return
  * values. If either of them occurs, the whole bitmap read operation should be repeated, if you need consistent information.
  */
@js.native
trait XIntegerReadOnlyBitmap extends XBitmap {
  
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  val MemoryLayout: IntegerBitmapLayout = js.native
  
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. If the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte), the leftover content
    * of the bytes at the right of each scanline is filled with zeros. The details of the scanline padding are to be retrieved from the passed bitmap
    * layout.
    *
    * Note that the bitmap memory layout might change over time for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in. Note that the color space returned therein needs to always match the current color space
    * @param rect A rectangle, within the bounds of the bitmap, to retrieve the consent from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    */
  def getData(bitmapLayout: js.Array[IntegerBitmapLayout], rect: IntegerRectangle2D): SafeArray[Double] = js.native
  
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  def getMemoryLayout(): IntegerBitmapLayout = js.native
  
  /**
    * Get a single pixel of the bitmap, returning its color value.
    *
    * If the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte - the case of more than one byte
    * per pixel is not specified), the color value is returned in the least significant bits of the single byte returned as the color. The details of the
    * returned pixel data are to be retrieved from the passed bitmap layout.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in. Note that the color space returned therein needs to always match the current color space
    * @param pos A position, within the bounds of the bitmap, to retrieve the color from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position is outside the permissible bitmap area.
    */
  def getPixel(bitmapLayout: js.Array[IntegerBitmapLayout], pos: IntegerPoint2D): SafeArray[Double] = js.native
}
object XIntegerReadOnlyBitmap {
  
  @scala.inline
  def apply(
    MemoryLayout: IntegerBitmapLayout,
    Size: IntegerSize2D,
    acquire: () => Unit,
    getData: (js.Array[IntegerBitmapLayout], IntegerRectangle2D) => SafeArray[Double],
    getMemoryLayout: () => IntegerBitmapLayout,
    getPixel: (js.Array[IntegerBitmapLayout], IntegerPoint2D) => SafeArray[Double],
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: () => IntegerSize2D,
    hasAlpha: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIntegerReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction2(getData), getMemoryLayout = js.Any.fromFunction0(getMemoryLayout), getPixel = js.Any.fromFunction2(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIntegerReadOnlyBitmap]
  }
  
  @scala.inline
  implicit class XIntegerReadOnlyBitmapOps[Self <: XIntegerReadOnlyBitmap] (val x: Self) extends AnyVal {
    
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
    def setMemoryLayout(value: IntegerBitmapLayout): Self = this.set("MemoryLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: (js.Array[IntegerBitmapLayout], IntegerRectangle2D) => SafeArray[Double]): Self = this.set("getData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMemoryLayout(value: () => IntegerBitmapLayout): Self = this.set("getMemoryLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPixel(value: (js.Array[IntegerBitmapLayout], IntegerPoint2D) => SafeArray[Double]): Self = this.set("getPixel", js.Any.fromFunction2(value))
  }
}
