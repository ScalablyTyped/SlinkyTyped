package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.Run.columnKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Run_ extends js.Object {
  /**
    * Addresses associated with this run instance, if any.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  /**
    * An array of artifact objects relevant to the run.
    */
  var artifacts: js.UndefOr[js.Array[Artifact]] = js.native
  /**
    * Automation details that describe this run.
    */
  var automationDetails: js.UndefOr[RunAutomationDetails] = js.native
  /**
    * The 'guid' property of a previous SARIF 'run' that comprises the baseline that was used to compute result
    * 'baselineState' properties for the run.
    */
  var baselineGuid: js.UndefOr[String] = js.native
  /**
    * Specifies the unit in which the tool measures columns.
    */
  var columnKind: js.UndefOr[columnKind] = js.native
  /**
    * A conversion object that describes how a converter transformed an analysis tool's native reporting format into
    * the SARIF format.
    */
  var conversion: js.UndefOr[Conversion] = js.native
  /**
    * Specifies the default encoding for any artifact object that refers to a text file.
    */
  var defaultEncoding: js.UndefOr[String] = js.native
  /**
    * Specifies the default source language for any artifact object that refers to a text file that contains source
    * code.
    */
  var defaultSourceLanguage: js.UndefOr[String] = js.native
  /**
    * References to external property files that should be inlined with the content of a root log file.
    */
  var externalPropertyFileReferences: js.UndefOr[ExternalPropertyFileReferences] = js.native
  /**
    * An array of zero or more unique graph objects associated with the run.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.native
  /**
    * Describes the invocation of the analysis tool.
    */
  var invocations: js.UndefOr[js.Array[Invocation]] = js.native
  /**
    * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter
    * lowercase culture code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code
    * associated with a country or region). The casing is recommended but not required (in order for this data to
    * conform to RFC5646).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * An array of logical locations such as namespaces, types or functions.
    */
  var logicalLocations: js.UndefOr[js.Array[LogicalLocation]] = js.native
  /**
    * An ordered list of character sequences that were treated as line breaks when computing region information for
    * the run.
    */
  var newlineSequences: js.UndefOr[js.Array[String]] = js.native
  /**
    * The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran.
    */
  var originalUriBaseIds: js.UndefOr[StringDictionary[ArtifactLocation]] = js.native
  /**
    * Contains configurations that may potentially override both reportingDescriptor.defaultConfiguration (the tool's
    * default severities) and invocation.configurationOverrides (severities established at run-time from the command
    * line).
    */
  var policies: js.UndefOr[js.Array[ToolComponent]] = js.native
  /**
    * Key/value pairs that provide additional information about the run.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of strings used to replace sensitive information in a redaction-aware property.
    */
  var redactionTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting
    * rules metadata. It must be present (but may be empty) if a log file represents an actual scan.
    */
  var results: js.UndefOr[js.Array[Result]] = js.native
  /**
    * Automation details that describe the aggregate of runs to which this run belongs.
    */
  var runAggregates: js.UndefOr[js.Array[RunAutomationDetails]] = js.native
  /**
    * A specialLocations object that defines locations of special significance to SARIF consumers.
    */
  var specialLocations: js.UndefOr[SpecialLocations] = js.native
  /**
    * An array of toolComponent objects relevant to a taxonomy in which results are categorized.
    */
  var taxonomies: js.UndefOr[js.Array[ToolComponent]] = js.native
  /**
    * An array of threadFlowLocation objects cached at run level.
    */
  var threadFlowLocations: js.UndefOr[js.Array[ThreadFlowLocation]] = js.native
  /**
    * Information about the tool or tool pipeline that generated the results in this run. A run can only contain
    * results produced by a single tool or tool pipeline. A run can aggregate results from multiple log files, as long
    * as context around the tool run (tool command-line arguments and the like) is identical for all aggregated files.
    */
  var tool: Tool = js.native
  /**
    * The set of available translations of the localized data provided by the tool.
    */
  var translations: js.UndefOr[js.Array[ToolComponent]] = js.native
  /**
    * Specifies the revision in version control of the artifacts that were scanned.
    */
  var versionControlProvenance: js.UndefOr[js.Array[VersionControlDetails]] = js.native
  /**
    * An array of request objects cached at run level.
    */
  var webRequests: js.UndefOr[js.Array[WebRequest]] = js.native
  /**
    * An array of response objects cached at run level.
    */
  var webResponses: js.UndefOr[js.Array[WebResponse]] = js.native
}

object Run_ {
  @scala.inline
  def apply(tool: Tool): Run_ = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Run_]
  }
  @scala.inline
  implicit class Run_Ops[Self <: Run_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTool(value: Tool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddresses(value: js.Array[Address]): Self = {
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
    def withArtifacts(value: js.Array[Artifact]): Self = {
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
    def withAutomationDetails(value: RunAutomationDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKind(value: columnKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKind")(js.undefined)
        ret
    }
    @scala.inline
    def withConversion(value: Conversion): Self = {
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
    def withDefaultEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSourceLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSourceLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSourceLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSourceLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalPropertyFileReferences(value: ExternalPropertyFileReferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPropertyFileReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalPropertyFileReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPropertyFileReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphs(value: js.Array[Graph]): Self = {
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
    def withInvocations(value: js.Array[Invocation]): Self = {
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
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalLocations(value: js.Array[LogicalLocation]): Self = {
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
    def withNewlineSequences(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newlineSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewlineSequences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newlineSequences")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalUriBaseIds(value: StringDictionary[ArtifactLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUriBaseIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalUriBaseIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUriBaseIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: js.Array[ToolComponent]): Self = {
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
    def withRedactionTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactionTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedactionTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactionTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[Result]): Self = {
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
    def withRunAggregates(value: js.Array[RunAutomationDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAggregates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAggregates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAggregates")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialLocations(value: SpecialLocations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxonomies(value: js.Array[ToolComponent]): Self = {
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
    def withThreadFlowLocations(value: js.Array[ThreadFlowLocation]): Self = {
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
    def withTranslations(value: js.Array[ToolComponent]): Self = {
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
    def withVersionControlProvenance(value: js.Array[VersionControlDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionControlProvenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionControlProvenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionControlProvenance")(js.undefined)
        ret
    }
    @scala.inline
    def withWebRequests(value: js.Array[WebRequest]): Self = {
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
    def withWebResponses(value: js.Array[WebResponse]): Self = {
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

