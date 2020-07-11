package typingsSlinky.reactNavigationStack.transitionerMod

import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNavigationStack.typesMod.Scene
import typingsSlinky.reactNavigationStack.typesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var layout: TransitionerLayout
  var nextScenes: js.UndefOr[js.Array[Scene]] = js.undefined
  var position: Value
  var scenes: js.Array[Scene]
}

object State {
  @scala.inline
  def apply(layout: TransitionerLayout, position: Value, scenes: js.Array[Scene]): State = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setLayout(value: TransitionerLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Value): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setScenesVarargs(value: Scene*): Self = this.set("scenes", js.Array(value :_*))
    @scala.inline
    def setScenes(value: js.Array[Scene]): Self = this.set("scenes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextScenesVarargs(value: Scene*): Self = this.set("nextScenes", js.Array(value :_*))
    @scala.inline
    def setNextScenes(value: js.Array[Scene]): Self = this.set("nextScenes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextScenes: Self = this.set("nextScenes", js.undefined)
  }
  
}

