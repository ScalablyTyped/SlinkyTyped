package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputFieldGroupProperties extends js.Object {
  /**
    * The group's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Arcade expression to determine whether this group is visible or not
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: js.UndefOr[String] = js.native
}

object InputFieldGroupProperties {
  @scala.inline
  def apply(): InputFieldGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFieldGroupProperties]
  }
  @scala.inline
  implicit class InputFieldGroupPropertiesOps[Self <: InputFieldGroupProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityExpression")(js.undefined)
        ret
    }
  }
  
}

