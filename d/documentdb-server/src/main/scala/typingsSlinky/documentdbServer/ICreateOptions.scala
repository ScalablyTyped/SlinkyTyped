package typingsSlinky.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options associated with a create operation. */
@js.native
trait ICreateOptions extends js.Object {
  /** Disables automatic generation of "id" field of the document to be created (if it is not provided) */
  var disableAutomaticIdGeneration: js.UndefOr[String] = js.native
  /** Specifies indexing directives. */
  var indexAction: js.UndefOr[String] = js.native
}

object ICreateOptions {
  @scala.inline
  def apply(): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateOptions]
  }
  @scala.inline
  implicit class ICreateOptionsOps[Self <: ICreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAutomaticIdGeneration(value: String): Self = {
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
    @scala.inline
    def withIndexAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexAction")(js.undefined)
        ret
    }
  }
  
}

