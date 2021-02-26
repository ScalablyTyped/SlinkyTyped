package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsSlinky.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsSlinky.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesMod {
  
  @JSImport("mendixmodelsdk/dist/gen/services", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typingsSlinky.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object services {
    
    @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod")
    @js.native
    class HttpMethod protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object HttpMethod {
      
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod.Delete")
      @js.native
      def Delete: HttpMethod = js.native
      @scala.inline
      def Delete_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod.Get")
      @js.native
      def Get: HttpMethod = js.native
      @scala.inline
      def Get_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Get")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod.Head")
      @js.native
      def Head: HttpMethod = js.native
      @scala.inline
      def Head_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Head")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod.Options")
      @js.native
      def Options: HttpMethod = js.native
      @scala.inline
      def Options_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Options")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod.Patch")
      @js.native
      def Patch: HttpMethod = js.native
      @scala.inline
      def Patch_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Patch")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod.Post")
      @js.native
      def Post: HttpMethod = js.native
      @scala.inline
      def Post_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Post")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/services", "services.HttpMethod.Put")
      @js.native
      def Put: HttpMethod = js.native
      @scala.inline
      def Put_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Put")(x.asInstanceOf[js.Any])
    }
  }
}
