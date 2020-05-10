package typingsSlinky.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormOptionsAPI extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var fieldTransform: js.UndefOr[js.Function | js.Array[js.Function]] = js.native
  var formState: js.UndefOr[js.Object] = js.native
  var removeChromeAutoComplete: js.UndefOr[Boolean] = js.native
  var resetModel: js.UndefOr[js.Function] = js.native
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.native
  var updateInitialValue: js.UndefOr[js.Function] = js.native
  var wrapper: js.UndefOr[String | js.Array[String]] = js.native
}

object IFormOptionsAPI {
  @scala.inline
  def apply(): IFormOptionsAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormOptionsAPI]
  }
  @scala.inline
  implicit class IFormOptionsAPIOps[Self <: IFormOptionsAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldTransform(value: js.Function | js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withFormState(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formState")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChromeAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChromeAutoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveChromeAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChromeAutoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withResetModel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetModel")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateManipulators(value: ITemplateManipulators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateManipulators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateManipulators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateManipulators")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateInitialValue(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInitialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateInitialValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInitialValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

