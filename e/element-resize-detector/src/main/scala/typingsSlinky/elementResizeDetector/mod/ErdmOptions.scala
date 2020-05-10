package typingsSlinky.elementResizeDetector.mod

import typingsSlinky.elementResizeDetector.elementResizeDetectorStrings.`object`
import typingsSlinky.elementResizeDetector.elementResizeDetectorStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErdmOptions extends js.Object {
  /**
    * Determines if listeners should be called when they are getting added.
    * If true, the listener is guaranteed to be called when it has been added.
    * If false, the listener will not be guarenteed to be called when
    * it has been added (does not prevent it from being called).
    *
    * @default true
    */
  var callOnAdd: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the the system will report debug messages as default
    * for the listenTo method.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * A custom id handler that is responsible for generating,
    * setting and retrieving id's for elements.
    * If not provided, a default id handler will be used.
    */
  var idHandler: js.UndefOr[IdHandlerProps] = js.native
  /**
    * A custom reporter that handles reporting logs, warnings and errors.
    * If not provided, a default id handler will be used.
    * If set to false, then nothing will be reported.
    */
  var reporter: js.UndefOr[ReporterProps] = js.native
  var strategy: js.UndefOr[scroll | `object`] = js.native
}

object ErdmOptions {
  @scala.inline
  def apply(): ErdmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErdmOptions]
  }
  @scala.inline
  implicit class ErdmOptionsOps[Self <: ErdmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallOnAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOnAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOnAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withIdHandler(value: IdHandlerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: ReporterProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: scroll | `object`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

