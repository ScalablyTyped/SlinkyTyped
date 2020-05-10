package typingsSlinky.ractive.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ractive.ractiveBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOpts[T /* <: Ractive[T] */] extends BaseInitOpts[T] {
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. Cannot be used with enhance. */
  @JSName("append")
  var append_InitOpts: js.UndefOr[`true`] = js.native
  /** Initiial data for this instance. */
  var data: js.UndefOr[Data | DataFn[T]] = js.native
  /** The target element into which to render this instance. */
  var el: js.UndefOr[Target] = js.native
  /** If true, this instance will try to reuse DOM nodes found in its target rather than discarding and replacing them. Cannot be used with append. */
  var enhance: js.UndefOr[`true`] = js.native
  /** The target element into which to render this instance. */
  var target: js.UndefOr[Target] = js.native
  /** An array of plugins to apply to the instance. */
  var use: js.UndefOr[js.Array[PluginInstance]] = js.native
}

object InitOpts {
  @scala.inline
  def apply[T](): InitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOpts[T]]
  }
  @scala.inline
  implicit class InitOptsOps[Self[t] <: InitOpts[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAppend(value: `true`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Data | DataFn[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withElHTMLElement(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: Target): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhance(value: `true`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhance: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhance")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Target): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: js.Array[PluginInstance]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

