package typingsSlinky.jqueryUiLayout

import typingsSlinky.jqueryUiLayout.JQueryUILayout.PaneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNorth extends js.Object {
  var east: PaneState = js.native
  var north: PaneState = js.native
  var south: PaneState = js.native
  var west: PaneState = js.native
}

object AnonNorth {
  @scala.inline
  def apply(east: PaneState, north: PaneState, south: PaneState, west: PaneState): AnonNorth = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNorth]
  }
  @scala.inline
  implicit class AnonNorthOps[Self <: AnonNorth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEast(value: PaneState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("east")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorth(value: PaneState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("north")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouth(value: PaneState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("south")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWest(value: PaneState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("west")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

