package typingsSlinky.karmaJasmineHtmlReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineHtmlReporterOptions extends js.Object {
  /**
    * Suppress all messages (overrides other suppress settings)
    */
  var suppressAll: js.UndefOr[Boolean] = js.native
  /** Suppress failed messages */
  var suppressFailed: js.UndefOr[Boolean] = js.native
}

object JasmineHtmlReporterOptions {
  @scala.inline
  def apply(): JasmineHtmlReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineHtmlReporterOptions]
  }
  @scala.inline
  implicit class JasmineHtmlReporterOptionsOps[Self <: JasmineHtmlReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuppressAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressFailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFailed")(js.undefined)
        ret
    }
  }
  
}

