package typingsSlinky.apolloDashUtilities

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.languageAstMod.DirectiveNode
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.languageAstMod.FieldNode
import typingsSlinky.graphql.languageAstMod.SelectionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/directives", JSImport.Namespace)
@js.native
object libDirectivesMod extends js.Object {
  def getDirectiveInfoFromField(field: FieldNode, variables: js.Object): DirectiveInfo = js.native
  def getDirectiveNames(doc: DocumentNode): js.Array[String] = js.native
  def getInclusionDirectives(directives: js.Array[DirectiveNode]): InclusionDirectives = js.native
  def hasClientExports(document: DocumentNode): Boolean = js.native
  def hasDirectives(names: js.Array[String], doc: DocumentNode): Boolean = js.native
  def shouldInclude(selection: SelectionNode): Boolean = js.native
  def shouldInclude(selection: SelectionNode, variables: StringDictionary[js.Any]): Boolean = js.native
  type DirectiveInfo = StringDictionary[StringDictionary[js.Any]]
  type InclusionDirectives = js.Array[Anon_Directive]
}

