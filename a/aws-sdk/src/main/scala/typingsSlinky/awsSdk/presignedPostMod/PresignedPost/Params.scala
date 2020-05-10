package typingsSlinky.awsSdk.presignedPostMod.PresignedPost

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  /**
    * The S3 bucket to which the form should upload an attached file.
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * An array of conditions that must be met for the form upload to be
    * accepted by S3.
    */
  var Conditions: js.UndefOr[js.Array[StringDictionary[_] | (js.Tuple3[String, _, _])]] = js.native
  /**
    * The number of seconds for which the POST form's signed policy should be
    * valid. Defaults to 3600 (one hour).
    */
  var Expires: js.UndefOr[Double] = js.native
  /**
    * A hash of form fields to include in the presigned POST form. All fields
    * (except 'key') will be included as exact match conditions in the
    * presigned policy.
    */
  var Fields: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[StringDictionary[_] | (js.Tuple3[String, _, _])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expires")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fields")(js.undefined)
        ret
    }
  }
  
}

