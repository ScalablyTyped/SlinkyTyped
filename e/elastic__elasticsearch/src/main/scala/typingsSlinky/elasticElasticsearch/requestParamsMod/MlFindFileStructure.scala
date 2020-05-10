package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.delimited
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ndjson
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.semi_structured_text
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlFindFileStructure[T] extends Generic {
  var body: T = js.native
  var charset: js.UndefOr[String] = js.native
  var column_names: js.UndefOr[String | js.Array[String]] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[ndjson | xml | delimited | semi_structured_text] = js.native
  var grok_pattern: js.UndefOr[String] = js.native
  var has_header_row: js.UndefOr[Boolean] = js.native
  var line_merge_size_limit: js.UndefOr[Double] = js.native
  var lines_to_sample: js.UndefOr[Double] = js.native
  var quote: js.UndefOr[String] = js.native
  var should_trim_fields: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[String] = js.native
  var timestamp_field: js.UndefOr[String] = js.native
  var timestamp_format: js.UndefOr[String] = js.native
}

object MlFindFileStructure {
  @scala.inline
  def apply[T](body: T): MlFindFileStructure[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFindFileStructure[T]]
  }
  @scala.inline
  implicit class MlFindFileStructureOps[Self[t] <: MlFindFileStructure[t], T] (val x: Self[T]) extends AnyVal {
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
    def withCharset(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withColumn_names(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn_names: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_names")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withExplain(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplain: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ndjson | xml | delimited | semi_structured_text): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGrok_pattern(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grok_pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrok_pattern: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grok_pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_header_row(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_header_row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_header_row: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_header_row")(js.undefined)
        ret
    }
    @scala.inline
    def withLine_merge_size_limit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_merge_size_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine_merge_size_limit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_merge_size_limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLines_to_sample(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines_to_sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines_to_sample: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines_to_sample")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
    @scala.inline
    def withShould_trim_fields(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_trim_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShould_trim_fields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_trim_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp_field(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp_field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp_field: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp_field")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp_format(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp_format: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp_format")(js.undefined)
        ret
    }
  }
  
}

