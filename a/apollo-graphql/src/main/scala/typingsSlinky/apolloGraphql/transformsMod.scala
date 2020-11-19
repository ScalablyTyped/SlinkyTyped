package typingsSlinky.apolloGraphql

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql/lib/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  
  def dropUnusedDefinitions(ast: DocumentNode, operationName: String): DocumentNode = js.native
  
  def hideLiterals(ast: DocumentNode): DocumentNode = js.native
  
  def hideStringAndNumericLiterals(ast: DocumentNode): DocumentNode = js.native
  
  def printWithReducedWhitespace(ast: DocumentNode): String = js.native
  
  def removeAliases(ast: DocumentNode): DocumentNode = js.native
  
  def sortAST(ast: DocumentNode): DocumentNode = js.native
}
