package typingsSlinky.fmWebsync

import typingsSlinky.fmWebsync.fm.websync.initializeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object fm extends js.Object {
    
    @js.native
    object websync extends js.Object {
      
      @js.native
      class client ()
        extends typingsSlinky.fmWebsync.fm.websync.client
      /* static members */
      @js.native
      object client extends js.Object {
        
        /**
          * Initializes the client according to the specified configuration.
          * This method must always be called first. While is always executes synchronously, callbacks are allowed for the purposes of method chaining.
          */
        def initialize(config: initializeConfig): typingsSlinky.fmWebsync.fm.websync.client = js.native
      }
    }
  }
}
