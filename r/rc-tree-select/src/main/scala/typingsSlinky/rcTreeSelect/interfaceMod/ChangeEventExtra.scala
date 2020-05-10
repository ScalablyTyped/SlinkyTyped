package typingsSlinky.rcTreeSelect.interfaceMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventExtra extends js.Object {
  /** @deprecated This prop not work as react node anymore. */
  var allCheckedNodes: js.Array[LegacyCheckedNode] = js.native
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var checked: js.UndefOr[Boolean] = js.native
  /** @deprecated Please save prev value by control logic instead */
  var preValue: js.Array[LabelValueType] = js.native
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var selected: js.UndefOr[Boolean] = js.native
  /** @deprecated This prop not work as react node anymore. */
  var triggerNode: ReactElement = js.native
  var triggerValue: RawValueType = js.native
}

object ChangeEventExtra {
  @scala.inline
  def apply(
    allCheckedNodes: js.Array[LegacyCheckedNode],
    preValue: js.Array[LabelValueType],
    triggerNode: ReactElement,
    triggerValue: RawValueType
  ): ChangeEventExtra = {
    val __obj = js.Dynamic.literal(allCheckedNodes = allCheckedNodes.asInstanceOf[js.Any], preValue = preValue.asInstanceOf[js.Any], triggerNode = triggerNode.asInstanceOf[js.Any], triggerValue = triggerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventExtra]
  }
  @scala.inline
  implicit class ChangeEventExtraOps[Self <: ChangeEventExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllCheckedNodes(value: js.Array[LegacyCheckedNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allCheckedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreValue(value: js.Array[LabelValueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerNode(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerValue(value: RawValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
  }
  
}

