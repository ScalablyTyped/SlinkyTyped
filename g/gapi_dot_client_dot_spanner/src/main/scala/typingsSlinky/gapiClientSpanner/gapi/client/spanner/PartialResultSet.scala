package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialResultSet extends js.Object {
  /**
    * If true, then the final value in values is chunked, and must
    * be combined with more values from subsequent `PartialResultSet`s
    * to obtain a complete field value.
    */
  var chunkedValue: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the result set, such as row type information.
    * Only present in the first response.
    */
  var metadata: js.UndefOr[ResultSetMetadata] = js.native
  /**
    * Streaming calls might be interrupted for a variety of reasons, such
    * as TCP connection loss. If this occurs, the stream of results can
    * be resumed by re-sending the original request and including
    * `resume_token`. Note that executing any other transaction in the
    * same session invalidates the token.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /**
    * Query plan and execution statistics for the query that produced this
    * streaming result set. These can be requested by setting
    * ExecuteSqlRequest.query_mode and are sent
    * only once with the last response in the stream.
    */
  var stats: js.UndefOr[ResultSetStats] = js.native
  /**
    * A streamed result set consists of a stream of values, which might
    * be split into many `PartialResultSet` messages to accommodate
    * large rows and/or large values. Every N complete values defines a
    * row, where N is equal to the number of entries in
    * metadata.row_type.fields.
    *
    * Most values are encoded based on type as described
    * here.
    *
    * It is possible that the last value in values is "chunked",
    * meaning that the rest of the value is sent in subsequent
    * `PartialResultSet`(s). This is denoted by the chunked_value
    * field. Two or more chunked values can be merged to form a
    * complete value as follows:
    *
    * &#42; `bool/number/null`: cannot be chunked
    * &#42; `string`: concatenate the strings
    * &#42; `list`: concatenate the lists. If the last element in a list is a
    * `string`, `list`, or `object`, merge it with the first element in
    * the next list by applying these rules recursively.
    * &#42; `object`: concatenate the (field name, field value) pairs. If a
    * field name is duplicated, then apply these rules recursively
    * to merge the field values.
    *
    * Some examples of merging:
    *
    * # Strings are concatenated.
    * "foo", "bar" => "foobar"
    *
    * # Lists of non-strings are concatenated.
    * [2, 3], [4] => [2, 3, 4]
    *
    * # Lists are concatenated, but the last and first elements are merged
    * # because they are strings.
    * ["a", "b"], ["c", "d"] => ["a", "bc", "d"]
    *
    * # Lists are concatenated, but the last and first elements are merged
    * # because they are lists. Recursively, the last and first elements
    * # of the inner lists are merged because they are strings.
    * ["a", ["b", "c"]], [["d"], "e"] => ["a", ["b", "cd"], "e"]
    *
    * # Non-overlapping object fields are combined.
    * {"a": "1"}, {"b": "2"} => {"a": "1", "b": 2"}
    *
    * # Overlapping object fields are merged.
    * {"a": "1"}, {"a": "2"} => {"a": "12"}
    *
    * # Examples of merging objects containing lists of strings.
    * {"a": ["1"]}, {"a": ["2"]} => {"a": ["12"]}
    *
    * For a more complete example, suppose a streaming SQL query is
    * yielding a result set whose rows contain a single string
    * field. The following `PartialResultSet`s might be yielded:
    *
    * {
    * "metadata": { ... }
    * "values": ["Hello", "W"]
    * "chunked_value": true
    * "resume_token": "Af65..."
    * }
    * {
    * "values": ["orl"]
    * "chunked_value": true
    * "resume_token": "Bqp2..."
    * }
    * {
    * "values": ["d"]
    * "resume_token": "Zx1B..."
    * }
    *
    * This sequence of `PartialResultSet`s encodes two rows, one
    * containing the field value `"Hello"`, and a second containing the
    * field value `"World" = "W" + "orl" + "d"`.
    */
  var values: js.UndefOr[js.Array[_]] = js.native
}

object PartialResultSet {
  @scala.inline
  def apply(): PartialResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialResultSet]
  }
  @scala.inline
  implicit class PartialResultSetOps[Self <: PartialResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkedValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: ResultSetMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: ResultSetStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

