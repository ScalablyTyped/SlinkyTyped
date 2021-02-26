package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.SetStateAction
import typingsSlinky.reactMdUtils.typesMod.PositionAnchor
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useContextMenuMod {
  
  @JSImport("@react-md/menu/types/useContextMenu", "useContextMenu")
  @js.native
  def useContextMenu[CE /* <: HTMLElement */](): ReturnValue[CE] = js.native
  @JSImport("@react-md/menu/types/useContextMenu", "useContextMenu")
  @js.native
  def useContextMenu[CE /* <: HTMLElement */](hasIdRefAnchorClassNamesDisableDeselect: Options): ReturnValue[CE] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The anchor to use for context menus.
      *
      * Defaults to `inner-left` and `top` to mimic native context menus.
      */
    var anchor: js.UndefOr[PositionAnchor] = js.native
    
    /**
      * The CSS classNames to use for the context menu animation. This defaults to
      * a vertical scaling transition instead of the default "from-point-scaling"
      * transition.
      */
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.native
    
    /**
      * When a context menu becomes visible, the native functionality is to also
      * highlight any text below the cursor when possible. Since this is a custom
      * context menu, this is normally not desired behavior so this hook will
      * automatically deselect this text. If the text selection behavior is
      * desired, this property can be enabled to keep text selected.
      */
    var disableDeselect: js.UndefOr[Boolean] = js.native
    
    /**
      * The id to use for the context menu. This defaults to `context-menu` since
      * there can usually only be one context menu visible at a time.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * An optional ref that should be merged with the returned ref.
      */
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setDisableDeselect(value: Boolean): Self = StObject.set(x, "disableDeselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDeselectUndefined: Self = StObject.set(x, "disableDeselect", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, @react-md/menu.@react-md/menu/types/useContextMenu.ProvidedPropNames>> */
  @js.native
  trait ProvidedContextMenuProps extends StObject {
    
    var anchor: js.Any = js.native
    
    var classNames: js.Any = js.native
    
    var disableControlClickOkay: js.Any = js.native
    
    var id: js.Any = js.native
    
    var onRequestClose: js.Any = js.native
    
    var positionOptions: js.Any = js.native
    
    /**
      * A ref that must be provided to the `Menu` component that is acting as a
      * context menu if you want to allow the native context menus within this
      * custom context menu.
      *
      * If this is never provided to the `Menu` component, right clicking (to
      * inspect an element for example) will close this context menu.
      */
    def ref(): Unit = js.native
    def ref(instance: HTMLDivElement): Unit = js.native
    
    var visible: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.id
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.anchor
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.visible
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.classNames
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.positionOptions
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.onRequestClose
    - typingsSlinky.reactMdMenu.reactMdMenuStrings.disableControlClickOkay
  */
  trait ProvidedPropNames extends StObject
  object ProvidedPropNames {
    
    @scala.inline
    def anchor: typingsSlinky.reactMdMenu.reactMdMenuStrings.anchor = "anchor".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.anchor]
    
    @scala.inline
    def classNames: typingsSlinky.reactMdMenu.reactMdMenuStrings.classNames = "classNames".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.classNames]
    
    @scala.inline
    def disableControlClickOkay: typingsSlinky.reactMdMenu.reactMdMenuStrings.disableControlClickOkay = "disableControlClickOkay".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.disableControlClickOkay]
    
    @scala.inline
    def id: typingsSlinky.reactMdMenu.reactMdMenuStrings.id = "id".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.id]
    
    @scala.inline
    def onRequestClose: typingsSlinky.reactMdMenu.reactMdMenuStrings.onRequestClose = "onRequestClose".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.onRequestClose]
    
    @scala.inline
    def positionOptions: typingsSlinky.reactMdMenu.reactMdMenuStrings.positionOptions = "positionOptions".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.positionOptions]
    
    @scala.inline
    def visible: typingsSlinky.reactMdMenu.reactMdMenuStrings.visible = "visible".asInstanceOf[typingsSlinky.reactMdMenu.reactMdMenuStrings.visible]
  }
  
  type ReturnValue[CE /* <: HTMLElement */] = js.Tuple3[ProvidedContextMenuProps, MouseEventHandler[CE], VisibilityDispatcher]
  
  type VisibilityDispatcher = Dispatch[SetStateAction[Boolean]]
}
