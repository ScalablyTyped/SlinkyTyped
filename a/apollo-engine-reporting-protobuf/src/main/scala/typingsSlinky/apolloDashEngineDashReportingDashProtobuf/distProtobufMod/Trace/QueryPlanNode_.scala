package typingsSlinky.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.fetch
import typingsSlinky.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.flatten
import typingsSlinky.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.parallel
import typingsSlinky.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a QueryPlanNode. */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode")
@js.native
/**
  * Constructs a new QueryPlanNode.
  * @param [properties] Properties to set
  */
class QueryPlanNode_ () extends IQueryPlanNode {
  def this(properties: IQueryPlanNode) = this()
  /** QueryPlanNode node. */
  var node: js.UndefOr[sequence | parallel | fetch | flatten] = js.native
  /**
    * Converts this QueryPlanNode to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

