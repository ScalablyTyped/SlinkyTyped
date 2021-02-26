package typingsSlinky.rbx

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.rbx.anon.CloseOnBlur
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalPortalMod {
  
  @JSImport("rbx/components/modal/modal-portal", "ModalPortal")
  @js.native
  class ModalPortal protected ()
    extends PureComponent[ModalPortalProps, js.Object, js.Any] {
    def this(props: ModalPortalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalPortalProps, context: js.Any) = this()
    
    val close: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MModalPortal(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MModalPortal(): Unit = js.native
    
    val handleKeydown: js.Any = js.native
  }
  /* static members */
  object ModalPortal {
    
    @JSImport("rbx/components/modal/modal-portal", "ModalPortal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/components/modal/modal-portal", "ModalPortal.defaultProps")
    @js.native
    def defaultProps: CloseOnBlur = js.native
    @scala.inline
    def defaultProps_=(x: CloseOnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/modal/modal-portal", "ModalPortal.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ModalPortalModifierProps extends StObject {
    
    var as: js.UndefOr[ReactType[_]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clipped: js.UndefOr[Boolean] = js.native
    
    var closeOnBlur: js.UndefOr[Boolean] = js.native
    
    var closeOnEsc: js.UndefOr[Boolean] = js.native
    
    var document: Document = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ModalPortalModifierProps {
    
    @scala.inline
    def apply(document: Document): ModalPortalModifierProps = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalPortalModifierProps]
    }
    
    @scala.inline
    implicit class ModalPortalModifierPropsMutableBuilder[Self <: ModalPortalModifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: ReactType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      @scala.inline
      def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      @scala.inline
      def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | SVGElement | ReactComponentClass[js.Object] | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    }
  }
  
  type ModalPortalProps = ModalPortalModifierProps
}
