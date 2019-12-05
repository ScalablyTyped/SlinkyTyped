package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsLocArrayCommentKindNull
import typingsSlinky.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSIndexSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSMethodSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSPropertySignatureKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceBodyBuilder extends js.Object {
  def apply(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSInterfaceBody = js.native
  def from(params: Anon_BodyCommentsLocArrayCommentKindNull): TSInterfaceBody = js.native
}

