package typingsSlinky.googleapis.bloggerV2Mod.bloggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPageList extends js.Object {
  /**
    * The list of Pages for a Blog.
    */
  var items: js.UndefOr[js.Array[SchemaPage]] = js.native
  /**
    * The kind of this entity. Always blogger#pageList
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPageList {
  @scala.inline
  def apply(): SchemaPageList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageList]
  }
  @scala.inline
  implicit class SchemaPageListOps[Self <: SchemaPageList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

