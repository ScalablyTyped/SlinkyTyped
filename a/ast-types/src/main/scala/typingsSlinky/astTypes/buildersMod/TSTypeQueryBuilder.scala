package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExprName
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSImportTypeKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeQueryBuilder extends StObject {
  
  def apply(exprName: IdentifierKind): TSTypeQuery = js.native
  def apply(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def apply(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  
  def from(params: ExprName): TSTypeQuery = js.native
}
