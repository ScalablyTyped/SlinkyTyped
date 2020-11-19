package typingsSlinky.rmcAlign.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IAlignProps_1056058104[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def childrenProps(value: js.Object): this.type = set("childrenProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def monitorBufferTime(value: Double): this.type = set("monitorBufferTime", value.asInstanceOf[js.Any])
  
  @scala.inline
  def monitorWindowResize(value: Boolean): this.type = set("monitorWindowResize", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAlign(value: (/* source */ js.Any, /* align */ js.Any) => Unit): this.type = set("onAlign", js.Any.fromFunction2(value))
}
