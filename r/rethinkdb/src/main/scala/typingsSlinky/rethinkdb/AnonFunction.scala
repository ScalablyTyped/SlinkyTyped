package typingsSlinky.rethinkdb

import typingsSlinky.rethinkdb.rethinkdbBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFunction extends js.Object {
  var function: Double = js.native
  var geo: Boolean = js.native
  var index: String = js.native
  var multi: Boolean = js.native
  var outdated: Boolean = js.native
  var ready: `true` = js.native
}

object AnonFunction {
  @scala.inline
  def apply(function: Double, geo: Boolean, index: String, multi: Boolean, outdated: Boolean, ready: `true`): AnonFunction = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], outdated = outdated.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFunction]
  }
  @scala.inline
  implicit class AnonFunctionOps[Self <: AnonFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutdated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

