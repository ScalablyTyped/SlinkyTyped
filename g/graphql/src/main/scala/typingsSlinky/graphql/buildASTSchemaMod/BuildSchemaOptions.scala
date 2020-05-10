package typingsSlinky.graphql.buildASTSchemaMod

import typingsSlinky.graphql.schemaMod.GraphQLSchemaValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildSchemaOptions extends GraphQLSchemaValidationOptions {
  /**
    * Set to true to assume the SDL is valid.
    *
    * Default: false
    */
  var assumeValidSDL: js.UndefOr[Boolean] = js.native
  /**
    * Descriptions are defined as preceding string literals, however an older
    * experimental version of the SDL supported preceding comments as
    * descriptions. Set to true to enable this deprecated behavior.
    * This option is provided to ease adoption and will be removed in v16.
    *
    * Default: false
    */
  var commentDescriptions: js.UndefOr[Boolean] = js.native
}

object BuildSchemaOptions {
  @scala.inline
  def apply(): BuildSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSchemaOptions]
  }
  @scala.inline
  implicit class BuildSchemaOptionsOps[Self <: BuildSchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumeValidSDL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeValidSDL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeValidSDL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeValidSDL")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentDescriptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentDescriptions")(js.undefined)
        ret
    }
  }
  
}

