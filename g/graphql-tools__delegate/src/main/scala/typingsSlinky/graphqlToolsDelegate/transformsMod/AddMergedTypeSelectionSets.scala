package typingsSlinky.graphqlToolsDelegate.transformsMod

import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.addSelectionSetsByTypeMod.default
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/transforms", "AddMergedTypeSelectionSets")
@js.native
class AddMergedTypeSelectionSets protected () extends default {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, SelectionSetNode]) = this()
}
