package typingsSlinky.gapiClientSiteverification.gapi.client.siteverification

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSiteverification.AnonAlt
import typingsSlinky.gapiClientSiteverification.AnonFields
import typingsSlinky.gapiClientSiteverification.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Get the most current data for a website or domain. */
  def get(request: AnonAlt): Request_[SiteVerificationWebResourceResource] = js.native
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: AnonFields): Request_[SiteVerificationWebResourceGettokenResponse] = js.native
  /** Attempt verification of a website or domain. */
  def insert(request: AnonKey): Request_[SiteVerificationWebResourceResource] = js.native
  /** Get the list of your verified websites and domains. */
  def list(request: AnonFields): Request_[SiteVerificationWebResourceListResponse] = js.native
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[SiteVerificationWebResourceResource] = js.native
  /** Modify the list of owners for your website or domain. */
  def update(request: AnonAlt): Request_[SiteVerificationWebResourceResource] = js.native
}

object WebResourceResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[SiteVerificationWebResourceResource],
    getToken: AnonFields => Request_[SiteVerificationWebResourceGettokenResponse],
    insert: AnonKey => Request_[SiteVerificationWebResourceResource],
    list: AnonFields => Request_[SiteVerificationWebResourceListResponse],
    patch: AnonAlt => Request_[SiteVerificationWebResourceResource],
    update: AnonAlt => Request_[SiteVerificationWebResourceResource]
  ): WebResourceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getToken = js.Any.fromFunction1(getToken), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebResourceResource]
  }
  @scala.inline
  implicit class WebResourceResourceOps[Self <: WebResourceResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[SiteVerificationWebResourceResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetToken(value: AnonFields => Request_[SiteVerificationWebResourceGettokenResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[SiteVerificationWebResourceResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[SiteVerificationWebResourceListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAlt => Request_[SiteVerificationWebResourceResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[SiteVerificationWebResourceResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

