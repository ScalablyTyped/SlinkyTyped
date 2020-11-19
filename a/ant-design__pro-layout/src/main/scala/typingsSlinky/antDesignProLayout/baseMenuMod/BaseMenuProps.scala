package typingsSlinky.antDesignProLayout.baseMenuMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typingsSlinky.antDesignProLayout.anon.Pathname
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`additions text`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`inline`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.additions
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.all
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.ascending
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.assertive
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.both
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.copy
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.date
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.decimal
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.descending
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.dialog
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.email
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.execute
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.grammar
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.grid
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.horizontal
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.inherit
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.link
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.list
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.listbox
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.location
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.ltr
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.menu
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mixed
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.move
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.no
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.none
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.numeric
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.off
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.on
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.other
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.page
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.polite
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.popup
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.removals
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.rtl
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.search
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.side
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.spelling
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.step
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.tel
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.text
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.time
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.top
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.tree
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.url
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.vertical
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.yes
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.Route
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.antd.menuMod.MenuMode
import typingsSlinky.antd.menuMod.MenuProps
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.rcMenu.anon.PartialkeyinMenuModeother
import typingsSlinky.rcMenu.interfaceMod.BuiltinPlacements
import typingsSlinky.rcMenu.interfaceMod.DestroyEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.interfaceMod.OpenAnimation
import typingsSlinky.rcMenu.interfaceMod.RenderIconType
import typingsSlinky.rcMenu.interfaceMod.SelectEventHandler
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.rcMenu.interfaceMod.TriggerSubMenuAction
import typingsSlinky.rcTrigger.interfaceMod.MotionType
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
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>> */
/* Inlined parent std.Omit<antd.antd/lib/menu.MenuProps, 'openKeys' | 'onOpenChange'> */
/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.PureSettings> */
@js.native
trait BaseMenuProps extends js.Object {
  
  var about: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
  var activeKey: js.UndefOr[String] = js.native
  
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
  
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  
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
  
  var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var collapsedWidth: js.UndefOr[String | Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var colorWeak: js.UndefOr[Boolean] = js.native
  
  var computedMatch: js.UndefOr[`match`[Route]] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contentWidth: js.UndefOr[ContentWidth] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultActiveFirst: js.UndefOr[Boolean] = js.native
  
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.native
  
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.native
  
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var expandIcon: js.UndefOr[RenderIconType] = js.native
  
  var fixSiderbar: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var forceSubMenuRender: js.UndefOr[Boolean] = js.native
  
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  
  var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var history: js.UndefOr[History[LocationState]] = js.native
  
  var iconfontUrl: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inlineCollapsed: js.UndefOr[Boolean] = js.native
  
  var inlineIndent: js.UndefOr[Double] = js.native
  
  var inlist: js.UndefOr[js.Any] = js.native
  
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var isMobile: js.UndefOr[Boolean] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemIcon: js.UndefOr[RenderIconType] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[side | top | mix] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Location[LocationState] | Pathname] = js.native
  
  var `match`: js.UndefOr[typingsSlinky.reactRouter.mod.`match`[js.Object]] = js.native
  
