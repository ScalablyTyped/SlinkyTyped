package typingsSlinky.mfiles

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mfiles.mfilesNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITheme extends /* key */ StringDictionary[String | Boolean | Double] {
  
  var last: `0` = js.native
}
object ITheme {
  
  @scala.inline
  def apply(last: `0`): ITheme = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITheme]
  }
  
  @scala.inline
  implicit class IThemeOps[Self <: ITheme] (val x: Self) extends AnyVal {
    
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
    def setLast(value: `0`): Self = this.set("last", value.asInstanceOf[js.Any])
  }
}
