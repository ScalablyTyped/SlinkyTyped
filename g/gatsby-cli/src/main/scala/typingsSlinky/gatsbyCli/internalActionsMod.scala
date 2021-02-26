package typingsSlinky.gatsbyCli

import typingsSlinky.gatsbyCli.anon.Activitytotal
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
import typingsSlinky.gatsbyCli.typesMod.IGatsbyCLIState
import typingsSlinky.gatsbyCli.typesMod.IPendingActivity
import typingsSlinky.gatsbyCli.typesMod.ISetLogs
import typingsSlinky.gatsbyCli.typesMod.ISetStatus
import typingsSlinky.gatsbyCli.typesMod.IStartActivity
import typingsSlinky.gatsbyCli.typesMod.IUpdateActivity
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalActionsMod {
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "activityTick")
  @js.native
  def activityTick(hasIdIncrement: Increment): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "createLog")
  @js.native
  def createLog(
    hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName: Activitytotal
  ): ICreateLog = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "createPendingActivity")
  @js.native
  def createPendingActivity(hasIdStatus: Id): ActionsToEmit = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "endActivity")
  @js.native
  def endActivity(hasIdStatus: Status): QueuedEndActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setActivityErrored")
  @js.native
  def setActivityErrored(hasId: IdString): IActivityErrored | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setActivityStatusText")
  @js.native
  def setActivityStatusText(hasIdStatusText: IdStatusText): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setActivityTotal")
  @js.native
  def setActivityTotal(hasIdTotal: Total): IUpdateActivity | Null = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setLogs")
  @js.native
  def setLogs(logs: IGatsbyCLIState): ISetLogs = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: ActivityStatuses, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: _empty): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "setStatus")
  @js.native
  def setStatus(status: _empty, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "startActivity")
  @js.native
  def startActivity(hasIdTextTypeStatusCurrentTotal: Current): QueuedStartActivityActions = js.native
  
  @JSImport("gatsby-cli/lib/reporter/redux/internal-actions", "updateActivity")
  @js.native
  def updateActivity(hasIdRest: StatusText): IUpdateActivity | Null = js.native
  
  type ActionsToEmit = js.Array[
    IPendingActivity | (ReturnType[
      js.Function2[
        /* status */ ActivityStatuses | _empty, 
        /* force */ js.UndefOr[Boolean], 
        js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
      ]
    ])
  ]
  
  type QueuedEndActivity = js.Array[
    ICancelActivity | IEndActivity | ICreateLog | (ReturnType[
      js.Function2[
        /* status */ ActivityStatuses | _empty, 
        /* force */ js.UndefOr[Boolean], 
        js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
      ]
    ])
  ]
  
  type QueuedStartActivityActions = js.Array[
    IStartActivity | (ReturnType[
      js.Function2[
        /* status */ ActivityStatuses | _empty, 
        /* force */ js.UndefOr[Boolean], 
        js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]
      ]
    ])
  ]
}
