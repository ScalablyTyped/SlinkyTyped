package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.gatsbyStrings.INPUT_OBJECT
import typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyGraphQLInputObjectType extends GatsbyGraphQLType {
  var config: ComposeInputObjectTypeConfig = js.native
  var kind: INPUT_OBJECT = js.native
}

object GatsbyGraphQLInputObjectType {
  @scala.inline
  def apply(config: ComposeInputObjectTypeConfig, kind: INPUT_OBJECT): GatsbyGraphQLInputObjectType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLInputObjectType]
  }
  @scala.inline
  implicit class GatsbyGraphQLInputObjectTypeOps[Self <: GatsbyGraphQLInputObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ComposeInputObjectTypeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: INPUT_OBJECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

