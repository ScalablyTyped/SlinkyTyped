package typingsSlinky.promClient.mod.Pushgateway

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
  		 * Label sets used in the url when making a request to the Pushgateway,
  		 */
  var groupings: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * Jobname that is pushing the metric
  		 */
  var jobName: String = js.native
}

object Parameters {
  @scala.inline
  def apply(jobName: String): Parameters = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupings(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupings")(js.undefined)
        ret
    }
  }
  
}

