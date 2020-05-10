package typingsSlinky.awsSdkClientS3Node.typesAnalyticsConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesAnalyticsFilterMod.AnalyticsFilter
import typingsSlinky.awsSdkClientS3Node.typesStorageClassAnalysisMod.StorageClassAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfiguration extends js.Object {
  /**
    * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
    */
  var Filter: js.UndefOr[AnalyticsFilter] = js.native
  /**
    * <p>The identifier used to represent an analytics configuration.</p>
    */
  var Id: String = js.native
  /**
    * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
    */
  var StorageClassAnalysis: typingsSlinky.awsSdkClientS3Node.typesStorageClassAnalysisMod.StorageClassAnalysis = js.native
}

object AnalyticsConfiguration {
  @scala.inline
  def apply(Id: String, StorageClassAnalysis: StorageClassAnalysis): AnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfiguration]
  }
  @scala.inline
  implicit class AnalyticsConfigurationOps[Self <: AnalyticsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageClassAnalysis(value: StorageClassAnalysis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClassAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: AnalyticsFilter): Self = {
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

