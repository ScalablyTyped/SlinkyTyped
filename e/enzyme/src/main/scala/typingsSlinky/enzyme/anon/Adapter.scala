package typingsSlinky.enzyme.anon

import typingsSlinky.enzyme.mod.EnzymeAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  var adapter: EnzymeAdapter = js.native
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/guides/migration-from-2-to-3.md#lifecycle-methods
  // Actually, `{adapter:} & Pick<ShallowRendererProps,"disableLifecycleMethods">` is more precise. However,
  // in that case jsdoc won't be shown
  /**
    * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
    * setProps and setContext. Default to false.
    */
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
}

object Adapter {
  @scala.inline
  def apply(adapter: EnzymeAdapter): Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: EnzymeAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableLifecycleMethods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLifecycleMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLifecycleMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLifecycleMethods")(js.undefined)
        ret
    }
  }
  
}

