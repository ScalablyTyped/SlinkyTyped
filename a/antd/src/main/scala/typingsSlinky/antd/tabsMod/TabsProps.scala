package typingsSlinky.antd.tabsMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.add
import typingsSlinky.antd.antdStrings.remove
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTabsProps * / any, 'editable'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTabsProps * / any[P]} */ trait TabsProps extends js.Object {
  var addIcon: js.UndefOr[ReactElement] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var hideAdd: js.UndefOr[Boolean] = js.undefined
  var onEdit: js.UndefOr[
    js.Function2[
      /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] | String, 
      /* action */ add | remove, 
      Unit
    ]
  ] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var `type`: js.UndefOr[TabsType] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddIconReactElement(value: ReactElement): Self = this.set("addIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddIcon(value: ReactElement): Self = this.set("addIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddIcon: Self = this.set("addIcon", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setHideAdd(value: Boolean): Self = this.set("hideAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAdd: Self = this.set("hideAdd", js.undefined)
    @scala.inline
    def setOnEdit(
      value: (/* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] | String, /* action */ add | remove) => Unit
    ): Self = this.set("onEdit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEdit: Self = this.set("onEdit", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: TabsType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

