package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Face extends js.Object {
  var face: js.UndefOr[String] = js.native
  var family: js.UndefOr[String] = js.native
  var height: js.UndefOr[String] = js.native
  var maxWidth: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
}

object Face {
  @scala.inline
  def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  @scala.inline
  implicit class FaceOps[Self <: Face] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

