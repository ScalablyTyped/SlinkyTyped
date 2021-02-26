package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FilesInputStore")
@js.native
class FilesInputStore ()
  extends typingsSlinky.babylonjs.BABYLON.FilesInputStore
/* static members */
object FilesInputStore {
  
  @JSGlobal("BABYLON.FilesInputStore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of files ready to be loaded
    */
  @JSGlobal("BABYLON.FilesInputStore.FilesToLoad")
  @js.native
  def FilesToLoad: org.scalablytyped.runtime.StringDictionary[File] = js.native
  @scala.inline
  def FilesToLoad_=(x: org.scalablytyped.runtime.StringDictionary[File]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FilesToLoad")(x.asInstanceOf[js.Any])
}
