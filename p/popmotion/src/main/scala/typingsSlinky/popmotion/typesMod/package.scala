package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnimationOptions[V] = typingsSlinky.popmotion.typesMod.PlaybackOptions[V] with (typingsSlinky.popmotion.typesMod.DecayOptions | typingsSlinky.popmotion.typesMod.KeyframeOptions[V] | typingsSlinky.popmotion.typesMod.SpringOptions)
  
  type Driver = js.Function1[
    /* update */ typingsSlinky.popmotion.typesMod.Update, 
    typingsSlinky.popmotion.typesMod.DriverControls
  ]
  
  type Update = js.Function1[/* timestamp */ scala.Double, scala.Unit]
}
