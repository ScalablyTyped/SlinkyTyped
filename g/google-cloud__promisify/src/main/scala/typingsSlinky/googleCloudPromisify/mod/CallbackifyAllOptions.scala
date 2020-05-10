package typingsSlinky.googleCloudPromisify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackifyAllOptions extends js.Object {
  /**
    * Array of methods to ignore when callbackifying.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
}

object CallbackifyAllOptions {
  @scala.inline
  def apply(): CallbackifyAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackifyAllOptions]
  }
  @scala.inline
  implicit class CallbackifyAllOptionsOps[Self <: CallbackifyAllOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
  }
  
}

