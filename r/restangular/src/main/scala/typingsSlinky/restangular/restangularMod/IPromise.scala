package typingsSlinky.restangular.restangularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T]
  extends typingsSlinky.angular.angularMod.IPromise[T] {
  @JSName("$object")
  var $object: T = js.native
  def call(methodName: String): IPromise[T] = js.native
  def call(methodName: String, params: js.Any): IPromise[T] = js.native
  def get(fieldName: String): IPromise[T] = js.native
}

