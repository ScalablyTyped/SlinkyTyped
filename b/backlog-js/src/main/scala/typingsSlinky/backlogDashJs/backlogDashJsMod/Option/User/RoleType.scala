package typingsSlinky.backlogDashJs.backlogDashJsMod.Option.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoleType extends js.Object

@JSImport("backlog-js", "Option.User.RoleType")
@js.native
object RoleType extends js.Object {
  @js.native
  sealed trait Admin extends RoleType
  
  @js.native
  sealed trait GuestReporter extends RoleType
  
  @js.native
  sealed trait GuestViewer extends RoleType
  
  @js.native
  sealed trait Reporter extends RoleType
  
  @js.native
  sealed trait User extends RoleType
  
  @js.native
  sealed trait Viewer extends RoleType
  
  /* 1 */ val Admin: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.User.RoleType.Admin with Double = js.native
  /* 5 */ val GuestReporter: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.User.RoleType.GuestReporter with Double = js.native
  /* 6 */ val GuestViewer: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.User.RoleType.GuestViewer with Double = js.native
  /* 3 */ val Reporter: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.User.RoleType.Reporter with Double = js.native
  /* 2 */ val User: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.User.RoleType.User with Double = js.native
  /* 4 */ val Viewer: typingsSlinky.backlogDashJs.backlogDashJsMod.Option.User.RoleType.Viewer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
}

