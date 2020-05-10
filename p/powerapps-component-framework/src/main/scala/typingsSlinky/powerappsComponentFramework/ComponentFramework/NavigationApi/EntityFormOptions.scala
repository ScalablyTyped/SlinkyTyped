package typingsSlinky.powerappsComponentFramework.ComponentFramework.NavigationApi

import typingsSlinky.powerappsComponentFramework.ComponentFramework.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for entity form options.
		 */
@js.native
trait EntityFormOptions extends js.Object {
  /**
  			 * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name
  			 */
  var createFromEntity: js.UndefOr[EntityReference] = js.native
  /**
  			 * ID of the entity record to display the form for.
  			 */
  var entityId: js.UndefOr[String] = js.native
  /**
  			 * Logical name of the entity to display the form for.
  			 */
  var entityName: String = js.native
  /**
  			 * ID of the form instance to be displayed.
  			 */
  var formId: js.UndefOr[String] = js.native
  /**
  			 * Height of the form window to be displayed in pixels.
  			 */
  var height: js.UndefOr[Double] = js.native
  /**
  			 * Indicates whether to display form in a new window.
  			 */
  var openInNewWindow: js.UndefOr[Boolean] = js.native
  /**
  			 * Indicates whether to open a quick create form. If you do not specify this, by default false is passed.
  			 */
  var useQuickCreateForm: js.UndefOr[Boolean] = js.native
  /**
  			 * Width of the form window to be displayed in pixels.
  			 */
  var width: js.UndefOr[Double] = js.native
  /**
  			 * Specify one of the following values for the window position of the form on the screen:
  			 *   1:center
  			 *   2:side
  			 */
  var windowPosition: js.UndefOr[Double] = js.native
}

object EntityFormOptions {
  @scala.inline
  def apply(entityName: String): EntityFormOptions = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFormOptions]
  }
  @scala.inline
  implicit class EntityFormOptionsOps[Self <: EntityFormOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFromEntity(value: EntityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFromEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenInNewWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenInNewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openInNewWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withUseQuickCreateForm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuickCreateForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseQuickCreateForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQuickCreateForm")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(js.undefined)
        ret
    }
  }
  
}

