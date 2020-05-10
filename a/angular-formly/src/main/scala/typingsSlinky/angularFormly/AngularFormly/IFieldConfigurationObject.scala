package typingsSlinky.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldConfigurationObject extends IFieldObject {
  /**
  		 * By default, the model passed to the formly-field directive is the same as the model passed to the
  		 * formly-form. However, if the field has a model specified, then it is used for that field (and that
  		 * field only). In addition, a deep watch is added to the formly-field directive's scope to run the
  		 * expressionProperties when the specified model changes.
  		 *
  		 * Note, the formly-form directive will allow you to specify a string which is an (almost) formly
  		 * expression which allows you to define the model as relative to the scope of the form.
  		 *
  		 * see http://docs.angular-formly.com/docs/field-configuration-object#model-object--string
  		 */
  var model: js.UndefOr[String | StringDictionary[js.Any]] = js.native
}

object IFieldConfigurationObject {
  @scala.inline
  def apply(): IFieldConfigurationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldConfigurationObject]
  }
  @scala.inline
  implicit class IFieldConfigurationObjectOps[Self <: IFieldConfigurationObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: String | StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

