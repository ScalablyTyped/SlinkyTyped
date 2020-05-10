package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a renametype event.
  */
@js.native
trait SchemaRename extends js.Object {
  /**
    * The new title.
    */
  var newTitle: js.UndefOr[String] = js.native
  /**
    * The old title.
    */
  var oldTitle: js.UndefOr[String] = js.native
}

object SchemaRename {
  @scala.inline
  def apply(): SchemaRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRename]
  }
  @scala.inline
  implicit class SchemaRenameOps[Self <: SchemaRename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOldTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTitle")(js.undefined)
        ret
    }
  }
  
}

