package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animationInterfaceMod {
  type AnimationBuilder = js.Function2[
    /* baseEl */ js.Any, 
    /* opts */ js.UndefOr[js.Any], 
    typingsSlinky.ionicCore.animationInterfaceMod.Animation
  ]
  type AnimationKeyFrames = (js.Tuple2[
    typingsSlinky.ionicCore.animationInterfaceMod.AnimationKeyFrameEdge, 
    typingsSlinky.ionicCore.animationInterfaceMod.AnimationKeyFrameEdge
  ]) | js.Array[typingsSlinky.ionicCore.animationInterfaceMod.AnimationKeyFrame]
  type AnimationLifecycle = js.Function2[
    /* currentStep */ typingsSlinky.ionicCore.ionicCoreNumbers.`0` | typingsSlinky.ionicCore.ionicCoreNumbers.`1`, 
    /* animation */ typingsSlinky.ionicCore.animationInterfaceMod.Animation, 
    scala.Unit
  ]
  type AnimationStyles = typingsSlinky.std.Record[java.lang.String, js.Any]
}
