package typingsSlinky.oracleOraclejet.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet.baseComponentSettableProperties> */
@js.native
trait baseComponentSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var translations: js.UndefOr[js.Object | Null] = js.native
}
object baseComponentSettablePropertiesLenient {
  
  @scala.inline
  def apply(): baseComponentSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[baseComponentSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class baseComponentSettablePropertiesLenientOps[Self <: baseComponentSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
}
