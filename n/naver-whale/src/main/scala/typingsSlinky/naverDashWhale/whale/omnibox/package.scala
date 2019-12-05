package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omnibox {
  import typingsSlinky.chrome.chrome.events.Event

  type OmniboxInputCancelledEvent = Event[js.Function0[Unit]]
  type OmniboxInputChangedEvent = Event[
    js.Function2[
      /* text */ String, 
      /* suggest */ js.Function1[
        /* suggestResults */ js.Array[typingsSlinky.chrome.chrome.omnibox.SuggestResult], 
        Unit
      ], 
      Unit
    ]
  ]
  type OmniboxInputEnteredEvent = Event[
    js.Function2[
      /* text */ String, 
      /* disposition */ typingsSlinky.chrome.chrome.omnibox.OnInputEnteredDisposition, 
      Unit
    ]
  ]
  type OmniboxInputStartedEvent = Event[js.Function0[Unit]]
  type OmniboxSuggestionDeletedEvent = Event[js.Function1[/* text */ String, Unit]]
}
