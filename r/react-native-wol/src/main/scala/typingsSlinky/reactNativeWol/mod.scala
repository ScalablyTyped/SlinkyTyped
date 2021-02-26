package typingsSlinky.reactNativeWol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-wol", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-wol", "default.send")
    @js.native
    def send: js.Function3[
        /* ipAddress */ String, 
        /* macAddress */ String, 
        /* callback */ js.UndefOr[js.Function2[/* result */ Boolean, /* message */ String, Unit]], 
        Unit
      ] = js.native
    @JSImport("react-native-wol", "default.send")
    @js.native
    def send(ipAddress: String, macAddress: String): Unit = js.native
    @JSImport("react-native-wol", "default.send")
    @js.native
    def send(
      ipAddress: String,
      macAddress: String,
      /** The callback will be passed true if the packet was sent without error. */
    callback: js.Function2[/* result */ Boolean, /* message */ String, Unit]
    ): Unit = js.native
    @scala.inline
    def send_=(
      x: js.Function3[
          /* ipAddress */ String, 
          /* macAddress */ String, 
          /* callback */ js.UndefOr[js.Function2[/* result */ Boolean, /* message */ String, Unit]], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("send")(x.asInstanceOf[js.Any])
  }
}
