package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupPlansInput extends js.Object {
  
  /**
    * A Boolean value with a default value of FALSE that returns deleted backup plans when set to TRUE.
    */
  var IncludeDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.backupMod.MaxResults] = js.native
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListBackupPlansInput {
  
  @scala.inline
  def apply(): ListBackupPlansInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupPlansInput]
  }
  
  @scala.inline
  implicit class ListBackupPlansInputOps[Self <: ListBackupPlansInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = this.set("IncludeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDeleted: Self = this.set("IncludeDeleted", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
