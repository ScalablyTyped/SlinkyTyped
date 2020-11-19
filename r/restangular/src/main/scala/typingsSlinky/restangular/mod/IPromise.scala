package typingsSlinky.restangular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromise[T]
  extends typingsSlinky.angular.mod.IPromise[T] {
  
  @JSName("$object")
  var $object: T = js.native
  
  def call(methodName: String): IPromise[T] = js.native
  def call(methodName: String, params: js.Any): IPromise[T] = js.native
  
  def get(fieldName: String): IPromise[T] = js.native
}