  var menu: js.UndefOr[DefaultOpenAll] = js.native
  
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.native
  
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement, ReactElement]
    ]
  ] = js.native
  
  /**
    * 要给菜单的props, 参考antd-menu的属性。https://ant.design/components/menu-cn/
    */
  var menuProps: js.UndefOr[MenuProps] = js.native
  
  var mode: js.UndefOr[MenuMode] = js.native
  
  var motion: js.UndefOr[MotionType] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onClick: js.UndefOr[MenuClickEventHandler] = js.native
  
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  
  var onDeselect: js.UndefOr[SelectEventHandler] = js.native
  
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.native
  
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
  
  var onSelect: js.UndefOr[SelectEventHandler] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
  
  var openAnimation: js.UndefOr[OpenAnimation] = js.native
  
  var openKeys: js.UndefOr[WithFalse[js.Array[String]]] = js.native
  
  var openTransitionName: js.UndefOr[String] = js.native
  
  var overflowedIndicator: js.UndefOr[ReactElement] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var postMenuData: js.UndefOr[
    js.Function1[/* menusData */ js.UndefOr[js.Array[MenuDataItem]], js.Array[MenuDataItem]]
  ] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var route: js.UndefOr[Route] = js.native
  
  var security: js.UndefOr[String] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var selectedKeys: js.UndefOr[js.Array[String]] = js.native
  
  var siderCollapsed: js.UndefOr[Boolean] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var splitMenus: js.UndefOr[Boolean] = js.native
  
  var staticContext: js.UndefOr[StaticContext] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subMenuCloseDelay: js.UndefOr[Double] = js.native
  
  var subMenuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement, ReactElement]
    ]
  ] = js.native
  
  var subMenuOpenDelay: js.UndefOr[Double] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[MenuTheme] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var vocab: js.UndefOr[String] = js.native
}
object BaseMenuProps {
  
