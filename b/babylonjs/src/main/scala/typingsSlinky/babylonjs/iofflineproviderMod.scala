package typingsSlinky.babylonjs

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Offline/IOfflineProvider", JSImport.Namespace)
@js.native
object iofflineproviderMod extends js.Object {
  
  @js.native
  trait IOfflineProvider extends js.Object {
    
    /**
      * Gets a boolean indicating if scene must be saved in the database
      */
    var enableSceneOffline: Boolean = js.native
    
    /**
      * Gets a boolean indicating if textures must be saved in the database
      */
    var enableTexturesOffline: Boolean = js.native
    
    /**
      * Loads a file from offline support
      * @param url defines the URL to load from
      * @param sceneLoaded defines a callback to call on success
      * @param progressCallBack defines a callback to call when progress changed
      * @param errorCallback defines a callback to call on error
      * @param useArrayBuffer defines a boolean to use array buffer instead of text string
      */
    def loadFile(url: String, sceneLoaded: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    def loadFile(
      url: String,
      sceneLoaded: js.Function1[/* data */ js.Any, Unit],
      progressCallBack: js.UndefOr[scala.Nothing],
      errorCallback: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): Unit = js.native
    def loadFile(
      url: String,
      sceneLoaded: js.Function1[/* data */ js.Any, Unit],
      progressCallBack: js.UndefOr[scala.Nothing],
      errorCallback: js.Function0[Unit]
    ): Unit = js.native
    def loadFile(
      url: String,
      sceneLoaded: js.Function1[/* data */ js.Any, Unit],
      progressCallBack: js.UndefOr[scala.Nothing],
      errorCallback: js.Function0[Unit],
      useArrayBuffer: Boolean
    ): Unit = js.native
    def loadFile(
      url: String,
      sceneLoaded: js.Function1[/* data */ js.Any, Unit],
      progressCallBack: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    def loadFile(
      url: String,
      sceneLoaded: js.Function1[/* data */ js.Any, Unit],
      progressCallBack: js.Function1[/* data */ js.Any, Unit],
      errorCallback: js.UndefOr[scala.Nothing],
      useArrayBuffer: Boolean
    ): Unit = js.native
    def loadFile(
      url: String,
      sceneLoaded: js.Function1[/* data */ js.Any, Unit],
      progressCallBack: js.Function1[/* data */ js.Any, Unit],
      errorCallback: js.Function0[Unit]
    ): Unit = js.native
    def loadFile(
      url: String,
      sceneLoaded: js.Function1[/* data */ js.Any, Unit],
      progressCallBack: js.Function1[/* data */ js.Any, Unit],
      errorCallback: js.Function0[Unit],
      useArrayBuffer: Boolean
    ): Unit = js.native
    
    /**
      * Loads an image from the offline support
      * @param url defines the url to load from
      * @param image defines the target DOM image
      */
    def loadImage(url: String, image: HTMLImageElement): Unit = js.native
    
    /**
      * Open the offline support and make it available
      * @param successCallback defines the callback to call on success
      * @param errorCallback defines the callback to call on error
      */
    def open(successCallback: js.Function0[Unit], errorCallback: js.Function0[Unit]): Unit = js.native
  }
}
