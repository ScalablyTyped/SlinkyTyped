package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ttsEngine {
  
  type TtsEngineSpeakEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* utterance */ java.lang.String, 
      /* options */ typingsSlinky.chrome.chrome.ttsEngine.SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ typingsSlinky.chrome.chrome.tts.TtsEvent, scala.Unit], 
      scala.Unit
    ]
  ]
}
