package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a CMIS document version. */
@js.native
trait CmisVersion extends js.Object {
  /** contains the author that created the version. */
  var Author: String = js.native
  /** contains the comment the author has left. */
  var Comment: String = js.native
  /** unique ID of the Cmis version */
  var Id: String = js.native
  /** specifies the time when the revision was created. */
  var TimeStamp: DateTime = js.native
}

object CmisVersion {
  @scala.inline
  def apply(Author: String, Comment: String, Id: String, TimeStamp: DateTime): CmisVersion = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmisVersion]
  }
  @scala.inline
  implicit class CmisVersionOps[Self <: CmisVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeStamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

