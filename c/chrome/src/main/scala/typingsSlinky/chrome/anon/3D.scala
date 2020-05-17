package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3D` extends js.Object {
  var `3D`: js.UndefOr[Features] = js.native
  var plugins: js.UndefOr[Npapi] = js.native
}

object `3D` {
  @scala.inline
  def apply(): `3D` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3D`]
  }
  @scala.inline
  implicit class `3DOps`[Self <: `3D`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with3D(value: Features): Self = {
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
    def withPlugins(value: Npapi): Self = {
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

