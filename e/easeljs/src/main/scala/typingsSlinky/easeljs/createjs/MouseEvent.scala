package typingsSlinky.easeljs.createjs

import typingsSlinky.createjsLib.createjs.Event
import typingsSlinky.easeljs.anon.HandleEvent
import typingsSlinky.easeljs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseEvent extends Event {
  
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): js.Function = js.native
  def addEventListener(`type`: String, listener: HandleEvent): js.Object = js.native
  def addEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): js.Object = js.native
  def addEventListener(`type`: String, listener: `0`): js.Object = js.native
  def addEventListener(`type`: String, listener: `0`, useCapture: Boolean): js.Object = js.native
  
  def dispatchEvent(eventObj: String): Boolean = js.native
  def dispatchEvent(eventObj: String, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: Event): Boolean = js.native
  def dispatchEvent(eventObj: Event, target: js.Object): Boolean = js.native
  
  def hasEventListener(`type`: String): Boolean = js.native
  
  // properties
  var isTouch: Boolean = js.native
  
  var localX: Double = js.native
  
  var localY: Double = js.native
  
  var mouseMoveOutside: Boolean = js.native
  
  var nativeEvent: org.scalajs.dom.raw.MouseEvent = js.native
  
  def off(`type`: String, listener: js.Function): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: HandleEvent): Unit = js.native
  def off(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: `0`): Unit = js.native
  def off(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
  
  // It is necessary for "arguments.callee"
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  def on(`type`: String, listener: HandleEvent): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: HandleEvent, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: HandleEvent, scope: js.Object): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: HandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: `0`): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.UndefOr[scala.Nothing],
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: `0`, scope: js.Object): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: js.UndefOr[scala.Nothing], data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.Object,
    once: js.UndefOr[scala.Nothing],
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean): js.Object = js.native
  def on(
    `type`: String,
    listener: `0`,
    scope: js.Object,
    once: Boolean,
    data: js.UndefOr[scala.Nothing],
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any, useCapture: Boolean): js.Object = js.native
  
  var pointerID: Double = js.native
  
  var primary: Boolean = js.native
  
  var rawX: Double = js.native
  
  var rawY: Double = js.native
  
  var relatedTarget: DisplayObject = js.native
  
  def removeAllEventListeners(): Unit = js.native
  def removeAllEventListeners(`type`: String): Unit = js.native
  
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: HandleEvent): Unit = js.native
  def removeEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: `0`): Unit = js.native
  def removeEventListener(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
  
  var stageX: Double = js.native
  
  var stageY: Double = js.native
  
  def willTrigger(`type`: String): Boolean = js.native
}
