package typingsSlinky.awsSdkClientS3Node.typesMetricsConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesMetricsFilterMod.UnmarshalledMetricsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMetricsConfiguration extends MetricsConfiguration {
  /**
    * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledMetricsConfiguration: js.UndefOr[UnmarshalledMetricsFilter] = js.native
}

object UnmarshalledMetricsConfiguration {
  @scala.inline
  def apply(Id: String): UnmarshalledMetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMetricsConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledMetricsConfigurationOps[Self <: UnmarshalledMetricsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: UnmarshalledMetricsFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
  }
  
}

