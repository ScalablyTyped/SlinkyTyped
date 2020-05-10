package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFWorkerParameters extends js.Object {
  var name: js.UndefOr[String] = js.native
  var port: js.UndefOr[js.Any] = js.native
  var verbosity: js.UndefOr[VerbosityLevel] = js.native
}

object PDFWorkerParameters {
  @scala.inline
  def apply(): PDFWorkerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFWorkerParameters]
  }
  @scala.inline
  implicit class PDFWorkerParametersOps[Self <: PDFWorkerParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbosity(value: VerbosityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(js.undefined)
        ret
    }
  }
  
}

