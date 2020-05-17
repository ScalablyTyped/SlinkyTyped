package typingsSlinky.phaser.Phaser.Input.Touch

import typingsSlinky.phaser.Phaser.Input.InputManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Touch Manager is a helper class that belongs to the Input Manager.
  * 
  * Its role is to listen for native DOM Touch Events and then pass them onto the Input Manager for further processing.
  * 
  * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
  */
@js.native
trait TouchManager extends js.Object {
  /**
    * If true the DOM events will have event.preventDefault applied to them, if false they will propagate fully.
    */
  var capture: Boolean = js.native
  /**
    * A boolean that controls if the Touch Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: Boolean = js.native
  /**
    * A reference to the Input Manager.
    */
  var manager: InputManager = js.native
  /**
    * The Touch Cancel event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchCancel: js.Function = js.native
  /**
    * The Touch Cancel event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchCancelWindow: js.Function = js.native
  /**
    * The Touch End event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchEnd: js.Function = js.native
  /**
    * The Touch End event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchEndWindow: js.Function = js.native
  /**
    * The Touch Move event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchMove: js.Function = js.native
  /**
    * The Touch Out event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchOut: js.Function = js.native
  /**
    * The Touch Over event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchOver: js.Function = js.native
  /**
    * The Touch Start event handler function.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchStart: js.Function = js.native
  /**
    * The Touch Start event handler function specifically for events on the Window.
    * Initially empty and bound in the `startListeners` method.
    */
  var onTouchStartWindow: js.Function = js.native
  /**
    * The Touch Event target, as defined in the Game Config.
    * Typically the canvas to which the game is rendering, but can be any interactive DOM element.
    */
  var target: js.Any = js.native
  /**
    * Destroys this Touch Manager instance.
    */
  def destroy(): Unit = js.native
  /**
    * Attempts to disable the context menu from appearing if you touch-hold on the browser.
    * 
    * Works by listening for the `contextmenu` event and prevent defaulting it.
    * 
    * Use this if you need to disable the OS context menu on mobile.
    */
  def disableContextMenu(): TouchManager = js.native
  /**
    * Starts the Touch Event listeners running as long as an input target is set.
    * 
    * This method is called automatically if Touch Input is enabled in the game config,
    * which it is by default. However, you can call it manually should you need to
    * delay input capturing until later in the game.
    */
  def startListeners(): Unit = js.native
  /**
    * Stops the Touch Event listeners.
    * This is called automatically and does not need to be manually invoked.
    */
  def stopListeners(): Unit = js.native
}

object TouchManager {
  @scala.inline
  def apply(
    capture: Boolean,
    destroy: () => Unit,
    disableContextMenu: () => TouchManager,
    enabled: Boolean,
    manager: InputManager,
    onTouchCancel: js.Function,
    onTouchCancelWindow: js.Function,
    onTouchEnd: js.Function,
    onTouchEndWindow: js.Function,
    onTouchMove: js.Function,
    onTouchOut: js.Function,
    onTouchOver: js.Function,
    onTouchStart: js.Function,
    onTouchStartWindow: js.Function,
    startListeners: () => Unit,
    stopListeners: () => Unit,
    target: js.Any
  ): TouchManager = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disableContextMenu = js.Any.fromFunction0(disableContextMenu), enabled = enabled.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchCancelWindow = onTouchCancelWindow.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchEndWindow = onTouchEndWindow.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchOut = onTouchOut.asInstanceOf[js.Any], onTouchOver = onTouchOver.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTouchStartWindow = onTouchStartWindow.asInstanceOf[js.Any], startListeners = js.Any.fromFunction0(startListeners), stopListeners = js.Any.fromFunction0(stopListeners), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchManager]
  }
  @scala.inline
  implicit class TouchManagerOps[Self <: TouchManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableContextMenu(value: () => TouchManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContextMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManager(value: InputManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchCancelWindow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchEndWindow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchMove(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchOut(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchOver(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchStart(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchStartWindow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

