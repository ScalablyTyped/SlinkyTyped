package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DocumentClassifierFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassifierFilter]
  }
  
  @scala.inline
  implicit class DocumentClassifierFilterOps[Self <: DocumentClassifierFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: ModelStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setSubmitTimeAfter(value: js.Date): Self = this.set("SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTimeAfter: Self = this.set("SubmitTimeAfter", js.undefined)
    
    @scala.inline
    def setSubmitTimeBefore(value: js.Date): Self = this.set("SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTimeBefore: Self = this.set("SubmitTimeBefore", js.undefined)
  }
}
