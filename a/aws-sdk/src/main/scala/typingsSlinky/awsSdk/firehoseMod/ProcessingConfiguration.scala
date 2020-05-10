package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingConfiguration extends js.Object {
  /**
    * Enables or disables data processing.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The data processors.
    */
  var Processors: js.UndefOr[ProcessorList] = js.native
}

object ProcessingConfiguration {
  @scala.inline
  def apply(): ProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingConfiguration]
  }
  @scala.inline
  implicit class ProcessingConfigurationOps[Self <: ProcessingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessors(value: ProcessorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processors")(js.undefined)
        ret
    }
  }
  
}

