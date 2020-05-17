package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowStyleIOS extends js.Object {
  var shadowColor: js.UndefOr[String] = js.native
  var shadowOffset: js.UndefOr[Height] = js.native
  var shadowOpacity: js.UndefOr[Double] = js.native
  var shadowRadius: js.UndefOr[Double] = js.native
}

object ShadowStyleIOS {
  @scala.inline
  def apply(): ShadowStyleIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowStyleIOS]
  }
  @scala.inline
  implicit class ShadowStyleIOSOps[Self <: ShadowStyleIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffset(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRadius")(js.undefined)
        ret
    }
  }
  
}

