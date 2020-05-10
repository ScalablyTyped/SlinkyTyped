package typingsSlinky.angularUiRouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlobals extends js.Object {
  /**
    * Currently resolved "resolve" values from the current state
    */
  var globals: StringDictionary[js.Any] = js.native
}

object AnonGlobals {
  @scala.inline
  def apply(globals: StringDictionary[js.Any]): AnonGlobals = {
    val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobals]
  }
  @scala.inline
  implicit class AnonGlobalsOps[Self <: AnonGlobals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobals(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

