package typingsSlinky.jqueryUiLayout.anon

import typingsSlinky.jqueryUiLayout.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait East extends js.Object {
  var east: JQuery | Boolean = js.native
  var north: JQuery | Boolean = js.native
  var south: JQuery | Boolean = js.native
  var west: JQuery | Boolean = js.native
}

object East {
  @scala.inline
  def apply(east: JQuery | Boolean, north: JQuery | Boolean, south: JQuery | Boolean, west: JQuery | Boolean): East = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[East]
  }
  @scala.inline
  implicit class EastOps[Self <: East] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEast(value: JQuery | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("east")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorth(value: JQuery | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("north")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouth(value: JQuery | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("south")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWest(value: JQuery | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("west")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

