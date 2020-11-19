package typingsSlinky.graphqlToolsStitch

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.graphqlToolsStitch.typesMod.MergeTypeCandidate
import typingsSlinky.graphqlToolsStitch.typesMod.MergeTypeFilter
import typingsSlinky.graphqlToolsStitch.typesMod.StitchingInfo
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Map
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/stitch/stitchingInfo", JSImport.Namespace)
@js.native
object stitchingInfoMod extends js.Object {
  
  def addStitchingInfo(stitchedSchema: GraphQLSchema, stitchingInfo: StitchingInfo): GraphQLSchema = js.native
  
  def completeStitchingInfo(stitchingInfo: StitchingInfo, resolvers: IResolvers[_, _, Record[String, _], _]): StitchingInfo = js.native
  
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]]
  ): StitchingInfo = js.native
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]],
    mergeTypes: js.Array[String]
  ): StitchingInfo = js.native
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]],
    mergeTypes: Boolean
  ): StitchingInfo = js.native
  def createStitchingInfo(
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]],
    mergeTypes: MergeTypeFilter
  ): StitchingInfo = js.native
}
