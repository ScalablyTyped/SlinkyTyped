package typingsSlinky.chrome.chrome.input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ime {
  
  type ActivateEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[/* engineID */ java.lang.String, /* screen */ java.lang.String, scala.Unit]
  ]
  
  type AssistiveWindowButtonClickedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[
      /* details */ typingsSlinky.chrome.chrome.input.ime.AssistiveWindowButtonClickedDetails, 
      scala.Unit
    ]
  ]
  
  type AssistiveWindowType = typingsSlinky.chrome.chromeStrings.undo
  
  type BlurEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* contextID */ scala.Double, scala.Unit]]
  
  type CandidateClickedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* engineID */ java.lang.String, 
      /* candidateID */ scala.Double, 
      /* button */ java.lang.String, 
      scala.Unit
    ]
  ]
  
  type DeactivatedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  
  type FocusEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* context */ typingsSlinky.chrome.chrome.input.ime.InputContext, scala.Unit]
  ]
  
  type InputContextUpdateEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* context */ typingsSlinky.chrome.chrome.input.ime.InputContext, scala.Unit]
  ]
  
  type InputResetEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  
  type KeyEventEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* engineID */ java.lang.String, 
      /* keyData */ typingsSlinky.chrome.chrome.input.ime.KeyboardEvent, 
      scala.Unit
    ]
  ]
  
  type MenuItemActivatedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[/* engineID */ java.lang.String, /* name */ java.lang.String, scala.Unit]
  ]
  
  type SurroundingTextChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* engineID */ java.lang.String, 
      /* surroundingInfo */ typingsSlinky.chrome.chrome.input.ime.SurroundingTextInfo, 
      scala.Unit
    ]
  ]
}
