package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerPoint2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerRectangle2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a specialized interface for bitmaps containing IEEE doubles for their color components. */
@js.native
trait XIeeeDoubleBitmap extends XIeeeDoubleReadOnlyBitmap {
  
  /**
    * Set raw data of a bitmap.
    *
    * Set raw data of a bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the bitmap can be changed.
    * When setting subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is changed.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setData()} .
    * @param data Data to set
    * @param bitmapLayout Layout of the data to set. Must match this bitmap's current layout.
    * @param rect Destination rectangle, within the bounds of the bitmap, to set the data in.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setData(data: SeqEquiv[Double], bitmapLayout: FloatingPointBitmapLayout, rect: IntegerRectangle2D): Unit = js.native
  
  /**
    * Set a single pixel of the bitmap with the given color value.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setPixel()} .
    * @param color The color value(s) to set
    * @param bitmapLayout Layout of the color elements to set. Must match this bitmap's current layout.
    * @param pos Pixel position with the bounds of the bitmap to set.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given point is outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setPixel(color: SeqEquiv[Double], bitmapLayout: FloatingPointBitmapLayout, pos: IntegerPoint2D): Unit = js.native
}
object XIeeeDoubleBitmap {
  
  @scala.inline
  def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: IntegerSize2D,
    acquire: () => Unit,
    getData: (js.Array[FloatingPointBitmapLayout], IntegerRectangle2D) => SafeArray[Double],
    getMemoryLayout: () => FloatingPointBitmapLayout,
    getPixel: (js.Array[FloatingPointBitmapLayout], IntegerPoint2D) => SafeArray[Double],
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: () => IntegerSize2D,
    hasAlpha: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setData: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerRectangle2D) => Unit,
    setPixel: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerPoint2D) => Unit
  ): XIeeeDoubleBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction2(getData), getMemoryLayout = js.Any.fromFunction0(getMemoryLayout), getPixel = js.Any.fromFunction2(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction3(setData), setPixel = js.Any.fromFunction3(setPixel))
    __obj.asInstanceOf[XIeeeDoubleBitmap]
  }
  
  @scala.inline
  implicit class XIeeeDoubleBitmapOps[Self <: XIeeeDoubleBitmap] (val x: Self) extends AnyVal {
    
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
    def setSetData(value: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerRectangle2D) => Unit): Self = this.set("setData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPixel(value: (SeqEquiv[Double], FloatingPointBitmapLayout, IntegerPoint2D) => Unit): Self = this.set("setPixel", js.Any.fromFunction3(value))
  }
}
