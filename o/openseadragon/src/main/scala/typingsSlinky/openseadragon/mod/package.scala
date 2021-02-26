package typingsSlinky.openseadragon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(options: typingsSlinky.openseadragon.mod.Options): typingsSlinky.openseadragon.mod.Viewer = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Viewer]
  
  @scala.inline
  def DEFAULT_SETTINGS: typingsSlinky.openseadragon.mod.Options = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SETTINGS").asInstanceOf[typingsSlinky.openseadragon.mod.Options]
  
  // TODO: use proper eventName type aliases, and OSDEvent where appropiate
  type EventHandler[T /* <: typingsSlinky.openseadragon.mod.OSDEvent[_] */] = js.Function1[/* event */ T, scala.Unit]
  
  type OnDrawCallback = js.Function3[
    /* position */ typingsSlinky.openseadragon.mod.Point, 
    /* size */ typingsSlinky.openseadragon.mod.Point, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    scala.Unit
  ]
  
  @scala.inline
  def addClass(element: java.lang.String, className: java.lang.String): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addClass(element: org.scalajs.dom.raw.Element, className: java.lang.String): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def addEvent(
    element: java.lang.String,
    eventName: java.lang.String,
    handler: js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit]
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addEvent(
    element: java.lang.String,
    eventName: java.lang.String,
    handler: js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addEvent(
    element: org.scalajs.dom.raw.Element,
    eventName: java.lang.String,
    handler: js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit]
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def addEvent(
    element: org.scalajs.dom.raw.Element,
    eventName: java.lang.String,
    handler: js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def cancelEvent(): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")().asInstanceOf[scala.Unit]
  @scala.inline
  def cancelEvent(event: typingsSlinky.openseadragon.mod.OSDEvent[_]): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")(event.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def capitalizeFirstLetter(value: java.lang.String): java.lang.String = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirstLetter")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def createCallback(`object`: js.Object, method: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): js.Function1[/* repeated */ js.Any, scala.Unit] = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCallback")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  @scala.inline
  def delegate(`object`: js.Object, method: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function2[/* object */ js.Any, /* repeated */ js.Any, scala.Unit] = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* object */ js.Any, /* repeated */ js.Any, scala.Unit]]
  
  // REVIEW: unsure of return type
  @scala.inline
  def extend(): js.Any = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Any]
  
  @scala.inline
  def getCssPropertyWithVendorPrefix(property: java.lang.String): java.lang.String = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCssPropertyWithVendorPrefix")(property.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getElement(element: java.lang.String): org.scalajs.dom.raw.Element = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Element]
  @scala.inline
  def getElement(element: org.scalajs.dom.raw.Element): org.scalajs.dom.raw.Element = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Element]
  
  @scala.inline
  def getElementOffset(element: java.lang.String): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  @scala.inline
  def getElementOffset(element: org.scalajs.dom.raw.Element): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  
  @scala.inline
  def getElementPosition(element: java.lang.String): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  @scala.inline
  def getElementPosition(element: org.scalajs.dom.raw.Element): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  
  @scala.inline
  def getElementSize(element: java.lang.String): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  @scala.inline
  def getElementSize(element: org.scalajs.dom.raw.Element): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  
  @scala.inline
  def getElementStyle(element: java.lang.String): js.Any = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getElementStyle(element: org.scalajs.dom.raw.Element): js.Any = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  // CSSStyle?
  @scala.inline
  def getMousePosition(): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")().asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  @scala.inline
  def getMousePosition(event: typingsSlinky.openseadragon.mod.OSDEvent[_]): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")(event.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  
  @scala.inline
  def getPageScroll(): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPageScroll")().asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  
  @scala.inline
  def getString(property: java.lang.String): java.lang.String = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getString")(property.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getUrlParameter(key: java.lang.String): java.lang.String = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUrlParameter")(key.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getWindowSize(): typingsSlinky.openseadragon.mod.Point = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getWindowSize")().asInstanceOf[typingsSlinky.openseadragon.mod.Point]
  
  @scala.inline
  def imageFormatSupported(): scala.Boolean = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")().asInstanceOf[scala.Boolean]
  @scala.inline
  def imageFormatSupported(extension: java.lang.String): scala.Boolean = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")(extension.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def indexOf(array: js.Array[_], searchElement: js.Object): scala.Double = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def indexOf(array: js.Array[_], searchElement: js.Object, fromIndex: scala.Double): scala.Double = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  // (missing jquery functions)
  @scala.inline
  def makeAjaxRequest(options: typingsSlinky.openseadragon.anon.Error): org.scalajs.dom.raw.XMLHttpRequest = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeAjaxRequest")(options.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.XMLHttpRequest]
  
  @scala.inline
  def makeCenteredNode(element: java.lang.String): org.scalajs.dom.raw.Element = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Element]
  @scala.inline
  def makeCenteredNode(element: org.scalajs.dom.raw.Element): org.scalajs.dom.raw.Element = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Element]
  
  @scala.inline
  def makeNeutralElement(tagName: java.lang.String): org.scalajs.dom.raw.Element = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeNeutralElement")(tagName.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Element]
  
  @scala.inline
  def makeTransparentImage(src: java.lang.String): org.scalajs.dom.raw.Element = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeTransparentImage")(src.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Element]
  
  @scala.inline
  def now(): scala.Double = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[scala.Double]
  
  @scala.inline
  def parseJSON(string: java.lang.String): js.Object = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(string.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def parseXml(string: java.lang.String): org.scalajs.dom.raw.Document = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(string.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Document]
  
  @scala.inline
  def pixelDensityRatio: scala.Double = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("pixelDensityRatio").asInstanceOf[scala.Double]
  @scala.inline
  def pixelDensityRatio_=(x: scala.Double): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].updateDynamic("pixelDensityRatio")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def pointInElement(element: java.lang.String, point: typingsSlinky.openseadragon.mod.Point): scala.Boolean = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def pointInElement(element: org.scalajs.dom.raw.Element, point: typingsSlinky.openseadragon.mod.Point): scala.Boolean = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def positiveModulo(number: scala.Double, modulo: scala.Double): scala.Double = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("positiveModulo")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def removeClass(element: java.lang.String, className: java.lang.String): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeClass(element: org.scalajs.dom.raw.Element, className: java.lang.String): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def removeEvent(
    element: java.lang.String,
    eventName: java.lang.String,
    handler: typingsSlinky.openseadragon.mod.EventHandler[_]
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent(
    element: java.lang.String,
    eventName: java.lang.String,
    handler: typingsSlinky.openseadragon.mod.EventHandler[_],
    useCapture: scala.Boolean
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent(
    element: org.scalajs.dom.raw.Element,
    eventName: java.lang.String,
    handler: typingsSlinky.openseadragon.mod.EventHandler[_]
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def removeEvent(
    element: org.scalajs.dom.raw.Element,
    eventName: java.lang.String,
    handler: typingsSlinky.openseadragon.mod.EventHandler[_],
    useCapture: scala.Boolean
  ): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setElementOpacity(element: java.lang.String, opacity: scala.Double): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setElementOpacity(element: java.lang.String, opacity: scala.Double, usesAlpha: scala.Boolean): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setElementOpacity(element: org.scalajs.dom.raw.Element, opacity: scala.Double): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setElementOpacity(element: org.scalajs.dom.raw.Element, opacity: scala.Double, usesAlpha: scala.Boolean): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setElementTouchActionNone(element: java.lang.String): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setElementTouchActionNone(element: org.scalajs.dom.raw.Element): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setPageScroll(point: typingsSlinky.openseadragon.mod.Point): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setPageScroll")(point.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setString(property: java.lang.String, value: js.Any): scala.Unit = (typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setString")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def stopEvent(): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[scala.Unit]
  @scala.inline
  def stopEvent(event: typingsSlinky.openseadragon.mod.OSDEvent[_]): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(event.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def supportsCanvas: scala.Boolean = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("supportsCanvas").asInstanceOf[scala.Boolean]
  @scala.inline
  def supportsCanvas_=(x: scala.Boolean): scala.Unit = typingsSlinky.openseadragon.mod.^.asInstanceOf[js.Dynamic].updateDynamic("supportsCanvas")(x.asInstanceOf[js.Any])
}
