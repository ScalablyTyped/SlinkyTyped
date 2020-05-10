package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set search results crowding limits. Crowding is a situation in which
  * multiple results from the same source or host &quot;crowd out&quot; other
  * results, diminishing the quality of search for users. To foster better
  * search quality and source diversity in search results, you can set a
  * condition to reduce repetitive results by source.
  */
@js.native
trait SchemaSourceCrowdingConfig extends js.Object {
  /**
    * Use a field to control results crowding. For example, if you want to
    * control overly similar results from Gmail topics, use `thread_id`. For
    * similar pages from Google Sites, you can use `webspace_id`. When matching
    * query results contain the same field value in `GenericMetadata`, crowding
    * limits are set on those records.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Maximum number of results allowed from a source. No limits will be set on
    * results if this value is less than or equal to 0.
    */
  var numResults: js.UndefOr[Double] = js.native
  /**
    * Maximum number of suggestions allowed from a source. No limits will be
    * set on results if this value is less than or equal to 0.
    */
  var numSuggestions: js.UndefOr[Double] = js.native
  /**
    * Control results by content source. This option limits the total number of
    * results from a given source and ignores field-based crowding control.
    */
  var source: js.UndefOr[Boolean] = js.native
}

object SchemaSourceCrowdingConfig {
  @scala.inline
  def apply(): SchemaSourceCrowdingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceCrowdingConfig]
  }
  @scala.inline
  implicit class SchemaSourceCrowdingConfigOps[Self <: SchemaSourceCrowdingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withNumResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNumSuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

