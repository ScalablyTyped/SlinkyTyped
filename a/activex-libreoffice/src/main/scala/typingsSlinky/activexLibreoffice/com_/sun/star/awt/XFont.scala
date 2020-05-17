package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a font on a specific device.
  *
  * All values are in pixels within this device.
  */
@js.native
trait XFont extends XInterface {
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  val FontDescriptor: typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** returns additional information about the font. */
  val FontMetric: SimpleFontMetric = js.native
  /**
    * returns the width of the specified character.
    * @returns the character width measured in pixels for the device.
    */
  def getCharWidth(c: String): Double = js.native
  /**
    * returns the widths of the specified characters.
    * @returns a sequence of the widths of subsequent characters for this font.
    */
  def getCharWidths(nFirst: String, nLast: String): SafeArray[Double] = js.native
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  def getFontDescriptor(): typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** returns additional information about the font. */
  def getFontMetric(): SimpleFontMetric = js.native
  /** queries the kerning pair table. */
  def getKernPairs(
    Chars1: js.Array[SeqEquiv[String]],
    Chars2: js.Array[SeqEquiv[String]],
    Kerns: js.Array[SeqEquiv[Double]]
  ): Unit = js.native
  /**
    * returns the string width.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidth(str: String): Double = js.native
  /**
    * returns the string and the character widths.
    * @param str the input string.
    * @param aDXArray receives the width of every single character measured in pixels for the device.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidthArray(str: String, aDXArray: js.Array[SeqEquiv[Double]]): Double = js.native
}

object XFont {
  @scala.inline
  def apply(
    FontDescriptor: FontDescriptor,
    FontMetric: SimpleFontMetric,
    acquire: () => Unit,
    getCharWidth: String => Double,
    getCharWidths: (String, String) => SafeArray[Double],
    getFontDescriptor: () => FontDescriptor,
    getFontMetric: () => SimpleFontMetric,
    getKernPairs: (js.Array[SeqEquiv[String]], js.Array[SeqEquiv[String]], js.Array[SeqEquiv[Double]]) => Unit,
    getStringWidth: String => Double,
    getStringWidthArray: (String, js.Array[SeqEquiv[Double]]) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFont = {
    val __obj = js.Dynamic.literal(FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCharWidth = js.Any.fromFunction1(getCharWidth), getCharWidths = js.Any.fromFunction2(getCharWidths), getFontDescriptor = js.Any.fromFunction0(getFontDescriptor), getFontMetric = js.Any.fromFunction0(getFontMetric), getKernPairs = js.Any.fromFunction3(getKernPairs), getStringWidth = js.Any.fromFunction1(getStringWidth), getStringWidthArray = js.Any.fromFunction2(getStringWidthArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFont]
  }
  @scala.inline
  implicit class XFontOps[Self <: XFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontDescriptor(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontMetric(value: SimpleFontMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCharWidth(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCharWidths(value: (String, String) => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharWidths")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetFontDescriptor(value: () => FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontDescriptor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFontMetric(value: () => SimpleFontMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontMetric")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKernPairs(
      value: (js.Array[SeqEquiv[String]], js.Array[SeqEquiv[String]], js.Array[SeqEquiv[Double]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKernPairs")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetStringWidth(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStringWidthArray(value: (String, js.Array[SeqEquiv[Double]]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringWidthArray")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

