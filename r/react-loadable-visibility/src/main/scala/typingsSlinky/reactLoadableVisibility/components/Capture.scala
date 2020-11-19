package typingsSlinky.reactLoadableVisibility.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactLoadable.LoadableExport.LoadableCaptureProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Capture {
  
  @JSImport("react-loadable-visibility/react-loadable", "default.Capture")
  @js.native
  object component extends js.Object
  
  def withProps(p: LoadableCaptureProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(report: String => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[LoadableCaptureProps]))
  }
}
