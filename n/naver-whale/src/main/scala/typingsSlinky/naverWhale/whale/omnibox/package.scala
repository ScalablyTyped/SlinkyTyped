package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omnibox {
  type OmniboxInputCancelledEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type OmniboxInputChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* text */ java.lang.String, 
      /* suggest */ js.Function1[
        /* suggestResults */ js.Array[typingsSlinky.chrome.chrome.omnibox.SuggestResult], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type OmniboxInputEnteredEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* text */ java.lang.String, 
      /* disposition */ typingsSlinky.chrome.chrome.omnibox.OnInputEnteredDisposition, 
      scala.Unit
    ]
  ]
  type OmniboxInputStartedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type OmniboxSuggestionDeletedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* text */ java.lang.String, scala.Unit]]
}
