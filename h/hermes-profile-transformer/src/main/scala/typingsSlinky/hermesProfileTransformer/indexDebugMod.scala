package typingsSlinky.hermesProfileTransformer

import typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDebugMod {
  
  /**
    * This transformer can take in the path of the profile, the source map (optional) and the bundle file name (optional)
    * and return a promise which resolves to Chrome Dev Tools compatible events
    * @param profilePath string
    * @param sourceMapPath string
    * @param bundleFileName string
    * @return Promise<DurationEvent[]>
    */
  @JSImport("hermes-profile-transformer/dist/index.debug", JSImport.Default)
  @js.native
  def default(profilePath: String): js.Promise[js.Array[DurationEvent]] = js.native
  @JSImport("hermes-profile-transformer/dist/index.debug", JSImport.Default)
  @js.native
  def default(profilePath: String, sourceMapPath: js.UndefOr[scala.Nothing], bundleFileName: String): js.Promise[js.Array[DurationEvent]] = js.native
  @JSImport("hermes-profile-transformer/dist/index.debug", JSImport.Default)
  @js.native
  def default(profilePath: String, sourceMapPath: String): js.Promise[js.Array[DurationEvent]] = js.native
  @JSImport("hermes-profile-transformer/dist/index.debug", JSImport.Default)
  @js.native
  def default(profilePath: String, sourceMapPath: String, bundleFileName: String): js.Promise[js.Array[DurationEvent]] = js.native
}
