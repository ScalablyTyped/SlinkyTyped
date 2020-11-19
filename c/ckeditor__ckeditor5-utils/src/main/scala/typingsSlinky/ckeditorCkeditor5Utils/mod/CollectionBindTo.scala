package typingsSlinky.ckeditorCkeditor5Utils.mod

import typingsSlinky.ckeditorCkeditor5Utils.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionBindTo[T, K] extends js.Object {
  
  def as(Class: Instantiable[T, K]): Unit = js.native
  
  def using(callbackOrProperty: /* keyof T */ String): Unit = js.native
  def using(callbackOrProperty: js.Function1[/* item */ T, K]): Unit = js.native
}
