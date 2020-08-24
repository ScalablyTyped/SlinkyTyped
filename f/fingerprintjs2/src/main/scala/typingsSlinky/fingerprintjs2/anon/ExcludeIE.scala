package typingsSlinky.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeIE extends js.Object {
  var excludeIE: Boolean = js.native
  var sortPluginsFor: js.Array[js.RegExp] = js.native
}

object ExcludeIE {
  @scala.inline
  def apply(excludeIE: Boolean, sortPluginsFor: js.Array[js.RegExp]): ExcludeIE = {
    val __obj = js.Dynamic.literal(excludeIE = excludeIE.asInstanceOf[js.Any], sortPluginsFor = sortPluginsFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeIE]
  }
  @scala.inline
  implicit class ExcludeIEOps[Self <: ExcludeIE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcludeIE(value: Boolean): Self = this.set("excludeIE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortPluginsForVarargs(value: js.RegExp*): Self = this.set("sortPluginsFor", js.Array(value :_*))
    @scala.inline
    def setSortPluginsFor(value: js.Array[js.RegExp]): Self = this.set("sortPluginsFor", value.asInstanceOf[js.Any])
  }
  
}

