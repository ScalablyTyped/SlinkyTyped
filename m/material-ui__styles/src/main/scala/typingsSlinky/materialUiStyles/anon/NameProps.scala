package typingsSlinky.materialUiStyles.anon

import typingsSlinky.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameProps[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[_] */] extends js.Object {
  
  var name: Name = js.native
  
  var props: Props = js.native
  
  var theme: js.UndefOr[Theme] = js.native
}
object NameProps {
  
  @scala.inline
  def apply[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[_] */](name: Name, props: Props): NameProps[Props, Name, Theme] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameProps[Props, Name, Theme]]
  }
  
  @scala.inline
  implicit class NamePropsOps[Self <: NameProps[_, _, _], Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[_] */] (val x: Self with (NameProps[Props, Name, Theme])) extends AnyVal {
    
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
