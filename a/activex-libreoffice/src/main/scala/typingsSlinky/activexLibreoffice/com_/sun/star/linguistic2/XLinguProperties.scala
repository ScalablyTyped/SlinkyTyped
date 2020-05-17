package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for {@link LinguProperties} service.
  * @since LibreOffice 4.1
  */
@js.native
trait XLinguProperties extends XPropertySet {
  /** the default western language for new documents. */
  var DefaultLocale: Locale = js.native
  /** the default language for CJK languages. */
  var DefaultLocale_CJK: Locale = js.native
  /** the default language for CTL languages. */
  var DefaultLocale_CTL: Locale = js.native
  /** the minimum number of characters of a word to remain before the hyphen when doing hyphenation. */
  var HyphMinLeading: Double = js.native
  /** the minimum number of characters of a word to remain after the hyphen when doing hyphenation. */
  var HyphMinTrailing: Double = js.native
  /** the minimum length of a word in order to be hyphenated. */
  var HyphMinWordLength: Double = js.native
  /**
    * defines whether interactive hyphenation should be performed without requiring the user to select every hyphenation position after the user has
    * triggered the hyphenation.
    */
  var IsHyphAuto: Boolean = js.native
  /** defines whether hyphenation should be done in special regions of documents or not. */
  var IsHyphSpecial: Boolean = js.native
  /** defines if control characters should be ignored or not, by the linguistic (i.e., spell checker, hyphenator and thesaurus). */
  var IsIgnoreControlCharacters: Boolean = js.native
  /** indicates whether spell checking should be done automatically or not. */
  var IsSpellAuto: Boolean = js.native
  /**
    * defines if the capitalization of words should be checked or not.
    * @deprecated Deprecated
    */
  var IsSpellCapitalization: Boolean = js.native
  /** defines whether spell checking should be done in special regions of documents or not. */
  var IsSpellSpecial: Boolean = js.native
  /** defines if words with only uppercase letters should be subject to spell checking or not. */
  var IsSpellUpperCase: Boolean = js.native
  /** defines if words containing digits (or numbers) should be subject to spell checking or not. */
  var IsSpellWithDigits: Boolean = js.native
  /** defines if the dictionary-list should be used for spell checking and hyphenation or not. */
  var IsUseDictionaryList: Boolean = js.native
  /** defines whether spell checking should be done in reverse direction or not. */
  var IsWrapReverse: Boolean = js.native
}

object XLinguProperties {
  @scala.inline
  def apply(
    DefaultLocale: Locale,
    DefaultLocale_CJK: Locale,
    DefaultLocale_CTL: Locale,
    HyphMinLeading: Double,
    HyphMinTrailing: Double,
    HyphMinWordLength: Double,
    IsHyphAuto: Boolean,
    IsHyphSpecial: Boolean,
    IsIgnoreControlCharacters: Boolean,
    IsSpellAuto: Boolean,
    IsSpellCapitalization: Boolean,
    IsSpellSpecial: Boolean,
    IsSpellUpperCase: Boolean,
    IsSpellWithDigits: Boolean,
    IsUseDictionaryList: Boolean,
    IsWrapReverse: Boolean,
    PropertySetInfo: XPropertySetInfo,
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
  ): XLinguProperties = {
    val __obj = js.Dynamic.literal(DefaultLocale = DefaultLocale.asInstanceOf[js.Any], DefaultLocale_CJK = DefaultLocale_CJK.asInstanceOf[js.Any], DefaultLocale_CTL = DefaultLocale_CTL.asInstanceOf[js.Any], HyphMinLeading = HyphMinLeading.asInstanceOf[js.Any], HyphMinTrailing = HyphMinTrailing.asInstanceOf[js.Any], HyphMinWordLength = HyphMinWordLength.asInstanceOf[js.Any], IsHyphAuto = IsHyphAuto.asInstanceOf[js.Any], IsHyphSpecial = IsHyphSpecial.asInstanceOf[js.Any], IsIgnoreControlCharacters = IsIgnoreControlCharacters.asInstanceOf[js.Any], IsSpellAuto = IsSpellAuto.asInstanceOf[js.Any], IsSpellCapitalization = IsSpellCapitalization.asInstanceOf[js.Any], IsSpellSpecial = IsSpellSpecial.asInstanceOf[js.Any], IsSpellUpperCase = IsSpellUpperCase.asInstanceOf[js.Any], IsSpellWithDigits = IsSpellWithDigits.asInstanceOf[js.Any], IsUseDictionaryList = IsUseDictionaryList.asInstanceOf[js.Any], IsWrapReverse = IsWrapReverse.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XLinguProperties]
  }
  @scala.inline
  implicit class XLinguPropertiesOps[Self <: XLinguProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLocale_CJK(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultLocale_CJK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLocale_CTL(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultLocale_CTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyphMinLeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyphMinLeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyphMinTrailing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyphMinTrailing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyphMinWordLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyphMinWordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHyphAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHyphAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHyphSpecial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHyphSpecial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIgnoreControlCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsIgnoreControlCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSpellAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSpellAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSpellCapitalization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSpellCapitalization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSpellSpecial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSpellSpecial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSpellUpperCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSpellUpperCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSpellWithDigits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSpellWithDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUseDictionaryList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUseDictionaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWrapReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsWrapReverse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

