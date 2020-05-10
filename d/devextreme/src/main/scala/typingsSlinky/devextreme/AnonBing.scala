package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBing extends js.Object {
  var bing: js.UndefOr[String] = js.native
  var google: js.UndefOr[String] = js.native
  var googleStatic: js.UndefOr[String] = js.native
}

object AnonBing {
  @scala.inline
  def apply(): AnonBing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBing]
  }
  @scala.inline
  implicit class AnonBingOps[Self <: AnonBing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bing")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleStatic")(js.undefined)
        ret
    }
  }
  
}

