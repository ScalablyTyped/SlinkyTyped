package typingsSlinky.angularCore

import typingsSlinky.angularCore.anon.RemoveParameter
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicQueriesUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/dynamic-queries/util", "identifyDynamicQueryNodes")
  @js.native
  def identifyDynamicQueryNodes(typeChecker: TypeChecker, sourceFile: SourceFile): RemoveParameter = js.native
  
  @JSImport("@angular/core/schematics/migrations/dynamic-queries/util", "removeOptionsParameter")
  @js.native
  def removeOptionsParameter(node: CallExpression): CallExpression = js.native
  
  @JSImport("@angular/core/schematics/migrations/dynamic-queries/util", "removeStaticFlag")
  @js.native
  def removeStaticFlag(node: ObjectLiteralExpression): ObjectLiteralExpression = js.native
}
