package typingsSlinky.reactMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataFunc = js.Function2[
    /* query */ java.lang.String, 
    /* callback */ js.Function1[
      /* data */ js.Array[typingsSlinky.reactMentions.mod.SuggestionDataItem], 
      scala.Unit
    ], 
    scala.Unit | js.Array[typingsSlinky.reactMentions.mod.SuggestionDataItem]
  ]
  type DisplayTransformFunc = js.Function2[/* id */ java.lang.String, /* display */ java.lang.String, java.lang.String]
  type MentionsInputClass = slinky.core.ReactComponentClass[typingsSlinky.reactMentions.mod.MentionsInputProps]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type OnChangeHandlerFunc = js.Function4[
    /* event */ typingsSlinky.reactMentions.AnonTarget, 
    /* newValue */ java.lang.String, 
    /* newPlainTextValue */ java.lang.String, 
    /* mentions */ js.Array[typingsSlinky.reactMentions.mod.MentionItem], 
    scala.Unit
  ]
}
