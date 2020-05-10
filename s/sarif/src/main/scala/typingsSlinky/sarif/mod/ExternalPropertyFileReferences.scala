package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalPropertyFileReferences extends js.Object {
  /**
    * An array of external property files containing run.addresses arrays to be merged with the root log file.
    */
  var addresses: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.artifacts arrays to be merged with the root log file.
    */
  var artifacts: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An external property file containing a run.conversion object to be merged with the root log file.
    */
  var conversion: js.UndefOr[ExternalPropertyFileReference] = js.native
  /**
    * An external property file containing a run.driver object to be merged with the root log file.
    */
  var driver: js.UndefOr[ExternalPropertyFileReference] = js.native
  /**
    * An array of external property files containing run.extensions arrays to be merged with the root log file.
    */
  var extensions: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An external property file containing a run.properties object to be merged with the root log file.
    */
  var externalizedProperties: js.UndefOr[ExternalPropertyFileReference] = js.native
  /**
    * An array of external property files containing a run.graphs object to be merged with the root log file.
    */
  var graphs: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.invocations arrays to be merged with the root log file.
    */
  var invocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.logicalLocations arrays to be merged with the root log file.
    */
  var logicalLocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.policies arrays to be merged with the root log file.
    */
  var policies: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * Key/value pairs that provide additional information about the external property files.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of external property files containing run.results arrays to be merged with the root log file.
    */
  var results: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.taxonomies arrays to be merged with the root log file.
    */
  var taxonomies: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.threadFlowLocations arrays to be merged with the root log
    * file.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.translations arrays to be merged with the root log file.
    */
  var translations: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.requests arrays to be merged with the root log file.
    */
  var webRequests: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
  /**
    * An array of external property files containing run.responses arrays to be merged with the root log file.
    */
  var webResponses: js.UndefOr[js.Array[ExternalPropertyFileReference]] = js.native
}

object ExternalPropertyFileReferences {
  @scala.inline
  def apply(): ExternalPropertyFileReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalPropertyFileReferences]
  }
  @scala.inline
  implicit class ExternalPropertyFileReferencesOps[Self <: ExternalPropertyFileReferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifacts(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withConversion(value: ExternalPropertyFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversion")(js.undefined)
        ret
    }
    @scala.inline
    def withDriver(value: ExternalPropertyFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalizedProperties(value: ExternalPropertyFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalizedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalizedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalizedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphs(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphs")(js.undefined)
        ret
    }
    @scala.inline
    def withInvocations(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocations")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalLocations(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxonomies(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxonomies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxonomies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxonomies")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadFlowLocations(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadFlowLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadFlowLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadFlowLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withWebRequests(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withWebResponses(value: js.Array[ExternalPropertyFileReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResponses")(js.undefined)
        ret
    }
  }
  
}

