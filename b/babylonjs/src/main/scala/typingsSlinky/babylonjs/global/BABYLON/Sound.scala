package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.ISoundOptions
import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Sound")
@js.native
class Sound protected ()
  extends typingsSlinky.babylonjs.BABYLON.Sound {
  /**
    * Create a sound and attach it to a scene
    * @param name Name of your sound
    * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer, it also works with MediaStreams
    * @param scene defines the scene the sound belongs to
    * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
    * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
    */
  def this(name: String, urlOrArrayBuffer: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    urlOrArrayBuffer: js.Any,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    readyToPlayCallback: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    name: String,
    urlOrArrayBuffer: js.Any,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    readyToPlayCallback: js.UndefOr[Nullable[js.Function0[Unit]]],
    options: ISoundOptions
  ) = this()
}
/* static members */
object Sound {
  
  /**
    * Parse a JSON representation of a sound to innstantiate in a given scene
    * @param parsedSound Define the JSON representation of the sound (usually coming from the serialize method)
    * @param scene Define the scene the new parsed sound should be created in
    * @param rootUrl Define the rooturl of the load in case we need to fetch relative dependencies
    * @param sourceSound Define a cound place holder if do not need to instantiate a new one
    * @returns the newly parsed sound
    */
  @JSGlobal("BABYLON.Sound.Parse")
  @js.native
  def Parse(parsedSound: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene, rootUrl: String): typingsSlinky.babylonjs.BABYLON.Sound = js.native
  @JSGlobal("BABYLON.Sound.Parse")
  @js.native
  def Parse(
    parsedSound: js.Any,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    rootUrl: String,
    sourceSound: typingsSlinky.babylonjs.BABYLON.Sound
  ): typingsSlinky.babylonjs.BABYLON.Sound = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.Sound._SceneComponentInitialization")
  @js.native
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
}
