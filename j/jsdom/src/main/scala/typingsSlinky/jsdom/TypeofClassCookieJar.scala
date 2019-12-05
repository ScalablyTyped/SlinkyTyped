package typingsSlinky.jsdom

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.Error
import typingsSlinky.toughDashCookie.toughDashCookieMod.CookieJar
import typingsSlinky.toughDashCookie.toughDashCookieMod.CookieJar.Serialized
import typingsSlinky.toughDashCookie.toughDashCookieMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCookieJar extends Instantiable0[CookieJar] {
  def deserialize(serialized: String, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(
    serialized: String,
    store: Store,
    cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserialize(serialized: Serialized, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(
    serialized: Serialized,
    store: Store,
    cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserializeSync(serialized: String): CookieJar = js.native
  def deserializeSync(serialized: String, store: Store): CookieJar = js.native
  def deserializeSync(serialized: Serialized): CookieJar = js.native
  def deserializeSync(serialized: Serialized, store: Store): CookieJar = js.native
  def fromJSON(string: String): CookieJar = js.native
}

