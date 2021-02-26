package typingsSlinky.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchedLogStream extends StObject {
  
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  
  /**
    * Indicates whether all the events in this log stream were searched.
    */
  var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.native
}
object SearchedLogStream {
  
  @scala.inline
  def apply(): SearchedLogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchedLogStream]
  }
  
  @scala.inline
  implicit class SearchedLogStreamMutableBuilder[Self <: SearchedLogStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
    @scala.inline
    def setSearchedCompletely(value: LogStreamSearchedCompletely): Self = StObject.set(x, "searchedCompletely", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchedCompletelyUndefined: Self = StObject.set(x, "searchedCompletely", js.undefined)
  }
}
