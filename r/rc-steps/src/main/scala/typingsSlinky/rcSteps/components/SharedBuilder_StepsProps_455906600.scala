package typingsSlinky.rcSteps.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSteps.anon.Description
import typingsSlinky.rcSteps.anon.Index
import typingsSlinky.rcSteps.interfaceMod.Icons
import typingsSlinky.rcSteps.interfaceMod.Status
import typingsSlinky.rcSteps.rcStepsStrings.default
import typingsSlinky.rcSteps.rcStepsStrings.horizontal
import typingsSlinky.rcSteps.rcStepsStrings.navigation
import typingsSlinky.rcSteps.rcStepsStrings.small
import typingsSlinky.rcSteps.rcStepsStrings.vertical
import typingsSlinky.rcSteps.stepsMod.ProgressDotRender
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_StepsProps_455906600[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
  
  @scala.inline
  def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icons(value: Icons): this.type = set("icons", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelPlacement(value: horizontal | vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def progressDotFunction2(value: (/* iconDot */ js.Any, /* info */ Index) => ReactElement): this.type = set("progressDot", js.Any.fromFunction2(value))
  
  @scala.inline
  def progressDot(value: ProgressDotRender | Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
  
  @scala.inline
  def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def status(value: Status): this.type = set("status", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stepIcon(value: /* info */ Description => ReactElement): this.type = set("stepIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: default | navigation): this.type = set("type", value.asInstanceOf[js.Any])
}
