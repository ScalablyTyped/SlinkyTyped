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
    def withErrorBoundary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorReporterFunctionComponent(value: ReactComponentClass[ErrorReporterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorReporterComponentClass(value: ReactComponentClass[ErrorReporterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorReporter(value: ReactComponentClass[ErrorReporterProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReporter")(js.undefined)
        ret
    }
  }
  
}

