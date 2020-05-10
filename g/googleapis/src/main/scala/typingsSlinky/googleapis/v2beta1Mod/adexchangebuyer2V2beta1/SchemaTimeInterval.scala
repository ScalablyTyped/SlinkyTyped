package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interval of time, with an absolute start and end.
  */
@js.native
trait SchemaTimeInterval extends js.Object {
  /**
    * The timestamp marking the end of the range (exclusive) for which data is
    * included.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The timestamp marking the start of the range (inclusive) for which data
    * is included.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimeInterval {
  @scala.inline
  def apply(): SchemaTimeInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeInterval]
  }
  @scala.inline
  implicit class SchemaTimeIntervalOps[Self <: SchemaTimeInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

