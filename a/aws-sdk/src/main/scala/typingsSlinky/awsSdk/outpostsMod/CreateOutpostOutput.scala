package typingsSlinky.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOutpostOutput extends js.Object {
  var Outpost: js.UndefOr[typingsSlinky.awsSdk.outpostsMod.Outpost] = js.native
}

object CreateOutpostOutput {
  @scala.inline
  def apply(): CreateOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOutpostOutput]
  }
  @scala.inline
  implicit class CreateOutpostOutputOps[Self <: CreateOutpostOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutpost(value: Outpost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outpost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outpost")(js.undefined)
        ret
    }
  }
  
}

