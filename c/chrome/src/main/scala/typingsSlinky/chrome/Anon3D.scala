package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon3D extends js.Object {
  var `3D`: js.UndefOr[AnonFeatures] = js.native
  var plugins: js.UndefOr[AnonNpapi] = js.native
}

object Anon3D {
  @scala.inline
  def apply(): Anon3D = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon3D]
  }
  @scala.inline
  implicit class Anon3DOps[Self <: Anon3D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with3D(value: AnonFeatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without3D: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3D")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: AnonNpapi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

