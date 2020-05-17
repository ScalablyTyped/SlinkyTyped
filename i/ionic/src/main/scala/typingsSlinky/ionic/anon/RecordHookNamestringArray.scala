package typingsSlinky.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<ionic.ionic/definitions.HookName, string | std.Array<string> | undefined> */
@js.native
trait RecordHookNamestringArray extends js.Object {
  @JSName("build:after")
  var buildColonafter: js.UndefOr[String | js.Array[String]] = js.native
  @JSName("build:before")
  var buildColonbefore: js.UndefOr[String | js.Array[String]] = js.native
  @JSName("serve:after")
  var serveColonafter: js.UndefOr[String | js.Array[String]] = js.native
  @JSName("serve:before")
  var serveColonbefore: js.UndefOr[String | js.Array[String]] = js.native
}

object RecordHookNamestringArray {
  @scala.inline
  def apply(): RecordHookNamestringArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordHookNamestringArray]
  }
  @scala.inline
  implicit class RecordHookNamestringArrayOps[Self <: RecordHookNamestringArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildColonafter(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build:after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildColonafter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build:after")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildColonbefore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build:before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildColonbefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build:before")(js.undefined)
        ret
    }
    @scala.inline
    def withServeColonafter(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serve:after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServeColonafter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serve:after")(js.undefined)
        ret
    }
    @scala.inline
    def withServeColonbefore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serve:before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServeColonbefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serve:before")(js.undefined)
        ret
    }
  }
  
}

