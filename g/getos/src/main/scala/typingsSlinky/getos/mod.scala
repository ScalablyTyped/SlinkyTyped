package typingsSlinky.getos

import typingsSlinky.getos.getosStrings.aix
import typingsSlinky.getos.getosStrings.android
import typingsSlinky.getos.getosStrings.cygwin
import typingsSlinky.getos.getosStrings.darwin
import typingsSlinky.getos.getosStrings.freebsd
import typingsSlinky.getos.getosStrings.linux
import typingsSlinky.getos.getosStrings.openbsd
import typingsSlinky.getos.getosStrings.sunos
import typingsSlinky.getos.getosStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("getos", JSImport.Namespace)
  @js.native
  def apply(cb: js.Function2[/* error */ js.Error | Null, /* os */ Os, Unit]): String = js.native
  
  @js.native
  trait LinuxOs extends Os {
    
    var codename: js.UndefOr[String] = js.native
    
    var dist: String = js.native
    
    var os: linux = js.native
    
    var release: String = js.native
  }
  object LinuxOs {
    
    @scala.inline
    def apply(dist: String, os: linux, release: String): LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxOs]
    }
    
    @scala.inline
    implicit class LinuxOsMutableBuilder[Self <: LinuxOs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
      
      @scala.inline
      def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: linux): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.getos.mod.OtherOs
    - typingsSlinky.getos.mod.LinuxOs
  */
  trait Os extends StObject
  object Os {
    
    @scala.inline
    def LinuxOs(dist: String, os: linux, release: String): typingsSlinky.getos.mod.LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.getos.mod.LinuxOs]
    }
    
    @scala.inline
    def OtherOs(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): typingsSlinky.getos.mod.OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.getos.mod.OtherOs]
    }
  }
  
  @js.native
  trait OtherOs extends Os {
    
    var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin = js.native
  }
  object OtherOs {
    
    @scala.inline
    def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherOs]
    }
    
    @scala.inline
    implicit class OtherOsMutableBuilder[Self <: OtherOs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
}
