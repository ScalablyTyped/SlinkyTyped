package typingsSlinky.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Search options to filter navigator.contacts.  */
@js.native
trait ContactFindOptions extends js.Object {
  /* Contact fields to be returned back. If specified, the resulting Contact object only features values for these fields. */
  var desiredFields: js.UndefOr[js.Array[ContactFieldType]] = js.native
  /** The search string used to find navigator.contacts. */
  var filter: js.UndefOr[String] = js.native
  /** Determines if the find operation returns multiple navigator.contacts. */
  var multiple: js.UndefOr[Boolean] = js.native
}

object ContactFindOptions {
  @scala.inline
  def apply(): ContactFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFindOptions]
  }
  @scala.inline
  implicit class ContactFindOptionsOps[Self <: ContactFindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredFields(value: js.Array[ContactFieldType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredFields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
  }
  
}

