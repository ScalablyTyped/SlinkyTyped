package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a metric, by describing the source which generated the metric.
  */
@js.native
trait SchemaMetricStructuredName extends js.Object {
  /**
    * Zero or more labeled fields which identify the part of the job this
    * metric is associated with, such as the name of a step or collection.  For
    * example, built-in counters associated with steps will have
    * context[&#39;step&#39;] = &lt;step-name&gt;. Counters associated with
    * PCollections in the SDK will have context[&#39;pcollection&#39;] =
    * &lt;pcollection-name&gt;.
    */
  var context: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Worker-defined metric name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Origin (namespace) of metric name. May be blank for user-define metrics;
    * will be &quot;dataflow&quot; for metrics defined by the Dataflow service
    * or SDK.
    */
  var origin: js.UndefOr[String] = js.native
}

object SchemaMetricStructuredName {
  @scala.inline
  def apply(): SchemaMetricStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricStructuredName]
  }
  @scala.inline
  implicit class SchemaMetricStructuredNameOps[Self <: SchemaMetricStructuredName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: StringDictionary[String]): Self = {
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

