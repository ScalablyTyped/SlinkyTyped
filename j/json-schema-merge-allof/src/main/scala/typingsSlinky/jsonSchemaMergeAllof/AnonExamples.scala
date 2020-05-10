package typingsSlinky.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExamples extends js.Object {
  var examples: js.UndefOr[js.Any] = js.native
}

object AnonExamples {
  @scala.inline
  def apply(): AnonExamples = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExamples]
  }
  @scala.inline
  implicit class AnonExamplesOps[Self <: AnonExamples] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExamples(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.undefined)
        ret
    }
  }
  
}

