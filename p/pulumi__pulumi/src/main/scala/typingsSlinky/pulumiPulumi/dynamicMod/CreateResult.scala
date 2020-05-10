package typingsSlinky.pulumiPulumi.dynamicMod

import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResult extends js.Object {
  /**
    * The ID of the created resource.
    */
  val id: ID = js.native
  /**
    * Any properties that were computed during creation.
    */
  val outs: js.UndefOr[js.Any] = js.native
}

object CreateResult {
  @scala.inline
  def apply(id: ID): CreateResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResult]
  }
  @scala.inline
  implicit class CreateResultOps[Self <: CreateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outs")(js.undefined)
        ret
    }
  }
  
}

