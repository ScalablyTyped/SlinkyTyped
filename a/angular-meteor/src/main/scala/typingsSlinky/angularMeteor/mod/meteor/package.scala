package typingsSlinky.angularMeteor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  /**
    * An object that connects a Meteor Collection to an AngularJS scope variable
    */
  type AngularMeteorCollection[T] = typingsSlinky.angularMeteor.mod.meteor.AngularMeteorCollection2[T, T]
  type ILoginWithExternalService = js.Function1[
    /* options */ typingsSlinky.meteor.Meteor.LoginWithExternalServiceOptions, 
    typingsSlinky.angular.mod.IPromise[scala.Unit]
  ]
}
