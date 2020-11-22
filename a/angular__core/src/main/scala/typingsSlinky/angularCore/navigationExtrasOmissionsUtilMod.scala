package typingsSlinky.angularCore

import typingsSlinky.std.Map
import typingsSlinky.std.Set
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/navigation-extras-omissions/util", JSImport.Namespace)
@js.native
object navigationExtrasOmissionsUtilMod extends js.Object {
  
  def findLiteralsToMigrate(sourceFile: SourceFile, typeChecker: TypeChecker): Map[String, Set[ObjectLiteralExpression]] = js.native
  
  def migrateLiteral(methodName: String, node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}
