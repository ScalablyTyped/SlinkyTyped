package typingsSlinky.apolloUtilities

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloUtilities.anon.Directive
import typingsSlinky.graphql.astMod.DirectiveNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-utilities/lib/directives", JSImport.Namespace)
@js.native
object directivesMod extends js.Object {
  
  def getDirectiveInfoFromField(field: FieldNode, variables: js.Object): DirectiveInfo = js.native
  
  def getDirectiveNames(doc: DocumentNode): js.Array[String] = js.native
  
  def getInclusionDirectives(directives: js.Array[DirectiveNode]): InclusionDirectives = js.native
  
  def hasClientExports(document: DocumentNode): Boolean = js.native
  
  def hasDirectives(names: js.Array[String], doc: DocumentNode): Boolean = js.native
  
  def shouldInclude(selection: SelectionNode): Boolean = js.native
  def shouldInclude(selection: SelectionNode, variables: StringDictionary[js.Any]): Boolean = js.native
  
  type DirectiveInfo = StringDictionary[StringDictionary[js.Any]]
  
  type InclusionDirectives = js.Array[Directive]
}
