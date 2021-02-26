package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastCrawlInfo extends StObject {
  
  /**
    * If an error occurred, the error information about the last crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The log group for the last crawl.
    */
  var LogGroup: js.UndefOr[typingsSlinky.awsSdk.glueMod.LogGroup] = js.native
  
  /**
    * The log stream for the last crawl.
    */
  var LogStream: js.UndefOr[typingsSlinky.awsSdk.glueMod.LogStream] = js.native
  
  /**
    * The prefix for a message about this crawl.
    */
  var MessagePrefix: js.UndefOr[typingsSlinky.awsSdk.glueMod.MessagePrefix] = js.native
  
  /**
    * The time at which the crawl started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Status of the last crawl.
    */
  var Status: js.UndefOr[LastCrawlStatus] = js.native
}
object LastCrawlInfo {
  
  @scala.inline
  def apply(): LastCrawlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastCrawlInfo]
  }
  
  @scala.inline
  implicit class LastCrawlInfoMutableBuilder[Self <: LastCrawlInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: DescriptionString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setLogGroup(value: LogGroup): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
    
    @scala.inline
    def setLogStream(value: LogStream): Self = StObject.set(x, "LogStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamUndefined: Self = StObject.set(x, "LogStream", js.undefined)
    
    @scala.inline
    def setMessagePrefix(value: MessagePrefix): Self = StObject.set(x, "MessagePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagePrefixUndefined: Self = StObject.set(x, "MessagePrefix", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: LastCrawlStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
