package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTimestamp extends js.Object {
  var nanos: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[String] = js.native
}

object SchemaTimestamp {
  @scala.inline
  def apply(): SchemaTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestamp]
  }
  @scala.inline
  implicit class SchemaTimestampOps[Self <: SchemaTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNanos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(js.undefined)
        ret
    }
    @scala.inline
    def withSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.undefined)
        ret
    }
  }
  
}

