package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to the CheckIn method.
  */
@js.native
trait SchemaCheckInResponse extends js.Object {
  /**
    * The deadline by which the worker must request an extension.  The backend
    * will allow for network transmission time and other delays, but the worker
    * must attempt to transmit the extension request no later than the
    * deadline.
    */
  var deadline: js.UndefOr[String] = js.native
  /**
    * The metadata that describes the operation assigned to the worker.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaCheckInResponse {
  @scala.inline
  def apply(): SchemaCheckInResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInResponse]
  }
  @scala.inline
  implicit class SchemaCheckInResponseOps[Self <: SchemaCheckInResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[js.Any]): Self = {
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
  }
  
}

