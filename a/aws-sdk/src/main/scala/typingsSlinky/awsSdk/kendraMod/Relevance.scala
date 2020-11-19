package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relevance extends js.Object {
  
  /**
    * Specifies the time period that the boost applies to. For example, to make the boost apply to documents with the field value within the last month, you would use "2628000s". Once the field value is beyond the specified range, the effect of the boost drops off. The higher the importance, the faster the effect drops off. If you don't specify a value, the default is 3 months. The value of the field is a numeric string followed by the character "s", for example "86400s" for one day, or "604800s" for one week.  Only applies to DATE fields.
    */
  var Duration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Duration] = js.native
  
  /**
    * Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can only set the Freshness field on one DATE type field. Only applies to DATE fields.
    */
  var Freshness: js.UndefOr[DocumentMetadataBoolean] = js.native
  
  /**
    * The relative importance of the field in the search. Larger numbers provide more of a boost than smaller numbers.
    */
  var Importance: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Importance] = js.native
  
  /**
    * Determines how values should be interpreted. When the RankOrder field is ASCENDING, higher numbers are better. For example, a document with a rating score of 10 is higher ranking than a document with a rating score of 1. When the RankOrder field is DESCENDING, lower numbers are better. For example, in a task tracking application, a priority 1 task is more important than a priority 5 task. Only applies to LONG and DOUBLE fields.
    */
  var RankOrder: js.UndefOr[Order] = js.native
  
  /**
    * A list of values that should be given a different boost when they appear in the result list. For example, if you are boosting a field called "department," query terms that match the department field are boosted in the result. However, you can add entries from the department field to boost documents with those values higher.  For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3 those departments are given special attention when they appear in the metadata of a document. When those terms appear they are given the specified importance instead of the regular importance for the boost.
    */
  var ValueImportanceMap: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ValueImportanceMap] = js.native
}
object Relevance {
  
  @scala.inline
  def apply(): Relevance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relevance]
  }
  
  @scala.inline
  implicit class RelevanceOps[Self <: Relevance] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Duration): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setFreshness(value: DocumentMetadataBoolean): Self = this.set("Freshness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreshness: Self = this.set("Freshness", js.undefined)
    
    @scala.inline
    def setImportance(value: Importance): Self = this.set("Importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportance: Self = this.set("Importance", js.undefined)
    
    @scala.inline
    def setRankOrder(value: Order): Self = this.set("RankOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRankOrder: Self = this.set("RankOrder", js.undefined)
    
    @scala.inline
    def setValueImportanceMap(value: ValueImportanceMap): Self = this.set("ValueImportanceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueImportanceMap: Self = this.set("ValueImportanceMap", js.undefined)
  }
}
