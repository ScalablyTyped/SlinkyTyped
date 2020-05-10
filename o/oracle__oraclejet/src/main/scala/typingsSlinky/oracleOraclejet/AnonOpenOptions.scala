package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOpenOptions
  extends /* key */ StringDictionary[js.Any] {
  var openOptions: OpenOptions = js.native
}

object AnonOpenOptions {
  @scala.inline
  def apply(openOptions: OpenOptions): AnonOpenOptions = {
    val __obj = js.Dynamic.literal(openOptions = openOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpenOptions]
  }
  @scala.inline
  implicit class AnonOpenOptionsOps[Self <: AnonOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenOptions(value: OpenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

