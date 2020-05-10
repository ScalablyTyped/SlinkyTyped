package typingsSlinky.configurable.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurable[T] extends js.Object {
  var settings: StringDictionary[js.Any] = js.native
  def disable(name: String): T with Configurable[T] = js.native
  def disabled(name: String): Boolean = js.native
  def enable(name: String): T with Configurable[T] = js.native
  def enabled(name: String): Boolean = js.native
  def get(name: String): js.Any = js.native
  def set(name: String, `val`: js.Any): T with Configurable[T] = js.native
}

object Configurable {
  @scala.inline
  def apply[T](
    disable: String => T with Configurable[T],
    disabled: String => Boolean,
    enable: String => T with Configurable[T],
    enabled: String => Boolean,
    get: String => js.Any,
    set: (String, js.Any) => T with Configurable[T],
    settings: StringDictionary[js.Any]
  ): Configurable[T] = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), disabled = js.Any.fromFunction1(disabled), enable = js.Any.fromFunction1(enable), enabled = js.Any.fromFunction1(enabled), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurable[T]]
  }
  @scala.inline
  implicit class ConfigurableOps[Self[t] <: Configurable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDisable(value: String => T with Configurable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabled(value: String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnable(value: String => T with Configurable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnabled(value: String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, js.Any) => T with Configurable[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSettings(value: StringDictionary[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

