package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a SourceSplitRequest.
  */
@js.native
trait SchemaSourceSplitResponse extends js.Object {
  /**
    * If outcome is SPLITTING_HAPPENED, then this is a list of bundles into
    * which the source was split. Otherwise this field is ignored. This list
    * can be empty, which means the source represents an empty input.
    */
  var bundles: js.UndefOr[js.Array[SchemaDerivedSource]] = js.native
  /**
    * Indicates whether splitting happened and produced a list of bundles. If
    * this is USE_CURRENT_SOURCE_AS_IS, the current source should be processed
    * &quot;as is&quot; without splitting. &quot;bundles&quot; is ignored in
    * this case. If this is SPLITTING_HAPPENED, then &quot;bundles&quot;
    * contains a list of bundles into which the source was split.
    */
  var outcome: js.UndefOr[String] = js.native
  /**
    * DEPRECATED in favor of bundles.
    */
  var shards: js.UndefOr[js.Array[SchemaSourceSplitShard]] = js.native
}

object SchemaSourceSplitResponse {
  @scala.inline
  def apply(): SchemaSourceSplitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitResponse]
  }
  @scala.inline
  implicit class SchemaSourceSplitResponseOps[Self <: SchemaSourceSplitResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundles(value: js.Array[SchemaDerivedSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(js.undefined)
        ret
    }
    @scala.inline
    def withShards(value: js.Array[SchemaSourceSplitShard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shards")(js.undefined)
        ret
    }
  }
  
}

