package typingsSlinky.expressUaMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Model extends StObject {
    
    /**
      * Determined dynamically
      */
    val model: js.UndefOr[String] = js.native
    
    /**
      * Possible vendor:
      * Acer, Alcatel, Amazon, Apple, Archos, Asus, BenQ, BlackBerry, Dell, GeeksPhone,
      * Google, HP, HTC, Huawei, Jolla, Lenovo, LG, Meizu, Microsoft, Motorola, Nexian,
      * Nintendo, Nokia, Nvidia, Ouya, Palm, Panasonic, Polytron, RIM, Samsung, Sharp,
      * Siemens, Sony-Ericsson, Sprint, Xbox, ZTE
      */
    val vendor: js.UndefOr[String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    /**
      * Possible 'os.name'
      * AIX, Amiga OS, Android, Arch, Bada, BeOS, BlackBerry, CentOS, Chromium OS, Contiki,
      * Fedora, Firefox OS, FreeBSD, Debian, DragonFly, Gentoo, GNU, Haiku, Hurd, iOS,
      * Joli, Linpus, Linux, Mac OS, Mageia, Mandriva, MeeGo, Minix, Mint, Morph OS, NetBSD,
      * Nintendo, OpenBSD, OpenVMS, OS/2, Palm, PCLinuxOS, Plan9, Playstation, QNX, RedHat,
      * RIM Tablet OS, RISC OS, Sailfish, Series40, Slackware, Solaris, SUSE, Symbian, Tizen,
      * Ubuntu, UNIX, VectorLinux, WebOS, Windows [Phone/Mobile], Zenwalk
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Determined dynamically
      */
    val version: js.UndefOr[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
