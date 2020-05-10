package typingsSlinky.emojione

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFname extends js.Object {
  var fname: String = js.native
  var isCanonical: Boolean = js.native
  var uc: String = js.native
  var unicode: js.Array[String] = js.native
}

object AnonFname {
  @scala.inline
  def apply(fname: String, isCanonical: Boolean, uc: String, unicode: js.Array[String]): AnonFname = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], isCanonical = isCanonical.asInstanceOf[js.Any], uc = uc.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFname]
  }
  @scala.inline
  implicit class AnonFnameOps[Self <: AnonFname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCanonical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanonical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnicode(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

