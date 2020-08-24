package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderCheckboxProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderStyleProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderStyles
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupHeader {
  @JSImport("office-ui-fabric-react", "GroupHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def ariaPosInSet(value: Double): this.type = set("ariaPosInSet", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaSetSize(value: Double): this.type = set("ariaSetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ js.Object | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def expandButtonIcon(value: String): this.type = set("expandButtonIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def expandButtonProps(value: HTMLAttributes[HTMLButtonElement]): this.type = set("expandButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def footerText(value: String): this.type = set("footerText", value.asInstanceOf[js.Any])
    @scala.inline
    def group(value: IGroup): this.type = set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def groupIndex(value: Double): this.type = set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def groupLevel(value: Double): this.type = set("groupLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def groupedListId(value: String): this.type = set("groupedListId", value.asInstanceOf[js.Any])
    @scala.inline
    def groupsVarargs(value: IGroup*): this.type = set("groups", js.Array(value :_*))
    @scala.inline
    def groups(value: js.Array[IGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def isCollapsedGroupSelectVisible(value: Boolean): this.type = set("isCollapsedGroupSelectVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def isGroupLoading(value: /* group */ IGroup => Boolean): this.type = set("isGroupLoading", js.Any.fromFunction1(value))
    @scala.inline
    def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingText(value: String): this.type = set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def onGroupHeaderClick(value: /* group */ IGroup => Unit): this.type = set("onGroupHeaderClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRenderGroupHeaderCheckbox(
      value: (/* props */ js.UndefOr[IGroupHeaderCheckboxProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IGroupHeaderCheckboxProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): this.type = set("onRenderGroupHeaderCheckbox", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderTitle(
      value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderTitle", js.Any.fromFunction2(value))
    @scala.inline
    def onToggleCollapse(value: /* group */ IGroup => Unit): this.type = set("onToggleCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def onToggleSelectGroup(value: /* group */ IGroup => Unit): this.type = set("onToggleSelectGroup", js.Any.fromFunction1(value))
    @scala.inline
    def onToggleSummarize(value: /* group */ IGroup => Unit): this.type = set("onToggleSummarize", js.Any.fromFunction1(value))
    @scala.inline
    def selectAllButtonProps(value: HTMLAttributes[HTMLButtonElement]): this.type = set("selectAllButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def showAllLinkText(value: String): this.type = set("showAllLinkText", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IGroupHeaderStyleProps => DeepPartial[IGroupHeaderStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGroupHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GroupHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

