package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a script project.
  */
@js.native
trait SchemaCreateProjectRequest extends js.Object {
  /**
    * The Drive ID of a parent file that the created script project is bound
    * to. This is usually the ID of a Google Doc, Google Sheet, Google Form, or
    * Google Slides file. If not set, a standalone script project is created.
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * The title for the project.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaCreateProjectRequest {
  @scala.inline
  def apply(): SchemaCreateProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateProjectRequest]
  }
  @scala.inline
  implicit class SchemaCreateProjectRequestOps[Self <: SchemaCreateProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

