package typingsSlinky.angular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeName extends js.Object {
  var codeName: String = js.native
  var dot: Double = js.native
  var full: String = js.native
  var major: Double = js.native
  var minor: Double = js.native
}

object CodeName {
  @scala.inline
  def apply(codeName: String, dot: Double, full: String, major: Double, minor: Double): CodeName = {
    val __obj = js.Dynamic.literal(codeName = codeName.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeName]
  }
  @scala.inline
  implicit class CodeNameOps[Self <: CodeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

