package typingsSlinky.rcAlign.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcAlign.interfaceMod.AlignResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_AlignPropsRefAttributes_132971729[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def monitorBufferTime(value: Double): this.type = set("monitorBufferTime", value.asInstanceOf[js.Any])
  @scala.inline
  def monitorWindowResize(value: Boolean): this.type = set("monitorWindowResize", value.asInstanceOf[js.Any])
  @scala.inline
  def onAlign(value: (/* source */ HTMLElement, /* result */ AlignResult) => Unit): this.type = set("onAlign", js.Any.fromFunction2(value))
}

