package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FadeInOutBehavior extends Behavior[Mesh] {
  var _hoverValue: js.Any = js.native
  var _hovered: js.Any = js.native
  var _millisecondsPerFrame: js.Any = js.native
  var _ownerNode: js.Any = js.native
  var _setAllVisibility: js.Any = js.native
  var _update: js.Any = js.native
  /**
    * Time in milliseconds to delay before fading in (Default: 0)
    */
  var delay: Double = js.native
  /**
    * Time in milliseconds for the mesh to fade in (Default: 300)
    */
  var fadeInTime: Double = js.native
  /**
    * Triggers the mesh to begin fading in or out
    * @param value if the object should fade in or out (true to fade in)
    */
  def fadeIn(value: Boolean): Unit = js.native
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MFadeInOutBehavior: String = js.native
}

object FadeInOutBehavior {
  @scala.inline
  def apply(
    _hoverValue: js.Any,
    _hovered: js.Any,
    _millisecondsPerFrame: js.Any,
    _ownerNode: js.Any,
    _setAllVisibility: js.Any,
    _update: js.Any,
    attach: Mesh => Unit,
    delay: Double,
    detach: () => Unit,
    fadeIn: Boolean => Unit,
    fadeInTime: Double,
    init: () => Unit,
    name: () => String
  ): FadeInOutBehavior = {
    val __obj = js.Dynamic.literal(_hoverValue = _hoverValue.asInstanceOf[js.Any], _hovered = _hovered.asInstanceOf[js.Any], _millisecondsPerFrame = _millisecondsPerFrame.asInstanceOf[js.Any], _ownerNode = _ownerNode.asInstanceOf[js.Any], _setAllVisibility = _setAllVisibility.asInstanceOf[js.Any], _update = _update.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), delay = delay.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), fadeIn = js.Any.fromFunction1(fadeIn), fadeInTime = fadeInTime.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[FadeInOutBehavior]
  }
  @scala.inline
  implicit class FadeInOutBehaviorOps[Self <: FadeInOutBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_hoverValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hoverValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hovered(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_millisecondsPerFrame(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_millisecondsPerFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ownerNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ownerNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_setAllVisibility(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setAllVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_update(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFadeIn(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFadeInTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeInTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

