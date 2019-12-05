package typingsSlinky.reactDashImgpro.reactDashImgproMod.ReactImgpro

import typingsSlinky.reactDashImgpro.reactDashImgproStrings.horizontal_center
import typingsSlinky.reactDashImgpro.reactDashImgproStrings.horizontal_left
import typingsSlinky.reactDashImgpro.reactDashImgproStrings.horizontal_right
import typingsSlinky.reactDashImgpro.reactDashImgproStrings.vertical_bottom
import typingsSlinky.reactDashImgpro.reactDashImgproStrings.vertical_middle
import typingsSlinky.reactDashImgpro.reactDashImgproStrings.vertical_top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: Double
  var mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle
  var width: Double
}

object Size {
  @scala.inline
  def apply(
    height: Double,
    mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Size]
  }
}

