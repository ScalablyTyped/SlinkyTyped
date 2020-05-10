package typingsSlinky.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyParameters extends BasicParameters {
  var x5c: js.UndefOr[js.Array[String]] = js.native
  var x5t: js.UndefOr[String] = js.native
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}

object KeyParameters {
  @scala.inline
  def apply(): KeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyParameters]
  }
  @scala.inline
  implicit class KeyParametersOps[Self <: KeyParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX5c(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5c: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5c")(js.undefined)
        ret
    }
    @scala.inline
    def withX5t(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5t: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t")(js.undefined)
        ret
    }
    @scala.inline
    def withX5tNumbersignS256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t#S256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5tNumbersignS256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t#S256")(js.undefined)
        ret
    }
  }
  
}

