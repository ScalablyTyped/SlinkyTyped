package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtensions extends js.Object {
  var extensions: js.UndefOr[js.Array[Asterisk | String | AnonIncludedirectories]] = js.native
  /** File types to handle */
  var types: js.UndefOr[js.Array[Asterisk | String | AnonIncludedirectories]] = js.native
}

object AnonExtensions {
  @scala.inline
  def apply(): AnonExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExtensions]
  }
  @scala.inline
  implicit class AnonExtensionsOps[Self <: AnonExtensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[Asterisk | String | AnonIncludedirectories]): Self = {
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
    @scala.inline
    def withTypes(value: js.Array[Asterisk | String | AnonIncludedirectories]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

