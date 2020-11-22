package typingsSlinky.konva.nodeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.konva.anon.Callback
import typingsSlinky.konva.anon.DrawBorder
import typingsSlinky.konva.anon.Handler
import typingsSlinky.konva.anon.HeightWidth
import typingsSlinky.konva.anon.MimeType
import typingsSlinky.konva.anon.OffsetX
import typingsSlinky.konva.anon.RelativeTo
import typingsSlinky.konva.anon.Width
import typingsSlinky.konva.anon.X
import typingsSlinky.konva.canvasMod.Canvas
import typingsSlinky.konva.canvasMod.SceneCanvas
import typingsSlinky.konva.containerMod.Container
import typingsSlinky.konva.contextMod.Context
import typingsSlinky.konva.konvaStrings.abort
import typingsSlinky.konva.konvaStrings.animationcancel
import typingsSlinky.konva.konvaStrings.animationend
import typingsSlinky.konva.konvaStrings.animationiteration
import typingsSlinky.konva.konvaStrings.animationstart
import typingsSlinky.konva.konvaStrings.auxclick
import typingsSlinky.konva.konvaStrings.blur
import typingsSlinky.konva.konvaStrings.cancel
import typingsSlinky.konva.konvaStrings.canplay
import typingsSlinky.konva.konvaStrings.canplaythrough
import typingsSlinky.konva.konvaStrings.change
import typingsSlinky.konva.konvaStrings.click
import typingsSlinky.konva.konvaStrings.close
import typingsSlinky.konva.konvaStrings.contextmenu
import typingsSlinky.konva.konvaStrings.cuechange
import typingsSlinky.konva.konvaStrings.dblclick
import typingsSlinky.konva.konvaStrings.drag
import typingsSlinky.konva.konvaStrings.dragend
import typingsSlinky.konva.konvaStrings.dragenter
import typingsSlinky.konva.konvaStrings.dragexit
import typingsSlinky.konva.konvaStrings.dragleave
import typingsSlinky.konva.konvaStrings.dragover
import typingsSlinky.konva.konvaStrings.dragstart
import typingsSlinky.konva.konvaStrings.drop
import typingsSlinky.konva.konvaStrings.durationchange
import typingsSlinky.konva.konvaStrings.emptied
import typingsSlinky.konva.konvaStrings.ended
import typingsSlinky.konva.konvaStrings.error
import typingsSlinky.konva.konvaStrings.focus
import typingsSlinky.konva.konvaStrings.focusin
import typingsSlinky.konva.konvaStrings.focusout
import typingsSlinky.konva.konvaStrings.gotpointercapture
import typingsSlinky.konva.konvaStrings.input
import typingsSlinky.konva.konvaStrings.invalid
import typingsSlinky.konva.konvaStrings.keydown
import typingsSlinky.konva.konvaStrings.keypress
import typingsSlinky.konva.konvaStrings.keyup
import typingsSlinky.konva.konvaStrings.load
import typingsSlinky.konva.konvaStrings.loadeddata
import typingsSlinky.konva.konvaStrings.loadedmetadata
import typingsSlinky.konva.konvaStrings.loadstart
import typingsSlinky.konva.konvaStrings.lostpointercapture
import typingsSlinky.konva.konvaStrings.mousedown
import typingsSlinky.konva.konvaStrings.mouseenter
import typingsSlinky.konva.konvaStrings.mouseleave
import typingsSlinky.konva.konvaStrings.mousemove
import typingsSlinky.konva.konvaStrings.mouseout
import typingsSlinky.konva.konvaStrings.mouseover
import typingsSlinky.konva.konvaStrings.mouseup
import typingsSlinky.konva.konvaStrings.pause
import typingsSlinky.konva.konvaStrings.play
import typingsSlinky.konva.konvaStrings.playing
import typingsSlinky.konva.konvaStrings.pointercancel
import typingsSlinky.konva.konvaStrings.pointerdown
import typingsSlinky.konva.konvaStrings.pointerenter
import typingsSlinky.konva.konvaStrings.pointerleave
import typingsSlinky.konva.konvaStrings.pointermove
import typingsSlinky.konva.konvaStrings.pointerout
import typingsSlinky.konva.konvaStrings.pointerover
import typingsSlinky.konva.konvaStrings.pointerup
import typingsSlinky.konva.konvaStrings.progress
import typingsSlinky.konva.konvaStrings.ratechange
import typingsSlinky.konva.konvaStrings.reset
import typingsSlinky.konva.konvaStrings.resize
import typingsSlinky.konva.konvaStrings.scroll
import typingsSlinky.konva.konvaStrings.securitypolicyviolation
import typingsSlinky.konva.konvaStrings.seeked
import typingsSlinky.konva.konvaStrings.seeking
import typingsSlinky.konva.konvaStrings.select
import typingsSlinky.konva.konvaStrings.selectionchange
import typingsSlinky.konva.konvaStrings.selectstart
import typingsSlinky.konva.konvaStrings.stalled
import typingsSlinky.konva.konvaStrings.submit
import typingsSlinky.konva.konvaStrings.suspend
import typingsSlinky.konva.konvaStrings.timeupdate
import typingsSlinky.konva.konvaStrings.toggle
import typingsSlinky.konva.konvaStrings.touchcancel
import typingsSlinky.konva.konvaStrings.touchend
import typingsSlinky.konva.konvaStrings.touchmove
import typingsSlinky.konva.konvaStrings.touchstart
import typingsSlinky.konva.konvaStrings.transitioncancel
import typingsSlinky.konva.konvaStrings.transitionend
import typingsSlinky.konva.konvaStrings.transitionrun
import typingsSlinky.konva.konvaStrings.transitionstart
import typingsSlinky.konva.konvaStrings.volumechange
import typingsSlinky.konva.konvaStrings.waiting
import typingsSlinky.konva.konvaStrings.wheel
import typingsSlinky.konva.layerMod.Layer
import typingsSlinky.konva.stageMod.Stage
import typingsSlinky.konva.typesMod.GetSet
import typingsSlinky.konva.typesMod.IRect
import typingsSlinky.konva.typesMod.Vector2d
import typingsSlinky.konva.utilMod.Collection
import typingsSlinky.konva.utilMod.Transform
import typingsSlinky.std.Map
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Node", "Node")
@js.native
abstract class Node[Config /* <: NodeConfig */] () extends js.Object {
  def this(config: Config) = this()
  
