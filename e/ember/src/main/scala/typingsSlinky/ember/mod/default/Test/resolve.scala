package typingsSlinky.ember.mod.default.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Test.resolve")
@js.native
object resolve extends js.Object {
  /**
    * Replacement for `Ember.RSVP.resolve`
    * The only difference is this uses
    * an instance of `Ember.Test.Promise`
    */
  def apply[T](): typingsSlinky.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: T): typingsSlinky.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: T, label: String): typingsSlinky.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: js.Thenable[T]): typingsSlinky.ember.mod.Ember.Test.Promise_[T] = js.native
  def apply[T](value: js.Thenable[T], label: String): typingsSlinky.ember.mod.Ember.Test.Promise_[T] = js.native
}

