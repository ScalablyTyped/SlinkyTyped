package typingsSlinky.netconf

import typingsSlinky.netconf.netconfStrings.`override`
import typingsSlinky.netconf.netconfStrings.merge
import typingsSlinky.netconf.netconfStrings.replace
import typingsSlinky.netconf.netconfStrings.set
import typingsSlinky.netconf.netconfStrings.text
import typingsSlinky.netconf.netconfStrings.update
import typingsSlinky.netconf.netconfStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Action extends StObject {
    
    var action: js.UndefOr[merge | replace | `override` | update | set] = js.native
    
    var config: js.Any = js.native
    
    var format: js.UndefOr[text | xml] = js.native
  }
  object Action {
    
    @scala.inline
    def apply(config: js.Any): Action = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: merge | replace | `override` | update | set): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: text | xml): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: String = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var pkey: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var username: String = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String, username: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPkey(value: String): Self = StObject.set(x, "pkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkeyUndefined: Self = StObject.set(x, "pkey", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hostname extends StObject {
    
    var hostname: String = js.native
    
    var module: String = js.native
    
    var serial: String = js.native
    
    var uptime: String = js.native
    
    var version: String = js.native
  }
  object Hostname {
    
    @scala.inline
    def apply(hostname: String, module: String, serial: String, uptime: String, version: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUptime(value: String): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
