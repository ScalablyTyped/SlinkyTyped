package typingsSlinky.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelBase extends js.Object {
  /** Should be declared as a getter instead of a plain property. */
  var hasTimestamps: js.UndefOr[Boolean | js.Array[String]] = js.native
  /** Should be declared as a getter instead of a plain property. Should be required, but cannot have abstract properties yet. */
  var tableName: js.UndefOr[String] = js.native
}

object IModelBase {
  @scala.inline
  def apply(): IModelBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelBase]
  }
  @scala.inline
  implicit class IModelBaseOps[Self <: IModelBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasTimestamps(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTimestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTimestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

