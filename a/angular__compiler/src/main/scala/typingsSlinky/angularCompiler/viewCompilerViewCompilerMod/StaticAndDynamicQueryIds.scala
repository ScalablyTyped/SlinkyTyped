package typingsSlinky.angularCompiler.viewCompilerViewCompilerMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticAndDynamicQueryIds extends js.Object {
  var dynamicQueryIds: Set[Double] = js.native
  var staticQueryIds: Set[Double] = js.native
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
    def withDynamicQueryIds(value: Set[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicQueryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticQueryIds(value: Set[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticQueryIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

