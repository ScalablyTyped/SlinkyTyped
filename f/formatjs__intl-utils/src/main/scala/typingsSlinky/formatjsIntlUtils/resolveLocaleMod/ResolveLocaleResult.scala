package typingsSlinky.formatjsIntlUtils.resolveLocaleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveLocaleResult
  extends /* k */ StringDictionary[js.Any] {
  var dataLocale: String = js.native
  var locale: String = js.native
}

object ResolveLocaleResult {
  @scala.inline
  def apply(dataLocale: String, locale: String): ResolveLocaleResult = {
    val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveLocaleResult]
  }
  @scala.inline
  implicit class ResolveLocaleResultOps[Self <: ResolveLocaleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

