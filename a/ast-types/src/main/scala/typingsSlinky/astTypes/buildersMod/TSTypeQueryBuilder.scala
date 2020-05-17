package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExprName
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSImportTypeKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeQueryBuilder extends js.Object {
  def apply(exprName: IdentifierKind): TSTypeQuery = js.native
  def apply(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def apply(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  def from(params: ExprName): TSTypeQuery = js.native
}

