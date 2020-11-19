package typingsSlinky.angularCore.collectorMod

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TypeChecker
import typingsSlinky.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/module-with-providers/collector", "Collector")
@js.native
class Collector protected () extends js.Object {
  def this(typeChecker: TypeChecker) = this()
  
  var _visitNgModuleClass: js.Any = js.native
  
  var resolvedModules: js.Array[ResolvedNgModule] = js.native
  
  var resolvedNonGenerics: js.Array[TypeReferenceNode] = js.native
  
  var typeChecker: TypeChecker = js.native
  
  var visitClassDeclaration: js.Any = js.native
  
  def visitNode(node: Node): Unit = js.native
}
