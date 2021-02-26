package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import typingsSlinky.reactstrap.reactstrapStrings.append
import typingsSlinky.reactstrap.reactstrapStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupAddonMod {
  
  @JSImport("reactstrap/lib/InputGroupAddon", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputGroupAddonProps, js.Object, js.Any]
  
  type InputGroupAddon = ReactComponentClass[InputGroupAddonProps]
  
  @js.native
  trait InputGroupAddonProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var addonType: prepend | append = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
  }
  object InputGroupAddonProps {
    
    @scala.inline
    def apply(addonType: prepend | append): InputGroupAddonProps = {
      val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputGroupAddonProps]
    }
    
    @scala.inline
    implicit class InputGroupAddonPropsMutableBuilder[Self <: InputGroupAddonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonType(value: prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
