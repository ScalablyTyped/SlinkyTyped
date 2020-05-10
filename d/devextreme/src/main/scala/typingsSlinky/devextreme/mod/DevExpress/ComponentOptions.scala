package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.AnonComponent
import typingsSlinky.devextreme.AnonElement
import typingsSlinky.devextreme.AnonFullName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[T] extends js.Object {
  /** A function that is executed before the widget is disposed of. */
  var onDisposing: js.UndefOr[js.Function1[/* e */ AnonComponent[T], _]] = js.native
  /** A function used in JavaScript frameworks to save the widget instance. */
  var onInitialized: js.UndefOr[js.Function1[/* e */ AnonElement[T], _]] = js.native
  /** A function that is executed after a widget option is changed. */
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ AnonFullName[T], _]] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[T](): ComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[T]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self[t] <: ComponentOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnDisposing(value: /* e */ AnonComponent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisposing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisposing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisposing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialized(value: /* e */ AnonElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitialized: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOptionChanged(value: /* e */ AnonFullName[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOptionChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOptionChanged")(js.undefined)
        ret
    }
  }
  
}

