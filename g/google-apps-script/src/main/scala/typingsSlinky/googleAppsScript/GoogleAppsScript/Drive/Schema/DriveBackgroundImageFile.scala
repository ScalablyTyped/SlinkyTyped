package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveBackgroundImageFile extends js.Object {
  var id: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var xCoordinate: js.UndefOr[Double] = js.native
  var yCoordinate: js.UndefOr[Double] = js.native
}

object DriveBackgroundImageFile {
  @scala.inline
  def apply(): DriveBackgroundImageFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveBackgroundImageFile]
  }
  @scala.inline
  implicit class DriveBackgroundImageFileOps[Self <: DriveBackgroundImageFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXCoordinate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xCoordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXCoordinate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xCoordinate")(js.undefined)
        ret
    }
    @scala.inline
    def withYCoordinate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yCoordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYCoordinate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yCoordinate")(js.undefined)
        ret
    }
  }
  
}

