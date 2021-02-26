package typingsSlinky.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intentsMod {
  
  @js.native
  sealed trait Intents extends StObject
  @JSImport("openfin/_v2/fdc3/intents", "Intents")
  @js.native
  object Intents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Intents with String] = js.native
    
    @js.native
    sealed trait DIAL_CALL extends Intents
    /* "DialCall" */ val DIAL_CALL: typingsSlinky.openfin.intentsMod.Intents.DIAL_CALL with String = js.native
    
    @js.native
    sealed trait SAVE_CONTACT extends Intents
    /* "SaveContact" */ val SAVE_CONTACT: typingsSlinky.openfin.intentsMod.Intents.SAVE_CONTACT with String = js.native
    
    @js.native
    sealed trait SAVE_INSTRUMENT extends Intents
    /* "SaveInstrument" */ val SAVE_INSTRUMENT: typingsSlinky.openfin.intentsMod.Intents.SAVE_INSTRUMENT with String = js.native
    
    @js.native
    sealed trait SHARE_CONTEXT extends Intents
    /* "ShareContext" */ val SHARE_CONTEXT: typingsSlinky.openfin.intentsMod.Intents.SHARE_CONTEXT with String = js.native
    
    @js.native
    sealed trait START_CALL extends Intents
    /* "StartCall" */ val START_CALL: typingsSlinky.openfin.intentsMod.Intents.START_CALL with String = js.native
    
    @js.native
    sealed trait START_CHAT extends Intents
    /* "StartChat" */ val START_CHAT: typingsSlinky.openfin.intentsMod.Intents.START_CHAT with String = js.native
    
    @js.native
    sealed trait VIEW_CHART extends Intents
    /* "ViewChart" */ val VIEW_CHART: typingsSlinky.openfin.intentsMod.Intents.VIEW_CHART with String = js.native
    
    @js.native
    sealed trait VIEW_CONTACT extends Intents
    /* "ViewContact" */ val VIEW_CONTACT: typingsSlinky.openfin.intentsMod.Intents.VIEW_CONTACT with String = js.native
    
    @js.native
    sealed trait VIEW_NEWS extends Intents
    /* "ViewNews" */ val VIEW_NEWS: typingsSlinky.openfin.intentsMod.Intents.VIEW_NEWS with String = js.native
    
    @js.native
    sealed trait VIEW_QUOTE extends Intents
    /* "ViewQuote" */ val VIEW_QUOTE: typingsSlinky.openfin.intentsMod.Intents.VIEW_QUOTE with String = js.native
  }
}
