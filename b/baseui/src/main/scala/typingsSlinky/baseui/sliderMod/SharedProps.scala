package typingsSlinky.baseui.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedProps extends js.Object {
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$isDragged")
  var $isDragged: Boolean = js.native
  @JSName("$max")
  var $max: Double = js.native
  @JSName("$min")
  var $min: Double = js.native
  @JSName("$thumbIndex")
  var $thumbIndex: Double = js.native
  @JSName("$value")
  var $value: js.Array[Double] = js.native
}

object SharedProps {
  @scala.inline
  def apply(
    $disabled: Boolean,
    $isDragged: Boolean,
    $max: Double,
    $min: Double,
    $thumbIndex: Double,
    $value: js.Array[Double]
  ): SharedProps = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isDragged = $isDragged.asInstanceOf[js.Any], $max = $max.asInstanceOf[js.Any], $min = $min.asInstanceOf[js.Any], $thumbIndex = $thumbIndex.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
  @scala.inline
  implicit class SharedPropsOps[Self <: SharedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$disabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$isDragged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isDragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$thumbIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$thumbIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$value(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

