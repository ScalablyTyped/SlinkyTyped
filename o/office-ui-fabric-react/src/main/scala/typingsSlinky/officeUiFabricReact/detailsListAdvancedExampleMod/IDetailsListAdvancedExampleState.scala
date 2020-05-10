package typingsSlinky.officeUiFabricReact.detailsListAdvancedExampleMod

import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListAdvancedExampleState extends js.Object {
  var announcedMessage: js.UndefOr[String] = js.native
  var canResizeColumns: js.UndefOr[Boolean] = js.native
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  var columns: js.Array[IColumn] = js.native
  var constrainMode: js.UndefOr[ConstrainMode] = js.native
  var contextualMenuProps: js.UndefOr[IContextualMenuProps] = js.native
  var groupItemLimit: js.UndefOr[Double] = js.native
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  var isHeaderVisible: js.UndefOr[Boolean] = js.native
  var isLazyLoaded: js.UndefOr[Boolean] = js.native
  var isSortedDescending: js.UndefOr[Boolean] = js.native
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ] = js.native
  var layoutMode: js.UndefOr[DetailsListLayoutMode] = js.native
  var selectionCount: Double = js.native
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  var sortedColumnKey: js.UndefOr[String] = js.native
}

object IDetailsListAdvancedExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    selectionCount: Double
  ): IDetailsListAdvancedExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionCount = selectionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListAdvancedExampleState]
  }
  @scala.inline
  implicit class IDetailsListAdvancedExampleStateOps[Self <: IDetailsListAdvancedExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnouncedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnouncedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withCanResizeColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResizeColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanResizeColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResizeColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxVisibility(value: CheckboxVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainMode(value: ConstrainMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainMode")(js.undefined)
        ret
    }
    @scala.inline
    def withContextualMenuProps(value: IContextualMenuProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextualMenuProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualMenuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupItemLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupItemLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupItemLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupItemLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[IGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHeaderVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLazyLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLazyLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLazyLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLazyLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortedDescending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortedDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortedDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortedDescending")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutMode(value: DetailsListLayoutMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortedColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedColumnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortedColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedColumnKey")(js.undefined)
        ret
    }
  }
  
}

