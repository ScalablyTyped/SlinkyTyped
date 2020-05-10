package typingsSlinky.hjson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeserializeOptions extends js.Object {
  /**
    * keep white space and comments. This is useful if
    * you want to edit an hjson file and save it while preserving comments (default false)
    */
  var keepWsc: js.UndefOr[Boolean] = js.native
}

object DeserializeOptions {
  @scala.inline
  def apply(): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializeOptions]
  }
  @scala.inline
  implicit class DeserializeOptionsOps[Self <: DeserializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepWsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWsc")(js.undefined)
        ret
    }
  }
  
}

