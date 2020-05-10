package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGeneration extends js.Object {
  var generation: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var objectPreconditions: js.UndefOr[AnonIfGenerationMatch] = js.native
}

object AnonGeneration {
  @scala.inline
  def apply(): AnonGeneration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGeneration]
  }
  @scala.inline
  implicit class AnonGenerationOps[Self <: AnonGeneration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
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
    def withObjectPreconditions(value: AnonIfGenerationMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPreconditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPreconditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPreconditions")(js.undefined)
        ret
    }
  }
  
}

