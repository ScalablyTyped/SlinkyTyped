package typingsSlinky.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optype extends js.Object {
  var index: String = js.native
  var op_type: js.UndefOr[String] = js.native
  var pipeline: js.UndefOr[String] = js.native
  var routing: js.UndefOr[String] = js.native
  var version_type: js.UndefOr[String] = js.native
}

object Optype {
  @scala.inline
  def apply(index: String): Optype = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optype]
  }
  @scala.inline
  implicit class OptypeOps[Self <: Optype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOp_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op_type")(js.undefined)
        ret
    }
    @scala.inline
    def withPipeline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withRouting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_type")(js.undefined)
        ret
    }
  }
  
}

