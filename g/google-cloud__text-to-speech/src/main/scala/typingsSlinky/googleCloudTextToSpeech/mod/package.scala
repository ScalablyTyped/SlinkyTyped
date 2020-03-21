package typingsSlinky.googleCloudTextToSpeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type APICallback[T] = js.Function2[
    /* err */ typingsSlinky.googleCloudTextToSpeech.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    scala.Unit
  ]
  type GoogleError = js.Any
  type ListVoicesOptions = typingsSlinky.googleCloudTextToSpeech.mod.CallOptions
  type ListVoicesResponse = js.Array[typingsSlinky.googleCloudTextToSpeech.mod.Voice]
  type SynthesizeSpeechOptions = typingsSlinky.googleCloudTextToSpeech.mod.CallOptions
}
