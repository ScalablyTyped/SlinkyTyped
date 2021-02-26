package typingsSlinky.reactLoadable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactLoadable.LoadableExport.LoadableCaptureProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Capture {
  
  @scala.inline
  def apply(report: String => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[LoadableCaptureProps]))
  }
  
  @JSImport("react-loadable", "Capture")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoadableCaptureProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
