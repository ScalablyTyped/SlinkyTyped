package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldStatsResponseField extends js.Object {
  var density: Double = js.native
  var doc_count: Double = js.native
  var is_aggregatable: String = js.native
  var is_searchable: String = js.native
  var max_doc: Double = js.native
  var max_value: js.Any = js.native
  var min_value: js.Any = js.native
  var sum_doc_freq: Double = js.native
  var sum_total_term_freq: Double = js.native
}

object FieldStatsResponseField {
  @scala.inline
  def apply(
    density: Double,
    doc_count: Double,
    is_aggregatable: String,
    is_searchable: String,
    max_doc: Double,
    max_value: js.Any,
    min_value: js.Any,
    sum_doc_freq: Double,
    sum_total_term_freq: Double
  ): FieldStatsResponseField = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], is_aggregatable = is_aggregatable.asInstanceOf[js.Any], is_searchable = is_searchable.asInstanceOf[js.Any], max_doc = max_doc.asInstanceOf[js.Any], max_value = max_value.asInstanceOf[js.Any], min_value = min_value.asInstanceOf[js.Any], sum_doc_freq = sum_doc_freq.asInstanceOf[js.Any], sum_total_term_freq = sum_total_term_freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponseField]
  }
  @scala.inline
  implicit class FieldStatsResponseFieldOps[Self <: FieldStatsResponseField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_aggregatable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_aggregatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_searchable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_doc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_value(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_value(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSum_doc_freq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum_doc_freq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSum_total_term_freq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum_total_term_freq")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

