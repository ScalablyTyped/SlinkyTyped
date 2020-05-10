package typingsSlinky.fortawesomeFontawesomeCommonTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconLookup extends js.Object {
  // IconName is defined in the code that will be generated at build time and bundled with this file.
  var iconName: IconName = js.native
  var prefix: IconPrefix = js.native
}

object IconLookup {
  @scala.inline
  implicit class IconLookupOps[Self <: IconLookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconName(value: IconName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: IconPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

