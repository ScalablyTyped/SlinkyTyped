package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRControllerComponent extends IDisposable {
  var _axes: js.Any = js.native
  var _axesIndices: js.Any = js.native
  var _buttonIndex: js.Any = js.native
  var _changes: js.Any = js.native
  var _currentValue: js.Any = js.native
  var _hasChanges: js.Any = js.native
  var _pressed: js.Any = js.native
  var _touched: js.Any = js.native
  /**
    * the id of this component
    */
  var id: String = js.native
  /**
    * If axes are available for this component (like a touchpad or thumbstick) the observers will be notified when
    * the axes data changes
    */
  var onAxisValueChangedObservable: Observable[Y] = js.native
  /**
    * Observers registered here will be triggered when the state of a button changes
    * State change is either pressed / touched / value
    */
  var onButtonStateChangedObservable: Observable[WebXRControllerComponent] = js.native
  /**
    * the type of the component
    */
  var `type`: MotionControllerComponentType = js.native
  /**
    * The current axes data. If this component has no axes it will still return an object { x: 0, y: 0 }
    */
  def axes: IWebXRMotionControllerAxesValue = js.native
  /**
    * Get the changes. Elements will be populated only if they changed with their previous and current value
    */
  def changes: IWebXRMotionControllerComponentChanges = js.native
  /**
    * Return whether or not the component changed the last frame
    */
  def hasChanges: Boolean = js.native
  /**
    * Are there axes correlating to this component
    * @return true is axes data is available
    */
  def isAxes(): Boolean = js.native
  /**
    * Is this component a button (hence - pressable)
    * @returns true if can be pressed
    */
  def isButton(): Boolean = js.native
  /**
    * is the button currently pressed
    */
  def pressed: Boolean = js.native
  /**
    * is the button currently touched
    */
  def touched: Boolean = js.native
  /**
    * update this component using the gamepad object it is in. Called on every frame
    * @param nativeController the native gamepad controller object
    */
  def update(nativeController: IMinimalMotionControllerObject): Unit = js.native
  /**
    * Get the current value of this component
    */
  def value: Double = js.native
}

object WebXRControllerComponent {
  @scala.inline
  def apply(
    _axes: js.Any,
    _axesIndices: js.Any,
    _buttonIndex: js.Any,
    _changes: js.Any,
    _currentValue: js.Any,
    _hasChanges: js.Any,
    _pressed: js.Any,
    _touched: js.Any,
    axes: () => IWebXRMotionControllerAxesValue,
    changes: () => IWebXRMotionControllerComponentChanges,
    dispose: () => Unit,
    hasChanges: () => Boolean,
    id: String,
    isAxes: () => Boolean,
    isButton: () => Boolean,
    onAxisValueChangedObservable: Observable[Y],
    onButtonStateChangedObservable: Observable[WebXRControllerComponent],
    pressed: () => Boolean,
    touched: () => Boolean,
    `type`: MotionControllerComponentType,
    update: IMinimalMotionControllerObject => Unit,
    value: () => Double
  ): WebXRControllerComponent = {
    val __obj = js.Dynamic.literal(_axes = _axes.asInstanceOf[js.Any], _axesIndices = _axesIndices.asInstanceOf[js.Any], _buttonIndex = _buttonIndex.asInstanceOf[js.Any], _changes = _changes.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _hasChanges = _hasChanges.asInstanceOf[js.Any], _pressed = _pressed.asInstanceOf[js.Any], _touched = _touched.asInstanceOf[js.Any], axes = js.Any.fromFunction0(axes), changes = js.Any.fromFunction0(changes), dispose = js.Any.fromFunction0(dispose), hasChanges = js.Any.fromFunction0(hasChanges), id = id.asInstanceOf[js.Any], isAxes = js.Any.fromFunction0(isAxes), isButton = js.Any.fromFunction0(isButton), onAxisValueChangedObservable = onAxisValueChangedObservable.asInstanceOf[js.Any], onButtonStateChangedObservable = onButtonStateChangedObservable.asInstanceOf[js.Any], pressed = js.Any.fromFunction0(pressed), touched = js.Any.fromFunction0(touched), update = js.Any.fromFunction1(update), value = js.Any.fromFunction0(value))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRControllerComponent]
  }
  @scala.inline
  implicit class WebXRControllerComponentOps[Self <: WebXRControllerComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_axes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_axesIndices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_axesIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_buttonIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_buttonIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_changes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hasChanges(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hasChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_touched(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_touched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxes(value: () => IWebXRMotionControllerAxesValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChanges(value: () => IWebXRMotionControllerComponentChanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasChanges(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAxes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsButton(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnAxisValueChangedObservable(value: Observable[Y]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAxisValueChangedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnButtonStateChangedObservable(value: Observable[WebXRControllerComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonStateChangedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouched(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touched")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: MotionControllerComponentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: IMinimalMotionControllerObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

