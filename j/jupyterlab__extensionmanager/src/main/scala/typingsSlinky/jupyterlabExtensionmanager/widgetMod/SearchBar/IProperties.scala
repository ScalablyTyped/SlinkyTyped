package typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React properties for search bar component.
  */
@js.native
trait IProperties extends js.Object {
  /**
    * The placeholder string to use in the search bar input field when empty.
    */
  var placeholder: String = js.native
}

object IProperties {
  @scala.inline
  def apply(placeholder: String): IProperties = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

