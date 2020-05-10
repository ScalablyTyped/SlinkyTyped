package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Names extends js.Object {
  val de: js.UndefOr[String] = js.native
  val en: String = js.native
  val es: js.UndefOr[String] = js.native
  val fr: js.UndefOr[String] = js.native
  val ja: js.UndefOr[String] = js.native
  val `pt-BR`: js.UndefOr[String] = js.native
  val ru: js.UndefOr[String] = js.native
  val `zh-CN`: js.UndefOr[String] = js.native
}

object Names {
  @scala.inline
  def apply(en: String): Names = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
  @scala.inline
  implicit class NamesOps[Self <: Names] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("de")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("de")(js.undefined)
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
    def withJa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ja")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ja")(js.undefined)
        ret
    }
    @scala.inline
    def `withPt-BR`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt-BR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPt-BR`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt-BR")(js.undefined)
        ret
    }
    @scala.inline
    def withRu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ru")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ru")(js.undefined)
        ret
    }
    @scala.inline
    def `withZh-CN`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh-CN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZh-CN`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh-CN")(js.undefined)
        ret
    }
  }
  
}

