package typingsSlinky.jsDataHttp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alpha extends js.Object {
  var alpha: js.UndefOr[String | Boolean] = js.native
  var beta: js.UndefOr[String | Boolean] = js.native
  var full: js.UndefOr[String] = js.native
  var major: js.UndefOr[String] = js.native
  var minor: js.UndefOr[String] = js.native
  var patch: js.UndefOr[String] = js.native
}

object Alpha {
  @scala.inline
  def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBeta(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(js.undefined)
        ret
    }
    @scala.inline
    def withFull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
    @scala.inline
    def withMajor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(js.undefined)
        ret
    }
    @scala.inline
    def withMinor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(js.undefined)
        ret
    }
    @scala.inline
    def withPatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
  }
  
}

