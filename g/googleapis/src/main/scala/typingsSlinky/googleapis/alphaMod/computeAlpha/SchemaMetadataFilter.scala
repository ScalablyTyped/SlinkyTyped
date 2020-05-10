package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Opaque filter criteria used by loadbalancers to restrict routing
  * configuration to a limited set of loadbalancing proxies. Proxies and
  * sidecars involved in loadbalancing would typically present metadata to the
  * loadbalancers which need to match criteria specified here. If a match takes
  * place, the relevant routing configuration is made available to those
  * proxies. For each metadataFilter in this list, if its filterMatchCriteria
  * is set to MATCH_ANY, at least one of the filterLabels must match the
  * corresponding label provided in the metadata. If its filterMatchCriteria is
  * set to MATCH_ALL, then all of its filterLabels must match with
  * corresponding labels in the provided metadata. An example for using
  * metadataFilters would be: if loadbalancing involves  Envoys, they will only
  * receive routing configuration when values in metadataFilters match values
  * supplied in &lt;a
  * href=&quot;https://www.envoyproxy.io/docs/envoy/latest/api-v2/api/v2/core/base.proto#envoy-api-msg-core-node&quot;
  * Node metadata of their XDS requests to loadbalancers.
  */
@js.native
trait SchemaMetadataFilter extends js.Object {
  /**
    * The list of label value pairs that must match labels in the provided
    * metadata based on filterMatchCriteria  This list must not be empty and
    * can have at the most 64 entries.
    */
  var filterLabels: js.UndefOr[js.Array[SchemaMetadataFilterLabelMatch]] = js.native
  /**
    * Specifies how individual filterLabel matches within the list of
    * filterLabels contribute towards the overall metadataFilter match.
    * Supported values are:   - MATCH_ANY: At least one of the filterLabels
    * must have a matching label in the provided metadata.  - MATCH_ALL: All
    * filterLabels must have matching labels in the provided metadata.
    */
  var filterMatchCriteria: js.UndefOr[String] = js.native
}

object SchemaMetadataFilter {
  @scala.inline
  def apply(): SchemaMetadataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataFilter]
  }
  @scala.inline
  implicit class SchemaMetadataFilterOps[Self <: SchemaMetadataFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterLabels(value: js.Array[SchemaMetadataFilterLabelMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMatchCriteria(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMatchCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMatchCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMatchCriteria")(js.undefined)
        ret
    }
  }
  
}

