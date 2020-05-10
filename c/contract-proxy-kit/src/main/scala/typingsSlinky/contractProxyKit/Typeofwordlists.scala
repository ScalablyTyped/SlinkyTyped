package typingsSlinky.contractProxyKit

import typingsSlinky.ethers.wordlistMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwordlists extends js.Object {
  val en: Wordlist = js.native
  val it: Wordlist = js.native
  val ja: Wordlist = js.native
  val ko: Wordlist = js.native
  val zh: Wordlist = js.native
  val zh_cn: Wordlist = js.native
  val zh_tw: Wordlist = js.native
}

object Typeofwordlists {
  @scala.inline
  def apply(
    en: Wordlist,
    it: Wordlist,
    ja: Wordlist,
    ko: Wordlist,
    zh: Wordlist,
    zh_cn: Wordlist,
    zh_tw: Wordlist
  ): Typeofwordlists = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], ja = ja.asInstanceOf[js.Any], ko = ko.asInstanceOf[js.Any], zh = zh.asInstanceOf[js.Any], zh_cn = zh_cn.asInstanceOf[js.Any], zh_tw = zh_tw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwordlists]
  }
  @scala.inline
  implicit class TypeofwordlistsOps[Self <: Typeofwordlists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEn(value: Wordlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIt(value: Wordlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJa(value: Wordlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ja")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKo(value: Wordlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ko")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZh(value: Wordlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZh_cn(value: Wordlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh_cn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZh_tw(value: Wordlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh_tw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

