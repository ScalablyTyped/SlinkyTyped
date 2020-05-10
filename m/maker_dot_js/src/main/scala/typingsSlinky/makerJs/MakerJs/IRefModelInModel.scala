package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a model within a model.
  */
@js.native
trait IRefModelInModel extends js.Object {
  var childId: String = js.native
  var childModel: IModel = js.native
  var parentModel: IModel = js.native
}

object IRefModelInModel {
  @scala.inline
  def apply(childId: String, childModel: IModel, parentModel: IModel): IRefModelInModel = {
    val __obj = js.Dynamic.literal(childId = childId.asInstanceOf[js.Any], childModel = childModel.asInstanceOf[js.Any], parentModel = parentModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefModelInModel]
  }
  @scala.inline
  implicit class IRefModelInModelOps[Self <: IRefModelInModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

