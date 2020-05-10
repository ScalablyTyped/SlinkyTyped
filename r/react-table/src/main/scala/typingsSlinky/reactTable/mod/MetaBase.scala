package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaBase[D /* <: js.Object */] extends js.Object {
  var instance: TableInstance[D] = js.native
  var userProps: js.Any = js.native
}

object MetaBase {
  @scala.inline
  def apply[D](instance: TableInstance[D], userProps: js.Any): MetaBase[D] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], userProps = userProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaBase[D]]
  }
  @scala.inline
  implicit class MetaBaseOps[Self[d] <: MetaBase[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withInstance(value: TableInstance[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserProps(value: js.Any): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

