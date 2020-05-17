package typingsSlinky.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieField extends js.Object {
  /**
    * The locale value key in the cookie, default is locale.
    */
  var cookieField: String = js.native
  /**
    * Locale cookie expire time, default `1y`, If pass number value, the unit will be ms
    */
  var cookieMaxAge: String | Double = js.native
  /**
    * default value EN_US
    */
  var defaultLocale: String = js.native
  /**
    * i18n resource file dir, not recommend to change default value
    */
  var dir: String = js.native
  /**
    * custom the locale value field, default `query.locale`, you can modify this config, such as `query.lang`
    */
  var queryField: String = js.native
}

object CookieField {
  @scala.inline
  def apply(
    cookieField: String,
    cookieMaxAge: String | Double,
    defaultLocale: String,
    dir: String,
    queryField: String
  ): CookieField = {
    val __obj = js.Dynamic.literal(cookieField = cookieField.asInstanceOf[js.Any], cookieMaxAge = cookieMaxAge.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], queryField = queryField.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieField]
  }
  @scala.inline
  implicit class CookieFieldOps[Self <: CookieField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookieMaxAge(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

