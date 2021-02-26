package typingsSlinky.grommet

import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object announceContextMod {
  
  @JSImport("grommet/contexts/AnnounceContext", "AnnounceContext")
  @js.native
  val AnnounceContext: Context[AnnounceValue] = js.native
  
  type AnnounceMessage = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.off
    - typingsSlinky.grommet.grommetStrings.polite
    - typingsSlinky.grommet.grommetStrings.assertive
  */
  trait AnnounceMode extends StObject
  object AnnounceMode {
    
    @scala.inline
    def assertive: typingsSlinky.grommet.grommetStrings.assertive = "assertive".asInstanceOf[typingsSlinky.grommet.grommetStrings.assertive]
    
    @scala.inline
    def off: typingsSlinky.grommet.grommetStrings.off = "off".asInstanceOf[typingsSlinky.grommet.grommetStrings.off]
    
    @scala.inline
    def polite: typingsSlinky.grommet.grommetStrings.polite = "polite".asInstanceOf[typingsSlinky.grommet.grommetStrings.polite]
  }
  
  type AnnounceValue = js.Function3[/* message */ AnnounceMessage, /* mode */ AnnounceMode, /* timeout */ Timeout, Unit]
  
  type Timeout = Double
}
