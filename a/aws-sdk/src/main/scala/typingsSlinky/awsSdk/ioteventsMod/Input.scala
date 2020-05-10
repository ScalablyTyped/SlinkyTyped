package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  /**
    * Information about the configuration of an input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.native
  /**
    * The definition of the input.
    */
  var inputDefinition: js.UndefOr[InputDefinition] = js.native
}

object Input {
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputConfiguration(value: InputConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDefinition(value: InputDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDefinition")(js.undefined)
        ret
    }
  }
  
}

