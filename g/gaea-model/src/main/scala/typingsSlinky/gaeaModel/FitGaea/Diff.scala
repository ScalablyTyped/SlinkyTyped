package typingsSlinky.gaeaModel.FitGaea

import typingsSlinky.gaeaModel.anon.BeforeName
import typingsSlinky.gaeaModel.anon.ComponentInfo
import typingsSlinky.gaeaModel.anon.Index
import typingsSlinky.gaeaModel.anon.NewIndex
import typingsSlinky.gaeaModel.anon.NewValue
import typingsSlinky.gaeaModel.anon.SourceIndex
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

@js.native
trait Diff extends js.Object {
  // 新增操作
  var add: js.UndefOr[Index] = js.native
  // 新增组合
  var addCombo: js.UndefOr[ComponentInfo] = js.native
  // 新增模板
  var addSource: js.UndefOr[ComponentInfo] = js.native
  // 内部交换顺序
  var exchange: js.UndefOr[NewIndex] = js.native
  // 操作组件的 mapUniqueKey
  var mapUniqueKey: String = js.native
  // 移动到另一个父元素
  var move: js.UndefOr[SourceIndex] = js.native
  // 粘贴操作
  var paste: js.UndefOr[DiffRemove] = js.native
  // 删除组件
  var remove: js.UndefOr[DiffRemove] = js.native
  // 重置组件
  var reset: js.UndefOr[BeforeName] = js.native
  // 操作类型
  var `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource = js.native
  // 更新操作
  var update: js.UndefOr[NewValue] = js.native
}

object Diff {
  @scala.inline
  def apply(
    mapUniqueKey: String,
    `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource
  ): Diff = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: add | move | remove | exchange | update | paste | reset | addCombo | addSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd(value: Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCombo(value: ComponentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCombo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddCombo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCombo")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSource(value: ComponentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSource")(js.undefined)
        ret
    }
    @scala.inline
    def withExchange(value: NewIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: SourceIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: DiffRemove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: DiffRemove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: BeforeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: NewValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

