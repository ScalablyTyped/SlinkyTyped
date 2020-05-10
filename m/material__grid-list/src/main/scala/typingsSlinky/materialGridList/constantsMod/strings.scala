package typingsSlinky.materialGridList.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialGridList.materialGridListStrings.`Dotmdc-grid-list__tiles`
import typingsSlinky.materialGridList.materialGridListStrings.`Dotmdc-grid-tile`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var TILES_SELECTOR: `Dotmdc-grid-list__tiles` = js.native
  var TILE_SELECTOR: `Dotmdc-grid-tile` = js.native
}

object strings {
  @scala.inline
  def apply(TILES_SELECTOR: `Dotmdc-grid-list__tiles`, TILE_SELECTOR: `Dotmdc-grid-tile`): strings = {
    val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR.asInstanceOf[js.Any], TILE_SELECTOR = TILE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTILES_SELECTOR(value: `Dotmdc-grid-list__tiles`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TILES_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTILE_SELECTOR(value: `Dotmdc-grid-tile`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TILE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

