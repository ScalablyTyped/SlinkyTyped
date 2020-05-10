package typingsSlinky.linguiCore.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait setupI18nProps extends js.Object {
  var catalogs: js.UndefOr[Catalogs] = js.native
  var development: js.UndefOr[js.Object] = js.native
  var language: js.UndefOr[String] = js.native
  var locales: js.UndefOr[js.Array[String]] = js.native
  var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.native
}

object setupI18nProps {
  @scala.inline
  def apply(): setupI18nProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[setupI18nProps]
  }
  @scala.inline
  implicit class setupI18nPropsOps[Self <: setupI18nProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogs(value: Catalogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogs")(js.undefined)
        ret
    }
    @scala.inline
    def withDevelopment(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("development")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevelopment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("development")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocales(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingFunction2(value: (/* language */ String, /* id */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMissing(value: String | (js.Function2[/* language */ String, /* id */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
        ret
    }
  }
  
}

