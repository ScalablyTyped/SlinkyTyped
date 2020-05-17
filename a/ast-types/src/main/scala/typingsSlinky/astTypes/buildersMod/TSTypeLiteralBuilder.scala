package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Members
import typingsSlinky.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSIndexSignatureKind
import typingsSlinky.astTypes.kindsMod.TSMethodSignatureKind
import typingsSlinky.astTypes.kindsMod.TSPropertySignatureKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeLiteralBuilder extends js.Object {
  def apply(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSTypeLiteral = js.native
  def from(params: Members): TSTypeLiteral = js.native
}

