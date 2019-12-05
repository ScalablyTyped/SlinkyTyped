package typingsSlinky.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/nodes.InterfaceDeclaration[P]} */ trait DeclareInterface extends ASTNode {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.DeclareInterface
}

object DeclareInterface {
  @scala.inline
  def apply(`type`: typingsSlinky.astDashTypes.astDashTypesStrings.DeclareInterface): DeclareInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareInterface]
  }
}

