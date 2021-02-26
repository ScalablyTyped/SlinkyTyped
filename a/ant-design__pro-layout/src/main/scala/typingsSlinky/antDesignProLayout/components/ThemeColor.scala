package typingsSlinky.antDesignProLayout.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.Color
import typingsSlinky.antDesignProLayout.anon.DefaultMessage
import typingsSlinky.antDesignProLayout.themeColorMod.ThemeColorProps
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeColor {
  
  @scala.inline
  def apply(formatMessage: DefaultMessage => String, onChange: String => Unit, value: String): Builder = {
    val __props = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ThemeColorProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/ThemeColor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def colors(value: js.Array[Color]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: Color*): this.type = set("colors", js.Array(value :_*))
  }
  
  def withProps(p: ThemeColorProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
