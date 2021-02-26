package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Abstract
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassMethodBuilder extends StObject {
  
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: js.UndefOr[Boolean],
    staticParam: js.UndefOr[Boolean | Null]
  ): ClassMethod = js.native
  
  def from(params: Abstract): ClassMethod = js.native
}
