package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOpenOptions(value: typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions): Self = this.set("openOptions", value.asInstanceOf[js.Any])
  }
}
