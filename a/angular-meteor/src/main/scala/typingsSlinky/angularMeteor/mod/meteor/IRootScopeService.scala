package typingsSlinky.angularMeteor.mod.meteor

import typingsSlinky.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRootScopeService
  extends typingsSlinky.angular.mod.IRootScopeService {
  /**
    * The current logged in user and it's data. it is null if the user is not logged in. A reactive data source.
    */
  var currentUser: User = js.native
  /**
    * True if a login method (such as Meteor.loginWithPassword, Meteor.loginWithFacebook, or Accounts.createUser) is currently in progress.
    * A reactive data source. Can be use to display animation while user is logging in.
    */
  var loggingIn: Boolean = js.native
}

