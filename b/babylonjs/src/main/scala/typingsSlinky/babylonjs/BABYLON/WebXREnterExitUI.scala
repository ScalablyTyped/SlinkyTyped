package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXREnterExitUI extends IDisposable {
  var _activeButton: js.Any = js.native
  var _buttons: js.Any = js.native
  var _overlay: js.Any = js.native
  var _updateButtons: js.Any = js.native
  /**
    * Fired every time the active button is changed.
    *
    * When xr is entered via a button that launches xr that button will be the callback parameter
    *
    * When exiting xr the callback parameter will be null)
    */
  var activeButtonChangedObservable: Observable[Nullable[WebXREnterExitUIButton]] = js.native
  /** version of the options passed to this UI */
  var options: WebXREnterExitUIOptions = js.native
  var scene: js.Any = js.native
}

object WebXREnterExitUI {
  @scala.inline
  def apply(
    _activeButton: js.Any,
    _buttons: js.Any,
    _overlay: js.Any,
    _updateButtons: js.Any,
    activeButtonChangedObservable: Observable[Nullable[WebXREnterExitUIButton]],
    dispose: () => Unit,
    options: WebXREnterExitUIOptions,
    scene: js.Any
  ): WebXREnterExitUI = {
    val __obj = js.Dynamic.literal(_activeButton = _activeButton.asInstanceOf[js.Any], _buttons = _buttons.asInstanceOf[js.Any], _overlay = _overlay.asInstanceOf[js.Any], _updateButtons = _updateButtons.asInstanceOf[js.Any], activeButtonChangedObservable = activeButtonChangedObservable.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), options = options.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXREnterExitUI]
  }
  @scala.inline
  implicit class WebXREnterExitUIOps[Self <: WebXREnterExitUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_activeButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_activeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_buttons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_overlay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_updateButtons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_updateButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveButtonChangedObservable(value: Observable[Nullable[WebXREnterExitUIButton]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeButtonChangedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: WebXREnterExitUIOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

