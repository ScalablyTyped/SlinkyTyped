package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlPutTrainedModel[T] extends Generic {
  var body: T = js.native
  var model_id: String = js.native
}

object MlPutTrainedModel {
  @scala.inline
  def apply[T](body: T, model_id: String): MlPutTrainedModel[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModel[T]]
  }
  @scala.inline
  implicit class MlPutTrainedModelOps[Self[t] <: MlPutTrainedModel[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

