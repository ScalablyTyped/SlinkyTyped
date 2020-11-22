package typingsSlinky.reactThreeFiber.canvasMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import slinky.web.SyntheticPointerEvent
import typingsSlinky.react.mod.AbstractView
import typingsSlinky.reactThreeFiber.reactThreeFiberStrings.mouse
import typingsSlinky.reactThreeFiber.reactThreeFiberStrings.pen
import typingsSlinky.reactThreeFiber.reactThreeFiberStrings.touch
import typingsSlinky.three.face3Mod.Face3
import typingsSlinky.three.mod.Object3D
import typingsSlinky.three.mod.Ray
import typingsSlinky.three.vector2Mod.Vector2
import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-three-fiber.react-three-fiber/canvas.ThreeEvent<react.react.PointerEvent<std.Element>> */
@js.native
trait PointerEvent extends DomEvent {
  
  var altKey: Boolean = js.native
  
  var bubbles: Boolean = js.native
  
  var button: Double = js.native
  
  var buttons: Double = js.native
  
  var camera: Camera = js.native
  
  var cancelable: Boolean = js.native
  
  var clientX: Double = js.native
  
  var clientY: Double = js.native
  
  var ctrlKey: Boolean = js.native
  
  var currentTarget: EventTarget with Element = js.native
  
  var defaultPrevented: Boolean = js.native
  
  var delta: Double = js.native
  
  var detail: Double = js.native
  
  var distance: Double = js.native
  
  var distanceToRay: js.UndefOr[Double] = js.native
  
  var eventObject: Object3D = js.native
  
  var eventPhase: Double = js.native
  
  var face: js.UndefOr[Face3 | Null] = js.native
  
  var faceIndex: js.UndefOr[Double] = js.native
  
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean = js.native
  
  var height: Double = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var instanceId: js.UndefOr[Double] = js.native
  
  var intersections: js.Array[Intersection] = js.native
  
  def isDefaultPrevented(): Boolean = js.native
  
  var isPrimary: Boolean = js.native
  
  def isPropagationStopped(): Boolean = js.native
  
  var isTrusted: Boolean = js.native
  
  var metaKey: Boolean = js.native
  
  var movementX: Double = js.native
  
  var movementY: Double = js.native
  
  var nativeEvent: org.scalajs.dom.raw.PointerEvent = js.native
  
  var `object`: typingsSlinky.three.object3DMod.Object3D = js.native
  
  var pageX: Double = js.native
  
  var pageY: Double = js.native
  
  def persist(): Unit = js.native
  
  var point: Vector3 = js.native
  
  var pointerId: Double = js.native
  
  var pointerType: mouse | pen | touch = js.native
  
  var pressure: Double = js.native
  
  def preventDefault(): Unit = js.native
  
  var ray: Ray = js.native
  
  var relatedTarget: EventTarget | Null = js.native
  
  var screenX: Double = js.native
  
  var screenY: Double = js.native
  
  var shiftKey: Boolean = js.native
  
  var sourceEvent: SyntheticPointerEvent[Element] = js.native
  
  def stopPropagation(): Unit = js.native
  
  var stopped: Boolean = js.native
  
  var tangentialPressure: Double = js.native
  
  var target: EventTarget = js.native
  
  var tiltX: Double = js.native
  
  var tiltY: Double = js.native
  
  var timeStamp: Double = js.native
  
  var twist: Double = js.native
  
  var `type`: String = js.native
  
  var unprojectedPoint: typingsSlinky.three.mod.Vector3 = js.native
  
  var uv: js.UndefOr[Vector2] = js.native
  
  var view: AbstractView = js.native
  
  var width: Double = js.native
}
object PointerEvent {
  
  @scala.inline
  def apply(
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    camera: Camera,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with Element,
    defaultPrevented: Boolean,
    delta: Double,
    detail: Double,
    distance: Double,
    eventObject: Object3D,
    eventPhase: Double,
    getModifierState: String => Boolean,
    height: Double,
    intersections: js.Array[Intersection],
    isDefaultPrevented: () => Boolean,
    isPrimary: Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: org.scalajs.dom.raw.PointerEvent,
    `object`: typingsSlinky.three.object3DMod.Object3D,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    point: Vector3,
    pointerId: Double,
    pointerType: mouse | pen | touch,
    pressure: Double,
    preventDefault: () => Unit,
    ray: Ray,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    sourceEvent: SyntheticPointerEvent[Element],
    stopPropagation: () => Unit,
    stopped: Boolean,
    tangentialPressure: Double,
    target: EventTarget,
    tiltX: Double,
    tiltY: Double,
    timeStamp: Double,
    twist: Double,
    `type`: String,
    unprojectedPoint: typingsSlinky.three.mod.Vector3,
    view: AbstractView,
    width: Double
  ): PointerEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), height = height.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPrimary = isPrimary.asInstanceOf[js.Any], isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), point = point.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), ray = ray.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], tangentialPressure = tangentialPressure.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent]
  }
  
  @scala.inline
  implicit class PointerEventOps[Self <: PointerEvent] (val x: Self) extends AnyVal {
    
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
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Double): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: EventTarget with Element): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Double): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventObject(value: Object3D): Self = this.set("eventObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetModifierState(value: String => Boolean): Self = this.set("getModifierState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionsVarargs(value: Intersection*): Self = this.set("intersections", js.Array(value :_*))
    
    @scala.inline
    def setIntersections(value: js.Array[Intersection]): Self = this.set("intersections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultPrevented(value: () => Boolean): Self = this.set("isDefaultPrevented", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPropagationStopped(value: () => Boolean): Self = this.set("isPropagationStopped", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementX(value: Double): Self = this.set("movementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementY(value: Double): Self = this.set("movementY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEvent(value: org.scalajs.dom.raw.PointerEvent): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: typingsSlinky.three.object3DMod.Object3D): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersist(value: () => Unit): Self = this.set("persist", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPoint(value: Vector3): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerType(value: mouse | pen | touch): Self = this.set("pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressure(value: Double): Self = this.set("pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRay(value: Ray): Self = this.set("ray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEvent(value: SyntheticPointerEvent[Element]): Self = this.set("sourceEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopped(value: Boolean): Self = this.set("stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentialPressure(value: Double): Self = this.set("tangentialPressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltX(value: Double): Self = this.set("tiltX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltY(value: Double): Self = this.set("tiltY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwist(value: Double): Self = this.set("twist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprojectedPoint(value: typingsSlinky.three.mod.Vector3): Self = this.set("unprojectedPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: AbstractView): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceToRay(value: Double): Self = this.set("distanceToRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceToRay: Self = this.set("distanceToRay", js.undefined)
    
    @scala.inline
    def setFace(value: Face3): Self = this.set("face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFace: Self = this.set("face", js.undefined)
    
    @scala.inline
    def setFaceNull: Self = this.set("face", null)
    
    @scala.inline
    def setFaceIndex(value: Double): Self = this.set("faceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceIndex: Self = this.set("faceIndex", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setInstanceId(value: Double): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setRelatedTarget(value: EventTarget): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTargetNull: Self = this.set("relatedTarget", null)
    
    @scala.inline
    def setUv(value: Vector2): Self = this.set("uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUv: Self = this.set("uv", js.undefined)
  }
}
