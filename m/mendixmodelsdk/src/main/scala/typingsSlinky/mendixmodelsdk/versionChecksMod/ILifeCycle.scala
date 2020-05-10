package typingsSlinky.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILifeCycle extends js.Object {
  var deleted: js.UndefOr[String] = js.native
  var deletionMessage: js.UndefOr[String | Null] = js.native
  var deprecated: js.UndefOr[String] = js.native
  var deprecationMessage: js.UndefOr[String | Null] = js.native
  var introduced: js.UndefOr[String] = js.native
}

object ILifeCycle {
  @scala.inline
  def apply(): ILifeCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILifeCycle]
  }
  @scala.inline
  implicit class ILifeCycleOps[Self <: ILifeCycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionMessage")(null)
        ret
    }
    @scala.inline
    def withDeprecated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationMessage")(null)
        ret
    }
    @scala.inline
    def withIntroduced(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introduced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntroduced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introduced")(js.undefined)
        ret
    }
  }
  
}

