package typingsSlinky.gaeaModel.FitGaea

import typingsSlinky.gaeaModel.AnonBeforeName
import typingsSlinky.gaeaModel.AnonComponentInfo
import typingsSlinky.gaeaModel.AnonIndex
import typingsSlinky.gaeaModel.AnonNewIndex
import typingsSlinky.gaeaModel.AnonNewValue
import typingsSlinky.gaeaModel.AnonSourceIndex
import typingsSlinky.gaeaModel.gaeaModelStrings.add
import typingsSlinky.gaeaModel.gaeaModelStrings.addCombo
import typingsSlinky.gaeaModel.gaeaModelStrings.addSource
import typingsSlinky.gaeaModel.gaeaModelStrings.exchange
import typingsSlinky.gaeaModel.gaeaModelStrings.move
import typingsSlinky.gaeaModel.gaeaModelStrings.paste
import typingsSlinky.gaeaModel.gaeaModelStrings.remove
import typingsSlinky.gaeaModel.gaeaModelStrings.reset
import typingsSlinky.gaeaModel.gaeaModelStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  // 新增操作
  var add: js.UndefOr[AnonIndex] = js.undefined
  // 新增组合
  var addCombo: js.UndefOr[AnonComponentInfo] = js.undefined
  // 新增模板
  var addSource: js.UndefOr[AnonComponentInfo] = js.undefined
  // 内部交换顺序
  var exchange: js.UndefOr[AnonNewIndex] = js.undefined
  // 操作组件的 mapUniqueKey
  var mapUniqueKey: String
  // 移动到另一个父元素
  var move: js.UndefOr[AnonSourceIndex] = js.undefined
  // 粘贴操作
  var paste: js.UndefOr[DiffRemove] = js.undefined
  // 删除组件
  var remove: js.UndefOr[DiffRemove] = js.undefined
  // 重置组件
  var reset: js.UndefOr[AnonBeforeName] = js.undefined
  // 操作类型
  var `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource
  // 更新操作
  var update: js.UndefOr[AnonNewValue] = js.undefined
}

object Diff {
  @scala.inline
  def apply(
    mapUniqueKey: String,
    `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource,
    add: AnonIndex = null,
    addCombo: AnonComponentInfo = null,
    addSource: AnonComponentInfo = null,
    exchange: AnonNewIndex = null,
    move: AnonSourceIndex = null,
    paste: DiffRemove = null,
    remove: DiffRemove = null,
    reset: AnonBeforeName = null,
    update: AnonNewValue = null
  ): Diff = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (addCombo != null) __obj.updateDynamic("addCombo")(addCombo.asInstanceOf[js.Any])
    if (addSource != null) __obj.updateDynamic("addSource")(addSource.asInstanceOf[js.Any])
    if (exchange != null) __obj.updateDynamic("exchange")(exchange.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
}

