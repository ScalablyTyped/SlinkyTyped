package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("mendixmodelsdk/dist/gen/client", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object client {
    
    @JSImport("mendixmodelsdk/dist/gen/client", "client.SupportedPlatform")
    @js.native
    class SupportedPlatform protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object SupportedPlatform {
      
      @JSImport("mendixmodelsdk/dist/gen/client", "client.SupportedPlatform")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/client", "client.SupportedPlatform.All")
      @js.native
      def All: SupportedPlatform = js.native
      @scala.inline
      def All_=(x: SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/client", "client.SupportedPlatform.Native")
      @js.native
      def Native: SupportedPlatform = js.native
      @scala.inline
      def Native_=(x: SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Native")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/client", "client.SupportedPlatform.Web")
      @js.native
      def Web: SupportedPlatform = js.native
      @scala.inline
      def Web_=(x: SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Web")(x.asInstanceOf[js.Any])
    }
  }
}
