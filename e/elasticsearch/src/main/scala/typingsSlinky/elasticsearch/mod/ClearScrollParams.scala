package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearScrollParams extends GenericParams {
  var scrollId: NameList = js.native
}

object ClearScrollParams {
  @scala.inline
  def apply(scrollId: NameList): ClearScrollParams = {
    val __obj = js.Dynamic.literal(scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearScrollParams]
  }
  @scala.inline
  implicit class ClearScrollParamsOps[Self <: ClearScrollParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollId(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

