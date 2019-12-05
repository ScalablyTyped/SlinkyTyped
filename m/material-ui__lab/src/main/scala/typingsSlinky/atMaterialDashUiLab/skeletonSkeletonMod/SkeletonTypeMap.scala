package typingsSlinky.atMaterialDashUiLab.skeletonSkeletonMod

import slinky.core.facade.ReactElement
import typingsSlinky.atMaterialDashUiLab.Anon_Circle
import typingsSlinky.atMaterialDashUiLab.atMaterialDashUiLabStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonTypeMap[P, D /* <: ReactElement */] extends js.Object {
  var classKey: SkeletonClassKey
  var defaultComponent: div
  var props: P with Anon_Circle
}

object SkeletonTypeMap {
  @scala.inline
  def apply[P, D /* <: ReactElement */](classKey: SkeletonClassKey, defaultComponent: div, props: P with Anon_Circle): SkeletonTypeMap[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkeletonTypeMap[P, D]]
  }
}

