package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputContext extends StObject {
  
  /**
    * The name of the context.
    */
  var name: OutputContextName = js.native
  
  /**
    * The number of seconds that the context should be active after it is first sent in a PostContent or PostText response. You can set the value between 5 and 86,400 seconds (24 hours).
    */
  var timeToLiveInSeconds: ContextTimeToLiveInSeconds = js.native
  
  /**
    * The number of conversation turns that the context should be active. A conversation turn is one PostContent or PostText request and the corresponding response from Amazon Lex.
    */
  var turnsToLive: ContextTurnsToLive = js.native
}
object OutputContext {
  
  @scala.inline
  def apply(
    name: OutputContextName,
    timeToLiveInSeconds: ContextTimeToLiveInSeconds,
    turnsToLive: ContextTurnsToLive
  ): OutputContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timeToLiveInSeconds = timeToLiveInSeconds.asInstanceOf[js.Any], turnsToLive = turnsToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputContext]
  }
  
  @scala.inline
  implicit class OutputContextMutableBuilder[Self <: OutputContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: OutputContextName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveInSeconds(value: ContextTimeToLiveInSeconds): Self = StObject.set(x, "timeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurnsToLive(value: ContextTurnsToLive): Self = StObject.set(x, "turnsToLive", value.asInstanceOf[js.Any])
  }
}
