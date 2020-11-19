package typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.fetch
import typingsSlinky.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.flatten
import typingsSlinky.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.parallel
import typingsSlinky.apolloEngineReportingProtobuf.apolloEngineReportingProtobufStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
