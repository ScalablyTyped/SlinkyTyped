package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.`private`
import typingsSlinky.astDashTypes.astDashTypesStrings.`protected`
import typingsSlinky.astDashTypes.astDashTypesStrings.constructor
import typingsSlinky.astDashTypes.astDashTypesStrings.get
import typingsSlinky.astDashTypes.astDashTypesStrings.method
import typingsSlinky.astDashTypes.astDashTypesStrings.public
import typingsSlinky.astDashTypes.astDashTypesStrings.set
import typingsSlinky.astDashTypes.genKindsMod.BlockStatementKind
import typingsSlinky.astDashTypes.genKindsMod.DeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.DecoratorKind
import typingsSlinky.astDashTypes.genKindsMod.FunctionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.PrivateNameKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'body'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]} */ trait ClassPrivateMethod
  extends ASTNode
     with DeclarationKind
     with FunctionKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `abstract`: js.UndefOr[Boolean | Null] = js.undefined
  var access: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var body: BlockStatementKind
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var key: PrivateNameKind
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  var static: js.UndefOr[Boolean | Null] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ClassPrivateMethod
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPrivateMethod")
@js.native
object ClassPrivateMethod extends TopLevel[Type[ClassPrivateMethod]]

