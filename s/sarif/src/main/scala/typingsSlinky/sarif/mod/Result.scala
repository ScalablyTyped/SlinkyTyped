package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.Result.baselineState
import typingsSlinky.sarif.mod.Result.kind
import typingsSlinky.sarif.mod.Result.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  /**
    * Identifies the artifact that the analysis tool was instructed to scan. This need not be the same as the artifact
    * where the result actually occurred.
    */
  var analysisTarget: js.UndefOr[ArtifactLocation] = js.native
  
  /**
    * A set of artifacts relevant to the result.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**
    * The state of a result relative to a baseline of a previous run.
    */
  var baselineState: js.UndefOr[baselineState] = js.native
  
  /**
    * An array of 'codeFlow' objects relevant to the result.
    */
  var codeFlows: js.UndefOr[js.Array[CodeFlow]] = js.native
  
  /**
    * A stable, unique identifier for the equivalence class of logically identical results to which this result
    * belongs, in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[String] = js.native
  
  /**
    * A set of strings each of which individually defines a stable, unique identity for the result.
    */
  var fingerprints: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * An array of 'fix' objects, each of which represents a proposed fix to the problem indicated by the result.
    */
  var fixes: js.UndefOr[js.Array[Fix]] = js.native
  
  /**
    * An array of one or more unique 'graphTraversal' objects.
    */
  var graphTraversals: js.UndefOr[js.Array[GraphTraversal]] = js.native
  
  /**
    * An array of zero or more unique graph objects associated with the result.
    */
  var graphs: js.UndefOr[js.Array[Graph]] = js.native
  
  /**
    * A stable, unique identifer for the result in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  
  /**
    * An absolute URI at which the result can be viewed.
    */
  var hostedViewerUri: js.UndefOr[String] = js.native
  
  /**
    * A value that categorizes results by evaluation state.
    */
  var kind: js.UndefOr[kind] = js.native
  
  /**
    * A value specifying the severity level of the result.
    */
  var level: js.UndefOr[level] = js.native
  
  /**
    * The set of locations where the result was detected. Specify only one location unless the problem indicated by
    * the result can only be corrected by making a change at every specified location.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  
  /**
    * A message that describes the result. The first sentence of the message only will be displayed when visible space
    * is limited.
    */
  var message: Message = js.native
  
  /**
    * A positive integer specifying the number of times this logically unique result was observed in this run.
    */
  var occurrenceCount: js.UndefOr[Double] = js.native
  
  /**
    * A set of strings that contribute to the stable, unique identity of the result.
    */
  var partialFingerprints: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Key/value pairs that provide additional information about the result.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * Information about how and when the result was detected.
    */
  var provenance: js.UndefOr[ResultProvenance] = js.native
  
  /**
    * A number representing the priority or importance of the result.
    */
  var rank: js.UndefOr[Double] = js.native
  
  /**
    * A set of locations relevant to this result.
    */
  var relatedLocations: js.UndefOr[js.Array[Location]] = js.native
  
  /**
    * A reference used to locate the rule descriptor relevant to this result.
    */
  var rule: js.UndefOr[ReportingDescriptorReference] = js.native
  
  /**
    * The stable, unique identifier of the rule, if any, to which this notification is relevant. This member can be
    * used to retrieve rule metadata from the rules dictionary, if it exists.
    */
  var ruleId: js.UndefOr[String] = js.native
  
  /**
    * The index within the tool component rules array of the rule object associated with this result.
    */
  var ruleIndex: js.UndefOr[Double] = js.native
  
  /**
    * An array of 'stack' objects relevant to the result.
    */
  var stacks: js.UndefOr[js.Array[Stack]] = js.native
  
  /**
    * A set of suppressions relevant to this result.
    */
  var suppressions: js.UndefOr[js.Array[Suppression]] = js.native
  
  /**
    * An array of references to taxonomy reporting descriptors that are applicable to the result.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.native
  
  /**
    * A web request associated with this result.
    */
  var webRequest: js.UndefOr[WebRequest] = js.native
  
  /**
    * A web response associated with this result.
    */
  var webResponse: js.UndefOr[WebResponse] = js.native
  
  /**
    * The URIs of the work items associated with this result.
    */
  var workItemUris: js.UndefOr[js.Array[String]] = js.native
}
object Result {
  
