package typingsSlinky.materialUiLab.skeletonSkeletonMod

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.AnonAnimation
import typingsSlinky.materialUiLab.materialUiLabStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonTypeMap[P, D /* <: ReactElement */] extends js.Object {
  var classKey: SkeletonClassKey = js.native
  var defaultComponent: div = js.native
  var props: P with AnonAnimation = js.native
}

object SkeletonTypeMap {
  @scala.inline
  def apply[P, D](classKey: SkeletonClassKey, defaultComponent: div, props: P with AnonAnimation): SkeletonTypeMap[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonTypeMap[P, D]]
  }
  @scala.inline
  implicit class SkeletonTypeMapOps[Self[p, d] <: SkeletonTypeMap[p, d], P, D] (val x: Self[P, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, D]) with Other]
    @scala.inline
    def withClassKey(value: SkeletonClassKey): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultComponent(value: div): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: P with AnonAnimation): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