  var _allEventListeners: Null | js.Array[js.Function] = js.native
  
  var _attachedDepsListeners: Map[String, Boolean] = js.native
  
  var _attrsAffectingSize: js.Array[String] = js.native
  
  def _batchTransformChanges(func: js.Any): Unit = js.native
  
  var _batchingTransformChange: Boolean = js.native
  
  var _cache: Map[String, _] = js.native
  
  def _calculate(name: js.Any, deps: js.Any, getter: js.Any): js.Any = js.native
  
  def _clearCache(): Unit = js.native
  def _clearCache(attr: String): Unit = js.native
  
  def _clearCaches(): Unit = js.native
  
  def _clearSelfAndDescendantCache(): Unit = js.native
  def _clearSelfAndDescendantCache(attr: js.UndefOr[scala.Nothing], forceEvent: Boolean): Unit = js.native
  def _clearSelfAndDescendantCache(attr: String): Unit = js.native
  def _clearSelfAndDescendantCache(attr: String, forceEvent: Boolean): Unit = js.native
  
  def _clearTransform(): OffsetX = js.native
  
  def _createDragElement(evt: js.Any): Unit = js.native
  
  def _delegate(event: String, selector: String, handler: js.Function1[/* e */ Event, Unit]): Unit = js.native
  
  def _dragChange(): Unit = js.native
  
  def _dragCleanup(): Unit = js.native
  
  var _dragEventId: Double | Null = js.native
  
  def _drawCachedHitCanvas(context: Context): Unit = js.native
  
  def _drawCachedSceneCanvas(context: Context): Unit = js.native
  
  def _eachAncestorReverse(func: js.Any, top: js.Any): Unit = js.native
  
  var _filterUpToDate: Boolean = js.native
  
  def _fire(eventType: js.Any, evt: js.Any): Unit = js.native
  
  def _fireAndBubble(eventType: js.Any, evt: js.Any): Unit = js.native
  def _fireAndBubble(eventType: js.Any, evt: js.Any, compareShape: js.Any): Unit = js.native
  
