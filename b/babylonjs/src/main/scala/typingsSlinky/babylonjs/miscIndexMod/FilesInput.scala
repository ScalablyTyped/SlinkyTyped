package typingsSlinky.babylonjs.miscIndexMod

import org.scalajs.dom.raw.File
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.sceneLoaderMod.ISceneLoaderProgressEvent
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "FilesInput")
@js.native
class FilesInput protected ()
  extends typingsSlinky.babylonjs.filesInputMod.FilesInput {
  /**
    * Creates a new FilesInput
    * @param engine defines the rendering engine
    * @param scene defines the hosting scene
    * @param sceneLoadedCallback callback called when scene is loaded
    * @param progressCallback callback called to track progress
    * @param additionalRenderLoopLogicCallback callback called to add user logic to the rendering loop
    * @param textureLoadingCallback callback called when a texture is loading
    * @param startingProcessingFilesCallback callback called when the system is about to process all files
    * @param onReloadCallback callback called when a reload is requested
    * @param errorCallback callback call if an error occurs
    */
  def this(
    engine: Engine,
    scene: Nullable[Scene],
    sceneLoadedCallback: Nullable[js.Function2[/* sceneFile */ File, /* scene */ Scene, Unit]],
    progressCallback: Nullable[js.Function1[/* progress */ ISceneLoaderProgressEvent, Unit]],
    additionalRenderLoopLogicCallback: Nullable[js.Function0[Unit]],
    textureLoadingCallback: Nullable[js.Function1[/* remaining */ Double, Unit]],
    startingProcessingFilesCallback: Nullable[js.Function1[/* files */ js.UndefOr[js.Array[File]], Unit]],
    onReloadCallback: Nullable[js.Function1[/* sceneFile */ File, Unit]],
    errorCallback: Nullable[
        js.Function3[/* sceneFile */ File, /* scene */ Nullable[Scene], /* message */ String, Unit]
      ]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Misc/index", "FilesInput")
@js.native
object FilesInput extends js.Object {
  
  /**
    * List of files ready to be loaded
    */
  def FilesToLoad: org.scalablytyped.runtime.StringDictionary[File] = js.native
}
