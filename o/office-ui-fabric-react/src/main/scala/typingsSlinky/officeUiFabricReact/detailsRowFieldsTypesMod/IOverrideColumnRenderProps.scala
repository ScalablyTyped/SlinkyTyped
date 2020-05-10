package typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.IDetailsListProps, 'onRenderItemColumn' | 'getCellValueKey'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.IDetailsRowProps, 'cellsByColumn'> */
@js.native
trait IOverrideColumnRenderProps extends js.Object {
  var cellsByColumn: js.UndefOr[StringDictionary[TagMod[Any]]] = js.native
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.native
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      TagMod[Any]
    ]
  ] = js.native
}

object IOverrideColumnRenderProps {
  @scala.inline
  def apply(): IOverrideColumnRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverrideColumnRenderProps]
  }
  @scala.inline
  implicit class IOverrideColumnRenderPropsOps[Self <: IOverrideColumnRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellsByColumn(value: StringDictionary[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellsByColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValueKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetCellValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemColumn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRenderItemColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemColumn")(js.undefined)
        ret
    }
  }
  
}

