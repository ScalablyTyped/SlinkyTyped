package typingsSlinky.agGrid.componentResolverMod

import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.colDefMod.ColGroupDef
import typingsSlinky.agGrid.gridOptionsMod.GridOptions
import typingsSlinky.agGrid.iRichCellEditorParamsMod.IRichCellEditorParams
import typingsSlinky.agGrid.iSetFilterParamsMod.ISetFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.agGrid.gridOptionsMod.GridOptions
  - typingsSlinky.agGrid.colDefMod.ColDef
  - typingsSlinky.agGrid.colDefMod.ColGroupDef
  - typingsSlinky.agGrid.iSetFilterParamsMod.ISetFilterParams
  - typingsSlinky.agGrid.iRichCellEditorParamsMod.IRichCellEditorParams
*/
trait ComponentHolder extends js.Object

object ComponentHolder {
  @scala.inline
  implicit def apply(value: ColDef): ComponentHolder = value.asInstanceOf[ComponentHolder]
  @scala.inline
  implicit def apply(value: ColGroupDef): ComponentHolder = value.asInstanceOf[ComponentHolder]
  @scala.inline
  implicit def apply(value: GridOptions): ComponentHolder = value.asInstanceOf[ComponentHolder]
  @scala.inline
  implicit def apply(value: IRichCellEditorParams): ComponentHolder = value.asInstanceOf[ComponentHolder]
  @scala.inline
  implicit def apply(value: ISetFilterParams): ComponentHolder = value.asInstanceOf[ComponentHolder]
}

