package typingsSlinky.pnpapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsiderBuiltinsExtensions extends js.Object {
  var considerBuiltins: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[String]] = js.native
}

object ConsiderBuiltinsExtensions {
  @scala.inline
  def apply(): ConsiderBuiltinsExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsiderBuiltinsExtensions]
  }
  @scala.inline
  implicit class ConsiderBuiltinsExtensionsOps[Self <: ConsiderBuiltinsExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsiderBuiltins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerBuiltins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsiderBuiltins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerBuiltins")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
  }
  
}

