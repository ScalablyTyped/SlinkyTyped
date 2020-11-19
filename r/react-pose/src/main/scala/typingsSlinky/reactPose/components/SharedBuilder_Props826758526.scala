package typingsSlinky.reactPose.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_Props826758526[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def animateOnMount(value: Boolean): this.type = set("animateOnMount", value.asInstanceOf[js.Any])
  
  @scala.inline
  def enterAfterExit(value: Boolean): this.type = set("enterAfterExit", value.asInstanceOf[js.Any])
  
  @scala.inline
  def enterPose(value: String): this.type = set("enterPose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def exitPose(value: String): this.type = set("exitPose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def flipMove(value: Boolean): this.type = set("flipMove", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onRest(value: () => Unit): this.type = set("onRest", js.Any.fromFunction0(value))
  
  @scala.inline
  def preEnterPose(value: String): this.type = set("preEnterPose", value.asInstanceOf[js.Any])
}
