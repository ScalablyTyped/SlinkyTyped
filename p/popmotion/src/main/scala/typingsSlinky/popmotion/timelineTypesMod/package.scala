package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object timelineTypesMod {
  
  type Instruction = scala.Double | java.lang.String | typingsSlinky.popmotion.timelineTypesMod.AnimationDefinition | (js.Array[typingsSlinky.popmotion.timelineTypesMod.AnimationDefinition | scala.Double])
  
  type TrackActions = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.popmotion.actionMod.Action[typingsSlinky.popmotion.actionTypesMod.ColdSubscription]
  ]
  
  type Tracks = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.popmotion.timelineTypesMod.AnimationDefinition]]
}
