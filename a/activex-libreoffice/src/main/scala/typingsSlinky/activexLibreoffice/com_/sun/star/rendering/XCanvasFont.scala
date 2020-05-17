package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to a specific, XCanvas-dependent font incarnation. This font is not universally usable, but belongs to the {@link
  * XCanvas} it was queried from.
  */
@js.native
trait XCanvasFont extends XInterface {
  /**
    * Query the list of available font sizes.
    *
    * This method queries the list of available font sizes (in device units) for this font. For scalable fonts that are not restricted to discrete sizes,
    * this list is **empty** , meaning that every size is possible. Fonts that **do** restrict the device size to certain discrete values, setting an
    * overall transformation that scales the {@link FontRequest.CellSize} to something not contained in the list returned by this method can lead to visible
    * disturbances.
    */
  val AvailableSizes: SafeArray[Double] = js.native
  /** Query the list of additional font properties. */
  val ExtraFontProperties: SafeArray[PropertyValue] = js.native
  /**
    * Query metric information about the font, that is generic to all its glyphs.
    *
    * Note that the metric values in the returned result are in the font coordinate system, i.e. relative to the corresponding size of this font. That is,
    * when this font was created with a cell size of 20 units, the metrics returned are calculated relative to this size.
    */
  val FontMetrics: typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontMetrics = js.native
  /** Query the {@link FontRequest} that was used to generate this object. */
  val FontRequest: typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontRequest = js.native
  /**
    * Create a text layout interface.
    *
    * Create a text layout interface for the given string, using this font to generate the glyphs from.
    * @param aText The text to layout.
    * @param nDirection Main text direction for the string specified. The main text direction is e.g. important for characters that are not strong, i.e. that
    * @param nRandomSeed Optional random seed for OpenType glyph variations.
    */
  def createTextLayout(aText: StringContext, nDirection: Double, nRandomSeed: Double): XTextLayout = js.native
  /**
    * Query the list of available font sizes.
    *
    * This method queries the list of available font sizes (in device units) for this font. For scalable fonts that are not restricted to discrete sizes,
    * this list is **empty** , meaning that every size is possible. Fonts that **do** restrict the device size to certain discrete values, setting an
    * overall transformation that scales the {@link FontRequest.CellSize} to something not contained in the list returned by this method can lead to visible
    * disturbances.
    */
  def getAvailableSizes(): SafeArray[Double] = js.native
  /** Query the list of additional font properties. */
  def getExtraFontProperties(): SafeArray[PropertyValue] = js.native
  /**
    * Query metric information about the font, that is generic to all its glyphs.
    *
    * Note that the metric values in the returned result are in the font coordinate system, i.e. relative to the corresponding size of this font. That is,
    * when this font was created with a cell size of 20 units, the metrics returned are calculated relative to this size.
    */
  def getFontMetrics(): typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontMetrics = js.native
  /** Query the {@link FontRequest} that was used to generate this object. */
  def getFontRequest(): typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontRequest = js.native
}

object XCanvasFont {
  @scala.inline
  def apply(
    AvailableSizes: SafeArray[Double],
    ExtraFontProperties: SafeArray[PropertyValue],
    FontMetrics: FontMetrics,
    FontRequest: FontRequest,
    acquire: () => Unit,
    createTextLayout: (StringContext, Double, Double) => XTextLayout,
    getAvailableSizes: () => SafeArray[Double],
    getExtraFontProperties: () => SafeArray[PropertyValue],
    getFontMetrics: () => FontMetrics,
    getFontRequest: () => FontRequest,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCanvasFont = {
    val __obj = js.Dynamic.literal(AvailableSizes = AvailableSizes.asInstanceOf[js.Any], ExtraFontProperties = ExtraFontProperties.asInstanceOf[js.Any], FontMetrics = FontMetrics.asInstanceOf[js.Any], FontRequest = FontRequest.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createTextLayout = js.Any.fromFunction3(createTextLayout), getAvailableSizes = js.Any.fromFunction0(getAvailableSizes), getExtraFontProperties = js.Any.fromFunction0(getExtraFontProperties), getFontMetrics = js.Any.fromFunction0(getFontMetrics), getFontRequest = js.Any.fromFunction0(getFontRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCanvasFont]
  }
  @scala.inline
  implicit class XCanvasFontOps[Self <: XCanvasFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableSizes(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraFontProperties(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraFontProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontMetrics(value: FontMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontRequest(value: FontRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTextLayout(value: (StringContext, Double, Double) => XTextLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTextLayout")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetAvailableSizes(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableSizes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtraFontProperties(value: () => SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraFontProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontMetrics(value: () => FontMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontMetrics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontRequest(value: () => FontRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontRequest")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

