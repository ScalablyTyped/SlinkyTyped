package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to another portion of a document or an external URL resource.
  */
@js.native
trait SchemaLink extends js.Object {
  /**
    * The ID of a bookmark in this document.
    */
  var bookmarkId: js.UndefOr[String] = js.native
  /**
    * The ID of a heading in this document.
    */
  var headingId: js.UndefOr[String] = js.native
  /**
    * An external URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaLink {
  @scala.inline
  def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  @scala.inline
  implicit class SchemaLinkOps[Self <: SchemaLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmarkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingId")(js.undefined)
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

