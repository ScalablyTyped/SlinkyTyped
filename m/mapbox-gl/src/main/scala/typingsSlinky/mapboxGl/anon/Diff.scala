package typingsSlinky.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diff extends js.Object {
  var diff: js.UndefOr[Boolean] = js.native
  var localIdeographFontFamily: js.UndefOr[String] = js.native
}

object Diff {
  @scala.inline
  def apply(): Diff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diff]
  }
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalIdeographFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdeographFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalIdeographFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdeographFontFamily")(js.undefined)
        ret
    }
  }
  
}

