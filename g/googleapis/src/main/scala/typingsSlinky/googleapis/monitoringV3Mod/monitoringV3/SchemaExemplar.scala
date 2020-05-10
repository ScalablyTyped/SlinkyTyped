package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exemplars are example points that may be used to annotate aggregated
  * distribution values. They are metadata that gives information about a
  * particular value added to a Distribution bucket, such as a trace ID that
  * was active when a value was added. They may contain further information,
  * such as a example values and timestamps, origin, etc.
  */
@js.native
trait SchemaExemplar extends js.Object {
  /**
    * Contextual information about the example value. Examples are:Trace:
    * type.googleapis.com/google.monitoring.v3.SpanContextLiteral string:
    * type.googleapis.com/google.protobuf.StringValueLabels dropped during
    * aggregation:  type.googleapis.com/google.monitoring.v3.DroppedLabelsThere
    * may be only a single attachment of any given message type in a single
    * exemplar, and this is enforced by the system.
    */
  var attachments: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * The observation (sampling) time of the above value.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Value of the exemplar point. This value determines to which bucket the
    * exemplar belongs.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaExemplar {
  @scala.inline
  def apply(): SchemaExemplar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExemplar]
  }
  @scala.inline
  implicit class SchemaExemplarOps[Self <: SchemaExemplar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

