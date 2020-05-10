package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.Result.baselineState
import typingsSlinky.sarif.mod.Result.kind
import typingsSlinky.sarif.mod.Result.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result_ extends js.Object {
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

object Result_ {
  @scala.inline
  def apply(message: Message): Result_ = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result_]
  }
  @scala.inline
  implicit class Result_Ops[Self <: Result_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalysisTarget(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineState(value: baselineState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineState")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeFlows(value: js.Array[CodeFlow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeFlows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeFlows")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelationGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprints(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprints")(js.undefined)
        ret
    }
    @scala.inline
    def withFixes(value: js.Array[Fix]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixes")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphTraversals(value: js.Array[GraphTraversal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphTraversals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphTraversals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphTraversals")(js.undefined)
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
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedViewerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedViewerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedViewerUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedViewerUri")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: kind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrenceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialFingerprints(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialFingerprints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialFingerprints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialFingerprints")(js.undefined)
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
    def withProvenance(value: ResultProvenance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedLocations(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: ReportingDescriptorReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStacks(value: js.Array[Stack]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacks")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressions(value: js.Array[Suppression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressions")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxa(value: js.Array[ReportingDescriptorReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxa")(js.undefined)
        ret
    }
    @scala.inline
    def withWebRequest(value: WebRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withWebResponse(value: WebResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkItemUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkItemUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemUris")(js.undefined)
        ret
    }
  }
  
}

