package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a linguistic service event.
  *
  * This type of event may be broadcast by a spell checker or hyphenator service implementation to inform its listeners (clients) that the results of
  * previous function calls may be different now. It is possible to suggest that hyphenation should be done again and/or the spelling of previously
  * incorrect or correct words should be checked again.
  * @see com.sun.star.linguistic2.XLinguServiceEventBroadcaster
  * @see com.sun.star.linguistic2.XLinguServiceEventListener
  * @see com.sun.star.linguistic2.SpellChecker
  * @see com.sun.star.linguistic2.Hyphenator
  * @see com.sun.star.lang.EventObject
  */
@js.native
trait LinguServiceEvent extends EventObject {
  
  /**
    * The type of event.
    *
    * The value may be combined via logical OR from those values defined in {@link com.sun.star.linguistic2.LinguServiceEventFlags}
    */
  var nEvent: Double = js.native
}
object LinguServiceEvent {
  
  @scala.inline
  def apply(Source: XInterface, nEvent: Double): LinguServiceEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], nEvent = nEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinguServiceEvent]
  }
  
  @scala.inline
  implicit class LinguServiceEventOps[Self <: LinguServiceEvent] (val x: Self) extends AnyVal {
    
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
    def setNEvent(value: Double): Self = this.set("nEvent", value.asInstanceOf[js.Any])
  }
}
