package typingsSlinky.angularCompiler.viewCompilerViewCompilerMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticAndDynamicQueryIds extends js.Object {
  var dynamicQueryIds: Set[Double]
  var staticQueryIds: Set[Double]
}

object StaticAndDynamicQueryIds {
  @scala.inline
  def apply(dynamicQueryIds: Set[Double], staticQueryIds: Set[Double]): StaticAndDynamicQueryIds = {
    val __obj = js.Dynamic.literal(dynamicQueryIds = dynamicQueryIds.asInstanceOf[js.Any], staticQueryIds = staticQueryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticAndDynamicQueryIds]
  }
  @scala.inline
  implicit class StaticAndDynamicQueryIdsOps[Self <: StaticAndDynamicQueryIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDynamicQueryIds(value: Set[Double]): Self = this.set("dynamicQueryIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticQueryIds(value: Set[Double]): Self = this.set("staticQueryIds", value.asInstanceOf[js.Any])
  }
  
}

