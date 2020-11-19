package typingsSlinky.expressBruteRedis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Redis store for Express Brute
  */
@js.native
trait expressBruteRedis extends js.Object {
  
  /**
    * @summary Gets a key in Redis storage.
    */
  def get(key: String): Unit = js.native
  def get(key: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def reset(key: String, callback: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  /**
    * @summary Resets a key in Redis storage.
    */
  def reset(key: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit], args: js.Any*): Unit = js.native
  
  /**
    * @summary Sets a key in Redis storage.
    */
  def set(key: String, value: String): Unit = js.native
  def set(
    key: String,
    value: String,
    lifetime: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* sender */ this.type, Unit]
  ): Unit = js.native
  def set(key: String, value: String, lifetime: Double): Unit = js.native
  def set(key: String, value: String, lifetime: Double, callback: js.Function1[/* sender */ this.type, Unit]): Unit = js.native
}
