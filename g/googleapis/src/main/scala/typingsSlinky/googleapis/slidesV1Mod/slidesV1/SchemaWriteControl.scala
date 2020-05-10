package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides control over how write requests are executed.
  */
@js.native
trait SchemaWriteControl extends js.Object {
  /**
    * The revision ID of the presentation required for the write request. If
    * specified and the `required_revision_id` doesn&#39;t exactly match the
    * presentation&#39;s current `revision_id`, the request will not be
    * processed and will return a 400 bad request error.
    */
  var requiredRevisionId: js.UndefOr[String] = js.native
}

object SchemaWriteControl {
  @scala.inline
  def apply(): SchemaWriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteControl]
  }
  @scala.inline
  implicit class SchemaWriteControlOps[Self <: SchemaWriteControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequiredRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredRevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredRevisionId")(js.undefined)
        ret
    }
  }
  
}

