package typingsSlinky.graphqlToolsStitch.anon

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphqlToolsStitch.typesMod.MergeTypeCandidate
import typingsSlinky.graphqlToolsStitch.typesMod.MergeTypeFilter
import typingsSlinky.graphqlToolsStitch.typesMod.OnTypeConflict
import typingsSlinky.graphqlToolsStitch.typesMod.StitchingInfo
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeTypes extends js.Object {
  
  var mergeTypes: Boolean | js.Array[String] | MergeTypeFilter = js.native
  
  def onTypeConflict(left: GraphQLNamedType, right: GraphQLNamedType): GraphQLNamedType = js.native
  def onTypeConflict(left: GraphQLNamedType, right: GraphQLNamedType, info: Left): GraphQLNamedType = js.native
  @JSName("onTypeConflict")
  var onTypeConflict_Original: OnTypeConflict = js.native
  
  var operationTypeNames: Record[String, _] = js.native
  
  var stitchingInfo: StitchingInfo = js.native
  
  var typeCandidates: Record[String, js.Array[MergeTypeCandidate]] = js.native
}
