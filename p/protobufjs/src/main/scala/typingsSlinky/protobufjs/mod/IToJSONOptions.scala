package typingsSlinky.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToJSONOptions extends js.Object {
  /** Serializes comments. */
  var keepComments: js.UndefOr[Boolean] = js.native
}

object IToJSONOptions {
  @scala.inline
  def apply(): IToJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToJSONOptions]
  }
  @scala.inline
  implicit class IToJSONOptionsOps[Self <: IToJSONOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepComments")(js.undefined)
        ret
    }
  }
  
}

