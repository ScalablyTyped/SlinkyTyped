package typingsSlinky.reactMosaicComponent.splitMod

import typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox
import typingsSlinky.reactMosaicComponent.typesMod.EnabledResizeOptions
import typingsSlinky.reactMosaicComponent.typesMod.MosaicDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitProps extends EnabledResizeOptions {
  var boundingBox: BoundingBox = js.native
  var direction: MosaicDirection = js.native
  var onChange: js.UndefOr[js.Function1[/* percentOfParent */ Double, Unit]] = js.native
  var onRelease: js.UndefOr[js.Function1[/* percentOfParent */ Double, Unit]] = js.native
  var splitPercentage: Double = js.native
}

object SplitProps {
  @scala.inline
  def apply(boundingBox: BoundingBox, direction: MosaicDirection, splitPercentage: Double): SplitProps = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], splitPercentage = splitPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitProps]
  }
  @scala.inline
  implicit class SplitPropsOps[Self <: SplitProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBox(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: MosaicDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: /* percentOfParent */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRelease(value: /* percentOfParent */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.undefined)
        ret
    }
  }
  
}

