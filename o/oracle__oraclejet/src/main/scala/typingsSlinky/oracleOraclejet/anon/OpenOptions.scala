package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenOptions
  extends /* key */ StringDictionary[js.Any] {
  var openOptions: typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions = js.native
}

object OpenOptions {
  @scala.inline
  def apply(openOptions: typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): OpenOptions = {
    val __obj = js.Dynamic.literal(openOptions = openOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
  @scala.inline
  implicit class OpenOptionsOps[Self <: OpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenOptions(value: typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

