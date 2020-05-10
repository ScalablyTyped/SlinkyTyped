package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerFilter extends js.Object {
  /**
    * The status of an entity recognizer.
    */
  var Status: js.UndefOr[ModelStatus] = js.native
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Filters the list of entities based on the time that the list was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.native
}

object EntityRecognizerFilter {
  @scala.inline
  def apply(): EntityRecognizerFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerFilter]
  }
  @scala.inline
  implicit class EntityRecognizerFilterOps[Self <: EntityRecognizerFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: ModelStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTimeBefore")(js.undefined)
        ret
    }
  }
  
}

