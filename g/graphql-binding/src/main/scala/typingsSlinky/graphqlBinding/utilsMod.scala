package typingsSlinky.graphqlBinding

import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlBinding.distTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-binding/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  
  def getTypeForRootFieldName(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLOutputType = js.native
  
  def isScalar(t: GraphQLOutputType): Boolean = js.native
  
  def printDocumentFromInfo(info: GraphQLResolveInfo): String = js.native
}
