package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorHandlingType")
@js.native
class ErrorHandlingType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ErrorHandlingType {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorHandlingType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorHandlingType.Abort")
  @js.native
  def Abort: ErrorHandlingType = js.native
  @scala.inline
  def Abort_=(x: ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Abort")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorHandlingType.Continue")
  @js.native
  def Continue: ErrorHandlingType = js.native
  @scala.inline
  def Continue_=(x: ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Continue")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorHandlingType.Custom")
  @js.native
  def Custom: ErrorHandlingType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorHandlingType.CustomWithoutRollBack")
  @js.native
  def CustomWithoutRollBack: ErrorHandlingType = js.native
  @scala.inline
  def CustomWithoutRollBack_=(x: ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomWithoutRollBack")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Custom_=(x: ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorHandlingType.Rollback")
  @js.native
  def Rollback: ErrorHandlingType = js.native
  @scala.inline
  def Rollback_=(x: ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rollback")(x.asInstanceOf[js.Any])
}
