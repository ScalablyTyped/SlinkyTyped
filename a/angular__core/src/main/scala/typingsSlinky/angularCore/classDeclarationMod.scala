package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.ClassDeclaration
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classDeclarationMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/class_declaration", "findParentClassDeclaration")
  @js.native
  def findParentClassDeclaration(node: Node): ClassDeclaration | Null = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/class_declaration", "getBaseTypeIdentifiers")
  @js.native
  def getBaseTypeIdentifiers(node: ClassDeclaration): js.Array[Identifier] | Null = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/class_declaration", "hasExplicitConstructor")
  @js.native
  def hasExplicitConstructor(node: ClassDeclaration): Boolean = js.native
}
