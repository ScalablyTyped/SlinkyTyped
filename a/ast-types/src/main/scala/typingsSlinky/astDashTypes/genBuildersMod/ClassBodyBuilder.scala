package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_BodyCommentsLocArray
import typingsSlinky.astDashTypes.genKindsMod.ClassMethodKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPrivateMethodKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPrivatePropertyKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.MethodDefinitionKind
import typingsSlinky.astDashTypes.genKindsMod.TSCallSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSConstructSignatureDeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.TSDeclareMethodKind
import typingsSlinky.astDashTypes.genKindsMod.TSIndexSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSMethodSignatureKind
import typingsSlinky.astDashTypes.genKindsMod.TSPropertySignatureKind
import typingsSlinky.astDashTypes.genKindsMod.VariableDeclaratorKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBodyBuilder extends js.Object {
  def apply(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): ClassBody = js.native
  def from(params: Anon_BodyCommentsLocArray): ClassBody = js.native
}

