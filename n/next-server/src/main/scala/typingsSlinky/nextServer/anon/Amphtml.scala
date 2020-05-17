package typingsSlinky.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amphtml extends js.Object {
  var amphtml: js.UndefOr[Boolean] = js.native
  var dataOnly: js.UndefOr[Boolean] = js.native
  var hasAmp: js.UndefOr[Boolean] = js.native
}

object Amphtml {
  @scala.inline
  def apply(): Amphtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amphtml]
  }
  @scala.inline
  implicit class AmphtmlOps[Self <: Amphtml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmphtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amphtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmphtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amphtml")(js.undefined)
        ret
    }
    @scala.inline
    def withDataOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAmp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAmp")(js.undefined)
        ret
    }
  }
  
}

