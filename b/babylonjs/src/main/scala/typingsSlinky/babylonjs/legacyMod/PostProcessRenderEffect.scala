package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "PostProcessRenderEffect")
@js.native
class PostProcessRenderEffect protected ()
  extends typingsSlinky.babylonjs.indexMod.PostProcessRenderEffect {
  /**
    * Instantiates a post process render effect.
    * A post process can be used to apply a shader to a texture after it is rendered.
    * @param engine The engine the effect is tied to
    * @param name The name of the effect
    * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
    * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
    */
  def this(
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typingsSlinky.babylonjs.postProcessMod.PostProcess | js.Array[typingsSlinky.babylonjs.postProcessMod.PostProcess]
        ]
      ]
  ) = this()
  def this(
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typingsSlinky.babylonjs.postProcessMod.PostProcess | js.Array[typingsSlinky.babylonjs.postProcessMod.PostProcess]
        ]
      ],
    singleInstance: Boolean
  ) = this()
}

