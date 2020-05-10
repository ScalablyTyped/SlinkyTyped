package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRowContext
  extends /* key */ StringDictionary[js.Any] {
  var rowContext: js.Object = js.native
}

object AnonRowContext {
  @scala.inline
  def apply(rowContext: js.Object): AnonRowContext = {
    val __obj = js.Dynamic.literal(rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowContext]
  }
  @scala.inline
  implicit class AnonRowContextOps[Self <: AnonRowContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

