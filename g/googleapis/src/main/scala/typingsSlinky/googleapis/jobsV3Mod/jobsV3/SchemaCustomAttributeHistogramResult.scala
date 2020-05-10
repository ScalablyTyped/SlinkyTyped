package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Custom attribute histogram result.
  */
@js.native
trait SchemaCustomAttributeHistogramResult extends js.Object {
  /**
    * Stores the key of custom attribute the histogram is performed on.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Stores bucketed histogram counting result or min/max values for custom
    * attribute long values associated with `key`.
    */
  var longValueHistogramResult: js.UndefOr[SchemaNumericBucketingResult] = js.native
  /**
    * Stores a map from the values of string custom field associated with `key`
    * to the number of jobs with that value in this histogram result.
    */
  var stringValueHistogramResult: js.UndefOr[StringDictionary[Double]] = js.native
}

object SchemaCustomAttributeHistogramResult {
  @scala.inline
  def apply(): SchemaCustomAttributeHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttributeHistogramResult]
  }
  @scala.inline
  implicit class SchemaCustomAttributeHistogramResultOps[Self <: SchemaCustomAttributeHistogramResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLongValueHistogramResult(value: SchemaNumericBucketingResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValueHistogramResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongValueHistogramResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValueHistogramResult")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValueHistogramResult(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValueHistogramResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValueHistogramResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValueHistogramResult")(js.undefined)
        ret
    }
  }
  
}

