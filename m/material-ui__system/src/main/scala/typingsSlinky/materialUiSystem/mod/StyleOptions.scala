package typingsSlinky.materialUiSystem.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleOptions[PropKey, Theme /* <: js.Object */] extends js.Object {
  
  var cssProperty: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 779 */ js.Any
  ] = js.native
  
  var prop: PropKey = js.native
  
  /**
    * dot access in `Theme`
    */
  var themeKey: js.UndefOr[String] = js.native
  
  var transform: js.UndefOr[js.Function1[/* cssValue */ js.Any, Double | String | CSSProperties]] = js.native
}
object StyleOptions {
  
  @scala.inline
  def apply[PropKey, Theme /* <: js.Object */](prop: PropKey): StyleOptions[PropKey, Theme] = {
    val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleOptions[PropKey, Theme]]
  }
  
  @scala.inline
  implicit class StyleOptionsOps[Self <: StyleOptions[_, _], PropKey, Theme /* <: js.Object */] (val x: Self with (StyleOptions[PropKey, Theme])) extends AnyVal {
    
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
    def setProp(value: PropKey): Self = this.set("prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssProperty(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 779 */ js.Any): Self = this.set("cssProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssProperty: Self = this.set("cssProperty", js.undefined)
    
    @scala.inline
    def setThemeKey(value: String): Self = this.set("themeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeKey: Self = this.set("themeKey", js.undefined)
    
    @scala.inline
    def setTransform(value: /* cssValue */ js.Any => Double | String | CSSProperties): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
