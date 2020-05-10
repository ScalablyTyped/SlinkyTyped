package typingsSlinky.reactCookies

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cookie.mod.CookieSerializeOptions
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-cookies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def load(name: String): js.Any = js.native
  def load(name: String, doNotParse: Boolean): js.Any = js.native
  def loadAll(): StringDictionary[js.Any] = js.native
  def loadAll(doNotParse: Boolean): StringDictionary[js.Any] = js.native
  def plugToRequest(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): js.Function0[Unit] = js.native
  def remove(name: String): Unit = js.native
  def remove(name: String, opt: CookieSerializeOptions): Unit = js.native
  def save(name: String, `val`: String, opt: CookieSerializeOptions): Unit = js.native
  def save(name: String, `val`: js.Object, opt: CookieSerializeOptions): Unit = js.native
  def save(name: String, `val`: Double, opt: CookieSerializeOptions): Unit = js.native
  def select(): StringDictionary[js.Any] = js.native
  def select(regex: js.RegExp): StringDictionary[js.Any] = js.native
  def setRawCookie(): Unit = js.native
  def setRawCookie(rawCookie: String): Unit = js.native
}

