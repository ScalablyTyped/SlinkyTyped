package typingsSlinky.angularDashMeteor.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  import typingsSlinky.angular.angularMod.IPromise
  import typingsSlinky.meteor.Meteor.LoginWithExternalServiceOptions

  /**
    * An object that connects a Meteor Collection to an AngularJS scope variable
    */
  type AngularMeteorCollection[T] = AngularMeteorCollection2[T, T]
  type ILoginWithExternalService = js.Function1[/* options */ LoginWithExternalServiceOptions, IPromise[Unit]]
}
