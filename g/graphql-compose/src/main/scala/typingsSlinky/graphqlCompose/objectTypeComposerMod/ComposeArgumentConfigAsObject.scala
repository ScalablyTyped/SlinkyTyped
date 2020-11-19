package typingsSlinky.graphqlCompose.objectTypeComposerMod

import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.definitionsMod.Thunk
import typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typingsSlinky.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposeArgumentConfigAsObject extends js.Object {
  
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  
  var astNode: js.UndefOr[InputValueDefinitionNode | Null] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var description: js.UndefOr[String | Null] = js.native
  
  var extensions: js.UndefOr[Extensions] = js.native
  
  var `type`: Thunk[ComposeArgumentType] | GraphQLInputType = js.native
}
object ComposeArgumentConfigAsObject {
  
  @scala.inline
  def apply(`type`: Thunk[ComposeArgumentType] | GraphQLInputType): ComposeArgumentConfigAsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeArgumentConfigAsObject]
  }
  
  @scala.inline
  implicit class ComposeArgumentConfigAsObjectOps[Self <: ComposeArgumentConfigAsObject] (val x: Self) extends AnyVal {
    
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
    def setTypeVarargs(
      value: (GraphQLInputType | TypeAsString | InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any])*
    ): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setTypeFunction0(value: () => ComposeArgumentType): Self = this.set("type", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Thunk[ComposeArgumentType] | GraphQLInputType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$call(value: Unit): Self = this.set("$call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$call: Self = this.set("$call", js.undefined)
    
    @scala.inline
    def setAstNode(value: InputValueDefinitionNode): Self = this.set("astNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setExtensions(value: Extensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
}
