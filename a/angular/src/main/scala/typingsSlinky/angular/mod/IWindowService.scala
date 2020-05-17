package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventListenerOptions
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// WindowService
// see http://docs.angularjs.org/api/ng.$window
///////////////////////////////////////////////////////////////////////////
@js.native
trait IWindowService
  extends Window
     with /* key */ StringDictionary[js.Any] {
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

