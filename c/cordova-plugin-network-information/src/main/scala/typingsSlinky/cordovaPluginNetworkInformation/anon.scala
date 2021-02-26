package typingsSlinky.cordovaPluginNetworkInformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Connection extends StObject {
    
    /**
      * This plugin provides an implementation of an old version of the Network Information API.
      * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
      */
    var connection: typingsSlinky.cordovaPluginNetworkInformation.Connection = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(connection: typingsSlinky.cordovaPluginNetworkInformation.Connection): typingsSlinky.cordovaPluginNetworkInformation.anon.Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cordovaPluginNetworkInformation.anon.Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: typingsSlinky.cordovaPluginNetworkInformation.anon.Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: typingsSlinky.cordovaPluginNetworkInformation.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
}
