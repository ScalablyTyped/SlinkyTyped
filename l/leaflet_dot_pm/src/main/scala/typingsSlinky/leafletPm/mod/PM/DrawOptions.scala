package typingsSlinky.leafletPm.mod.PM

import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOptions extends js.Object {
  var hintlineStyle: js.UndefOr[PathOptions] = js.native
  var pathOptions: js.UndefOr[PathOptions] = js.native
  var templineStyle: js.UndefOr[PathOptions] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHintlineStyle(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPathOptions(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplineStyle(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templineStyle")(js.undefined)
        ret
    }
  }
  
}

