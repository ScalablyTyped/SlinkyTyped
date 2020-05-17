package typingsSlinky.c3.anon

import typingsSlinky.c3.mod.ChartInternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onclick extends js.Object {
  /**
    * Set click event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  /**
    * Set mouseout event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  /**
    * Set mouseover event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  /**
    * Tile settings for legend color display.
    */
  var tile: js.UndefOr[Height] = js.native
}

object Onclick {
  @scala.inline
  def apply(): Onclick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onclick]
  }
  @scala.inline
  implicit class OnclickOps[Self <: Onclick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnclick(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseover(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withTile(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.undefined)
        ret
    }
  }
  
}

