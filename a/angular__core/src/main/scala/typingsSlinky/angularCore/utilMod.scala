package typingsSlinky.angularCore

import typingsSlinky.angularCore.anon.RemoveParameter
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/dynamic-queries/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def identifyDynamicQueryNodes(typeChecker: TypeChecker, sourceFile: SourceFile): RemoveParameter = js.native
  
  def removeOptionsParameter(node: CallExpression): CallExpression = js.native
  
  def removeStaticFlag(node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}
