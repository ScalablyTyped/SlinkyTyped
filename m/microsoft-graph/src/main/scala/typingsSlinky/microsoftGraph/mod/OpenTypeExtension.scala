package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTypeExtension extends Entity {
  // A unique text identifier for an open type open extension. Required.
  var extensionName: js.UndefOr[String] = js.native
}

object OpenTypeExtension {
  @scala.inline
  def apply(): OpenTypeExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTypeExtension]
  }
  @scala.inline
  implicit class OpenTypeExtensionOps[Self <: OpenTypeExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(js.undefined)
        ret
    }
  }
  
}

