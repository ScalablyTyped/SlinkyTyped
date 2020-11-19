package typingsSlinky.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// region Effects (fx)
// #region Effects (fx)
@js.native
trait Effects extends js.Object {
  
  /**
    * The rate (in milliseconds) at which animations fire.
    * @see \`{@link https://api.jquery.com/jQuery.fx.interval/ }\`
    * @since 1.4.3
    * @deprecated ​ Deprecated since 3.0. See \`{@link https://api.jquery.com/jQuery.fx.interval/ }\`.
    *
    * **Cause**: As of jQuery 3.0 the `jQuery.fx.interval` property can be used to change the animation interval only on browsers that do not support the `window.requestAnimationFrame()` method. That is currently only Internet Explorer 9 and the Android Browser. Once support is dropped for these browsers, the property will serve no purpose and it will be removed.
    *
    * **Solution**: Find and remove code that changes or uses `jQuery.fx.interval`. If the value is being used by code in your page or a plugin, the code may be making assumptions that are no longer valid. The default value of `jQuery.fx.interval` is `13` (milliseconds), which could be used instead of accessing this property.
    * @example ​ ````Cause all animations to run with less frames.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>jQuery.fx.interval demo</title>
    <style>
    div {
    width: 50px;
    height: 30px;
    margin: 5px;
    float: left;
    background: green;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <p><input type="button" value="Run"></p>
  <div></div>
  ​
  <script>
  jQuery.fx.interval = 100;
  $( "input" ).click(function() {
    $( "div" ).toggle( 3000 );
  });
  </script>
  </body>
  </html>
  ```
    */
  var interval: Double = js.native
  
  /**
    * Globally disable all animations.
    * @see \`{@link https://api.jquery.com/jQuery.fx.off/ }\`
    * @since 1.3
    * @example ​ ````Toggle animation on and off
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>jQuery.fx.off demo</title>
    <style>
    div {
    width: 50px;
    height: 30px;
    margin: 5px;
    float: left;
    background: green;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input type="button" value="Run">
  <button>Toggle fx</button>
  <div></div>
  ​
  <script>
  var toggleFx = function() {
    $.fx.off = !$.fx.off;
  };
  toggleFx();
  $( "button" ).click( toggleFx );
  $( "input" ).click(function() {
    $( "div" ).toggle( "slow" );
  });
  </script>
  </body>
  </html>
  ```
    */
  var off: Boolean = js.native
  
  /**
    * @deprecated ​ Deprecated since 1.8. Use \`{@link Tween.propHooks jQuery.Tween.propHooks}\`.
    *
    * `jQuery.fx.step` functions are being replaced by `jQuery.Tween.propHooks` and may eventually be removed, but are still supported via the default tween propHook.
    */
  var step: PlainObject[AnimationHook[Node]] = js.native
  
  /**
    * _overridable_ Clears up the `setInterval`
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#plugging-in-a-different-timer-loop }\`
    * @since 1.8
    */
  def stop(): Unit = js.native
  
  /**
    * Calls `.run()` on each object in the `jQuery.timers` array, removing it from the array if `.run()` returns a falsy value. Calls `jQuery.fx.stop()` whenever there are no timers remaining.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#plugging-in-a-different-timer-loop }\`
    * @since 1.8
    */
  def tick(): Unit = js.native
  
  /**
    * _overridable_ Creates a `setInterval` if one doesn't already exist, and pushes `tickFunction` to the `jQuery.timers` array. `tickFunction` should also have `anim`, `elem`, and `queue` properties that reference the animation object, animated element, and queue option to facilitate `jQuery.fn.stop()`
    *
    * By overriding `fx.timer` and `fx.stop` you should be able to implement any animation tick behaviour you desire. (like using `requestAnimationFrame` instead of `setTimeout`.)
    *
    * There is an example of overriding the timer loop in \`{@link https://github.com/gnarf37/jquery-requestAnimationFrame jquery.requestAnimationFrame}\`
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#plugging-in-a-different-timer-loop }\`
    * @since 1.8
    */
  def timer(tickFunction: TickFunction[_]): Unit = js.native
}
object Effects {
  
  @scala.inline
  def apply(
    interval: Double,
    off: Boolean,
    step: PlainObject[AnimationHook[Node]],
    stop: () => Unit,
    tick: () => Unit,
    timer: TickFunction[_] => Unit
  ): Effects = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick), timer = js.Any.fromFunction1(timer))
    __obj.asInstanceOf[Effects]
  }
  
  @scala.inline
  implicit class EffectsOps[Self <: Effects] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(value: Boolean): Self = this.set("off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: PlainObject[AnimationHook[Node]]): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTick(value: () => Unit): Self = this.set("tick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimer(value: TickFunction[_] => Unit): Self = this.set("timer", js.Any.fromFunction1(value))
  }
}
