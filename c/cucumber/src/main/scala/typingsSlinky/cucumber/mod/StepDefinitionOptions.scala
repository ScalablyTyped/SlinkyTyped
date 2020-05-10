package typingsSlinky.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepDefinitionOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.native
  var wrapperOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object StepDefinitionOptions {
  @scala.inline
  def apply(): StepDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepDefinitionOptions]
  }
  @scala.inline
  implicit class StepDefinitionOptionsOps[Self <: StepDefinitionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperOptions")(js.undefined)
        ret
    }
  }
  
}

