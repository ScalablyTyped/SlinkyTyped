package typingsSlinky.gatsbyCli

import typingsSlinky.gatsbyCli.anon.Activitycurrent
import typingsSlinky.gatsbyCli.anon.Current
import typingsSlinky.gatsbyCli.anon.Id
import typingsSlinky.gatsbyCli.anon.IdStatusText
import typingsSlinky.gatsbyCli.anon.IdString
import typingsSlinky.gatsbyCli.anon.Increment
import typingsSlinky.gatsbyCli.anon.Status
import typingsSlinky.gatsbyCli.anon.StatusText
import typingsSlinky.gatsbyCli.anon.Total
import typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses
import typingsSlinky.gatsbyCli.gatsbyCliStrings._empty
import typingsSlinky.gatsbyCli.typesMod.IActivityErrored
import typingsSlinky.gatsbyCli.typesMod.ICancelActivity
import typingsSlinky.gatsbyCli.typesMod.ICreateLog
import typingsSlinky.gatsbyCli.typesMod.IEndActivity
import typingsSlinky.gatsbyCli.typesMod.IPendingActivity
import typingsSlinky.gatsbyCli.typesMod.ISetStatus
import typingsSlinky.gatsbyCli.typesMod.IStartActivity
import typingsSlinky.gatsbyCli.typesMod.IUpdateActivity
import typingsSlinky.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "activityTick")
  @js.native
  def activityTick(hasIdIncrement: Increment): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "createLog")
  @js.native
  def createLog(
    hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName: Activitycurrent
  ): ICreateLog = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "createPendingActivity")
  @js.native
  def createPendingActivity(hasIdStatus: Id): js.Array[IPendingActivity | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit])] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "endActivity")
  @js.native
  def endActivity(hasIdStatus: Status): (js.Array[
    ICreateLog | IEndActivity | ICancelActivity | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit])
  ]) | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setActivityErrored")
  @js.native
  def setActivityErrored(hasId: IdString): IActivityErrored | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setActivityStatusText")
  @js.native
  def setActivityStatusText(hasIdStatusText: IdStatusText): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setActivityTotal")
  @js.native
  def setActivityTotal(hasIdTotal: Total): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: _empty): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "setStatus")
  @js.native
  def setStatus(status: _empty, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "startActivity")
  @js.native
  def startActivity(hasIdTextTypeStatusCurrentTotal: Current): js.Array[IStartActivity | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit])] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/actions", "updateActivity")
  @js.native
  def updateActivity(hasIdRest: StatusText): IUpdateActivity | Null = js.native
}
