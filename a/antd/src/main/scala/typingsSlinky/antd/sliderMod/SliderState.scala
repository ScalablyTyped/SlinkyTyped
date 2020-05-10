package typingsSlinky.antd.sliderMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderState extends js.Object {
  var visibles: NumberDictionary[Boolean] = js.native
}

object SliderState {
  @scala.inline
  def apply(visibles: NumberDictionary[Boolean]): SliderState = {
    val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderState]
  }
  @scala.inline
  implicit class SliderStateOps[Self <: SliderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibles(value: NumberDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

