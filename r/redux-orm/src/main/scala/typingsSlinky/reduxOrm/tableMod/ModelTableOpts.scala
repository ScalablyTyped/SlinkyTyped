package typingsSlinky.reduxOrm.tableMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.modelMod.AnyModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelTableOpts[MClass /* <: Instantiable0[AnyModel] */] extends js.Object {
  val arrName: ArrName[MClass] = js.native
  val fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any = js.native
  val idAttribute: IdAttribute[MClass] = js.native
  val mapName: MapName[MClass] = js.native
}

object ModelTableOpts {
  @scala.inline
  def apply[MClass](
    arrName: ArrName[MClass],
    fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any,
    idAttribute: IdAttribute[MClass],
    mapName: MapName[MClass]
  ): ModelTableOpts[MClass] = {
    val __obj = js.Dynamic.literal(arrName = arrName.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], idAttribute = idAttribute.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTableOpts[MClass]]
  }
  @scala.inline
  implicit class ModelTableOptsOps[Self[mclass] <: ModelTableOpts[mclass], MClass] (val x: Self[MClass]) extends AnyVal {
    @scala.inline
    def duplicate: Self[MClass] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[MClass]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[MClass] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[MClass] with Other]
    @scala.inline
    def withArrName(value: ArrName[MClass]): Self[MClass] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(
      value: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any
    ): Self[MClass] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdAttribute(value: IdAttribute[MClass]): Self[MClass] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapName(value: MapName[MClass]): Self[MClass] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

