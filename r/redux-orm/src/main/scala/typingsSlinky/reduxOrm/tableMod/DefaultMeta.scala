package typingsSlinky.reduxOrm.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMeta[MIdType] extends js.Object {
  var maxId: Null | Double = js.native
}

object DefaultMeta {
  @scala.inline
  def apply[MIdType](): DefaultMeta[MIdType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMeta[MIdType]]
  }
  @scala.inline
  implicit class DefaultMetaOps[Self[midtype] <: DefaultMeta[midtype], MIdType] (val x: Self[MIdType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[MIdType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[MIdType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[MIdType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[MIdType] with Other]
    @scala.inline
    def withMaxId(value: Double): Self[MIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxIdNull: Self[MIdType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxId")(null)
        ret
    }
  }
  
}

