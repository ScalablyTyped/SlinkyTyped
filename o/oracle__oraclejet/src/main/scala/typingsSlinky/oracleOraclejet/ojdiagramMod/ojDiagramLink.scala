package typingsSlinky.oracleOraclejet.ojdiagramMod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.oracleOraclejet.mod.JetElement
import typingsSlinky.oracleOraclejet.mod.JetSetPropertyType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.abort
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationcancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationiteration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.animationstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auxclick
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.blur
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.canplay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.canplaythrough
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.categories
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.categoriesChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.change
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.click
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.color
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.contextmenu
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.copy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cuechange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cut
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dblclick
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drag
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragexit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragleave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dragstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drop
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.durationchange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.emptied
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.endConnectorType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.endConnectorTypeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.endNode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.endNodeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ended
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.error
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusin
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fullscreenchange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fullscreenerror
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.gotpointercapture
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.input
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keydown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keypress
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.keyup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.label
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.load
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadeddata
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadedmetadata
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lostpointercapture
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mousedown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseleave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mousemove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.mouseup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.paste
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pause
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.play
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.playing
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointercancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerdown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerleave
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointermove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerout
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerover
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pointerup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.progress
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ratechange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.reset
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.resize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.securitypolicyviolation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seeked
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seeking
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.select
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectableChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectionchange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.shortDescChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stalled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startConnectorType
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startConnectorTypeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startNode
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startNodeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.submit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.suspend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.timeupdate
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.toggle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchcancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchmove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.touchstart_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitioncancel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitionend
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitionrun
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transitionstart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.volumechange
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.waiting
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.wheel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.width
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.widthChanged
import typingsSlinky.std.Event_
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDiagramLink extends JetElement[ojDiagramLinkSettableProperties] {
  var categories: js.Array[String] = js.native
  var color: js.UndefOr[String] = js.native
  var endConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.native
  var endNode: js.Any = js.native
  var label: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[js.Object | Null] = js.native
  var onCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEndConnectorTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEndNodeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectableChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onShortDescChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStartConnectorTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStartNodeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onWidthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var selectable: js.UndefOr[auto | off] = js.native
  var shortDesc: js.UndefOr[String] = js.native
  var startConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.native
  var startNode: js.Any = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var width: js.UndefOr[Double] = js.native
  def addEventListener(
    `type`: endConnectorTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: endConnectorTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: endNodeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: endNodeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectableChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: selectableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: startConnectorTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: startConnectorTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: startNodeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: startNodeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(`type`: categoriesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: categoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(`type`: colorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(`type`: labelChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(`type`: labelStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: labelStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(`type`: shortDescChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: shortDescChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(`type`: svgClassNameChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(`type`: svgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(`type`: touchstart_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_widthChanged(`type`: widthChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_widthChanged(
    `type`: widthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getProperty(property: String): js.Any = js.native
  @JSName("getProperty")
  def getProperty_categories(property: categories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_endConnectorType(property: endConnectorType): js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.native
  @JSName("getProperty")
  def getProperty_endNode(property: endNode): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['endNode'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_labelStyle(property: labelStyle): js.UndefOr[js.Object | Null] = js.native
  @JSName("getProperty")
  def getProperty_selectable(property: selectable): js.UndefOr[auto | off] = js.native
  @JSName("getProperty")
  def getProperty_shortDesc(property: shortDesc): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_startConnectorType(property: startConnectorType): js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.native
  @JSName("getProperty")
  def getProperty_startNode(property: startNode): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['startNode'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_width(property: width): js.UndefOr[Double] = js.native
  def setProperties(properties: ojDiagramLinkSettablePropertiesLenient): Unit = js.native
  def setProperty(property: endConnectorType, value: arrow): Unit = js.native
  def setProperty(property: endConnectorType, value: arrowConcave): Unit = js.native
  def setProperty(property: endConnectorType, value: arrowOpen): Unit = js.native
  def setProperty(property: endConnectorType, value: circle): Unit = js.native
  def setProperty(property: endConnectorType, value: none): Unit = js.native
  def setProperty(property: endConnectorType, value: rectangle): Unit = js.native
  def setProperty(property: endConnectorType, value: rectangleRounded): Unit = js.native
  def setProperty(property: selectable, value: auto): Unit = js.native
  def setProperty(property: selectable, value: off): Unit = js.native
  def setProperty(property: startConnectorType, value: arrow): Unit = js.native
  def setProperty(property: startConnectorType, value: arrowConcave): Unit = js.native
  def setProperty(property: startConnectorType, value: arrowOpen): Unit = js.native
  def setProperty(property: startConnectorType, value: circle): Unit = js.native
  def setProperty(property: startConnectorType, value: none): Unit = js.native
  def setProperty(property: startConnectorType, value: rectangle): Unit = js.native
  def setProperty(property: startConnectorType, value: rectangleRounded): Unit = js.native
  def setProperty[T /* <: String */](property: T, value: JetSetPropertyType[T, ojDiagramLinkSettableProperties]): Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(property: categories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_endNode(property: endNode, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: labelStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: labelStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: shortDesc, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_startNode(property: startNode, value: js.Any): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_width(property: width, value: Double): Unit = js.native
}

