package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.gatsbyStrings.ENUM
import typingsSlinky.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyGraphQLEnumType extends GatsbyGraphQLType {
  var config: ComposeEnumTypeConfig = js.native
  var kind: ENUM = js.native
}

object GatsbyGraphQLEnumType {
  @scala.inline
  def apply(config: ComposeEnumTypeConfig, kind: ENUM): GatsbyGraphQLEnumType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLEnumType]
  }
  @scala.inline
  implicit class GatsbyGraphQLEnumTypeOps[Self <: GatsbyGraphQLEnumType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ComposeEnumTypeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

