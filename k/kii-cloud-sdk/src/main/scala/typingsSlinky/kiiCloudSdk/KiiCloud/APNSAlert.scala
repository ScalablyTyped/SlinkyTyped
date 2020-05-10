package typingsSlinky.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNSAlert extends js.Object {
  var `action-loc-key`: String = js.native
  var body: String = js.native
  var `launch-image`: String = js.native
  var `loc-args`: js.Array[String] = js.native
  var `loc-key`: String = js.native
  var title: String = js.native
  var `title-loc-args`: js.Array[String] = js.native
  var `title-loc-key`: String = js.native
}

object APNSAlert {
  @scala.inline
  def apply(
    `action-loc-key`: String,
    body: String,
    `launch-image`: String,
    `loc-args`: js.Array[String],
    `loc-key`: String,
    title: String,
    `title-loc-args`: js.Array[String],
    `title-loc-key`: String
  ): APNSAlert = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("action-loc-key")(`action-loc-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("launch-image")(`launch-image`.asInstanceOf[js.Any])
    __obj.updateDynamic("loc-args")(`loc-args`.asInstanceOf[js.Any])
    __obj.updateDynamic("loc-key")(`loc-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("title-loc-args")(`title-loc-args`.asInstanceOf[js.Any])
    __obj.updateDynamic("title-loc-key")(`title-loc-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSAlert]
  }
  @scala.inline
  implicit class APNSAlertOps[Self <: APNSAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAction-loc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action-loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLaunch-image`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLoc-args`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLoc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTitle-loc-args`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTitle-loc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

