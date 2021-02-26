package typingsSlinky.mongodbMemoryServerCore

import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.aix
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.android
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.cygwin
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.darwin
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.freebsd
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.linux
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.openbsd
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.sunos
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getosMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/getos", JSImport.Default)
  @js.native
  def default(): js.Promise[AnyOS] = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/getos", "isLinuxOS")
  @js.native
  def isLinuxOS(os: AnyOS): /* is mongodb-memory-server-core.mongodb-memory-server-core/lib/util/getos.LinuxOS */ Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mongodbMemoryServerCore.getosMod.OtherOS
    - typingsSlinky.mongodbMemoryServerCore.getosMod.LinuxOS
  */
  trait AnyOS extends StObject
  object AnyOS {
    
    @scala.inline
    def LinuxOS(dist: String, os: linux, release: String): typingsSlinky.mongodbMemoryServerCore.getosMod.LinuxOS = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.mongodbMemoryServerCore.getosMod.LinuxOS]
    }
    
    @scala.inline
    def OtherOS(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): typingsSlinky.mongodbMemoryServerCore.getosMod.OtherOS = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.mongodbMemoryServerCore.getosMod.OtherOS]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.mongodbMemoryServerCore.getosMod.AnyOS because Already inherited */ @js.native
  trait LinuxOS extends OtherOS {
    
    var codename: js.UndefOr[String] = js.native
    
    var dist: String = js.native
    
    @JSName("os")
    var os_LinuxOS: linux = js.native
    
    var release: String = js.native
  }
  object LinuxOS {
    
    @scala.inline
    def apply(dist: String, os: linux, release: String): LinuxOS = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxOS]
    }
    
    @scala.inline
    implicit class LinuxOSMutableBuilder[Self <: LinuxOS] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait OtherOS extends AnyOS {
    
    var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String = js.native
  }
  object OtherOS {
    
    @scala.inline
    def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherOS]
    }
    
    @scala.inline
    implicit class OtherOSMutableBuilder[Self <: OtherOS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
}
