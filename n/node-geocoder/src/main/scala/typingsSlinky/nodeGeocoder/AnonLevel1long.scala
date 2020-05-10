package typingsSlinky.nodeGeocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLevel1long extends js.Object {
  var level1long: js.UndefOr[String] = js.native
  var level1short: js.UndefOr[String] = js.native
  var level2long: js.UndefOr[String] = js.native
  var level2short: js.UndefOr[String] = js.native
}

object AnonLevel1long {
  @scala.inline
  def apply(): AnonLevel1long = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLevel1long]
  }
  @scala.inline
  implicit class AnonLevel1longOps[Self <: AnonLevel1long] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel1long(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level1long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel1long: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level1long")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel1short(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level1short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel1short: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level1short")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel2long(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level2long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel2long: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level2long")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel2short(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level2short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel2short: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level2short")(js.undefined)
        ret
    }
  }
  
}

