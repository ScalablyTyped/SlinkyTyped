package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.Run.columnKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Run extends StObject {
  
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
object Run {
  
  @scala.inline
  def apply(tool: Tool): Run = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Run]
  }
  
  @scala.inline
  implicit class RunMutableBuilder[Self <: Run] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setAutomationDetails(value: RunAutomationDetails): Self = StObject.set(x, "automationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationDetailsUndefined: Self = StObject.set(x, "automationDetails", js.undefined)
    
    @scala.inline
    def setBaselineGuid(value: String): Self = StObject.set(x, "baselineGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineGuidUndefined: Self = StObject.set(x, "baselineGuid", js.undefined)
    
    @scala.inline
    def setColumnKind(value: columnKind): Self = StObject.set(x, "columnKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKindUndefined: Self = StObject.set(x, "columnKind", js.undefined)
    
    @scala.inline
    def setConversion(value: Conversion): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    @scala.inline
    def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    @scala.inline
    def setDefaultSourceLanguage(value: String): Self = StObject.set(x, "defaultSourceLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSourceLanguageUndefined: Self = StObject.set(x, "defaultSourceLanguage", js.undefined)
    
    @scala.inline
    def setExternalPropertyFileReferences(value: ExternalPropertyFileReferences): Self = StObject.set(x, "externalPropertyFileReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalPropertyFileReferencesUndefined: Self = StObject.set(x, "externalPropertyFileReferences", js.undefined)
    
    @scala.inline
    def setGraphs(value: js.Array[Graph]): Self = StObject.set(x, "graphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphsUndefined: Self = StObject.set(x, "graphs", js.undefined)
    
    @scala.inline
    def setGraphsVarargs(value: Graph*): Self = StObject.set(x, "graphs", js.Array(value :_*))
    
    @scala.inline
    def setInvocations(value: js.Array[Invocation]): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationsUndefined: Self = StObject.set(x, "invocations", js.undefined)
    
    @scala.inline
    def setInvocationsVarargs(value: Invocation*): Self = StObject.set(x, "invocations", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLogicalLocations(value: js.Array[LogicalLocation]): Self = StObject.set(x, "logicalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalLocationsUndefined: Self = StObject.set(x, "logicalLocations", js.undefined)
    
    @scala.inline
    def setLogicalLocationsVarargs(value: LogicalLocation*): Self = StObject.set(x, "logicalLocations", js.Array(value :_*))
    
    @scala.inline
    def setNewlineSequences(value: js.Array[String]): Self = StObject.set(x, "newlineSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewlineSequencesUndefined: Self = StObject.set(x, "newlineSequences", js.undefined)
    
    @scala.inline
    def setNewlineSequencesVarargs(value: String*): Self = StObject.set(x, "newlineSequences", js.Array(value :_*))
    
    @scala.inline
    def setOriginalUriBaseIds(value: StringDictionary[ArtifactLocation]): Self = StObject.set(x, "originalUriBaseIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalUriBaseIdsUndefined: Self = StObject.set(x, "originalUriBaseIds", js.undefined)
    
    @scala.inline
    def setPolicies(value: js.Array[ToolComponent]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: ToolComponent*): Self = StObject.set(x, "policies", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRedactionTokens(value: js.Array[String]): Self = StObject.set(x, "redactionTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactionTokensUndefined: Self = StObject.set(x, "redactionTokens", js.undefined)
    
    @scala.inline
    def setRedactionTokensVarargs(value: String*): Self = StObject.set(x, "redactionTokens", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setRunAggregates(value: js.Array[RunAutomationDetails]): Self = StObject.set(x, "runAggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAggregatesUndefined: Self = StObject.set(x, "runAggregates", js.undefined)
    
    @scala.inline
    def setRunAggregatesVarargs(value: RunAutomationDetails*): Self = StObject.set(x, "runAggregates", js.Array(value :_*))
    
    @scala.inline
    def setSpecialLocations(value: SpecialLocations): Self = StObject.set(x, "specialLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialLocationsUndefined: Self = StObject.set(x, "specialLocations", js.undefined)
    
    @scala.inline
    def setTaxonomies(value: js.Array[ToolComponent]): Self = StObject.set(x, "taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomiesUndefined: Self = StObject.set(x, "taxonomies", js.undefined)
    
    @scala.inline
    def setTaxonomiesVarargs(value: ToolComponent*): Self = StObject.set(x, "taxonomies", js.Array(value :_*))
    
    @scala.inline
    def setThreadFlowLocations(value: js.Array[ThreadFlowLocation]): Self = StObject.set(x, "threadFlowLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadFlowLocationsUndefined: Self = StObject.set(x, "threadFlowLocations", js.undefined)
    
    @scala.inline
    def setThreadFlowLocationsVarargs(value: ThreadFlowLocation*): Self = StObject.set(x, "threadFlowLocations", js.Array(value :_*))
    
    @scala.inline
    def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: js.Array[ToolComponent]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setTranslationsVarargs(value: ToolComponent*): Self = StObject.set(x, "translations", js.Array(value :_*))
    
    @scala.inline
    def setVersionControlProvenance(value: js.Array[VersionControlDetails]): Self = StObject.set(x, "versionControlProvenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionControlProvenanceUndefined: Self = StObject.set(x, "versionControlProvenance", js.undefined)
    
    @scala.inline
    def setVersionControlProvenanceVarargs(value: VersionControlDetails*): Self = StObject.set(x, "versionControlProvenance", js.Array(value :_*))
    
    @scala.inline
    def setWebRequests(value: js.Array[WebRequest]): Self = StObject.set(x, "webRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequestsUndefined: Self = StObject.set(x, "webRequests", js.undefined)
    
    @scala.inline
    def setWebRequestsVarargs(value: WebRequest*): Self = StObject.set(x, "webRequests", js.Array(value :_*))
    
    @scala.inline
    def setWebResponses(value: js.Array[WebResponse]): Self = StObject.set(x, "webResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebResponsesUndefined: Self = StObject.set(x, "webResponses", js.undefined)
    
    @scala.inline
    def setWebResponsesVarargs(value: WebResponse*): Self = StObject.set(x, "webResponses", js.Array(value :_*))
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.utf16CodeUnits
    - typingsSlinky.sarif.sarifStrings.unicodeCodePoints
  */
  trait columnKind extends StObject
  object columnKind {
    
    @scala.inline
    def unicodeCodePoints: typingsSlinky.sarif.sarifStrings.unicodeCodePoints = "unicodeCodePoints".asInstanceOf[typingsSlinky.sarif.sarifStrings.unicodeCodePoints]
    
    @scala.inline
    def utf16CodeUnits: typingsSlinky.sarif.sarifStrings.utf16CodeUnits = "utf16CodeUnits".asInstanceOf[typingsSlinky.sarif.sarifStrings.utf16CodeUnits]
  }
}
