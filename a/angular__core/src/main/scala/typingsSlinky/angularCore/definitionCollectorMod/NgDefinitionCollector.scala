package typingsSlinky.angularCore.definitionCollectorMod

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/missing-injectable/definition_collector", "NgDefinitionCollector")
@js.native
class NgDefinitionCollector protected () extends js.Object {
  def this(typeChecker: TypeChecker) = this()
  
  var _visitDirectiveClass: js.Any = js.native
  
  var _visitNgModuleClass: js.Any = js.native
  
  var resolvedDirectives: js.Array[ResolvedDirective] = js.native
  
  var resolvedModules: js.Array[ResolvedNgModule] = js.native
  
  var typeChecker: TypeChecker = js.native
  
  var visitClassDeclaration: js.Any = js.native
  
  def visitNode(node: Node): Unit = js.native
}
