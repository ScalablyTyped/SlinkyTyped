package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidpublisher.anon.Alt
import typingsSlinky.gapiClientAndroidpublisher.anon.ApkVersionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApklistingsResource extends js.Object {
  /** Deletes the APK-specific localized listing for a specified APK and language code. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Deletes all the APK-specific localized listings for a specified APK. */
  def deleteall(request: ApkVersionCode): Request[Unit] = js.native
  /** Fetches the APK-specific localized listing for a specified APK and language code. */
  def get(request: Alt): Request[ApkListing] = js.native
  /** Lists all the APK-specific localized listings for a specified APK. */
  def list(request: ApkVersionCode): Request[ApkListingsListResponse] = js.native
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. This method supports patch semantics. */
  def patch(request: Alt): Request[ApkListing] = js.native
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. */
  def update(request: Alt): Request[ApkListing] = js.native
}

object ApklistingsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    deleteall: ApkVersionCode => Request[Unit],
    get: Alt => Request[ApkListing],
    list: ApkVersionCode => Request[ApkListingsListResponse],
    patch: Alt => Request[ApkListing],
    update: Alt => Request[ApkListing]
  ): ApklistingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ApklistingsResource]
  }
  @scala.inline
  implicit class ApklistingsResourceOps[Self <: ApklistingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteall(value: ApkVersionCode => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[ApkListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: ApkVersionCode => Request[ApkListingsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Alt => Request[ApkListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[ApkListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

