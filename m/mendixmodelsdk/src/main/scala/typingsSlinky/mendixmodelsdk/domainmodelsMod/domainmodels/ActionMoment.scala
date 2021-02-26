package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.internalMod.AbstractEnum
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.ActionMoment")
@js.native
class ActionMoment protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ActionMoment {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.ActionMoment")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.ActionMoment.After")
  @js.native
  def After: ActionMoment = js.native
  @scala.inline
  def After_=(x: ActionMoment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("After")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.ActionMoment.Before")
  @js.native
  def Before: ActionMoment = js.native
  @scala.inline
  def Before_=(x: ActionMoment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Before")(x.asInstanceOf[js.Any])
}
