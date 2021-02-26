package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.kinkeyofPickIDetailsRowSt
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DetailsRowFields {
  
  @scala.inline
  def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    rowClassNames: kinkeyofPickIDetailsRowSt
  ): Builder = {
    val __props = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsRowFieldsProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DetailsRowFields")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableUpdateAnimations(value: Boolean): this.type = set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): this.type = set("getCellValueKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def onRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactElement
    ): this.type = set("onRenderItemColumn", js.Any.fromFunction3(value))
  }
  
  def withProps(p: IDetailsRowFieldsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
