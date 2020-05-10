package typingsSlinky.reactScrollableAnchor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureAnchorsOptions extends js.Object {
  var keepLastAnchorHash: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var scrollDuration: js.UndefOr[Double] = js.native
}

object ConfigureAnchorsOptions {
  @scala.inline
  def apply(): ConfigureAnchorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureAnchorsOptions]
  }
  @scala.inline
  implicit class ConfigureAnchorsOptionsOps[Self <: ConfigureAnchorsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepLastAnchorHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLastAnchorHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLastAnchorHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLastAnchorHash")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(js.undefined)
        ret
    }
  }
  
}

