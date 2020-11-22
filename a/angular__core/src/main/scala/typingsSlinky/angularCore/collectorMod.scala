package typingsSlinky.angularCore

import typingsSlinky.std.Set
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.PropertyAssignment
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/initial-navigation/collector", JSImport.Namespace)
@js.native
object collectorMod extends js.Object {
  
  @js.native
  class InitialNavigationCollector protected () extends js.Object {
    def this(typeChecker: TypeChecker) = this()
    
    var assignments: Set[PropertyAssignment] = js.native
    
    var getLiteralNeedingMigration: js.Any = js.native
    
    var getLiteralNeedingMigrationFromIdentifier: js.Any = js.native
    
    val typeChecker: js.Any = js.native
    
    def visitExtraOptionsLiteral(extraOptionsLiteral: ObjectLiteralExpression): Unit = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
}
