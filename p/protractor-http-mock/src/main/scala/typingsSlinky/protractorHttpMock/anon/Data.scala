package typingsSlinky.protractorHttpMock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[TResponse] extends js.Object {
  var data: TResponse = js.native
  var delay: js.UndefOr[Double] = js.native
  var status: js.UndefOr[Double] = js.native
}

object Data {
  @scala.inline
  def apply[TResponse](data: TResponse): Data[TResponse] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TResponse]]
  }
  @scala.inline
  implicit class DataOps[Self[tresponse] <: Data[tresponse], TResponse] (val x: Self[TResponse]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResponse] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResponse]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResponse] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResponse] with Other]
    @scala.inline
    def withData(value: TResponse): Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self[TResponse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