  def _fireChangeEvent(attr: js.Any, oldVal: js.Any, newVal: js.Any): Unit = js.native
  
  def _getAbsoluteOpacity(): Double = js.native
  
  def _getAbsoluteTransform(): Transform = js.native
  def _getAbsoluteTransform(top: Node[NodeConfig]): Transform = js.native
  
  def _getCache(attr: String, privateGetter: js.Function): js.Any = js.native
  
  def _getCachedSceneCanvas(): js.Any = js.native
  
  def _getCanvasCache(): js.Any = js.native
  
  def _getProtoListeners(eventType: js.Any): js.Any = js.native
  
  def _getStage(): js.UndefOr[Stage] = js.native
  
  def _getTransform(): Transform = js.native
  
  var _id: Double = js.native
  
  def _isListening(): js.Any = js.native
  def _isListening(relativeTo: Node[NodeConfig]): js.Any = js.native
  
  def _isMatch(selector: js.Any): js.Any = js.native
  
  var _isUnderCache: Boolean = js.native
  
  def _isVisible(relativeTo: js.Any): js.Any = js.native
  
  var _lastPos: Vector2d = js.native
  
  def _listenDrag(): Unit = js.native
  
  var _needClearTransformCache: Boolean = js.native
  
  def _off(`type`: js.Any): Unit = js.native
  def _off(`type`: js.Any, name: js.UndefOr[scala.Nothing], callback: js.Any): Unit = js.native
  def _off(`type`: js.Any, name: js.Any): Unit = js.native
  def _off(`type`: js.Any, name: js.Any, callback: js.Any): Unit = js.native
  
  def _remove(): Unit = js.native
  
  def _setAttr(key: js.Any, `val`: js.Any): Unit = js.native
  def _setAttr(key: js.Any, `val`: js.Any, skipFire: Boolean): Unit = js.native
  
  def _setComponentAttr(key: js.Any, component: js.Any, `val`: js.Any): Unit = js.native
  
  def _setDragPosition(evt: js.Any, elem: js.Any): Unit = js.native
  
  def _setTransform(trans: js.Any): Unit = js.native
  
  var _shouldFireChangeEvents: Boolean = js.native
  
  def _toKonvaCanvas(config: js.Any): SceneCanvas = js.native
  
  def _transformedRect(rect: IRect, top: Node[NodeConfig]): Width = js.native
  
  def absolutePosition(): Vector2d = js.native
  def absolutePosition(v: Vector2d): this.type = js.native
  @JSName("absolutePosition")
  var absolutePosition_Original: GetSet[Vector2d, this.type] = js.native
  
