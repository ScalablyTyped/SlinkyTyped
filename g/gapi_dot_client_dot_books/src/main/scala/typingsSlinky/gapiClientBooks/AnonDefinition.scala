package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefinition extends js.Object {
  var definition: js.UndefOr[String] = js.native
  var examples: js.UndefOr[js.Array[AnonSource]] = js.native
}

object AnonDefinition {
  @scala.inline
  def apply(): AnonDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefinition]
  }
  @scala.inline
  implicit class AnonDefinitionOps[Self <: AnonDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withExamples(value: js.Array[AnonSource]): Self = {
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

