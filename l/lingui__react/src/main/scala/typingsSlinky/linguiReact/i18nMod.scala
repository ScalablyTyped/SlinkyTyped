package typingsSlinky.linguiReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.linguiReact.anon.I18n
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nMod {
  
  @JSImport("@lingui/react/I18n", JSImport.Default)
  @js.native
  class default ()
    extends Component[I18nComponentProps, js.Object, js.Any]
  
  type I18nComponent = ReactComponentClass[I18nComponentProps]
  
  @js.native
  trait I18nComponentProps extends StObject {
    
    def children(hasI18nI18nHash: I18n): ReactElement = js.native
    
    var update: js.UndefOr[Boolean] = js.native
    
    var withHash: js.UndefOr[Boolean] = js.native
  }
  object I18nComponentProps {
    
    @scala.inline
    def apply(children: I18n => ReactElement): I18nComponentProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[I18nComponentProps]
    }
    
    @scala.inline
    implicit class I18nComponentPropsMutableBuilder[Self <: I18nComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: I18n => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setWithHash(value: Boolean): Self = StObject.set(x, "withHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithHashUndefined: Self = StObject.set(x, "withHash", js.undefined)
    }
  }
}
