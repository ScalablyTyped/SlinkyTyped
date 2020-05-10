package typingsSlinky.fingerprintjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeIE extends js.Object {
  var excludeIE: Boolean = js.native
  var sortPluginsFor: js.Array[js.RegExp] = js.native
}

object AnonExcludeIE {
  @scala.inline
  def apply(excludeIE: Boolean, sortPluginsFor: js.Array[js.RegExp]): AnonExcludeIE = {
    val __obj = js.Dynamic.literal(excludeIE = excludeIE.asInstanceOf[js.Any], sortPluginsFor = sortPluginsFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeIE]
  }
  @scala.inline
  implicit class AnonExcludeIEOps[Self <: AnonExcludeIE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeIE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortPluginsFor(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortPluginsFor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

