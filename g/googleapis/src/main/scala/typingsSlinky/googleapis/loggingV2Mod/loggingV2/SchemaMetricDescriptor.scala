package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a metric type and its schema. Once a metric descriptor is created,
  * deleting or altering it stops data collection and makes the metric
  * type&#39;s existing data unusable.
  */
@js.native
trait SchemaMetricDescriptor extends js.Object {
  /**
    * A detailed description of the metric, which can be used in documentation.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A concise name for the metric, which can be displayed in user interfaces.
    * Use sentence case without an ending period, for example &quot;Request
    * count&quot;. This field is optional but it is recommended to be set for
    * any metrics associated with user-visible concepts, such as Quota.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The set of labels that can be used to describe a specific instance of
    * this metric type. For example, the
    * appengine.googleapis.com/http/server/response_latencies metric type has a
    * label for the HTTP response code, response_code, so you can look at
    * latencies for successful responses or just for responses that failed.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.native
  /**
    * Optional. Metadata which can be used to guide usage of the metric.
    */
  var metadata: js.UndefOr[SchemaMetricDescriptorMetadata] = js.native
  /**
    * Whether the metric records instantaneous values, changes to a value, etc.
    * Some combinations of metric_kind and value_type might not be supported.
    */
  var metricKind: js.UndefOr[String] = js.native
  /**
    * The resource name of the metric descriptor.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The metric type, including its DNS name prefix. The type is not
    * URL-encoded. All user-defined metric types have the DNS name
    * custom.googleapis.com or external.googleapis.com. Metric types should use
    * a natural hierarchical grouping. For example:
    * &quot;custom.googleapis.com/invoice/paid/amount&quot;
    * &quot;external.googleapis.com/prometheus/up&quot;
    * &quot;appengine.googleapis.com/http/server/response_latencies&quot;
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The unit in which the metric value is reported. It is only applicable if
    * the value_type is INT64, DOUBLE, or DISTRIBUTION. The supported units are
    * a subset of The Unified Code for Units of Measure
    * (http://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT) bit bit
    * By byte s second min minute h hour d dayPrefixes (PREFIX) k kilo (10**3)
    * M mega (10**6) G giga (10**9) T tera (10**12) P peta (10**15) E exa
    * (10**18) Z zetta (10**21) Y yotta (10**24) m milli (10**-3) u micro
    * (10**-6) n nano (10**-9) p pico (10**-12) f femto (10**-15) a atto
    * (10**-18) z zepto (10**-21) y yocto (10**-24) Ki kibi (2**10) Mi mebi
    * (2**20) Gi gibi (2**30) Ti tebi (2**40)GrammarThe grammar also includes
    * these connectors: / division (as an infix operator, e.g. 1/s). .
    * multiplication (as an infix operator, e.g. GBy.d)The grammar for a unit
    * is as follows: Expression = Component { &quot;.&quot; Component } {
    * &quot;/&quot; Component } ;  Component = ( [ PREFIX ] UNIT |
    * &quot;%&quot; ) [ Annotation ]           | Annotation           |
    * &quot;1&quot;           ;  Annotation = &quot;{&quot; NAME &quot;}&quot;
    * ; Notes: Annotation is just a comment if it follows a UNIT and is
    * equivalent to 1 if it is used alone. For examples,  {requests}/s == 1/s,
    * By{transmitted}/s == By/s. NAME is a sequence of non-blank printable
    * ASCII characters not  containing &#39;{&#39; or &#39;}&#39;. 1 represents
    * dimensionless value 1, such as in 1/s. % represents dimensionless value
    * 1/100, and annotates values giving  a percentage.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * Whether the measurement is an integer, a floating-point number, etc. Some
    * combinations of metric_kind and value_type might not be supported.
    */
  var valueType: js.UndefOr[String] = js.native
}

object SchemaMetricDescriptor {
  @scala.inline
  def apply(): SchemaMetricDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricDescriptor]
  }
  @scala.inline
  implicit class SchemaMetricDescriptorOps[Self <: SchemaMetricDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[SchemaLabelDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaMetricDescriptorMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricKind")(js.undefined)
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
  }
  
}

