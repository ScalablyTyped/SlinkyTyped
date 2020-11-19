package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  
  def applyRequestTransforms(originalRequest: Request, transforms: js.Array[Transform[Record[String, _]]]): Request = js.native
  
  def applyResultTransforms(originalResult: js.Any, transforms: js.Array[Transform[Record[String, _]]]): js.Any = js.native
  
  def applySchemaTransforms(originalSchema: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
}
