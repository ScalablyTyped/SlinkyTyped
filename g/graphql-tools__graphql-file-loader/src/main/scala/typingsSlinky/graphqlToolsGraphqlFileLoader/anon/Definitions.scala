package typingsSlinky.graphqlToolsGraphqlFileLoader.anon

import typingsSlinky.graphql.astMod.DefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definitions extends js.Object {
  
  var definitions: js.Array[DefinitionNode] = js.native
  
  var kind: typingsSlinky.graphqlToolsGraphqlFileLoader.graphqlToolsGraphqlFileLoaderStrings.Document = js.native
  
  var loc: js.UndefOr[typingsSlinky.graphql.mod.Location] = js.native
}
object Definitions {
  
  @scala.inline
  def apply(
    definitions: js.Array[DefinitionNode],
    kind: typingsSlinky.graphqlToolsGraphqlFileLoader.graphqlToolsGraphqlFileLoaderStrings.Document
  ): Definitions = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definitions]
  }
  
  @scala.inline
  implicit class DefinitionsOps[Self <: Definitions] (val x: Self) extends AnyVal {
    
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
    def setKind(value: typingsSlinky.graphqlToolsGraphqlFileLoader.graphqlToolsGraphqlFileLoaderStrings.Document): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: typingsSlinky.graphql.mod.Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
}
