package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object client {
  
  @JSImport("mendixmodelsdk", "client.SupportedPlatform")
  @js.native
  class SupportedPlatform protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.client.SupportedPlatform {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SupportedPlatform {
    
    @JSImport("mendixmodelsdk", "client.SupportedPlatform")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "client.SupportedPlatform.All")
    @js.native
    def All: typingsSlinky.mendixmodelsdk.clientMod.client.SupportedPlatform = js.native
    @scala.inline
    def All_=(x: typingsSlinky.mendixmodelsdk.clientMod.client.SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "client.SupportedPlatform.Native")
    @js.native
    def Native: typingsSlinky.mendixmodelsdk.clientMod.client.SupportedPlatform = js.native
    @scala.inline
    def Native_=(x: typingsSlinky.mendixmodelsdk.clientMod.client.SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Native")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "client.SupportedPlatform.Web")
    @js.native
    def Web: typingsSlinky.mendixmodelsdk.clientMod.client.SupportedPlatform = js.native
    @scala.inline
    def Web_=(x: typingsSlinky.mendixmodelsdk.clientMod.client.SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Web")(x.asInstanceOf[js.Any])
  }
}
