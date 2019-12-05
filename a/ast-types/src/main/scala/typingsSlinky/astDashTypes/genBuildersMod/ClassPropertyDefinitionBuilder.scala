package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsDefinition
import typingsSlinky.astDashTypes.genKindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astDashTypes.genKindsMod.ClassPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.MethodDefinitionKind
import typingsSlinky.astDashTypes.genKindsMod.VariableDeclaratorKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPropertyDefinitionBuilder extends js.Object {
  def apply(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: ClassPropertyKind): ClassPropertyDefinition = js.native
  def apply(definition: MethodDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: VariableDeclaratorKind): ClassPropertyDefinition = js.native
  def from(params: Anon_CommentsDefinition): ClassPropertyDefinition = js.native
}

