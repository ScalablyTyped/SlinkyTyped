package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.gatsbyStrings.UNION
import typingsSlinky.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyGraphQLUnionType extends GatsbyGraphQLType {
  var config: ComposeUnionTypeConfig[_, _] = js.native
  var kind: UNION = js.native
}

object GatsbyGraphQLUnionType {
  @scala.inline
  def apply(config: ComposeUnionTypeConfig[_, _], kind: UNION): GatsbyGraphQLUnionType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLUnionType]
  }
  @scala.inline
  implicit class GatsbyGraphQLUnionTypeOps[Self <: GatsbyGraphQLUnionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ComposeUnionTypeConfig[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: UNION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

