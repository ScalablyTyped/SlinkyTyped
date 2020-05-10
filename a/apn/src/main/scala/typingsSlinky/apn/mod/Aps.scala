package typingsSlinky.apn.mod

import typingsSlinky.apn.apnNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aps extends js.Object {
  var alert: js.UndefOr[String | ApsAlert] = js.native
  var badge: js.UndefOr[Double] = js.native
  var category: js.UndefOr[String] = js.native
  var `content-available`: js.UndefOr[`1`] = js.native
  var `launch-image`: js.UndefOr[String] = js.native
  var `mutable-content`: js.UndefOr[`1`] = js.native
  var sound: js.UndefOr[String] = js.native
  var `url-args`: js.UndefOr[js.Array[String]] = js.native
}

object Aps {
  @scala.inline
  def apply(): Aps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aps]
  }
  @scala.inline
  implicit class ApsOps[Self <: Aps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: String | ApsAlert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-available`(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-available`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-available")(js.undefined)
        ret
    }
    @scala.inline
    def `withLaunch-image`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLaunch-image`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withMutable-content`(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutable-content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMutable-content`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutable-content")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def `withUrl-args`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUrl-args`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url-args")(js.undefined)
        ret
    }
  }
  
}

