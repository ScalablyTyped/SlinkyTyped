package typingsSlinky.graphqlTools.interfacesMod

import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[
js.Array[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.ITypedef * / js.Object
]]
  - java.lang.String
  - typingsSlinky.graphql.astMod.DocumentNode
  - typingsSlinky.graphql.astMod.ASTNode
*/
trait ITypedef extends ITypeDefinitions

object ITypedef {
  @scala.inline
  implicit def apply(value: ASTNode): ITypedef = value.asInstanceOf[ITypedef]
  @scala.inline
  implicit def apply(value: DocumentNode): ITypedef = value.asInstanceOf[ITypedef]
  @scala.inline
  implicit def apply(
    value: js.Function0[
      js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias graphql-tools.graphql-tools/dist/Interfaces.ITypedef */ js.Object
      ]
    ]
  ): ITypedef = value.asInstanceOf[ITypedef]
  @scala.inline
  implicit def apply(value: String): ITypedef = value.asInstanceOf[ITypedef]
}

