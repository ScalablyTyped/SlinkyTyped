package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupPlansInput extends StObject {
  
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
  implicit class ListBackupPlansInputMutableBuilder[Self <: ListBackupPlansInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "IncludeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "IncludeDeleted", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
