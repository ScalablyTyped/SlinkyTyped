package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only cover photo. A large image shown on the
  * person&#39;s profile page that represents who they are or what they care
  * about.
  */
@js.native
trait SchemaCoverPhoto extends js.Object {
  /**
    * True if the cover photo is the default cover photo; false if the cover
    * photo is a user-provided cover photo.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the cover photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The URL of the cover photo.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaCoverPhoto {
  @scala.inline
  def apply(): SchemaCoverPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCoverPhoto]
  }
  @scala.inline
  implicit class SchemaCoverPhotoOps[Self <: SchemaCoverPhoto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaFieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

