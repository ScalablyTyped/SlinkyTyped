package typingsSlinky.officeUiFabricReact.detailsListNavigatingFocusExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListNavigatingFocusExampleState extends js.Object {
  var initialFocusedIndex: js.UndefOr[Double] = js.native
  var items: js.Array[String] = js.native
  var key: Double = js.native
}

object IDetailsListNavigatingFocusExampleState {
  @scala.inline
  def apply(items: js.Array[String], key: Double): IDetailsListNavigatingFocusExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListNavigatingFocusExampleState]
  }
  @scala.inline
  implicit class IDetailsListNavigatingFocusExampleStateOps[Self <: IDetailsListNavigatingFocusExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialFocusedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocusedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFocusedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocusedIndex")(js.undefined)
        ret
    }
  }
  
}

