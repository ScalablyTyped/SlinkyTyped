package typingsSlinky.powerappsComponentFramework.ComponentFramework.UtilityApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Options used when opening a lookup dialog.
		 */
@js.native
trait LookupOptions extends js.Object {
  /**
  			 * Whether the lookup allows more than one item to be selected.
  			 */
  var allowMultiSelect: Boolean = js.native
  /**
  			 * The default entity type.
  			 */
  var defaultEntityType: String = js.native
  /**
  			 * The default view to use.
  			 */
  var defaultViewId: String = js.native
  /**
  			 * The entity types to display.
  			 */
  var entityTypes: js.Array[String] = js.native
  /**
  			 * The views to be available in the view picker. Only System views are supported (not user views).
  			 */
  var viewIds: js.Array[String] = js.native
}

object LookupOptions {
  @scala.inline
  def apply(
    allowMultiSelect: Boolean,
    defaultEntityType: String,
    defaultViewId: String,
    entityTypes: js.Array[String],
    viewIds: js.Array[String]
  ): LookupOptions = {
    val __obj = js.Dynamic.literal(allowMultiSelect = allowMultiSelect.asInstanceOf[js.Any], defaultEntityType = defaultEntityType.asInstanceOf[js.Any], defaultViewId = defaultViewId.asInstanceOf[js.Any], entityTypes = entityTypes.asInstanceOf[js.Any], viewIds = viewIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptions]
  }
  @scala.inline
  implicit class LookupOptionsOps[Self <: LookupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEntityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultViewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

