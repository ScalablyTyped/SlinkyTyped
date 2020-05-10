package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.gatsbyStrings.SCALAR
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyGraphQLScalarType extends GatsbyGraphQLType {
  var config: ComposeScalarTypeConfig = js.native
  var kind: SCALAR = js.native
}

object GatsbyGraphQLScalarType {
  @scala.inline
  def apply(config: ComposeScalarTypeConfig, kind: SCALAR): GatsbyGraphQLScalarType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLScalarType]
  }
  @scala.inline
  implicit class GatsbyGraphQLScalarTypeOps[Self <: GatsbyGraphQLScalarType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ComposeScalarTypeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: SCALAR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

