package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.baseui.baseuiStrings._blank
import typingsSlinky.baseui.baseuiStrings._parent
import typingsSlinky.baseui.baseuiStrings._self
import typingsSlinky.baseui.baseuiStrings._top
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("baseui/link", "StyledLink")
  @js.native
  val StyledLink: StyletronComponent[LinkProps] = js.native
  
  @js.native
  trait LinkProps
    extends AnchorHTMLAttributes[HTMLAnchorElement]
       with ClassAttributes[HTMLAnchorElement] {
    
    @JSName("target")
    var target_LinkProps: js.UndefOr[_self | _blank | _parent | _top] = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: _self | _blank | _parent | _top): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
