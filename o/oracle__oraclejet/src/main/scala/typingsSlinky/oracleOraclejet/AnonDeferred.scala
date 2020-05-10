package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeferred
  extends /* key */ StringDictionary[js.Any] {
  var deferred: js.UndefOr[Boolean] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
}

object AnonDeferred {
  @scala.inline
  def apply(): AnonDeferred = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDeferred]
  }
  @scala.inline
  implicit class AnonDeferredOps[Self <: AnonDeferred] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withFetchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(js.undefined)
        ret
    }
  }
  
}

