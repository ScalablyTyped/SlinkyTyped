package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphqlToolsWrap.typesMod.FieldNodeTransformer
import typingsSlinky.graphqlToolsWrap.typesMod.RootFieldTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "TransformRootFields")
@js.native
class TransformRootFields protected ()
  extends typingsSlinky.graphqlTools.mod.TransformRootFields {
  def this(rootFieldTransformer: RootFieldTransformer) = this()
  def this(rootFieldTransformer: RootFieldTransformer, fieldNodeTransformer: FieldNodeTransformer) = this()
}
