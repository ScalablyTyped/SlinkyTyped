package typingsSlinky.cypress.JQuery_

import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TouchList
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region TouchEvent
// #region TouchEvent
@js.native
trait TouchEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_TouchEventBase: Boolean = js.native
  // MouseEvent
  @JSName("button")
  var button_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("buttons")
  var buttons_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_TouchEventBase: TouchList = js.native
  /** @deprecated */
  @JSName("charCode")
  var charCode_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  // KeyboardEvent
  /** @deprecated */
  @JSName("char")
  var char_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("clientX")
  var clientX_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("clientY")
  var clientY_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("ctrlKey")
  var ctrlKey_TouchEventBase: Boolean = js.native
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("key")
  var key_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  /**
    * Indicates whether the META key was pressed when the event fired.
    * @see \`{@link https://api.jquery.com/event.metaKey/ }\`
    * @since 1.0.4
    * @example ​ ````Determine whether the META key was pressed when the event fired.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.metaKey demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button value="Test" name="Test" id="checkMetaKey">Click me!</button>
  <div id="display"></div>
  ​
  <script>
  $( "#checkMetaKey" ).click(function( event ) {
    $( "#display" ).text( event.metaKey );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("metaKey")
  var metaKey_TouchEventBase: Boolean = js.native
  @JSName("offsetX")
  var offsetX_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("offsetY")
  var offsetY_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("originalEvent")
  var originalEvent_TouchEventBase: js.UndefOr[TouchEvent] = js.native
  /**
    * The mouse position relative to the left edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageX/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageX demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageX")
  var pageX_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  /**
    * The mouse position relative to the top edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageY/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageY demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageY")
  var pageY_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  // PointerEvent
  @JSName("pointerId")
  var pointerId_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("pointerType")
  var pointerType_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  /**
    * The other DOM element involved in the event, if any.
    * @see \`{@link https://api.jquery.com/event.relatedTarget/ }\`
    * @since 1.1.4
    * @example ​ ````On mouseout of anchors, alert the element type being entered.
  ```javascript
  $( "a" ).mouseout(function( event ) {
    alert( event.relatedTarget.nodeName ); // "DIV"
  });
  ```
    */
  var relatedTarget: js.UndefOr[scala.Nothing] = js.native
  @JSName("screenX")
  var screenX_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("screenY")
  var screenY_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("shiftKey")
  var shiftKey_TouchEventBase: Boolean = js.native
  @JSName("targetTouches")
  var targetTouches_TouchEventBase: TouchList = js.native
  /** @deprecated */
  @JSName("toElement")
  var toElement_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("touches")
  var touches_TouchEventBase: TouchList = js.native
  // MouseEvent, KeyboardEvent
  /**
    * For key or mouse events, this property indicates the specific key or button that was pressed.
    * @see \`{@link https://api.jquery.com/event.which/ }\`
    * @since 1.1.3
    * @deprecated ​ Deprecated since 3.3. See \`{@link https://github.com/jquery/api.jquery.com/issues/821 }\`.
    * @example ​ ````Log which key was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="type something">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "keydown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    * @example ​ ````Log which mouse button was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="click here">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "mousedown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("which")
  var which_TouchEventBase: js.UndefOr[scala.Nothing] = js.native
}

object TouchEventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    changedTouches: TouchList,
    ctrlKey: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    targetTouches: TouchList,
    timeStamp: Double,
    touches: TouchList,
    `type`: String,
    view: Window_
  ): TouchEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class TouchEventBaseOps[Self[tdelegatetarget, tdata, tcurrenttarget, ttarget] <: TouchEventBase[tdelegatetarget, tdata, tcurrenttarget, ttarget], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) with Other]
    @scala.inline
    def withAltKey(value: Boolean): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedTouches(value: TouchList): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaKey(value: Boolean): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShiftKey(value: Boolean): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetTouches(value: TouchList): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouches(value: TouchList): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withChar(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChar: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(js.undefined)
        ret
    }
    @scala.inline
    def withCharCode(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharCode: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charCode")(js.undefined)
        ret
    }
    @scala.inline
    def withClientX(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientX: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(js.undefined)
        ret
    }
    @scala.inline
    def withClientY(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientY: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyCode(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyCode: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalEvent(value: TouchEvent): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEvent: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPageX(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageX: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(js.undefined)
        ret
    }
    @scala.inline
    def withPageY(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageY: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerId(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerId: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerType(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerType: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerType")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedTarget(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedTarget: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenX(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenX: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenX")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenY(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenY: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenY")(js.undefined)
        ret
    }
    @scala.inline
    def withToElement(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToElement: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toElement")(js.undefined)
        ret
    }
    @scala.inline
    def withWhich(value: scala.Nothing): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhich: Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(js.undefined)
        ret
    }
  }
  
}

