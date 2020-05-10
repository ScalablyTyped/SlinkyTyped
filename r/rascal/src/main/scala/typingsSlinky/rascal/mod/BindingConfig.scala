package typingsSlinky.rascal.mod

import typingsSlinky.rascal.rascalStrings.exchange
import typingsSlinky.rascal.rascalStrings.queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingConfig extends js.Object {
  var bindingKey: js.UndefOr[String] = js.native
  var bindingKeys: js.UndefOr[js.Array[String]] = js.native
  var destination: js.UndefOr[String] = js.native
  var destinationType: js.UndefOr[queue | exchange] = js.native
  var options: js.UndefOr[js.Any] = js.native
  var source: js.UndefOr[String] = js.native
}

object BindingConfig {
  @scala.inline
  def apply(): BindingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingConfig]
  }
  @scala.inline
  implicit class BindingConfigOps[Self <: BindingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationType(value: queue | exchange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationType")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

