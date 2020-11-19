package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.ClassDeclaration
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/utils/typescript/class_declaration", JSImport.Namespace)
@js.native
object classDeclarationMod extends js.Object {
  
  def findParentClassDeclaration(node: Node): ClassDeclaration | Null = js.native
  
  def getBaseTypeIdentifiers(node: ClassDeclaration): js.Array[Identifier] | Null = js.native
  
  def hasExplicitConstructor(node: ClassDeclaration): Boolean = js.native
}
