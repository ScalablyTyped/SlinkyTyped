package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.gatsbyStrings.OBJECT
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyGraphQLObjectType extends GatsbyGraphQLType {
  var config: ComposeObjectTypeConfig[_, _] = js.native
  var kind: OBJECT = js.native
}

object GatsbyGraphQLObjectType {
  @scala.inline
  def apply(config: ComposeObjectTypeConfig[_, _], kind: OBJECT): GatsbyGraphQLObjectType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLObjectType]
  }
  @scala.inline
  implicit class GatsbyGraphQLObjectTypeOps[Self <: GatsbyGraphQLObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ComposeObjectTypeConfig[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: OBJECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

