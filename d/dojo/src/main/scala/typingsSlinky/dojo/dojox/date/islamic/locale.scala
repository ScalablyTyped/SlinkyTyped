package typingsSlinky.dojo.dojox.date.islamic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/islamic/locale.html
  *
  *
  */
@js.native
trait locale extends js.Object {
  /**
    *
    */
  var months: js.Object = js.native
  /**
    *
    */
  var weekDays: js.Object = js.native
  /**
    * Add a reference to a bundle containing localized custom formats to be
    * used by date/time formatting and parsing routines.
    *
    * @param packageName
    * @param bundleName
    */
  def addCustomFormats(packageName: String, bundleName: String): Unit = js.native
  /**
    * Format a Date object as a String, using  settings.
    *
    * @param dateObject
    * @param options               Optional
    */
  def format(dateObject: Date, options: js.Object): Unit = js.native
  /**
    * Used to get localized strings from dojo.cldr for day or month names.
    *
    * @param item
    * @param type
    * @param context               Optional
    * @param locale               Optional
    * @param date               Optional
    */
  def getNames(item: String, `type`: String, context: String, locale: String, date: Date): js.Any = js.native
  /**
    * This function parse string date value according to options
    *
    * @param value
    * @param options               Optional
    */
  def parse(value: String, options: js.Object): Unit = js.native
  /**
    * Builds the regular needed to parse a islamic.Date
    *
    * @param options               Optional
    */
  def regexp(options: js.Object): Unit = js.native
}

object locale {
  @scala.inline
  def apply(
    addCustomFormats: (String, String) => Unit,
    format: (Date, js.Object) => Unit,
    getNames: (String, String, String, String, Date) => js.Any,
    months: js.Object,
    parse: (String, js.Object) => Unit,
    regexp: js.Object => Unit,
    weekDays: js.Object
  ): locale = {
    val __obj = js.Dynamic.literal(addCustomFormats = js.Any.fromFunction2(addCustomFormats), format = js.Any.fromFunction2(format), getNames = js.Any.fromFunction5(getNames), months = months.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), regexp = js.Any.fromFunction1(regexp), weekDays = weekDays.asInstanceOf[js.Any])
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
    def withFormat(value: (Date, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNames(value: (String, String, String, String, Date) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNames")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withMonths(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withWeekDays(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

