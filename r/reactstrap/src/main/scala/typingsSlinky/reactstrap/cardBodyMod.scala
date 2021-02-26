package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardBodyMod {
  
  @JSImport("reactstrap/lib/CardBody", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardBodyProps, js.Object, js.Any]
  
  type CardBody = ReactComponentClass[CardBodyProps]
  
  @js.native
  trait CardBodyProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
  }
  object CardBodyProps {
    
    @scala.inline
    def apply(): CardBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardBodyProps]
    }
    
    @scala.inline
    implicit class CardBodyPropsMutableBuilder[Self <: CardBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
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
