package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttsEngine {
  import typingsSlinky.chrome.chrome.events.Event
  import typingsSlinky.chrome.chrome.tts.TtsEvent

  type TtsEngineSpeakEvent = Event[
    js.Function3[
      /* utterance */ String, 
      /* options */ typingsSlinky.chrome.chrome.ttsEngine.SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ TtsEvent, Unit], 
      Unit
    ]
  ]
}
