package typingsSlinky.dojo.dojox.date.hebrew

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/hebrew/locale.html
  *
  *
  */
@js.native
trait locale extends js.Object {
  /**
    * Add a reference to a bundle containing localized custom formats to be
    * used by date/time formatting and parsing routines.
    * The user may add custom localized formats where the bundle has properties following the
    * same naming convention used by dojo.cldr: dateFormat-xxxx / timeFormat-xxxx
    * The pattern string should match the format used by the CLDR.
    * See dojo.date.locale.format() for details.
    * The resources must be loaded by dojo.requireLocalization() prior to use
    *
    * @param packageName
    * @param bundleName
    */
  def addCustomFormats(packageName: String, bundleName: String): Unit = js.native
  /**
    * Format a Date object as a String, using  settings.
    * Create a string from a hebrew.Date object using a known pattern.
    * By default, this method formats both date and time from dateObject.
    * Default formatting lengths is 'short'
    *
    * @param dateObject the date and/or time to be formatted.  If a time only is formatted,the values in the year, month, and day fields are irrelevant.  Theopposite is true when formatting only dates.
    * @param options               Optional
    */
  def format(dateObject: typingsSlinky.dojo.dojox.date.hebrew, options: js.Object): Unit = js.native
  /**
    * Used to get localized strings from dojo.cldr for day or month names.
    *
    * @param item 'months' || 'days'
    * @param type 'wide' || 'narrow' || 'abbr' (e.g. "Monday", "Mon", or "M" respectively, in English)
    * @param context               Optional
    * @param locale               Optionaloverride locale used to find the names
    * @param date               Optionalrequired for item=months to determine leap month name
    */
  def getNames(item: String, `type`: String, context: String, locale: String, date: Date): Unit = js.native
  /**
    * This function parse string date value according to options
    *
    * @param value
    * @param options               Optional
    */
  def parse(value: String, options: js.Object): Unit = js.native
  /**
    * Builds the regular needed to parse a hebrew.Date
    *
    * @param options               Optional
    */
  def regexp(options: js.Object): Unit = js.native
}

object locale {
  @scala.inline
  def apply(
    addCustomFormats: (String, String) => Unit,
    format: (typingsSlinky.dojo.dojox.date.hebrew, js.Object) => Unit,
    getNames: (String, String, String, String, Date) => Unit,
    parse: (String, js.Object) => Unit,
    regexp: js.Object => Unit
  ): locale = {
    val __obj = js.Dynamic.literal(addCustomFormats = js.Any.fromFunction2(addCustomFormats), format = js.Any.fromFunction2(format), getNames = js.Any.fromFunction5(getNames), parse = js.Any.fromFunction2(parse), regexp = js.Any.fromFunction1(regexp))
    __obj.asInstanceOf[locale]
  }
  @scala.inline
  implicit class localeOps[Self <: locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCustomFormats(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomFormats")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormat(value: (typingsSlinky.dojo.dojox.date.hebrew, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNames(value: (String, String, String, String, Date) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNames")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withParse(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegexp(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

