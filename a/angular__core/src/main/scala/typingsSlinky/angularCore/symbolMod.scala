package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.ImportSpecifier
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.Symbol
import typingsSlinky.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/symbol", "getValueSymbolOfDeclaration")
  @js.native
  def getValueSymbolOfDeclaration(node: Node, typeChecker: TypeChecker): js.UndefOr[Symbol] = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/symbol", "isReferenceToImport")
  @js.native
  def isReferenceToImport(typeChecker: TypeChecker, node: Node, importSpecifier: ImportSpecifier): Boolean = js.native
}
