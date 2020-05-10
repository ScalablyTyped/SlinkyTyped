package typingsSlinky.officeUiFabricReact.groupedListBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListExampleState extends js.Object {
  var isCompactMode: js.UndefOr[Boolean] = js.native
}

object IGroupedListExampleState {
  @scala.inline
  def apply(): IGroupedListExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupedListExampleState]
  }
  @scala.inline
  implicit class IGroupedListExampleStateOps[Self <: IGroupedListExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCompactMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompactMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompactMode")(js.undefined)
        ret
    }
  }
  
}