  @scala.inline
  def apply(): BaseMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuProps]
  }
  
  @scala.inline
  implicit class BaseMenuPropsOps[Self <: BaseMenuProps] (val x: Self) extends AnyVal {
    
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
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def setActiveKey(value: String): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setBuiltinPlacements(value: BuiltinPlacements): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsedWidth(value: String | Double): Self = this.set("collapsedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedWidth: Self = this.set("collapsedWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorWeak(value: Boolean): Self = this.set("colorWeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorWeak: Self = this.set("colorWeak", js.undefined)
    
    @scala.inline
    def setComputedMatch(value: `match`[Route]): Self = this.set("computedMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputedMatch: Self = this.set("computedMatch", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    
    @scala.inline
    def setContentWidth(value: ContentWidth): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentWidth: Self = this.set("contentWidth", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    
    @scala.inline
    def setDefaultActiveFirst(value: Boolean): Self = this.set("defaultActiveFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveFirst: Self = this.set("defaultActiveFirst", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultMotions(value: PartialkeyinMenuModeother): Self = this.set("defaultMotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMotions: Self = this.set("defaultMotions", js.undefined)
    
    @scala.inline
    def setDefaultOpenKeysVarargs(value: String*): Self = this.set("defaultOpenKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultOpenKeys(value: js.Array[String]): Self = this.set("defaultOpenKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpenKeys: Self = this.set("defaultOpenKeys", js.undefined)
    
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: String*): Self = this.set("defaultSelectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[String]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelectedKeys: Self = this.set("defaultSelectedKeys", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setExpandIconReactElement(value: ReactElement): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconFunction1(value: /* props */ js.Any => ReactElement): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandIcon(value: RenderIconType): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    
    @scala.inline
    def setFixSiderbar(value: Boolean): Self = this.set("fixSiderbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixSiderbar: Self = this.set("fixSiderbar", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setForceSubMenuRender(value: Boolean): Self = this.set("forceSubMenuRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSubMenuRender: Self = this.set("forceSubMenuRender", js.undefined)
    
    @scala.inline
    def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatMessage: Self = this.set("formatMessage", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setHandleOpenChange(value: /* openKeys */ js.Array[String] => Unit): Self = this.set("handleOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleOpenChange: Self = this.set("handleOpenChange", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setIconfontUrl(value: String): Self = this.set("iconfontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconfontUrl: Self = this.set("iconfontUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInlineCollapsed(value: Boolean): Self = this.set("inlineCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineCollapsed: Self = this.set("inlineCollapsed", js.undefined)
    
    @scala.inline
    def setInlineIndent(value: Double): Self = this.set("inlineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineIndent: Self = this.set("inlineIndent", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    
    @scala.inline
    def setItemIconReactElement(value: ReactElement): Self = this.set("itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIconFunction1(value: /* props */ js.Any => ReactElement): Self = this.set("itemIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemIcon(value: RenderIconType): Self = this.set("itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemIcon: Self = this.set("itemIcon", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLayout(value: side | top | mix): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState] | Pathname): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMatch(value: `match`[js.Object]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setMenu(value: DefaultOpenAll): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMenuDataVarargs(value: MenuDataItem*): Self = this.set("menuData", js.Array(value :_*))
    
    @scala.inline
    def setMenuData(value: js.Array[MenuDataItem]): Self = this.set("menuData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuData: Self = this.set("menuData", js.undefined)
    
    @scala.inline
    def setMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement) => ReactElement): Self = this.set("menuItemRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement, ReactElement]
        ]
    ): Self = this.set("menuItemRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItemRender: Self = this.set("menuItemRender", js.undefined)
    
    @scala.inline
    def setMenuProps(value: MenuProps): Self = this.set("menuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuProps: Self = this.set("menuProps", js.undefined)
    
    @scala.inline
    def setMode(value: MenuMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMotion(value: MotionType): Self = this.set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setNavTheme(value: MenuTheme | realDark): Self = this.set("navTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavTheme: Self = this.set("navTheme", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* info */ MenuInfo => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnDeselect(value: /* info */ SelectInfo => Unit): Self = this.set("onDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    
    @scala.inline
    def setOnDestroy(value: /* key */ Key => Unit): Self = this.set("onDestroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDestroy: Self = this.set("onDestroy", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* info */ SelectInfo => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOpenAnimation(value: OpenAnimation): Self = this.set("openAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenAnimation: Self = this.set("openAnimation", js.undefined)
    
    @scala.inline
    def setOpenKeysVarargs(value: String*): Self = this.set("openKeys", js.Array(value :_*))
    
    @scala.inline
    def setOpenKeys(value: WithFalse[js.Array[String]]): Self = this.set("openKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenKeys: Self = this.set("openKeys", js.undefined)
    
    @scala.inline
    def setOpenTransitionName(value: String): Self = this.set("openTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenTransitionName: Self = this.set("openTransitionName", js.undefined)
    
    @scala.inline
    def setOverflowedIndicatorReactElement(value: ReactElement): Self = this.set("overflowedIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowedIndicator(value: ReactElement): Self = this.set("overflowedIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowedIndicator: Self = this.set("overflowedIndicator", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPostMenuData(value: /* menusData */ js.UndefOr[js.Array[MenuDataItem]] => js.Array[MenuDataItem]): Self = this.set("postMenuData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostMenuData: Self = this.set("postMenuData", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRoute(value: Route): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSelectedKeysVarargs(value: String*): Self = this.set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedKeys(value: js.Array[String]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    
    @scala.inline
    def setSiderCollapsed(value: Boolean): Self = this.set("siderCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiderCollapsed: Self = this.set("siderCollapsed", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setSplitMenus(value: Boolean): Self = this.set("splitMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitMenus: Self = this.set("splitMenus", js.undefined)
    
    @scala.inline
    def setStaticContext(value: StaticContext): Self = this.set("staticContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticContext: Self = this.set("staticContext", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubMenuCloseDelay(value: Double): Self = this.set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuCloseDelay: Self = this.set("subMenuCloseDelay", js.undefined)
    
    @scala.inline
    def setSubMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement) => ReactElement): Self = this.set("subMenuItemRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement, ReactElement]
        ]
    ): Self = this.set("subMenuItemRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuItemRender: Self = this.set("subMenuItemRender", js.undefined)
    
    @scala.inline
    def setSubMenuOpenDelay(value: Double): Self = this.set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuOpenDelay: Self = this.set("subMenuOpenDelay", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTheme(value: MenuTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = this.set("triggerSubMenuAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerSubMenuAction: Self = this.set("triggerSubMenuAction", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
  }
}
