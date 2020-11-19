package typingsSlinky.apolloClient.anon

import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphql.astMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<graphql.graphql.DocumentNode> */
@js.native
trait ReadonlyDocumentNode extends js.Object {
  
  val definitions: js.Array[DefinitionNode] = js.native
  
  val kind: typingsSlinky.apolloClient.apolloClientStrings.Document = js.native
  
  val loc: js.UndefOr[Location] = js.native
}
object ReadonlyDocumentNode {
  
  @scala.inline
  def apply(
    definitions: js.Array[DefinitionNode],
    kind: typingsSlinky.apolloClient.apolloClientStrings.Document
  ): ReadonlyDocumentNode = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDocumentNode]
  }
  
  @scala.inline
  implicit class ReadonlyDocumentNodeOps[Self <: ReadonlyDocumentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefinitionsVarargs(value: DefinitionNode*): Self = this.set("definitions", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: js.Array[DefinitionNode]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.apolloClient.apolloClientStrings.Document): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
}
