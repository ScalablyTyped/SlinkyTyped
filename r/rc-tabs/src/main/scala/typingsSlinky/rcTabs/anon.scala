package typingsSlinky.rcTabs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.rcTabs.interfaceMod.AnimatedConfig
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.OnTabScroll
import typingsSlinky.rcTabs.interfaceMod.RenderTabBar
import typingsSlinky.rcTabs.interfaceMod.Tab
import typingsSlinky.rcTabs.interfaceMod.TabBarExtraContent
import typingsSlinky.rcTabs.interfaceMod.TabPosition
import typingsSlinky.rcTabs.interfaceMod.TabsLocale
import typingsSlinky.rcTabs.rcTabsStrings.`additions removals`
import typingsSlinky.rcTabs.rcTabsStrings.`additions text`
import typingsSlinky.rcTabs.rcTabsStrings.`inline`
import typingsSlinky.rcTabs.rcTabsStrings.`removals additions`
import typingsSlinky.rcTabs.rcTabsStrings.`removals text`
import typingsSlinky.rcTabs.rcTabsStrings.`text additions`
import typingsSlinky.rcTabs.rcTabsStrings.`text removals`
import typingsSlinky.rcTabs.rcTabsStrings.additions
import typingsSlinky.rcTabs.rcTabsStrings.all
import typingsSlinky.rcTabs.rcTabsStrings.ascending
import typingsSlinky.rcTabs.rcTabsStrings.assertive
import typingsSlinky.rcTabs.rcTabsStrings.both
import typingsSlinky.rcTabs.rcTabsStrings.bottom
import typingsSlinky.rcTabs.rcTabsStrings.copy
import typingsSlinky.rcTabs.rcTabsStrings.date
import typingsSlinky.rcTabs.rcTabsStrings.decimal
import typingsSlinky.rcTabs.rcTabsStrings.descending
import typingsSlinky.rcTabs.rcTabsStrings.dialog
import typingsSlinky.rcTabs.rcTabsStrings.email
import typingsSlinky.rcTabs.rcTabsStrings.execute
import typingsSlinky.rcTabs.rcTabsStrings.grammar
import typingsSlinky.rcTabs.rcTabsStrings.grid
import typingsSlinky.rcTabs.rcTabsStrings.horizontal
import typingsSlinky.rcTabs.rcTabsStrings.inherit
import typingsSlinky.rcTabs.rcTabsStrings.left
import typingsSlinky.rcTabs.rcTabsStrings.link
import typingsSlinky.rcTabs.rcTabsStrings.list
import typingsSlinky.rcTabs.rcTabsStrings.listbox
import typingsSlinky.rcTabs.rcTabsStrings.location
import typingsSlinky.rcTabs.rcTabsStrings.ltr
import typingsSlinky.rcTabs.rcTabsStrings.menu
import typingsSlinky.rcTabs.rcTabsStrings.mixed
import typingsSlinky.rcTabs.rcTabsStrings.move
import typingsSlinky.rcTabs.rcTabsStrings.no
import typingsSlinky.rcTabs.rcTabsStrings.none
import typingsSlinky.rcTabs.rcTabsStrings.numeric
import typingsSlinky.rcTabs.rcTabsStrings.off
import typingsSlinky.rcTabs.rcTabsStrings.on
import typingsSlinky.rcTabs.rcTabsStrings.other
import typingsSlinky.rcTabs.rcTabsStrings.page
import typingsSlinky.rcTabs.rcTabsStrings.polite
import typingsSlinky.rcTabs.rcTabsStrings.popup
import typingsSlinky.rcTabs.rcTabsStrings.removals
import typingsSlinky.rcTabs.rcTabsStrings.right
import typingsSlinky.rcTabs.rcTabsStrings.rtl
import typingsSlinky.rcTabs.rcTabsStrings.search
import typingsSlinky.rcTabs.rcTabsStrings.spelling
import typingsSlinky.rcTabs.rcTabsStrings.step
import typingsSlinky.rcTabs.rcTabsStrings.tel
import typingsSlinky.rcTabs.rcTabsStrings.text
import typingsSlinky.rcTabs.rcTabsStrings.time
import typingsSlinky.rcTabs.rcTabsStrings.top
import typingsSlinky.rcTabs.rcTabsStrings.tree
import typingsSlinky.rcTabs.rcTabsStrings.url
import typingsSlinky.rcTabs.rcTabsStrings.vertical
import typingsSlinky.rcTabs.rcTabsStrings.yes
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.Validator
import typingsSlinky.react.mod.WheelEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Direction extends StObject {
    
    var direction: left | right | top | bottom = js.native
  }
  object Direction {
    
    @scala.inline
    def apply(direction: left | right | top | bottom): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    @scala.inline
    implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: left | right | top | bottom): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var event: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyboardEvent(value: SyntheticKeyboardEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventMouseEvent(value: SyntheticMouseEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rc-tabs.rc-tabs/es/Tabs.TabsProps & react.react.RefAttributes<std.HTMLDivElement>> */
  @js.native
  trait PartialTabsPropsRefAttrib extends StObject {
    
    var about: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    var activeKey: js.UndefOr[String] = js.native
    
    var animated: js.UndefOr[Boolean | AnimatedConfig] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var defaultActiveKey: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var destroyInactiveTabPane: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var moreIcon: js.UndefOr[ReactElement] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onTabClick: js.UndefOr[
        js.Function2[
          /* activeKey */ String, 
          /* e */ SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element], 
          Unit
        ]
      ] = js.native
    
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabBarStyle: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tabPosition: js.UndefOr[TabPosition] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object PartialTabsPropsRefAttrib {
    
    @scala.inline
    def apply(): PartialTabsPropsRefAttrib = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTabsPropsRefAttrib]
    }
    
    @scala.inline
    implicit class PartialTabsPropsRefAttribMutableBuilder[Self <: PartialTabsPropsRefAttrib] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setAnimated(value: Boolean | AnimatedConfig): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: String): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDestroyInactiveTabPane(value: Boolean): Self = StObject.set(x, "destroyInactiveTabPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactiveTabPaneUndefined: Self = StObject.set(x, "destroyInactiveTabPane", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLocale(value: TabsLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMoreIcon(value: ReactElement): Self = StObject.set(x, "moreIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreIconReactElement(value: ReactElement): Self = StObject.set(x, "moreIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreIconUndefined: Self = StObject.set(x, "moreIcon", js.undefined)
      
      @scala.inline
      def setMoreTransitionName(value: String): Self = StObject.set(x, "moreTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreTransitionNameUndefined: Self = StObject.set(x, "moreTransitionName", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, org.scalajs.dom.raw.Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* activeKey */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLDivElement, org.scalajs.dom.raw.Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, org.scalajs.dom.raw.Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLDivElement, org.scalajs.dom.raw.Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, org.scalajs.dom.raw.Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTabClick(
        value: (/* activeKey */ String, /* e */ SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element]) => Unit
      ): Self = StObject.set(x, "onTabClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      @scala.inline
      def setOnTabScroll(value: /* info */ Direction => Unit): Self = StObject.set(x, "onTabScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabScrollUndefined: Self = StObject.set(x, "onTabScroll", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
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
      
      @scala.inline
      def setRenderTabBar(value: (/* props */ js.Any, /* DefaultTabBar */ ReactComponentClass[js.Object]) => ReactElement): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentReactElement(value: ReactElement): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      @scala.inline
      def setTabBarGutter(value: Double): Self = StObject.set(x, "tabBarGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarGutterUndefined: Self = StObject.set(x, "tabBarGutter", js.undefined)
      
      @scala.inline
      def setTabBarStyle(value: CSSProperties): Self = StObject.set(x, "tabBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarStyleUndefined: Self = StObject.set(x, "tabBarStyle", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTabPosition(value: TabPosition): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  /* Inlined react.react.WeakValidationMap<rc-tabs.rc-tabs/es/Tabs.TabsProps & react.react.RefAttributes<std.HTMLDivElement>> */
  @js.native
  trait WeakValidationMapTabsProp extends StObject {
    
    var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var activeKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var animated: js.UndefOr[Validator[js.UndefOr[AnimatedConfig | Boolean | Null]]] = js.native
    
    var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.native
    
    var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
    
    var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.native
    
    var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.native
    
    var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.native
    
    var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.native
    
    var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.native
    
    var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
    
    var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-relevant`: js.UndefOr[
        Validator[
          js.UndefOr[
            additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
          ]
        ]
      ] = js.native
    
    var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.native
    
    var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var children: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.native
    
    var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.native
    
    var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Html | Null]]] = js.native
    
    var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var defaultActiveKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
    
    var destroyInactiveTabPane: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var direction: js.UndefOr[Validator[js.UndefOr[ltr | rtl | Null]]] = js.native
    
    var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
    
    var editable: js.UndefOr[Validator[js.UndefOr[EditableConfig | Null]]] = js.native
    
    var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
    
    var inputMode: js.UndefOr[
        Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
      ] = js.native
    
    var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
    
    var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var locale: js.UndefOr[Validator[js.UndefOr[Null | TabsLocale]]] = js.native
    
    var moreIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.native
    
    var moreTransitionName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* activeKey */ String, Unit]) | Null]]] = js.native
    
    var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]] = js.native
    
    var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]]] = js.native
    
    var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]] = js.native
    
    var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onTabClick: js.UndefOr[
        Validator[
          js.UndefOr[
            (js.Function2[
              /* activeKey */ String, 
              SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element], 
              Unit
            ]) | Null
          ]
        ]
      ] = js.native
    
    var onTabScroll: js.UndefOr[Validator[js.UndefOr[Null | OnTabScroll]]] = js.native
    
    var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.native
    
    var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.native
    
    var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.native
    
    var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]] = js.native
    
    var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLDivElement]]]] = js.native
    
    var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]] = js.native
    
    var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLDivElement]]]] = js.native
    
    var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[HTMLDivElement]]]] = js.native
    
    var renderTabBar: js.UndefOr[Validator[js.UndefOr[Null | RenderTabBar]]] = js.native
    
    var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
    
    var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
    
    var tabBarExtraContent: js.UndefOr[Validator[js.UndefOr[Null | TabBarExtraContent]]] = js.native
    
    var tabBarGutter: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var tabBarStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
    
    var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
    
    var tabPosition: js.UndefOr[Validator[js.UndefOr[Null | TabPosition]]] = js.native
    
    var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.native
    
    var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
    
    var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.native
    
    var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  }
  object WeakValidationMapTabsProp {
    
    @scala.inline
    def apply(): WeakValidationMapTabsProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapTabsProp]
    }
    
    @scala.inline
    implicit class WeakValidationMapTabsPropMutableBuilder[Self <: WeakValidationMapTabsProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setActiveKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setAnimated(value: Validator[js.UndefOr[AnimatedConfig | Boolean | Null]]): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list | both | Null]]): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: Validator[
              js.UndefOr[
                additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
              ]
            ]
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other | Null]]): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoSave(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setChildren(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Validator[js.UndefOr[inherit | Booleanish | Null]]): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Validator[js.UndefOr[Html | Null]]): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDatatype(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDestroyInactiveTabPane(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "destroyInactiveTabPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactiveTabPaneUndefined: Self = StObject.set(x, "destroyInactiveTabPane", js.undefined)
      
      @scala.inline
      def setDir(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirection(value: Validator[js.UndefOr[ltr | rtl | Null]]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDraggable(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEditable(value: Validator[js.UndefOr[EditableConfig | Null]]): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setHidden(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLang(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLocale(value: Validator[js.UndefOr[Null | TabsLocale]]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMoreIcon(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "moreIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreIconUndefined: Self = StObject.set(x, "moreIcon", js.undefined)
      
      @scala.inline
      def setMoreTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "moreTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreTransitionNameUndefined: Self = StObject.set(x, "moreTransitionName", js.undefined)
      
      @scala.inline
      def setOnAbort(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: Validator[js.UndefOr[AnimationEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayThrough(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: Validator[js.UndefOr[(js.Function1[/* activeKey */ String, Unit]) | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: Validator[js.UndefOr[CompositionEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEnd(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: Validator[js.UndefOr[DragEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadStart(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: Validator[js.UndefOr[FormEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTabClick(
        value: Validator[
              js.UndefOr[
                (js.Function2[
                  /* activeKey */ String, 
                  SyntheticKeyboardEvent[Element] | SyntheticMouseEvent[Element], 
                  Unit
                ]) | Null
              ]
            ]
      ): Self = StObject.set(x, "onTabClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      @scala.inline
      def setOnTabScroll(value: Validator[js.UndefOr[Null | OnTabScroll]]): Self = StObject.set(x, "onTabScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTabScrollUndefined: Self = StObject.set(x, "onTabScroll", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: Validator[js.UndefOr[Null | WheelEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setRef(value: Validator[js.UndefOr[Null | Ref[HTMLDivElement]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRenderTabBar(value: Validator[js.UndefOr[Null | RenderTabBar]]): Self = StObject.set(x, "renderTabBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      @scala.inline
      def setResource(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabBarExtraContent(value: Validator[js.UndefOr[Null | TabBarExtraContent]]): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      @scala.inline
      def setTabBarGutter(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tabBarGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarGutterUndefined: Self = StObject.set(x, "tabBarGutter", js.undefined)
      
      @scala.inline
      def setTabBarStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "tabBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarStyleUndefined: Self = StObject.set(x, "tabBarStyle", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTabPosition(value: Validator[js.UndefOr[Null | TabPosition]]): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
      
      @scala.inline
      def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: Validator[js.UndefOr[yes | no | Null]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: Validator[js.UndefOr[on | off | Null]]): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setVocab(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Width {
    
    @scala.inline
    def apply(height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  tabs :std.Array<rc-tabs.rc-tabs/es/interface.Tab>} & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
  @js.native
  trait tabsArrayTabTabNavListPro extends StObject {
    
    var activeKey: String = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var extra: js.UndefOr[TabBarExtraContent] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[ReactElement] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(activeKey: Key, e: SyntheticKeyboardEvent[Element]): Unit = js.native
    def onTabClick(activeKey: Key, e: SyntheticMouseEvent[Element]): Unit = js.native
    
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    
    var panes: ReactElement = js.native
    
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
}
