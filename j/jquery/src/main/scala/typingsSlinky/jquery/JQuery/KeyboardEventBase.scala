package typingsSlinky.jquery.JQuery

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
// region KeyboardEvent
// #region KeyboardEvent
@js.native
trait KeyboardEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_KeyboardEventBase: Boolean = js.native
  // MouseEvent
  @JSName("button")
  var button_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("buttons")
  var buttons_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  /** @deprecated */
  @JSName("charCode")
  var charCode_KeyboardEventBase: Double = js.native
  @JSName("clientX")
  var clientX_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("clientY")
  var clientY_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("ctrlKey")
  var ctrlKey_KeyboardEventBase: Boolean = js.native
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_KeyboardEventBase: Double = js.native
  @JSName("key")
  var key_KeyboardEventBase: String = js.native
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
  var metaKey_KeyboardEventBase: Boolean = js.native
  @JSName("offsetX")
  var offsetX_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("offsetY")
  var offsetY_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("originalEvent")
  var originalEvent_KeyboardEventBase: js.UndefOr[KeyboardEvent] = js.native
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
  var pageX_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
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
  var pageY_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  // PointerEvent
  @JSName("pointerId")
  var pointerId_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("pointerType")
  var pointerType_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
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
  var screenX_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("screenY")
  var screenY_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("shiftKey")
  var shiftKey_KeyboardEventBase: Boolean = js.native
  @JSName("targetTouches")
  var targetTouches_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  /** @deprecated */
  @JSName("toElement")
  var toElement_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("touches")
  var touches_KeyboardEventBase: js.UndefOr[scala.Nothing] = js.native
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
  var which_KeyboardEventBase: Double = js.native
}

object KeyboardEventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    charCode: Double,
    ctrlKey: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    key: String,
    keyCode: Double,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String,
    view: Window,
    which: Double
  ): KeyboardEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class KeyboardEventBaseOps[Self[tdelegatetarget, tdata, tcurrenttarget, ttarget] <: KeyboardEventBase[tdelegatetarget, tdata, tcurrenttarget, ttarget], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self[TDelegateTarget, TData, TCurrentTarget, TTarget]) extends AnyVal {
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
    def withCharCode(value: Double): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyCode(value: Double): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
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
    def withWhich(value: Double): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: KeyboardEvent): Self[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
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
  }
  
}

