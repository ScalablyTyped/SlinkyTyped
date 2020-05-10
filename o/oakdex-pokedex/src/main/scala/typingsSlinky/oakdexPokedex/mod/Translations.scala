package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translations extends js.Object {
  var cz: js.UndefOr[String] = js.native
  var de: String = js.native
  var dk: js.UndefOr[String] = js.native
  var en: String = js.native
  var es: js.UndefOr[String] = js.native
  var fr: js.UndefOr[String] = js.native
  var gr: js.UndefOr[String] = js.native
  var it: js.UndefOr[String] = js.native
  var jp: js.UndefOr[String] = js.native
  var pl: js.UndefOr[String] = js.native
  var tr: js.UndefOr[String] = js.native
}

object Translations {
  @scala.inline
  def apply(de: String, en: String): Translations = {
    val __obj = js.Dynamic.literal(de = de.asInstanceOf[js.Any], en = en.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translations]
  }
  @scala.inline
  implicit class TranslationsOps[Self <: Translations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("de")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCz(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cz")(js.undefined)
        ret
    }
    @scala.inline
    def withDk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dk")(js.undefined)
        ret
    }
    @scala.inline
    def withEs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("es")(js.undefined)
        ret
    }
    @scala.inline
    def withFr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fr")(js.undefined)
        ret
    }
    @scala.inline
    def withGr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gr")(js.undefined)
        ret
    }
    @scala.inline
    def withIt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it")(js.undefined)
        ret
    }
    @scala.inline
    def withJp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jp")(js.undefined)
        ret
    }
    @scala.inline
    def withPl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(js.undefined)
        ret
    }
    @scala.inline
    def withTr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(js.undefined)
        ret
    }
  }
  
}

