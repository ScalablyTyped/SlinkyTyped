package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellHoriJustify
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellOrientation
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder2
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a field in an AutoFormat. A field contains all cell properties for a specific position in an AutoFormat. */
@js.native
trait TableAutoFormatField extends XPropertySet {
  /** contains the cell background color. */
  var CellBackColor: Color = js.native
  /** contains the value of the text color. */
  var CharColor: Color = js.native
  /** is `TRUE` if the characters are contoured. */
  var CharContoured: Boolean = js.native
  /** is `TRUE` if the characters are crossed out. */
  var CharCrossedOut: Boolean = js.native
  /** contains the value of the character set of the western font. */
  var CharFontCharSet: String = js.native
  /** contains the value of the character set of the Asian font. */
  var CharFontCharSetAsian: String = js.native
  /** contains the value of the character set of the complex font. */
  var CharFontCharSetComplex: String = js.native
  /** contains the value of the western font family. */
  var CharFontFamily: String = js.native
  /** contains the value of the Asian font family. */
  var CharFontFamilyAsian: String = js.native
  /** contains the value of the complex font family. */
  var CharFontFamilyComplex: String = js.native
  /** specifies the name of the western font. */
  var CharFontName: String = js.native
  /** specifies the name of the Asian font. */
  var CharFontNameAsian: String = js.native
  /** specifies the name of the complex font. */
  var CharFontNameComplex: String = js.native
  /** contains the value of the pitch of the western font. */
  var CharFontPitch: String = js.native
  /** contains the value of the pitch of the Asian font. */
  var CharFontPitchAsian: String = js.native
  /** contains the value of the pitch of the complex font. */
  var CharFontPitchComplex: String = js.native
  /** specifies the name of the western font style. */
  var CharFontStyleName: String = js.native
  /** specifies the name of the Asian font style. */
  var CharFontStyleNameAsian: String = js.native
  /** specifies the name of the complex font style. */
  var CharFontStyleNameComplex: String = js.native
  /** contains the height of characters of the western font in point. */
  var CharHeight: Double = js.native
  /** contains the height of characters of the Asian font in point. */
  var CharHeightAsian: Double = js.native
  /** contains the height of characters of the complex font in point. */
  var CharHeightComplex: Double = js.native
  /** contains the value of the posture of characters of the western font. */
  var CharPosture: FontSlant = js.native
  /** contains the value of the posture of characters of the Asian font. */
  var CharPostureAsian: FontSlant = js.native
  /** contains the value of the posture of characters of the complex font. */
  var CharPostureComplex: FontSlant = js.native
  /** is `TRUE` if the characters are shadowed. */
  var CharShadowed: Boolean = js.native
  /** contains the value for the character underline. */
  var CharUnderline: Double = js.native
  /** contains the value for the weight of characters of the western font. */
  var CharWeight: Double = js.native
  /** contains the value for the weight of characters of the Asian font. */
  var CharWeightAsian: Double = js.native
  /** contains the value for the weight of characters of the complex font. */
  var CharWeightComplex: Double = js.native
  /** specifies the horizontal alignment of the cell contents. */
  var HoriJustify: CellHoriJustify = js.native
  /**
    * is `TRUE` if the cell background is transparent.
    *
    * In this case the {@link TableAutoFormatField.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: Boolean = js.native
  /** is `TRUE` if text breaks automatically at cell borders. */
  var IsTextWrapped: Boolean = js.native
  /** contains the orientation of the cell contents (i.e. top-to-bottom or stacked). */
  var Orientation: CellOrientation = js.native
  /** contains the margin between cell contents and bottom border (in 1/100 mm). */
  var ParaBottomMargin: Double = js.native
  /** contains the margin between cell contents and left border (in 1/100 mm). */
  var ParaLeftMargin: Double = js.native
  /** contains the margin between cell contents and right border (in 1/100 mm). */
  var ParaRightMargin: Double = js.native
  /** contains the margin between cell contents and top border (in 1/100 mm). */
  var ParaTopMargin: Double = js.native
  /** contains the rotation angle of the cell contents. */
  var RotateAngle: Double = js.native
  /**
    * contains the reference edge of the cell rotation.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: Double = js.native
  /** contains a description of the shadow. */
  var ShadowFormat: typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat = js.native
  /**
    * property containing a description of the cell border.
    * @since OOo 1.1.2
    */
  var TableBorder: typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder = js.native
  /**
    * property containing a description of the cell border. Preferred over {@link com.sun.star.table.TableBorder}{@link TableBorder} .
    * @since LibreOffice 3.6
    */
  var TableBorder2: typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder2 = js.native
  /**
    * specifies the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double = js.native
}

object TableAutoFormatField {
  @scala.inline
  def apply(
    CellBackColor: Color,
    CharColor: Color,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharFontCharSet: String,
    CharFontCharSetAsian: String,
    CharFontCharSetComplex: String,
    CharFontFamily: String,
    CharFontFamilyAsian: String,
    CharFontFamilyComplex: String,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: String,
    CharFontPitchAsian: String,
    CharFontPitchComplex: String,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharShadowed: Boolean,
    CharUnderline: Double,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    HoriJustify: CellHoriJustify,
    IsCellBackgroundTransparent: Boolean,
    IsTextWrapped: Boolean,
    Orientation: CellOrientation,
    ParaBottomMargin: Double,
    ParaLeftMargin: Double,
    ParaRightMargin: Double,
    ParaTopMargin: Double,
    PropertySetInfo: XPropertySetInfo,
    RotateAngle: Double,
    RotateReference: Double,
    ShadowFormat: ShadowFormat,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    VertJustify: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TableAutoFormatField = {
    val __obj = js.Dynamic.literal(CellBackColor = CellBackColor.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TableAutoFormatField]
  }
  @scala.inline
  implicit class TableAutoFormatFieldOps[Self <: TableAutoFormatField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellBackColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharContoured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharContoured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharCrossedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharCrossedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontCharSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontCharSetAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSetAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontCharSetComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontCharSetComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamilyAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamilyAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontFamilyComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontFamilyComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontNameAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontNameAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontNameComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontNameComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitchAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitchAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontPitchComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontPitchComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleNameAsian(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleNameAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharFontStyleNameComplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharFontStyleNameComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeightAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeightAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharHeightComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharHeightComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPosture(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPosture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPostureAsian(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPostureAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharPostureComplex(value: FontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharPostureComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharShadowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharShadowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharUnderline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharUnderline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeightAsian(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeightAsian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharWeightComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharWeightComplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoriJustify(value: CellHoriJustify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoriJustify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCellBackgroundTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCellBackgroundTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTextWrapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTextWrapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: CellOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParaBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParaBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParaLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParaLeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParaRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParaRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParaTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParaTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotateAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateReference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotateReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowFormat(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableBorder(value: TableBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableBorder2(value: TableBorder2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableBorder2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertJustify(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VertJustify")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

