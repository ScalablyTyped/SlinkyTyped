package typingsSlinky.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowFactory[EntityType] extends js.Object {
  var rowCache: js.Array[Row[EntityType]] = js.native
}

object RowFactory {
  @scala.inline
  def apply[EntityType](rowCache: js.Array[Row[EntityType]]): RowFactory[EntityType] = {
    val __obj = js.Dynamic.literal(rowCache = rowCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFactory[EntityType]]
  }
  @scala.inline
  implicit class RowFactoryOps[Self[entitytype] <: RowFactory[entitytype], EntityType] (val x: Self[EntityType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EntityType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EntityType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EntityType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EntityType] with Other]
    @scala.inline
    def withRowCache(value: js.Array[Row[EntityType]]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCache")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

