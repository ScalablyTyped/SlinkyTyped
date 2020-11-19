package typingsSlinky.nanoid.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NanoidAsync extends js.Object {
  
  def apply(): js.Promise[String] = js.native
  def apply(size: Double): js.Promise[String] = js.native
  def apply(size: Double, callback: js.Function2[/* error */ js.Error | Null, /* id */ String, _]): Unit = js.native
  def apply(size: Null, callback: js.Function2[/* error */ js.Error | Null, /* id */ String, _]): Unit = js.native
}
