package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for About (notes) of a user in Directory API.
  */
@js.native
trait SchemaUserAbout extends js.Object {
  /**
    * About entry can have a type which indicates the content type. It can
    * either be plain or html. By default, notes contents are assumed to
    * contain plain text.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Actual value of notes.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserAbout {
  @scala.inline
  def apply(): SchemaUserAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAbout]
  }
  @scala.inline
  implicit class SchemaUserAboutOps[Self <: SchemaUserAbout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

