package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAnimationsTimelineTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.popmotion.libActionMod.Action

  type Instruction = Double | String | AnimationDefinition | (js.Array[AnimationDefinition | Double])
  type TrackActions = StringDictionary[Action]
  type Tracks = StringDictionary[js.Array[AnimationDefinition]]
}
