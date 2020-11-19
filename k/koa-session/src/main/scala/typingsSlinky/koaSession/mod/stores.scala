package typingsSlinky.koaSession.mod

import typingsSlinky.koaSession.anon.Changed
import typingsSlinky.koaSession.anon.PartialSessionexpirenumbe
import typingsSlinky.koaSession.anon.Rolling
import typingsSlinky.koaSession.koaSessionStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait stores extends js.Object {
  
  /**
    * destroy session for key
    */
  def destroy(key: String): js.Any = js.native
  
  def get(key: String, maxAge: js.UndefOr[scala.Nothing], data: Rolling): js.Any = js.native
  /**
    * get session object by key
    */
  def get(key: String, maxAge: Double, data: Rolling): js.Any = js.native
  @JSName("get")
  def get_session(key: String, maxAge: session, data: Rolling): js.Any = js.native
  
  def set(key: String, sess: PartialSessionexpirenumbe, maxAge: js.UndefOr[scala.Nothing], data: Changed): js.Any = js.native
  /**
    * set session object for key, with a maxAge (in ms)
    */
  def set(key: String, sess: PartialSessionexpirenumbe, maxAge: Double, data: Changed): js.Any = js.native
  @JSName("set")
  def set_session(key: String, sess: PartialSessionexpirenumbe, maxAge: session, data: Changed): js.Any = js.native
}