  @scala.inline
  def apply(message: Message): Result = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisTarget(value: ArtifactLocation): Self = StObject.set(x, "analysisTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisTargetUndefined: Self = StObject.set(x, "analysisTarget", js.undefined)
    
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBaselineState(value: baselineState): Self = StObject.set(x, "baselineState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineStateUndefined: Self = StObject.set(x, "baselineState", js.undefined)
    
    @scala.inline
    def setCodeFlows(value: js.Array[CodeFlow]): Self = StObject.set(x, "codeFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeFlowsUndefined: Self = StObject.set(x, "codeFlows", js.undefined)
    
    @scala.inline
    def setCodeFlowsVarargs(value: CodeFlow*): Self = StObject.set(x, "codeFlows", js.Array(value :_*))
    
    @scala.inline
    def setCorrelationGuid(value: String): Self = StObject.set(x, "correlationGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationGuidUndefined: Self = StObject.set(x, "correlationGuid", js.undefined)
    
    @scala.inline
    def setFingerprints(value: StringDictionary[String]): Self = StObject.set(x, "fingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintsUndefined: Self = StObject.set(x, "fingerprints", js.undefined)
    
    @scala.inline
    def setFixes(value: js.Array[Fix]): Self = StObject.set(x, "fixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixesUndefined: Self = StObject.set(x, "fixes", js.undefined)
    
    @scala.inline
    def setFixesVarargs(value: Fix*): Self = StObject.set(x, "fixes", js.Array(value :_*))
    
    @scala.inline
    def setGraphTraversals(value: js.Array[GraphTraversal]): Self = StObject.set(x, "graphTraversals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphTraversalsUndefined: Self = StObject.set(x, "graphTraversals", js.undefined)
    
    @scala.inline
    def setGraphTraversalsVarargs(value: GraphTraversal*): Self = StObject.set(x, "graphTraversals", js.Array(value :_*))
    
    @scala.inline
    def setGraphs(value: js.Array[Graph]): Self = StObject.set(x, "graphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphsUndefined: Self = StObject.set(x, "graphs", js.undefined)
    
    @scala.inline
    def setGraphsVarargs(value: Graph*): Self = StObject.set(x, "graphs", js.Array(value :_*))
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setHostedViewerUri(value: String): Self = StObject.set(x, "hostedViewerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedViewerUriUndefined: Self = StObject.set(x, "hostedViewerUri", js.undefined)
    
    @scala.inline
    def setKind(value: kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceCount(value: Double): Self = StObject.set(x, "occurrenceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceCountUndefined: Self = StObject.set(x, "occurrenceCount", js.undefined)
    
    @scala.inline
    def setPartialFingerprints(value: StringDictionary[String]): Self = StObject.set(x, "partialFingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialFingerprintsUndefined: Self = StObject.set(x, "partialFingerprints", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setProvenance(value: ResultProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    @scala.inline
    def setRelatedLocations(value: js.Array[Location]): Self = StObject.set(x, "relatedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedLocationsUndefined: Self = StObject.set(x, "relatedLocations", js.undefined)
    
    @scala.inline
    def setRelatedLocationsVarargs(value: Location*): Self = StObject.set(x, "relatedLocations", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: ReportingDescriptorReference): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    @scala.inline
    def setRuleIndex(value: Double): Self = StObject.set(x, "ruleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIndexUndefined: Self = StObject.set(x, "ruleIndex", js.undefined)
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setStacks(value: js.Array[Stack]): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacksUndefined: Self = StObject.set(x, "stacks", js.undefined)
    
    @scala.inline
    def setStacksVarargs(value: Stack*): Self = StObject.set(x, "stacks", js.Array(value :_*))
    
    @scala.inline
    def setSuppressions(value: js.Array[Suppression]): Self = StObject.set(x, "suppressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressionsUndefined: Self = StObject.set(x, "suppressions", js.undefined)
    
    @scala.inline
    def setSuppressionsVarargs(value: Suppression*): Self = StObject.set(x, "suppressions", js.Array(value :_*))
    
    @scala.inline
    def setTaxa(value: js.Array[ReportingDescriptorReference]): Self = StObject.set(x, "taxa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxaUndefined: Self = StObject.set(x, "taxa", js.undefined)
    
    @scala.inline
    def setTaxaVarargs(value: ReportingDescriptorReference*): Self = StObject.set(x, "taxa", js.Array(value :_*))
    
    @scala.inline
    def setWebRequest(value: WebRequest): Self = StObject.set(x, "webRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRequestUndefined: Self = StObject.set(x, "webRequest", js.undefined)
    
    @scala.inline
    def setWebResponse(value: WebResponse): Self = StObject.set(x, "webResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebResponseUndefined: Self = StObject.set(x, "webResponse", js.undefined)
    
    @scala.inline
    def setWorkItemUris(value: js.Array[String]): Self = StObject.set(x, "workItemUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemUrisUndefined: Self = StObject.set(x, "workItemUris", js.undefined)
    
    @scala.inline
    def setWorkItemUrisVarargs(value: String*): Self = StObject.set(x, "workItemUris", js.Array(value :_*))
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.`new`
    - typingsSlinky.sarif.sarifStrings.unchanged
    - typingsSlinky.sarif.sarifStrings.updated
    - typingsSlinky.sarif.sarifStrings.absent
  */
  trait baselineState extends StObject
  object baselineState {
    
    @scala.inline
    def absent: typingsSlinky.sarif.sarifStrings.absent = "absent".asInstanceOf[typingsSlinky.sarif.sarifStrings.absent]
    
    @scala.inline
    def `new`: typingsSlinky.sarif.sarifStrings.`new` = "new".asInstanceOf[typingsSlinky.sarif.sarifStrings.`new`]
    
    @scala.inline
    def unchanged: typingsSlinky.sarif.sarifStrings.unchanged = "unchanged".asInstanceOf[typingsSlinky.sarif.sarifStrings.unchanged]
    
    @scala.inline
    def updated: typingsSlinky.sarif.sarifStrings.updated = "updated".asInstanceOf[typingsSlinky.sarif.sarifStrings.updated]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.notApplicable
    - typingsSlinky.sarif.sarifStrings.pass
    - typingsSlinky.sarif.sarifStrings.fail
    - typingsSlinky.sarif.sarifStrings.review
    - typingsSlinky.sarif.sarifStrings.open
    - typingsSlinky.sarif.sarifStrings.informational
  */
  trait kind extends StObject
  object kind {
    
    @scala.inline
    def fail: typingsSlinky.sarif.sarifStrings.fail = "fail".asInstanceOf[typingsSlinky.sarif.sarifStrings.fail]
    
    @scala.inline
    def informational: typingsSlinky.sarif.sarifStrings.informational = "informational".asInstanceOf[typingsSlinky.sarif.sarifStrings.informational]
    
    @scala.inline
    def notApplicable: typingsSlinky.sarif.sarifStrings.notApplicable = "notApplicable".asInstanceOf[typingsSlinky.sarif.sarifStrings.notApplicable]
    
    @scala.inline
    def open: typingsSlinky.sarif.sarifStrings.open = "open".asInstanceOf[typingsSlinky.sarif.sarifStrings.open]
    
    @scala.inline
    def pass: typingsSlinky.sarif.sarifStrings.pass = "pass".asInstanceOf[typingsSlinky.sarif.sarifStrings.pass]
    
    @scala.inline
    def review: typingsSlinky.sarif.sarifStrings.review = "review".asInstanceOf[typingsSlinky.sarif.sarifStrings.review]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sarif.sarifStrings.none
    - typingsSlinky.sarif.sarifStrings.note
    - typingsSlinky.sarif.sarifStrings.warning
    - typingsSlinky.sarif.sarifStrings.error
  */
  trait level extends StObject
  object level {
    
    @scala.inline
    def error: typingsSlinky.sarif.sarifStrings.error = "error".asInstanceOf[typingsSlinky.sarif.sarifStrings.error]
    
    @scala.inline
    def none: typingsSlinky.sarif.sarifStrings.none = "none".asInstanceOf[typingsSlinky.sarif.sarifStrings.none]
    
    @scala.inline
    def note: typingsSlinky.sarif.sarifStrings.note = "note".asInstanceOf[typingsSlinky.sarif.sarifStrings.note]
    
    @scala.inline
    def warning: typingsSlinky.sarif.sarifStrings.warning = "warning".asInstanceOf[typingsSlinky.sarif.sarifStrings.warning]
  }
}
