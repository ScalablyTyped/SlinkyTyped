package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputFormatConfiguration extends js.Object {
  /**
    * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null, the server rejects the request.
    */
  var Deserializer: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.Deserializer] = js.native
}

object InputFormatConfiguration {
  @scala.inline
  def apply(): InputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFormatConfiguration]
  }
  @scala.inline
  implicit class InputFormatConfigurationOps[Self <: InputFormatConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeserializer(value: Deserializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deserializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deserializer")(js.undefined)
        ret
    }
  }
  
}

