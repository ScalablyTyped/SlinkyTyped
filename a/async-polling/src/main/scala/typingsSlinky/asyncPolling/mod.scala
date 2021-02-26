package typingsSlinky.asyncPolling

import typingsSlinky.asyncPolling.anon.On
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-polling", JSImport.Namespace)
  @js.native
  def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Result], _], 
      _
    ],
    delay: Double
  ): On = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.asyncPolling.asyncPollingStrings.run
    - typingsSlinky.asyncPolling.asyncPollingStrings.start
    - typingsSlinky.asyncPolling.asyncPollingStrings.error
    - typingsSlinky.asyncPolling.asyncPollingStrings.result
    - typingsSlinky.asyncPolling.asyncPollingStrings.end
    - typingsSlinky.asyncPolling.asyncPollingStrings.schedule
    - typingsSlinky.asyncPolling.asyncPollingStrings.stop
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def end: typingsSlinky.asyncPolling.asyncPollingStrings.end = "end".asInstanceOf[typingsSlinky.asyncPolling.asyncPollingStrings.end]
    
    @scala.inline
    def error: typingsSlinky.asyncPolling.asyncPollingStrings.error = "error".asInstanceOf[typingsSlinky.asyncPolling.asyncPollingStrings.error]
    
    @scala.inline
    def result: typingsSlinky.asyncPolling.asyncPollingStrings.result = "result".asInstanceOf[typingsSlinky.asyncPolling.asyncPollingStrings.result]
    
    @scala.inline
    def run: typingsSlinky.asyncPolling.asyncPollingStrings.run = "run".asInstanceOf[typingsSlinky.asyncPolling.asyncPollingStrings.run]
    
    @scala.inline
    def schedule: typingsSlinky.asyncPolling.asyncPollingStrings.schedule = "schedule".asInstanceOf[typingsSlinky.asyncPolling.asyncPollingStrings.schedule]
    
    @scala.inline
    def start: typingsSlinky.asyncPolling.asyncPollingStrings.start = "start".asInstanceOf[typingsSlinky.asyncPolling.asyncPollingStrings.start]
    
    @scala.inline
    def stop: typingsSlinky.asyncPolling.asyncPollingStrings.stop = "stop".asInstanceOf[typingsSlinky.asyncPolling.asyncPollingStrings.stop]
  }
}
