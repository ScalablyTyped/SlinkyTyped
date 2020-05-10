package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonAlt
import typingsSlinky.gapiClientAndroidpublisher.AnonApkVersionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApklistingsResource extends js.Object {
  /** Deletes the APK-specific localized listing for a specified APK and language code. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Deletes all the APK-specific localized listings for a specified APK. */
  def deleteall(request: AnonApkVersionCode): Request_[Unit] = js.native
  /** Fetches the APK-specific localized listing for a specified APK and language code. */
  def get(request: AnonAlt): Request_[ApkListing] = js.native
  /** Lists all the APK-specific localized listings for a specified APK. */
  def list(request: AnonApkVersionCode): Request_[ApkListingsListResponse] = js.native
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[ApkListing] = js.native
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. */
  def update(request: AnonAlt): Request_[ApkListing] = js.native
}

object ApklistingsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    deleteall: AnonApkVersionCode => Request_[Unit],
    get: AnonAlt => Request_[ApkListing],
    list: AnonApkVersionCode => Request_[ApkListingsListResponse],
    patch: AnonAlt => Request_[ApkListing],
    update: AnonAlt => Request_[ApkListing]
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
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteall(value: AnonApkVersionCode => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[ApkListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonApkVersionCode => Request_[ApkListingsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAlt => Request_[ApkListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[ApkListing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

