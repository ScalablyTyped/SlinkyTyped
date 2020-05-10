package typingsSlinky.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOpacityNumber extends js.Object {
  var opacity: Double = js.native
  var transform: js.Array[AnonTranslateY | AnonTranslateXTranslateY] = js.native
}

object AnonOpacityNumber {
  @scala.inline
  def apply(opacity: Double, transform: js.Array[AnonTranslateY | AnonTranslateXTranslateY]): AnonOpacityNumber = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacityNumber]
  }
  @scala.inline
  implicit class AnonOpacityNumberOps[Self <: AnonOpacityNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[AnonTranslateY | AnonTranslateXTranslateY]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

