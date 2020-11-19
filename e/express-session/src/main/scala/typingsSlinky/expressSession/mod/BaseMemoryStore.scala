package typingsSlinky.expressSession.mod

import typingsSlinky.expressSession.mod.global.Express.Session
import typingsSlinky.expressSession.mod.global.Express.SessionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMemoryStore extends js.Object {
  
  var clear: js.UndefOr[
    js.Function1[/* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]], Unit]
  ] = js.native
  
  def destroy(sid: String): Unit = js.native
  def destroy(sid: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def get(
    sid: String,
    callback: js.Function2[/* err */ js.Any, /* session */ js.UndefOr[SessionData | Null], Unit]
  ): Unit = js.native
  
  var length: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* length */ js.UndefOr[Double | Null], Unit], 
      Unit
    ]
  ] = js.native
  
  def set(sid: String, session: Session): Unit = js.native
  def set(sid: String, session: Session, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
}
