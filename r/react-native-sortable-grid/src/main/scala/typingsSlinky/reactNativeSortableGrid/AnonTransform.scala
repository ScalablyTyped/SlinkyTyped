package typingsSlinky.reactNativeSortableGrid

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTransform extends js.Object {
  var transform: js.Array[StringDictionary[AnimatedInterpolation]] = js.native
}

object AnonTransform {
  @scala.inline
  def apply(transform: js.Array[StringDictionary[AnimatedInterpolation]]): AnonTransform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransform]
  }
  @scala.inline
  implicit class AnonTransformOps[Self <: AnonTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransform(value: js.Array[StringDictionary[AnimatedInterpolation]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