  def addEventListener(`type`: String, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
  
  def addName(name: js.Any): this.type = js.native
  
  def alpha(): Double = js.native
  def alpha(v: Double): this.type = js.native
  @JSName("alpha")
  var alpha_Original: GetSet[Double, this.type] = js.native
  
  var attrs: js.Any = js.native
  
  def blue(): Double = js.native
  def blue(v: Double): this.type = js.native
  @JSName("blue")
  var blue_Original: GetSet[Double, this.type] = js.native
  
  def blurRadius(): Double = js.native
  def blurRadius(v: Double): this.type = js.native
  @JSName("blurRadius")
  var blurRadius_Original: GetSet[Double, this.type] = js.native
  
  def brightness(): Double = js.native
  def brightness(v: Double): this.type = js.native
  @JSName("brightness")
  var brightness_Original: GetSet[Double, this.type] = js.native
  
  def cache(): this.type = js.native
  def cache(config: DrawBorder): this.type = js.native
  
  var children: Collection[_] = js.native
  
  var className: String = js.native
  
  def clearCache(): this.type = js.native
  
  def clone(obj: js.Any): js.Any = js.native
  
  def contrast(): Double = js.native
  def contrast(v: Double): this.type = js.native
  @JSName("contrast")
  var contrast_Original: GetSet[Double, this.type] = js.native
  
  def destroy(): this.type = js.native
  
  def dispatchEvent(evt: js.Any): this.type = js.native
  
  def dragBoundFunc(): js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d] = js.native
  def dragBoundFunc(v: js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d]): this.type = js.native
  @JSName("dragBoundFunc")
  var dragBoundFunc_Original: GetSet[
    js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d], 
    this.type
  ] = js.native
  
  def dragDistance(): Double = js.native
  def dragDistance(v: Double): this.type = js.native
  @JSName("dragDistance")
  var dragDistance_Original: GetSet[Double, this.type] = js.native
  
  def draggable(): Boolean = js.native
  def draggable(v: Boolean): this.type = js.native
  @JSName("draggable")
  var draggable_Original: GetSet[Boolean, this.type] = js.native
  
  def draw(): this.type = js.native
  
  def drawHit(): Unit = js.native
  def drawHit(canvas: js.UndefOr[scala.Nothing], top: Node[NodeConfig]): Unit = js.native
  def drawHit(canvas: Canvas): Unit = js.native
  def drawHit(canvas: Canvas, top: Node[NodeConfig]): Unit = js.native
  
  def drawScene(): Unit = js.native
  def drawScene(canvas: js.UndefOr[scala.Nothing], top: Node[NodeConfig]): Unit = js.native
  def drawScene(canvas: Canvas): Unit = js.native
  def drawScene(canvas: Canvas, top: Node[NodeConfig]): Unit = js.native
  
  def embossBlend(): Boolean = js.native
  def embossBlend(v: Boolean): this.type = js.native
  @JSName("embossBlend")
  var embossBlend_Original: GetSet[Boolean, this.type] = js.native
  
  def embossDirection(): String = js.native
  def embossDirection(v: String): this.type = js.native
  @JSName("embossDirection")
  var embossDirection_Original: GetSet[String, this.type] = js.native
  
  def embossStrength(): Double = js.native
  def embossStrength(v: Double): this.type = js.native
  @JSName("embossStrength")
  var embossStrength_Original: GetSet[Double, this.type] = js.native
  
  def embossWhiteLevel(): Double = js.native
  def embossWhiteLevel(v: Double): this.type = js.native
  @JSName("embossWhiteLevel")
  var embossWhiteLevel_Original: GetSet[Double, this.type] = js.native
  
  def enhance(): Double = js.native
  def enhance(v: Double): this.type = js.native
  @JSName("enhance")
  var enhance_Original: GetSet[Double, this.type] = js.native
  
  var eventListeners: StringDictionary[js.Array[Handler]] = js.native
  
  def filters(): js.Array[Filter] = js.native
  def filters(v: js.Array[Filter]): this.type = js.native
  @JSName("filters")
  var filters_Original: GetSet[js.Array[Filter], this.type] = js.native
  
  def findAncestor(selector: js.Any): Node[NodeConfig] = js.native
  def findAncestor(selector: js.Any, includeSelf: js.UndefOr[scala.Nothing], stopNode: js.Any): Node[NodeConfig] = js.native
  def findAncestor(selector: js.Any, includeSelf: js.Any): Node[NodeConfig] = js.native
  def findAncestor(selector: js.Any, includeSelf: js.Any, stopNode: js.Any): Node[NodeConfig] = js.native
  
  def findAncestors(selector: js.Any): js.Array[Node[NodeConfig]] = js.native
  def findAncestors(selector: js.Any, includeSelf: js.UndefOr[scala.Nothing], stopNode: js.Any): js.Array[Node[NodeConfig]] = js.native
  def findAncestors(selector: js.Any, includeSelf: js.Any): js.Array[Node[NodeConfig]] = js.native
  def findAncestors(selector: js.Any, includeSelf: js.Any, stopNode: js.Any): js.Array[Node[NodeConfig]] = js.native
  
  def fire(eventType: js.Any): this.type = js.native
  def fire(eventType: js.Any, evt: js.UndefOr[scala.Nothing], bubble: js.Any): this.type = js.native
  def fire(eventType: js.Any, evt: js.Any): this.type = js.native
  def fire(eventType: js.Any, evt: js.Any, bubble: js.Any): this.type = js.native
  
  def getAbsoluteOpacity(): js.Any = js.native
  
  def getAbsolutePosition(): X = js.native
  def getAbsolutePosition(top: js.Any): X = js.native
  
  def getAbsoluteRotation(): Double = js.native
  
  def getAbsoluteScale(): X = js.native
  def getAbsoluteScale(top: js.Any): X = js.native
  
  def getAbsoluteTransform(): Transform = js.native
  def getAbsoluteTransform(top: Node[NodeConfig]): Transform = js.native
  
  def getAbsoluteZIndex(): Double = js.native
  
  def getAncestors(): Collection[Node[NodeConfig]] = js.native
  
  def getAttr(attr: String): js.Any = js.native
  
  def getAttrs(): js.Any = js.native
  
  def getChildren(): Collection[_] = js.native
  
  def getClassName(): String = js.native
  
  def getClientRect(): Width = js.native
  def getClientRect(config: RelativeTo): Width = js.native
  
  def getDepth(): Double = js.native
  
  def getDragDistance(): js.Any = js.native
  
  def getLayer(): Layer | Null = js.native
  
  def getParent(): Container[Node[NodeConfig]] = js.native
  
  def getPosition(): X = js.native
  
  def getSize(): HeightWidth = js.native
  
  def getStage(): Stage | Null = js.native
  
  def getTransform(): Transform = js.native
  
  def getType(): String = js.native
  
  def getZIndex(): Double = js.native
  
  def globalCompositeOperation(): globalCompositeOperationType = js.native
  def globalCompositeOperation(v: globalCompositeOperationType): this.type = js.native
  @JSName("globalCompositeOperation")
  var globalCompositeOperation_Original: GetSet[globalCompositeOperationType, this.type] = js.native
  
  def green(): Double = js.native
  def green(v: Double): this.type = js.native
  @JSName("green")
  var green_Original: GetSet[Double, this.type] = js.native
  
  def hasChildren(): Boolean = js.native
  
  def hasName(name: js.Any): Boolean = js.native
  
  def height(): Double = js.native
  def height(v: Double): this.type = js.native
  @JSName("height")
  var height_Original: GetSet[Double, this.type] = js.native
  
  def hide(): this.type = js.native
  
  def hue(): Double = js.native
  def hue(v: Double): this.type = js.native
  @JSName("hue")
  var hue_Original: GetSet[Double, this.type] = js.native
  
  def id(): String = js.native
  def id(v: String): this.type = js.native
  @JSName("id")
  var id_Original: GetSet[String, this.type] = js.native
  
  var index: Double = js.native
  
  def isAncestorOf(node: js.Any): Boolean = js.native
  
  def isCached(): Boolean = js.native
  
  def isDragging(): Boolean = js.native
  
  def isListening(): js.Any = js.native
  
  def isVisible(): js.Any = js.native
  
  def kaleidoscopeAngle(): Double = js.native
  def kaleidoscopeAngle(v: Double): this.type = js.native
  @JSName("kaleidoscopeAngle")
  var kaleidoscopeAngle_Original: GetSet[Double, this.type] = js.native
  
  def kaleidoscopePower(): Double = js.native
  def kaleidoscopePower(v: Double): this.type = js.native
  @JSName("kaleidoscopePower")
  var kaleidoscopePower_Original: GetSet[Double, this.type] = js.native
  
  def levels(): Double = js.native
  def levels(v: Double): this.type = js.native
  @JSName("levels")
  var levels_Original: GetSet[Double, this.type] = js.native
  
  def listening(): Boolean = js.native
  def listening(v: Boolean): this.type = js.native
  @JSName("listening")
  var listening_Original: GetSet[Boolean, this.type] = js.native
  
  def luminance(): Double = js.native
  def luminance(v: Double): this.type = js.native
  @JSName("luminance")
  var luminance_Original: GetSet[Double, this.type] = js.native
  
  def move(change: js.Any): this.type = js.native
  
  def moveDown(): Boolean = js.native
  
  def moveTo(newContainer: js.Any): this.type = js.native
  
  def moveToBottom(): Boolean = js.native
  
  def moveToTop(): Boolean = js.native
  
  def moveUp(): Boolean = js.native
  
  def name(): String = js.native
  def name(v: String): this.type = js.native
  @JSName("name")
  var name_Original: GetSet[String, this.type] = js.native
  
  var nodeType: String = js.native
  
  def noise(): Double = js.native
  def noise(v: Double): this.type = js.native
  @JSName("noise")
  var noise_Original: GetSet[Double, this.type] = js.native
  
  def off(evtStr: String): this.type = js.native
  def off(evtStr: String, callback: js.Function): this.type = js.native
  
  def offset(): Vector2d = js.native
  def offset(v: Vector2d): this.type = js.native
  
  def offsetX(): Double = js.native
  def offsetX(v: Double): this.type = js.native
  @JSName("offsetX")
  var offsetX_Original: GetSet[Double, this.type] = js.native
  
  def offsetY(): Double = js.native
  def offsetY(v: Double): this.type = js.native
  @JSName("offsetY")
  var offsetY_Original: GetSet[Double, this.type] = js.native
  
  @JSName("offset")
  var offset_Original: GetSet[Vector2d, this.type] = js.native
  
  @JSName("on")
  def on_abort(evtStr: abort, handler: KonvaEventListener[this.type, UIEvent]): js.Any = js.native
  @JSName("on")
  def on_animationcancel(evtStr: animationcancel, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
  @JSName("on")
  def on_animationend(evtStr: animationend, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
  @JSName("on")
  def on_animationiteration(evtStr: animationiteration, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
  @JSName("on")
  def on_animationstart(evtStr: animationstart, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
  @JSName("on")
  def on_auxclick(evtStr: auxclick, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_blur(evtStr: blur, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
  @JSName("on")
  def on_cancel(evtStr: cancel, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_canplay(evtStr: canplay, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_canplaythrough(evtStr: canplaythrough, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_change(evtStr: change, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_click(evtStr: click, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_close(evtStr: close, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_contextmenu(evtStr: contextmenu, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_cuechange(evtStr: cuechange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_dblclick(evtStr: dblclick, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_drag(evtStr: drag, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
  @JSName("on")
  def on_dragend(evtStr: dragend, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
  @JSName("on")
  def on_dragenter(evtStr: dragenter, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
  @JSName("on")
  def on_dragexit(evtStr: dragexit, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_dragleave(evtStr: dragleave, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
  @JSName("on")
  def on_dragover(evtStr: dragover, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
  @JSName("on")
  def on_dragstart(evtStr: dragstart, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
  @JSName("on")
  def on_drop(evtStr: drop, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
  @JSName("on")
  def on_durationchange(evtStr: durationchange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_emptied(evtStr: emptied, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_ended(evtStr: ended, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_error(evtStr: error, handler: KonvaEventListener[this.type, ErrorEvent]): js.Any = js.native
  @JSName("on")
  def on_focus(evtStr: focus, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
  @JSName("on")
  def on_focusin(evtStr: focusin, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
  @JSName("on")
  def on_focusout(evtStr: focusout, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
  @JSName("on")
  def on_gotpointercapture(evtStr: gotpointercapture, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_input(evtStr: input, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_invalid(evtStr: invalid, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_keydown(evtStr: keydown, handler: KonvaEventListener[this.type, KeyboardEvent]): js.Any = js.native
  @JSName("on")
  def on_keypress(evtStr: keypress, handler: KonvaEventListener[this.type, KeyboardEvent]): js.Any = js.native
  @JSName("on")
  def on_keyup(evtStr: keyup, handler: KonvaEventListener[this.type, KeyboardEvent]): js.Any = js.native
  @JSName("on")
  def on_load(evtStr: load, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_loadeddata(evtStr: loadeddata, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_loadedmetadata(evtStr: loadedmetadata, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_loadstart(evtStr: loadstart, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_lostpointercapture(evtStr: lostpointercapture, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_mousedown(evtStr: mousedown, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_mouseenter(evtStr: mouseenter, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_mouseleave(evtStr: mouseleave, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_mousemove(evtStr: mousemove, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_mouseout(evtStr: mouseout, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_mouseover(evtStr: mouseover, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_mouseup(evtStr: mouseup, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
  @JSName("on")
  def on_pause(evtStr: pause, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_play(evtStr: play, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_playing(evtStr: playing, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_pointercancel(evtStr: pointercancel, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_pointerdown(evtStr: pointerdown, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_pointerenter(evtStr: pointerenter, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_pointerleave(evtStr: pointerleave, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_pointermove(evtStr: pointermove, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_pointerout(evtStr: pointerout, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_pointerover(evtStr: pointerover, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_pointerup(evtStr: pointerup, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
  @JSName("on")
  def on_progress(evtStr: progress, handler: KonvaEventListener[this.type, ProgressEvent]): js.Any = js.native
  @JSName("on")
  def on_ratechange(evtStr: ratechange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_reset(evtStr: reset, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_resize(evtStr: resize, handler: KonvaEventListener[this.type, UIEvent]): js.Any = js.native
  @JSName("on")
  def on_scroll(evtStr: scroll, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_securitypolicyviolation(
    evtStr: securitypolicyviolation,
    handler: KonvaEventListener[this.type, SecurityPolicyViolationEvent]
  ): js.Any = js.native
  @JSName("on")
  def on_seeked(evtStr: seeked, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_seeking(evtStr: seeking, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_select(evtStr: select, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_selectionchange(evtStr: selectionchange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_selectstart(evtStr: selectstart, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_stalled(evtStr: stalled, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_submit(evtStr: submit, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_suspend(evtStr: suspend, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_timeupdate(evtStr: timeupdate, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_toggle(evtStr: toggle, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_touchcancel(evtStr: touchcancel, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
  @JSName("on")
  def on_touchend(evtStr: touchend, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
  @JSName("on")
  def on_touchmove(evtStr: touchmove, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
  @JSName("on")
  def on_touchstart(evtStr: touchstart, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
  @JSName("on")
  def on_transitioncancel(evtStr: transitioncancel, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
  @JSName("on")
  def on_transitionend(evtStr: transitionend, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
  @JSName("on")
  def on_transitionrun(evtStr: transitionrun, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
  @JSName("on")
  def on_transitionstart(evtStr: transitionstart, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
  @JSName("on")
  def on_volumechange(evtStr: volumechange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_waiting(evtStr: waiting, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
  @JSName("on")
  def on_wheel(evtStr: wheel, handler: KonvaEventListener[this.type, WheelEvent]): js.Any = js.native
  
  def opacity(): Double = js.native
  def opacity(v: Double): this.type = js.native
  @JSName("opacity")
  var opacity_Original: GetSet[Double, this.type] = js.native
  
  var parent: Container[Node[NodeConfig]] | Null = js.native
  
  def pixelSize(): Double = js.native
  def pixelSize(v: Double): this.type = js.native
  @JSName("pixelSize")
  var pixelSize_Original: GetSet[Double, this.type] = js.native
  
  def position(): Vector2d = js.native
  def position(v: Vector2d): this.type = js.native
  @JSName("position")
  var position_Original: GetSet[Vector2d, this.type] = js.native
  
  def preventDefault(): Boolean = js.native
  def preventDefault(v: Boolean): this.type = js.native
  @JSName("preventDefault")
  var preventDefault_Original: GetSet[Boolean, this.type] = js.native
  
  def red(): Double = js.native
  def red(v: Double): this.type = js.native
  @JSName("red")
  var red_Original: GetSet[Double, this.type] = js.native
  
  def remove(): this.type = js.native
  
  def removeEventListener(`type`: String): this.type = js.native
  
  def removeName(name: js.Any): this.type = js.native
  
  def rotate(theta: js.Any): this.type = js.native
  
  def rotation(): Double = js.native
  def rotation(v: Double): this.type = js.native
  @JSName("rotation")
  var rotation_Original: GetSet[Double, this.type] = js.native
  
  def saturation(): Double = js.native
  def saturation(v: Double): this.type = js.native
  @JSName("saturation")
  var saturation_Original: GetSet[Double, this.type] = js.native
  
  def scale(): Vector2d = js.native
  def scale(v: Vector2d): this.type = js.native
  
  def scaleX(): Double = js.native
  def scaleX(v: Double): this.type = js.native
  @JSName("scaleX")
  var scaleX_Original: GetSet[Double, this.type] = js.native
  
  def scaleY(): Double = js.native
  def scaleY(v: Double): this.type = js.native
  @JSName("scaleY")
  var scaleY_Original: GetSet[Double, this.type] = js.native
  
  @JSName("scale")
  var scale_Original: GetSet[Vector2d, this.type] = js.native
  
  def setAbsolutePosition(pos: js.Any): this.type = js.native
  
  def setAttr(attr: js.Any, `val`: js.Any): this.type = js.native
  
  def setAttrs(config: js.Any): this.type = js.native
  
  def setDraggable(draggable: js.Any): Unit = js.native
  
  def setId(id: js.Any): this.type = js.native
  
  def setName(name: js.Any): this.type = js.native
  
  def setPosition(pos: js.Any): this.type = js.native
  
  def setSize(size: js.Any): this.type = js.native
  
  def setZIndex(zIndex: js.Any): this.type = js.native
  
  def shouldDrawHit(): js.Any = js.native
  def shouldDrawHit(top: Node[NodeConfig]): js.Any = js.native
  
  def show(): this.type = js.native
  
  def size(): HeightWidth = js.native
  def size(v: HeightWidth): this.type = js.native
  @JSName("size")
  var size_Original: GetSet[HeightWidth, this.type] = js.native
  
  def skew(): Vector2d = js.native
  def skew(v: Vector2d): this.type = js.native
  
  def skewX(): Double = js.native
  def skewX(v: Double): this.type = js.native
  @JSName("skewX")
  var skewX_Original: GetSet[Double, this.type] = js.native
  
  def skewY(): Double = js.native
  def skewY(v: Double): this.type = js.native
  @JSName("skewY")
  var skewY_Original: GetSet[Double, this.type] = js.native
  
  @JSName("skew")
  var skew_Original: GetSet[Vector2d, this.type] = js.native
  
  def startDrag(): Unit = js.native
  def startDrag(evt: js.UndefOr[scala.Nothing], bubbleEvent: Boolean): Unit = js.native
  def startDrag(evt: js.Any): Unit = js.native
  def startDrag(evt: js.Any, bubbleEvent: Boolean): Unit = js.native
  
  def stopDrag(): Unit = js.native
  def stopDrag(evt: js.Any): Unit = js.native
  
  def threshold(): Double = js.native
  def threshold(v: Double): this.type = js.native
  @JSName("threshold")
  var threshold_Original: GetSet[Double, this.type] = js.native
  
  def to(params: AnimTo): Unit = js.native
  
  def toCanvas(config: js.Any): HTMLCanvasElement = js.native
  
  def toDataURL(): String = js.native
  def toDataURL(config: Callback): String = js.native
  
  def toImage(): Unit = js.native
  def toImage(config: MimeType): Unit = js.native
  
  def toJSON(): String = js.native
  
  def toObject(): js.Any = js.native
  
  def transformsEnabled(): String = js.native
  def transformsEnabled(v: String): this.type = js.native
  @JSName("transformsEnabled")
  var transformsEnabled_Original: GetSet[String, this.type] = js.native
  
  def value(): Double = js.native
  def value(v: Double): this.type = js.native
  @JSName("value")
  var value_Original: GetSet[Double, this.type] = js.native
  
  def visible(): Boolean = js.native
  def visible(v: Boolean): this.type = js.native
  @JSName("visible")
  var visible_Original: GetSet[Boolean, this.type] = js.native
  
  def width(): Double = js.native
  def width(v: Double): this.type = js.native
  @JSName("width")
  var width_Original: GetSet[Double, this.type] = js.native
  
  def x(): Double = js.native
  def x(v: Double): this.type = js.native
  @JSName("x")
  var x_Original: GetSet[Double, this.type] = js.native
  
  def y(): Double = js.native
  def y(v: Double): this.type = js.native
  @JSName("y")
  var y_Original: GetSet[Double, this.type] = js.native
  
  def zIndex(): Double = js.native
  def zIndex(v: Double): this.type = js.native
  @JSName("zIndex")
  var zIndex_Original: GetSet[Double, this.type] = js.native
}
/* static members */
@JSImport("konva/types/Node", "Node")
@js.native
object Node extends js.Object {
  
  def _createNode(obj: js.Any): js.Any = js.native
  def _createNode(obj: js.Any, container: js.Any): js.Any = js.native
  
  def create(data: js.Any): js.Any = js.native
  def create(data: js.Any, container: js.Any): js.Any = js.native
}
