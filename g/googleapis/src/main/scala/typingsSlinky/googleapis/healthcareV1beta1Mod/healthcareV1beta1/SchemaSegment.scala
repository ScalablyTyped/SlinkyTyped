package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

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
    * zero-based indexes separated by dots to identify Fields, components and
    * sub-components. A bracket notation is also used to identify different
    * instances of a repeated field. Regex for key:
    * (\d+)(\[\d+\])?(.\d+)?(.\d+)?  Examples of (key, value) pairs: - (0.1,
    * &quot;foo&quot;): Component 1 of Field 0 has the value &quot;foo&quot;. -
    * (1.1.2, &quot;bar&quot;): Sub-component 2 of Component 1 of field 1 has
    * the value &quot;bar&quot;. - (1[2].1, &quot;baz&quot;): Component 1 of
    * Instance 2 of Field 1, which is repeated, has the value &quot;baz&quot;.
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

