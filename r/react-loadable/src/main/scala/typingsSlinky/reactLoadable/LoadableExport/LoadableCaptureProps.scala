package typingsSlinky.reactLoadable.LoadableExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadableCaptureProps extends js.Object {
  
  /**
    * Function called for every moduleName that is rendered via React Loadable.
    */
  def report(moduleName: String): Unit = js.native
}
object LoadableCaptureProps {
  
  @scala.inline
  def apply(report: String => Unit): LoadableCaptureProps = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[LoadableCaptureProps]
  }
  
  @scala.inline
  implicit class LoadableCapturePropsOps[Self <: LoadableCaptureProps] (val x: Self) extends AnyVal {
    
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
    def setReport(value: String => Unit): Self = this.set("report", js.Any.fromFunction1(value))
  }
}
