package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A segment in a structured format.
  */
@js.native
trait SchemaSegment extends js.Object {
  /**
    * A mapping from the positional location to the value. The key string uses
    * indexes separated by dots to identify Fields, components and
    * sub-components. To be consistent with how the standard refers to
    * different parts of message, we use zero-based indexes for fields and
    * one-based indexes for components and sub-components. A bracket notation
    * is also used to identify different instances of a repeated field.
    * Zero-based indexes are used to refer to each instance. Regex for key:
    * (\d+)(\[\d+\])?(.\d+)?(.\d+)?  Examples of (key, value) pairs:  (0.1,
    * &quot;foo&quot;) denotes First component of Field 0 has the value
    * &quot;foo&quot;.  (1.1.2, &quot;bar&quot;) denotes Second sub-component
    * of the first component of Field 1 has the value &quot;bar&quot;. (1[0].1,
    * &quot;baz&quot;) denotes First component of the first Instance of Field
    * 1, which is repeated, has the value &quot;baz&quot;.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A string that indicates the type of segment, e.g., EVN, PID.
    */
  var segmentId: js.UndefOr[String] = js.native
  /**
    * Set ID for segments that can be in a set. This can be empty if it is
    * missing or it is not applicable.
    */
  var setId: js.UndefOr[String] = js.native
}

object SchemaSegment {
  @scala.inline
  def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  @scala.inline
  implicit class SchemaSegmentOps[Self <: SchemaSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.undefined)
        ret
    }
  }
  
}

