package typingsSlinky.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Contact")
@js.native
class ContactCls protected () extends Contact {
  /** Constructor of Contact object */
  def this(
    id: js.UndefOr[String],
    displayName: js.UndefOr[String],
    name: js.UndefOr[ContactName],
    nickname: js.UndefOr[String],
    phoneNumbers: js.UndefOr[js.Array[ContactField]],
    emails: js.UndefOr[js.Array[ContactField]],
    addresses: js.UndefOr[js.Array[ContactAddress]],
    ims: js.UndefOr[js.Array[ContactField]],
    organizations: js.UndefOr[js.Array[ContactOrganization]],
    birthday: js.UndefOr[js.Date],
    note: js.UndefOr[String],
    photos: js.UndefOr[js.Array[ContactField]],
    categories: js.UndefOr[ContactField],
    urls: js.UndefOr[js.Array[ContactField]]
  ) = this()
}

