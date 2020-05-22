package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNumber extends js.Object {
  var r: Double
  var style: Left
}

object RNumber {
  @scala.inline
  def apply(r: Double, style: Left): RNumber = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNumber]
  }
}

