package typingsSlinky.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCountMode extends js.Object {
  /**
    * Count is retrieved by a separate request upfront and inline with each data request
    */
  var Both: js.Any = js.native
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in the data request
    */
  var Inline: js.Any = js.native
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in every data request
    */
  var InlineRepeat: js.Any = js.native
  /**
    * Count is not requested from the server
    */
  var None: js.Any = js.native
  /**
    * Count is retrieved by sending a separate $count request, before requesting data
    */
  var Request: js.Any = js.native
}

object TypeofCountMode {
  @scala.inline
  def apply(Both: js.Any, Inline: js.Any, InlineRepeat: js.Any, None: js.Any, Request: js.Any): TypeofCountMode = {
    val __obj = js.Dynamic.literal(Both = Both.asInstanceOf[js.Any], Inline = Inline.asInstanceOf[js.Any], InlineRepeat = InlineRepeat.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCountMode]
  }
  @scala.inline
  implicit class TypeofCountModeOps[Self <: TypeofCountMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Both")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineRepeat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineRepeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("None")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

