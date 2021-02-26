package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to access the palette of a color-indexed bitmap.
  * @since OOo 2.0
  */
@js.native
trait XBitmapPalette extends XInterface {
  
  /**
    * Query associated color space.
    * @returns the color space that is associated with this palette.
    */
  val ColorSpace: XColorSpace = js.native
  
  /**
    * Request the number of palette entries available.
    * @returns the number of entries in this palette.
    */
  val NumberOfEntries: Double = js.native
  
  /**
    * Query associated color space.
    * @returns the color space that is associated with this palette.
    */
  def getColorSpace(): XColorSpace = js.native
  
  /**
    * Request the color for the given palette entry.
    * @param entry Output parameter for the color components at the given palette entry.
    * @param nIndex The index of the palette entry to be retrieved. Valid range is [0, {@link getNumberOfEntries()} -1].
    * @returns `TRUE` , if the given palette entry should be displayed opaque, and `FALSE` if the entry should be displayed transparent. This is sometimes used
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is smaller than zero or larger than {@link XBitmapPalette.getNumberOfEntries()} -1.
    */
  def getIndex(entry: js.Array[SeqEquiv[ColorComponent]], nIndex: Double): Boolean = js.native
  
  /**
    * Request the number of palette entries available.
    * @returns the number of entries in this palette.
    */
  def getNumberOfEntries(): Double = js.native
  
  /**
    * Set the color for the given palette entry.
    * @param color Sequence of device color values in the associated bitmap's device color format.
    * @param transparency When `TRUE` , the specified palette entry is displayed as opaque color. When `FALSE` , the given entry displays as fully transparent
    * @param nIndex The index of the palette entry to be changed. Valid range is [0, {@link getNumberOfEntries()} -1].
    * @returns whether the palette entry was changed. For read-only entries, this method always returns `FALSE` .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is smaller than zero or larger than {@link XBitmapPalette.getNumberOfEntries()} -1.
    * @throws com::sun::star::lang::IllegalArgumentException if the given sequence of color components does not match the associated bitmap's device color format.
    */
  def setIndex(color: SeqEquiv[ColorComponent], transparency: Boolean, nIndex: Double): Boolean = js.native
}
object XBitmapPalette {
  
  @scala.inline
  def apply(
    ColorSpace: XColorSpace,
    NumberOfEntries: Double,
    acquire: () => Unit,
    getColorSpace: () => XColorSpace,
    getIndex: (js.Array[SeqEquiv[ColorComponent]], Double) => Boolean,
    getNumberOfEntries: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setIndex: (SeqEquiv[ColorComponent], Boolean, Double) => Boolean
  ): XBitmapPalette = {
    val __obj = js.Dynamic.literal(ColorSpace = ColorSpace.asInstanceOf[js.Any], NumberOfEntries = NumberOfEntries.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColorSpace = js.Any.fromFunction0(getColorSpace), getIndex = js.Any.fromFunction2(getIndex), getNumberOfEntries = js.Any.fromFunction0(getNumberOfEntries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIndex = js.Any.fromFunction3(setIndex))
    __obj.asInstanceOf[XBitmapPalette]
  }
  
  @scala.inline
  implicit class XBitmapPaletteMutableBuilder[Self <: XBitmapPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSpace(value: XColorSpace): Self = StObject.set(x, "ColorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColorSpace(value: () => XColorSpace): Self = StObject.set(x, "getColorSpace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: (js.Array[SeqEquiv[ColorComponent]], Double) => Boolean): Self = StObject.set(x, "getIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetNumberOfEntries(value: () => Double): Self = StObject.set(x, "getNumberOfEntries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumberOfEntries(value: Double): Self = StObject.set(x, "NumberOfEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIndex(value: (SeqEquiv[ColorComponent], Boolean, Double) => Boolean): Self = StObject.set(x, "setIndex", js.Any.fromFunction3(value))
  }
}
