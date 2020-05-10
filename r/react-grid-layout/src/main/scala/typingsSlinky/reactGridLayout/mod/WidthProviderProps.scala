package typingsSlinky.reactGridLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidthProviderProps extends js.Object {
  /**
    * If true, WidthProvider will measure the container's width before mounting children.
    * Use this if you'd like to completely eliminate any resizing animation on
    * application/component mount.
    */
  var measureBeforeMount: js.UndefOr[Boolean] = js.native
}

object WidthProviderProps {
  @scala.inline
  def apply(): WidthProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthProviderProps]
  }
  @scala.inline
  implicit class WidthProviderPropsOps[Self <: WidthProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeasureBeforeMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureBeforeMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureBeforeMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureBeforeMount")(js.undefined)
        ret
    }
  }
  
}

