package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentOptions extends RequestOptions {
  /** Disables the automatic id generation. If id is missing in the body and this option is true, an error will be returned. */
  var disableAutomaticIdGeneration: js.UndefOr[Boolean] = js.native
}

object DocumentOptions {
  @scala.inline
  def apply(): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOptions]
  }
  @scala.inline
  implicit class DocumentOptionsOps[Self <: DocumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAutomaticIdGeneration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutomaticIdGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutomaticIdGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutomaticIdGeneration")(js.undefined)
        ret
    }
  }
  
}

