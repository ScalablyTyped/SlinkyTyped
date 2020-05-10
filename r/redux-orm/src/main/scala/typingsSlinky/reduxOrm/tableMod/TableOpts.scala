package typingsSlinky.reduxOrm.tableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reduxOrm.fieldsMod.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOpts extends js.Object {
  val arrName: js.UndefOr[String] = js.native
  val fields: js.UndefOr[StringDictionary[Field]] = js.native
  val idAttribute: js.UndefOr[String] = js.native
  val mapName: js.UndefOr[String] = js.native
}

object TableOpts {
  @scala.inline
  def apply(): TableOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOpts]
  }
  @scala.inline
  implicit class TableOptsOps[Self <: TableOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrName")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withIdAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withMapName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapName")(js.undefined)
        ret
    }
  }
  
}

