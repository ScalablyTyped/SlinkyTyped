package typingsSlinky.reactHotLoader.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppContainerProps extends js.Object {
  var errorBoundary: js.UndefOr[Boolean] = js.native
  var errorReporter: js.UndefOr[ReactComponentClass[ErrorReporterProps]] = js.native
}

object AppContainerProps {
  @scala.inline
  def apply(): AppContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppContainerProps]
  }
  @scala.inline
  implicit class AppContainerPropsOps[Self <: AppContainerProps] (val x: Self) extends AnyVal {
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
    def setErrorBoundary(value: Boolean): Self = this.set("errorBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorBoundary: Self = this.set("errorBoundary", js.undefined)
    @scala.inline
    def setErrorReporterFunctionComponent(value: ReactComponentClass[ErrorReporterProps]): Self = this.set("errorReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorReporterComponentClass(value: ReactComponentClass[ErrorReporterProps]): Self = this.set("errorReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorReporter(value: ReactComponentClass[ErrorReporterProps]): Self = this.set("errorReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorReporter: Self = this.set("errorReporter", js.undefined)
  }
  
}

