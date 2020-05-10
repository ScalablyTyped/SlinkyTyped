package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformUpdateTransform[T] extends Generic {
  var body: T = js.native
  var defer_validation: js.UndefOr[Boolean] = js.native
  var transform_id: String = js.native
}

object TransformUpdateTransform {
  @scala.inline
  def apply[T](body: T, transform_id: String): TransformUpdateTransform[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformUpdateTransform[T]]
  }
  @scala.inline
  implicit class TransformUpdateTransformOps[Self[t] <: TransformUpdateTransform[t], T] (val x: Self[T]) extends AnyVal {
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
    def withTransform_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefer_validation(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer_validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer_validation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer_validation")(js.undefined)
        ret
    }
  }
  
}

