package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricStructuredName extends js.Object {
  /**
    * Zero or more labeled fields which identify the part of the job this
    * metric is associated with, such as the name of a step or collection.
    *
    * For example, built-in counters associated with steps will have
    * context['step'] = <step-name>. Counters associated with PCollections
    * in the SDK will have context['pcollection'] = <pcollection-name>.
    */
  var context: js.UndefOr[Record[String, String]] = js.native
  /** Worker-defined metric name. */
  var name: js.UndefOr[String] = js.native
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics;
    * will be "dataflow" for metrics defined by the Dataflow service or SDK.
    */
  var origin: js.UndefOr[String] = js.native
}

object MetricStructuredName {
  @scala.inline
  def apply(): MetricStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricStructuredName]
  }
  @scala.inline
  implicit class MetricStructuredNameOps[Self <: MetricStructuredName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
  }
  
}

