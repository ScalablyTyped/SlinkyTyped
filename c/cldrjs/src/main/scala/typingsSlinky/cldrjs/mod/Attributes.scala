package typingsSlinky.cldrjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name Attributes
  * @memberof cldr
  * @kind interface
  *
  * @description
  * The object created during instance initialization and used internally by .get()
  * to replace dynamic parts of an item path.
  */
@js.native
trait Attributes extends js.Object {
  /**
    * @name language
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Language subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var language: js.Any = js.native
  /**
    * @name languageId
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Language Id {@link http://www.unicode.org/reports/tr35/#Unicode_language_identifier}
    */
  var languageId: js.Any = js.native
  /**
    * @name maxLanguageId
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Maximized Language Id {@link http://www.unicode.org/reports/tr35/#Likely_Subtags}
    */
  var maxLanguageId: js.Any = js.native
  /**
    * @name minLanguageId
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Minimized Language Id {@link http://www.unicode.org/reports/tr35/#Likely_Subtags}
    */
  var minLanguageId: js.Any = js.native
  /**
    * @name region
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Region subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var region: js.Any = js.native
  /**
    * @name script
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Script subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var script: js.Any = js.native
  /**
    * @name territory
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Region subtag (territory variant) {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var territory: js.Any = js.native
}

object Attributes {
  @scala.inline
  def apply(
    language: js.Any,
    languageId: js.Any,
    maxLanguageId: js.Any,
    minLanguageId: js.Any,
    region: js.Any,
    script: js.Any,
    territory: js.Any
  ): Attributes = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], maxLanguageId = maxLanguageId.asInstanceOf[js.Any], minLanguageId = minLanguageId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], territory = territory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLanguageId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLanguageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLanguageId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLanguageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerritory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("territory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

