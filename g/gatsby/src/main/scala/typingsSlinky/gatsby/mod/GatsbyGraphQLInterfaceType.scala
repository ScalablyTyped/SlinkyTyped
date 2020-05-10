package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.gatsbyStrings.INTERFACE
import typingsSlinky.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyGraphQLInterfaceType extends GatsbyGraphQLType {
  var config: ComposeInterfaceTypeConfig[_, _] = js.native
  var kind: INTERFACE = js.native
}

object GatsbyGraphQLInterfaceType {
  @scala.inline
  def apply(config: ComposeInterfaceTypeConfig[_, _], kind: INTERFACE): GatsbyGraphQLInterfaceType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLInterfaceType]
  }
  @scala.inline
  implicit class GatsbyGraphQLInterfaceTypeOps[Self <: GatsbyGraphQLInterfaceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ComposeInterfaceTypeConfig[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: INTERFACE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

