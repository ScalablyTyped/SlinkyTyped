package typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod

import typingsSlinky.officeUiFabricReact.anon.kinkeyofPickIDetailsRowSt
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsRowFieldsProps extends IOverrideColumnRenderProps {
  /**
    * Style properties to customize cell render output.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  /**
    * Index to start for the column
    */
  var columnStartIndex: Double = js.native
  /**
    * Columns metadata
    */
  var columns: js.Array[IColumn] = js.native
  /**
    * whether to render as a compact field
    */
  var compact: js.UndefOr[Boolean] = js.native
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  /**
    * Data source for this component
    */
  var item: js.Any = js.native
  /**
    * The item index of the collection for the DetailsList
    */
  var itemIndex: Double = js.native
  /**
    * Subset of classnames currently generated in DetailsRow that are used within DetailsRowFields.
    */
  var rowClassNames: kinkeyofPickIDetailsRowSt = js.native
}

object IDetailsRowFieldsProps {
  @scala.inline
  def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    rowClassNames: kinkeyofPickIDetailsRowSt
  ): IDetailsRowFieldsProps = {
    val __obj = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowFieldsProps]
  }
  @scala.inline
  implicit class IDetailsRowFieldsPropsOps[Self <: IDetailsRowFieldsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowClassNames(value: kinkeyofPickIDetailsRowSt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellStyleProps(value: ICellStyleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUpdateAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUpdateAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(js.undefined)
        ret
    }
  }
  
}

