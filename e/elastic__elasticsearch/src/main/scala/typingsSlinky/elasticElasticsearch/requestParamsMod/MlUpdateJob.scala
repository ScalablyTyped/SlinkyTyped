package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlUpdateJob[T] extends Generic {
  var body: T = js.native
  var job_id: String = js.native
}

object MlUpdateJob {
  @scala.inline
  def apply[T](body: T, job_id: String): MlUpdateJob[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateJob[T]]
  }
  @scala.inline
  implicit class MlUpdateJobOps[Self[t] <: MlUpdateJob[t], T] (val x: Self[T]) extends AnyVal {
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
    def withJob_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

