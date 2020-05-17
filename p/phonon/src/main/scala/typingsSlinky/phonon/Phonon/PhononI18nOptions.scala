package typingsSlinky.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononI18nOptions extends js.Object {
  var directory: js.UndefOr[String] = js.native
  var localeFallback: js.UndefOr[String] = js.native
  var localePreferred: js.UndefOr[String] = js.native
}

object PhononI18nOptions {
  @scala.inline
  def apply(): PhononI18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononI18nOptions]
  }
  @scala.inline
  implicit class PhononI18nOptionsOps[Self <: PhononI18nOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleFallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalePreferred(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localePreferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalePreferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localePreferred")(js.undefined)
        ret
    }
  }
  
}

