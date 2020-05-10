package typingsSlinky.pulumiAws.configurationSetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSetArgs extends js.Object {
  /**
    * The name of the configuration set
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ConfigurationSetArgs {
  @scala.inline
  def apply(): ConfigurationSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSetArgs]
  }
  @scala.inline
  implicit class ConfigurationSetArgsOps[Self <: ConfigurationSetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
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
  }
  
}

