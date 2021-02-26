package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PostProcessRenderEffect")
@js.native
class PostProcessRenderEffect protected ()
  extends typingsSlinky.babylonjs.BABYLON.PostProcessRenderEffect {
  /**
    * Instantiates a post process render effect.
    * A post process can be used to apply a shader to a texture after it is rendered.
    * @param engine The engine the effect is tied to
    * @param name The name of the effect
    * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
    * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
    */
  def this(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typingsSlinky.babylonjs.BABYLON.PostProcess | js.Array[typingsSlinky.babylonjs.BABYLON.PostProcess]
        ]
      ]
  ) = this()
  def this(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typingsSlinky.babylonjs.BABYLON.PostProcess | js.Array[typingsSlinky.babylonjs.BABYLON.PostProcess]
        ]
      ],
    singleInstance: Boolean
  ) = this()
}
