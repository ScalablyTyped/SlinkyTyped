package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropGridProperty extends IModel {
  /** [Property] (Ext.util.MixedCollection) */
  @JSName("fields")
  var fields_IPropGridProperty: js.UndefOr[IMixedCollection] = js.native
}

object IPropGridProperty {
  @scala.inline
  def apply(): IPropGridProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropGridProperty]
  }
  @scala.inline
  implicit class IPropGridPropertyOps[Self <: IPropGridProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: IMixedCollection): Self = {
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
  }
  
}

