package typingsSlinky.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[I] extends js.Object {
  /**
    * 目标点的数据
    */
  var data: typingsSlinky.amapJsApi.AMap.MassMarks.Data = js.native
  /**
    * 事件触发目标
    */
  var target: I = js.native
}

object Data {
  @scala.inline
  def apply[I](data: typingsSlinky.amapJsApi.AMap.MassMarks.Data, target: I): Data[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[I]]
  }
  @scala.inline
  implicit class DataOps[Self[i] <: Data[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withData(value: typingsSlinky.amapJsApi.AMap.MassMarks.Data): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: I): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

