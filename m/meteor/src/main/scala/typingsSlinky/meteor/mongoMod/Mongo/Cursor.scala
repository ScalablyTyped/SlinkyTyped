package typingsSlinky.meteor.mongoMod.Mongo

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.meteor.Meteor.LiveQueryHandle
import typingsSlinky.meteor.anon.NonMutatingCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cursor[T, U] extends js.Object {
  
  def count(): Double = js.native
  def count(applySkipLimit: Boolean): Double = js.native
  
  def fetch(): js.Array[U] = js.native
  
  def forEach(callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  def map[M](callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], M]): js.Array[M] = js.native
  def map[M](
    callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], M],
    thisArg: js.Any
  ): js.Array[M] = js.native
  
  def observe(callbacks: ObserveCallbacks[U]): LiveQueryHandle = js.native
  
  def observeChanges(callbacks: ObserveChangesCallbacks[T]): LiveQueryHandle = js.native
  def observeChanges(callbacks: ObserveChangesCallbacks[T], options: NonMutatingCallbacks): LiveQueryHandle = js.native
}
@JSImport("meteor/mongo", "Mongo.Cursor")
@js.native
object Cursor extends TopLevel[CursorStatic]
