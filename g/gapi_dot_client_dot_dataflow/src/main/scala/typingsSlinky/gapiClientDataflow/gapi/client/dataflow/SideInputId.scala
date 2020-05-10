package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideInputId extends js.Object {
  /** The step that receives and usually consumes this side input. */
  var declaringStepName: js.UndefOr[String] = js.native
  /** The index of the side input, from the list of non_parallel_inputs. */
  var inputIndex: js.UndefOr[Double] = js.native
}

object SideInputId {
  @scala.inline
  def apply(): SideInputId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideInputId]
  }
  @scala.inline
  implicit class SideInputIdOps[Self <: SideInputId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclaringStepName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaringStepName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaringStepName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaringStepName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIndex")(js.undefined)
        ret
    }
  }
  
}

