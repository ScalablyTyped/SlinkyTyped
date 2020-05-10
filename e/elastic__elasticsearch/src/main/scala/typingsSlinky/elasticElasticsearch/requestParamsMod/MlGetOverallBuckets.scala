package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetOverallBuckets[T] extends Generic {
  var allow_no_jobs: js.UndefOr[Boolean] = js.native
  var body: js.UndefOr[T] = js.native
  var bucket_span: js.UndefOr[String] = js.native
  var end: js.UndefOr[String] = js.native
  var exclude_interim: js.UndefOr[Boolean] = js.native
  var job_id: String = js.native
  var overall_score: js.UndefOr[Double] = js.native
  var start: js.UndefOr[String] = js.native
  var top_n: js.UndefOr[Double] = js.native
}

object MlGetOverallBuckets {
  @scala.inline
  def apply[T](job_id: String): MlGetOverallBuckets[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetOverallBuckets[T]]
  }
  @scala.inline
  implicit class MlGetOverallBucketsOps[Self[t] <: MlGetOverallBuckets[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withJob_id(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_no_jobs(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_no_jobs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_jobs")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBucket_span(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket_span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket_span: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket_span")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_interim(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_interim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_interim: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_interim")(js.undefined)
        ret
    }
    @scala.inline
    def withOverall_score(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overall_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverall_score: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overall_score")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTop_n(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop_n: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_n")(js.undefined)
        ret
    }
  }
  
}

