package typingsSlinky.dojo.dijit.main

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/main.typematic.html
  *
  * These functions are used to repetitively call a user specified callback
  * method when a specific key or mouse click over a specific DOM node is
  * held down for a specific amount of time.
  * Only 1 such event is allowed to occur on the browser page at 1 time.
  * 
  */
@js.native
trait typematic extends js.Object {
  /**
    * Start listening for a specific typematic key.
    * See also the trigger method for other parameters.
    * 
    * @param node             
    * @param keyObject an object defining the key to listen for:keyCode: the keyCode (number) to listen for, used for non-printable keyscharCode: the charCode (number) to listen for, used for printable keyscharOrCode: deprecated, use keyCode or charCodectrlKey: desired ctrl key state to initiate the callback sequence:pressed (true)released (false)either (unspecified)altKey: same as ctrlKey but for the alt keyshiftKey: same as ctrlKey but for the shift key             
    * @param _this             
    * @param callback             
    * @param subsequentDelay             
    * @param initialDelay             
    * @param minDelay               Optional            
    */
  def addKeyListener(
    node: HTMLElement,
    keyObject: js.Object,
    _this: js.Object,
    callback: js.Function,
    subsequentDelay: Double,
    initialDelay: Double,
    minDelay: Double
  ): js.Any = js.native
  /**
    * Start listening for a specific typematic key and mouseclick.
    * This is a thin wrapper to addKeyListener and addMouseListener.
    * See the addMouseListener and addKeyListener methods for other parameters.
    * 
    * @param mouseNode the DOM node object to listen on for mouse events.             
    * @param keyNode the DOM node object to listen on for key events.             
    * @param keyObject             
    * @param _this             
    * @param callback             
    * @param subsequentDelay             
    * @param initialDelay             
    * @param minDelay               Optional            
    */
  def addListener(
    mouseNode: HTMLElement,
    keyNode: HTMLElement,
    keyObject: js.Object,
    _this: js.Object,
    callback: js.Function,
    subsequentDelay: Double,
    initialDelay: Double,
    minDelay: Double
  ): js.Any = js.native
  /**
    * Start listening for a typematic mouse click.
    * See the trigger method for other parameters.
    * 
    * @param node             
    * @param _this             
    * @param callback             
    * @param subsequentDelay             
    * @param initialDelay             
    * @param minDelay               Optional            
    */
  def addMouseListener(
    node: HTMLElement,
    _this: js.Object,
    callback: js.Function,
    subsequentDelay: Double,
    initialDelay: Double,
    minDelay: Double
  ): js.Any = js.native
  /**
    * Stop an ongoing timed, repeating callback sequence.
    * 
    */
  def stop(): Unit = js.native
  /**
    * Start a timed, repeating callback sequence.
    * If already started, the function call is ignored.
    * This method is not normally called by the user but can be
    * when the normal listener code is insufficient.
    * 
    * @param evt key or mouse event object             
    * @param _this pointer to the user's widget space.             
    * @param node the DOM node object passed in             
    * @param callback function to call until the sequence is stopped called with 3 parameters:             
    * @param obj user space object used to uniquely identify each typematic sequence             
    * @param subsequentDelay               Optionalif > 1, the number of milliseconds until the 3->n events occuror else the fractional time multiplier for the next event's delay, default=0.9             
    * @param initialDelay               Optionalthe number of milliseconds until the 2nd event occurs, default=500ms             
    * @param minDelay               Optionalthe maximum delay in milliseconds for event to fire, default=10ms             
    */
  def trigger(
    evt: Event_,
    _this: js.Object,
    node: HTMLElement,
    callback: js.Function,
    obj: js.Object,
    subsequentDelay: Double,
    initialDelay: Double,
    minDelay: Double
  ): Unit = js.native
}

object typematic {
  @scala.inline
  def apply(
    addKeyListener: (HTMLElement, js.Object, js.Object, js.Function, Double, Double, Double) => js.Any,
    addListener: (HTMLElement, HTMLElement, js.Object, js.Object, js.Function, Double, Double, Double) => js.Any,
    addMouseListener: (HTMLElement, js.Object, js.Function, Double, Double, Double) => js.Any,
    stop: () => Unit,
    trigger: (Event_, js.Object, HTMLElement, js.Function, js.Object, Double, Double, Double) => Unit
  ): typematic = {
    val __obj = js.Dynamic.literal(addKeyListener = js.Any.fromFunction7(addKeyListener), addListener = js.Any.fromFunction8(addListener), addMouseListener = js.Any.fromFunction6(addMouseListener), stop = js.Any.fromFunction0(stop), trigger = js.Any.fromFunction8(trigger))
    __obj.asInstanceOf[typematic]
  }
  @scala.inline
  implicit class typematicOps[Self <: typematic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddKeyListener(value: (HTMLElement, js.Object, js.Object, js.Function, Double, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addKeyListener")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withAddListener(
      value: (HTMLElement, HTMLElement, js.Object, js.Object, js.Function, Double, Double, Double) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withAddMouseListener(value: (HTMLElement, js.Object, js.Function, Double, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMouseListener")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrigger(value: (Event_, js.Object, HTMLElement, js.Function, js.Object, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.Any.fromFunction8(value))
        ret
    }
  }
  
}

