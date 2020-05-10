package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailInfo extends js.Object {
  /**
    * The AWS region in which a trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.native
  /**
    * The name of a trail.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The ARN of a trail.
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object TrailInfo {
  @scala.inline
  def apply(): TrailInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailInfo]
  }
  @scala.inline
  implicit class TrailInfoOps[Self <: TrailInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(js.undefined)
        ret
    }
  }
  
}

