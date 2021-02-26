package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Definition
import typingsSlinky.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyKind
import typingsSlinky.astTypes.kindsMod.MethodDefinitionKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassPropertyDefinitionBuilder extends StObject {
  
  def apply(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: ClassPropertyKind): ClassPropertyDefinition = js.native
  def apply(definition: MethodDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: VariableDeclaratorKind): ClassPropertyDefinition = js.native
  
  def from(params: Definition): ClassPropertyDefinition = js.native
}
