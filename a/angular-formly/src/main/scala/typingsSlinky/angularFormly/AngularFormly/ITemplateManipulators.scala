package typingsSlinky.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITemplateManipulators extends js.Object {
  var postWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.native
  var preWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.native
}

object ITemplateManipulators {
  @scala.inline
  def apply(): ITemplateManipulators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateManipulators]
  }
  @scala.inline
  implicit class ITemplateManipulatorsOps[Self <: ITemplateManipulators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostWrapper(value: js.Array[ITemplateManipulator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withPreWrapper(value: js.Array[ITemplateManipulator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preWrapper")(js.undefined)
        ret
    }
  }
  
}

