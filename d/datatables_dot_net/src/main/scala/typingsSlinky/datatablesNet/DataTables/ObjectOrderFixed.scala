package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectOrderFixed extends js.Object {
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var post: js.UndefOr[js.Array[_]] = js.native
  /**
    * Two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var pre: js.UndefOr[js.Array[_]] = js.native
}

object ObjectOrderFixed {
  @scala.inline
  def apply(): ObjectOrderFixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOrderFixed]
  }
  @scala.inline
  implicit class ObjectOrderFixedOps[Self <: ObjectOrderFixed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPost(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
  }
  
}

