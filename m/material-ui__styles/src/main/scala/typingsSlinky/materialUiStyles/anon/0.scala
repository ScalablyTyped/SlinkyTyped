package typingsSlinky.materialUiStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[Theme] extends js.Object {
  var theme: js.UndefOr[Theme] = js.native
}

object `0` {
  @scala.inline
  def apply[Theme](): `0`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[Theme]]
  }
  @scala.inline
  implicit class `0Ops`[Self[theme] <: `0`[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withTheme(value: Theme): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

