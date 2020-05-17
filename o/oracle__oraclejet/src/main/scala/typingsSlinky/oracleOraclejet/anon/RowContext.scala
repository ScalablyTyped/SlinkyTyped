package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowContext
  extends /* key */ StringDictionary[js.Any] {
  var rowContext: js.Object = js.native
}

object RowContext {
  @scala.inline
  def apply(rowContext: js.Object): RowContext = {
    val __obj = js.Dynamic.literal(rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContext]
  }
  @scala.inline
  implicit class RowContextOps[Self <: RowContext] (val x: Self) extends AnyVal {
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

