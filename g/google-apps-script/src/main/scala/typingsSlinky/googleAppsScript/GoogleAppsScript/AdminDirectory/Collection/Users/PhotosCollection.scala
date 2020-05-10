package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Users

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserPhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotosCollection extends js.Object {
  // Retrieve photo of a user
  def get(userKey: String): UserPhoto = js.native
  // Add a photo for the user. This method supports patch semantics.
  def patch(resource: UserPhoto, userKey: String): UserPhoto = js.native
  // Remove photos for the user
  def remove(userKey: String): Unit = js.native
  // Add a photo for the user
  def update(resource: UserPhoto, userKey: String): UserPhoto = js.native
}

object PhotosCollection {
  @scala.inline
  def apply(
    get: String => UserPhoto,
    patch: (UserPhoto, String) => UserPhoto,
    remove: String => Unit,
    update: (UserPhoto, String) => UserPhoto
  ): PhotosCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[PhotosCollection]
  }
  @scala.inline
  implicit class PhotosCollectionOps[Self <: PhotosCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: String => UserPhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: (UserPhoto, String) => UserPhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (UserPhoto, String) => UserPhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

