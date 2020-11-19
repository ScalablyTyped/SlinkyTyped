package typingsSlinky.graphqlImport

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.astMod.TypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-import/dist/definition", JSImport.Namespace)
@js.native
object definitionMod extends js.Object {
  
  def completeDefinitionPool(
    allDefinitions: js.Array[ValidDefinitionNode],
    definitionPool: js.Array[ValidDefinitionNode],
    newTypeDefinitions: js.Array[ValidDefinitionNode]
  ): js.Array[ValidDefinitionNode] = js.native
  
  type DefinitionMap = StringDictionary[ValidDefinitionNode]
  
  type ValidDefinitionNode = DirectiveDefinitionNode | TypeDefinitionNode
}
