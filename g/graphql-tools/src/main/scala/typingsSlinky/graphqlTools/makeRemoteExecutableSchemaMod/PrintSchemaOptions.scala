package typingsSlinky.graphqlTools.makeRemoteExecutableSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type has been copied inline from its source on `@types/graphql`:
  *
  * https://git.io/Jv8NX
  *
  * Previously, it was imported from `graphql/utilities/schemaPrinter`, however
  * that module has been removed in `graphql@15`.  Furthermore, the sole property
  * on this type is due to be deprecated in `graphql@16`.
  */
@js.native
trait PrintSchemaOptions extends js.Object {
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

object PrintSchemaOptions {
  @scala.inline
  def apply(): PrintSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintSchemaOptions]
  }
  @scala.inline
  implicit class PrintSchemaOptionsOps[Self <: PrintSchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

