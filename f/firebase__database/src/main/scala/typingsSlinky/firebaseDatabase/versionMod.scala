package typingsSlinky.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionMod {
  
  @JSImport("@firebase/database/dist/src/core/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/version", "SDK_VERSION")
  @js.native
  def SDK_VERSION: String = js.native
  @scala.inline
  def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/database/dist/src/core/version", "setSDKVersion")
  @js.native
  def setSDKVersion(version: String): Unit = js.native
}
