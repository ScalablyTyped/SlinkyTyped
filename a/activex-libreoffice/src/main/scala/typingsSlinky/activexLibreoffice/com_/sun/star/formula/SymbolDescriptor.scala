package typingsSlinky.activexLibreoffice.com_.sun.star.formula

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated DeprecateddraftnWeight should be changed to float as in FontWeight.idlnItalic probably needs to have FontItalic extended by the two extra defines */
@js.native
trait SymbolDescriptor extends js.Object {
  /**
    * Specifies the character set which is supported by the font.
    * @see com.sun.star.awt.CharSet
    */
  var nCharSet: Double = js.native
  /** Specifies the Unicode character of the symbol. */
  var nCharacter: Double = js.native
  /**
    * Specifies the general style of the font.
    * @see com.sun.star.awt.FontFamily
    */
  var nFamily: Double = js.native
  /**
    * Specifies if the font is italic.
    * @see com.sun.star.awt.FontSlant The values com::sun::star::awt::FontSlant::REVERSE_OBLIQUE and com::sun::star::awt::FontSlant::REVERSE_ITALIC may not
    */
  var nItalic: Double = js.native
  /**
    * Specifies the pitch of the font.
    * @see com.sun.star.awt.FontPitch
    */
  var nPitch: Double = js.native
  /**
    * Specifies the thickness of the line.
    * @see com.sun.star.awt.FontWeight The allowed integer values correspond as follows: 0 : {@link com.sun.star.awt.FontWeight.DONTKNOW} 1 : {@link com.sun
    */
  var nWeight: Double = js.native
  /** The export name of the symbol. */
  var sExportName: String = js.native
  /** Specifies the exact name of the font ("Arial", "Courier", etc.). */
  var sFontName: String = js.native
  /** The name of the symbol. */
  var sName: String = js.native
  /** Specifies the name of the symbol set to which this symbol belongs. */
  var sSymbolSet: String = js.native
}

object SymbolDescriptor {
  @scala.inline
  def apply(
    nCharSet: Double,
    nCharacter: Double,
    nFamily: Double,
    nItalic: Double,
    nPitch: Double,
    nWeight: Double,
    sExportName: String,
    sFontName: String,
    sName: String,
    sSymbolSet: String
  ): SymbolDescriptor = {
    val __obj = js.Dynamic.literal(nCharSet = nCharSet.asInstanceOf[js.Any], nCharacter = nCharacter.asInstanceOf[js.Any], nFamily = nFamily.asInstanceOf[js.Any], nItalic = nItalic.asInstanceOf[js.Any], nPitch = nPitch.asInstanceOf[js.Any], nWeight = nWeight.asInstanceOf[js.Any], sExportName = sExportName.asInstanceOf[js.Any], sFontName = sFontName.asInstanceOf[js.Any], sName = sName.asInstanceOf[js.Any], sSymbolSet = sSymbolSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolDescriptor]
  }
  @scala.inline
  implicit class SymbolDescriptorOps[Self <: SymbolDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNCharSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nCharSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNCharacter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNFamily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNItalic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSExportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sExportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSFontName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFontName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSSymbolSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSymbolSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

