package typingsSlinky.passportDashSaml.passportDashSamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheProvider extends js.Object {
  def get(key: String, callback: js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit | Null]): Unit = js.native
  def remove(key: String, callback: js.Function2[/* err */ js.Error | Null, /* key */ String, Unit | Null]): Unit = js.native
  def save(
    key: String,
    value: js.Any,
    callback: js.Function2[/* err */ js.Error | Null, /* cacheItem */ CacheItem, Unit | Null]
  ): Unit = js.native
  def save(
    key: Null,
    value: js.Any,
    callback: js.Function2[/* err */ js.Error | Null, /* cacheItem */ CacheItem, Unit | Null]
  ): Unit = js.native
}

