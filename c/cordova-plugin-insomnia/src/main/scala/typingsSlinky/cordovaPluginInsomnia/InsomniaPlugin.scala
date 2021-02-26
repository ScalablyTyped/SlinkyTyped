package typingsSlinky.cordovaPluginInsomnia

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InsomniaPlugin {
  
  @js.native
  trait Insomnia extends StObject {
    
    /**
      * After making your app practically a zombie, you can allow it to sleep again by calling allowSleepAgain.
      */
    def allowSleepAgain(): Unit = js.native
    def allowSleepAgain(success: js.UndefOr[scala.Nothing], fail: js.Function0[_]): Unit = js.native
    def allowSleepAgain(success: js.Function0[_]): Unit = js.native
    def allowSleepAgain(success: js.Function0[_], fail: js.Function0[_]): Unit = js.native
    
    /**
      * Prevent the screen of the mobile device from falling asleep.
      */
    def keepAwake(): Unit = js.native
    def keepAwake(success: js.UndefOr[scala.Nothing], fail: js.Function0[_]): Unit = js.native
    def keepAwake(success: js.Function0[_]): Unit = js.native
    def keepAwake(success: js.Function0[_], fail: js.Function0[_]): Unit = js.native
  }
}
