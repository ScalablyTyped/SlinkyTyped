package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SynchronizationType")
@js.native
class SynchronizationType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SynchronizationType {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SynchronizationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SynchronizationType.All")
  @js.native
  def All: SynchronizationType = js.native
  @scala.inline
  def All_=(x: SynchronizationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SynchronizationType.Specific")
  @js.native
  def Specific: SynchronizationType = js.native
  @scala.inline
  def Specific_=(x: SynchronizationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Specific")(x.asInstanceOf[js.Any])
}
