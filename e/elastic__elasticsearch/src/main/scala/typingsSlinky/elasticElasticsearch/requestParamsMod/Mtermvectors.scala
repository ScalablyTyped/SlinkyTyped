package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.force
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mtermvectors[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var field_statistics: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[String | js.Array[String]] = js.native
  var ids: js.UndefOr[String | js.Array[String]] = js.native
  var index: js.UndefOr[String] = js.native
  var offsets: js.UndefOr[Boolean] = js.native
  var payloads: js.UndefOr[Boolean] = js.native
  var positions: js.UndefOr[Boolean] = js.native
  var preference: js.UndefOr[String] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[String] = js.native
  var term_statistics: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
  var version_type: js.UndefOr[internal | external | external_gte | force] = js.native
}

object Mtermvectors {
  @scala.inline
  def apply[T](): Mtermvectors[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mtermvectors[T]]
  }
  @scala.inline
  implicit class MtermvectorsOps[Self[t] <: Mtermvectors[t], T] (val x: Self[T]) extends AnyVal {
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
    def withoutBody: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withField_statistics(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField_statistics: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsets(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsets: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloads(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloads: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloads")(js.undefined)
        ret
    }
    @scala.inline
    def withPositions(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreference(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreference: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtime(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(js.undefined)
        ret
    }
    @scala.inline
    def withRouting(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing")(js.undefined)
        ret
    }
    @scala.inline
    def withTerm_statistics(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term_statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerm_statistics: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term_statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_type(value: internal | external | external_gte | force): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_type: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_type")(js.undefined)
        ret
    }
  }
  
}

