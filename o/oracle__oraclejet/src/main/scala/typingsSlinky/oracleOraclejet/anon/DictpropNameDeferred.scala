package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameDeferred
  extends /* key */ StringDictionary[js.Any] {
  var deferred: js.UndefOr[Boolean] = js.native
}

object DictpropNameDeferred {
  @scala.inline
  def apply(): DictpropNameDeferred = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropNameDeferred]
  }
  @scala.inline
  implicit class DictpropNameDeferredOps[Self <: DictpropNameDeferred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(js.undefined)
        ret
    }
  }
  
}

