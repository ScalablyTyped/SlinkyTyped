package typingsSlinky.reactMdMaterialIcons.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdIcon.fontIconMod.FontIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationFontIcon {
  
  @JSImport("@react-md/material-icons", "NavigationFontIcon")
  @js.native
  object component extends js.Object
  
  def withProps(p: FontIconProps with RefAttributes[HTMLElement]): SharedBuilder_FontIconPropsRefAttributes_1257903674[HTMLElement] = new SharedBuilder_FontIconPropsRefAttributes_1257903674[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: NavigationFontIcon.type): SharedBuilder_FontIconPropsRefAttributes_1257903674[HTMLElement] = new SharedBuilder_FontIconPropsRefAttributes_1257903674[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
}
