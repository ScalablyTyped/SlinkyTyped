package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publish container version response.
  */
@js.native
trait SchemaPublishContainerVersionResponse extends js.Object {
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.native
}

object SchemaPublishContainerVersionResponse {
  @scala.inline
  def apply(): SchemaPublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishContainerVersionResponse]
  }
  @scala.inline
  implicit class SchemaPublishContainerVersionResponseOps[Self <: SchemaPublishContainerVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilerError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerError")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerVersion(value: SchemaContainerVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(js.undefined)
        ret
    }
  }
  
}

