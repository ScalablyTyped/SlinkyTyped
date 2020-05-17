package typingsSlinky.leaflet.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.mod.Coords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var coords: Coords = js.native
  var current: Boolean = js.native
  var el: HTMLElement = js.native
  var loaded: js.UndefOr[js.Date] = js.native
  var retain: js.UndefOr[Boolean] = js.native
}

object Active {
  @scala.inline
  def apply(coords: Coords, current: Boolean, el: HTMLElement): Active = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoords(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withRetain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retain")(js.undefined)
        ret
    }
  }
  
}

