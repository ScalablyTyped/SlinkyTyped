package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentClassifierFilter extends js.Object {
  /**
    * Filters the list of classifiers based on status. 
    */
  var Status: js.UndefOr[ModelStatus] = js.native
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted after the specified time. Classifiers are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted before the specified time. Classifiers are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.native
}

object DocumentClassifierFilter {
  @scala.inline
  def apply(Status: ModelStatus = null, SubmitTimeAfter: js.Date = null, SubmitTimeBefore: js.Date = null): DocumentClassifierFilter = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmitTimeAfter != null) __obj.updateDynamic("SubmitTimeAfter")(SubmitTimeAfter.asInstanceOf[js.Any])
    if (SubmitTimeBefore != null) __obj.updateDynamic("SubmitTimeBefore")(SubmitTimeBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentClassifierFilter]
  }
}

