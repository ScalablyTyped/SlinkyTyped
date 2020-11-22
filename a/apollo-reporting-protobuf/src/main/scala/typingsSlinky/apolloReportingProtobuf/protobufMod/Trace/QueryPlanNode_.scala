package typingsSlinky.apolloReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloReportingProtobuf.apolloReportingProtobufStrings.fetch
import typingsSlinky.apolloReportingProtobuf.apolloReportingProtobufStrings.flatten
import typingsSlinky.apolloReportingProtobuf.apolloReportingProtobufStrings.parallel
import typingsSlinky.apolloReportingProtobuf.apolloReportingProtobufStrings.sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a QueryPlanNode. */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode")
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
