package typingsSlinky.phosphorDatagrid.datamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the args objects of the `changed` signal.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.IRowsChangedArgs
  - typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.IColumnsChangedArgs
  - typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.IRowsMovedArgs
  - typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.IColumnsMovedArgs
  - typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.ICellsChangedArgs
  - typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.IModelResetArgs
*/
trait ChangedArgs extends js.Object

object ChangedArgs {
  @scala.inline
  implicit def apply(value: ICellsChangedArgs): ChangedArgs = value.asInstanceOf[ChangedArgs]
  @scala.inline
  implicit def apply(value: IColumnsChangedArgs): ChangedArgs = value.asInstanceOf[ChangedArgs]
  @scala.inline
  implicit def apply(value: IColumnsMovedArgs): ChangedArgs = value.asInstanceOf[ChangedArgs]
  @scala.inline
  implicit def apply(value: IModelResetArgs): ChangedArgs = value.asInstanceOf[ChangedArgs]
  @scala.inline
  implicit def apply(value: IRowsChangedArgs): ChangedArgs = value.asInstanceOf[ChangedArgs]
  @scala.inline
  implicit def apply(value: IRowsMovedArgs): ChangedArgs = value.asInstanceOf[ChangedArgs]
}

