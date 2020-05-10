package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAs.SmimeInfoCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListSendAsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAsCollection extends js.Object {
  var SmimeInfo: js.UndefOr[SmimeInfoCollection] = js.native
  // Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, userId: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  // Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection.
  def get(userId: String, sendAsEmail: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  // Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom "from" aliases.
  def list(userId: String): ListSendAsResponse = js.native
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority. This method supports patch semantics.
  def patch(
    resource: typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    userId: String,
    sendAsEmail: String
  ): typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  // Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, sendAsEmail: String): Unit = js.native
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
  def update(
    resource: typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    userId: String,
    sendAsEmail: String
  ): typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs = js.native
  // Sends a verification email to the specified send-as alias address. The verification status must be pending.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def verify(userId: String, sendAsEmail: String): Unit = js.native
}

object SendAsCollection {
  @scala.inline
  def apply(
    create: (typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    get: (String, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    list: String => ListSendAsResponse,
    patch: (typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    remove: (String, String) => Unit,
    update: (typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs,
    verify: (String, String) => Unit
  ): SendAsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[SendAsCollection]
  }
  @scala.inline
  implicit class SendAsCollectionOps[Self <: SendAsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(
      value: (typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: (String, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => ListSendAsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(
      value: (typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(
      value: (typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs, String, String) => typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withVerify(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSmimeInfo(value: SmimeInfoCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmimeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmimeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmimeInfo")(js.undefined)
        ret
    }
  }
  
}

