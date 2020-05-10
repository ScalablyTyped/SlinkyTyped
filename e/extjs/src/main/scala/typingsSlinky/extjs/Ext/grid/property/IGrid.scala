package typingsSlinky.extjs.Ext.grid.property

import typingsSlinky.extjs.Ext.grid.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGrid extends IPanel {
  /** [Config Option] (Object) */
  var customEditors: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var customRenderers: js.UndefOr[js.Any] = js.native
  /** [Method] Gets the source data object containing the property data
  		* @returns Object The data object.
  		*/
  var getSource: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var inferTypes: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number/String) */
  var nameColumnWidth: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var nameField: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var propertyNames: js.UndefOr[js.Any] = js.native
  /** [Method] Removes a property from the grid
  		* @param prop String The name of the property to remove.
  		*/
  var removeProperty: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of a property
  		* @param prop String The name of the property to set.
  		* @param value Object The value to test.
  		* @param create Boolean true to create the property if it doesn't already exist.
  		*/
  var setProperty: js.UndefOr[
    js.Function3[
      /* prop */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* create */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the source data object containing the property data
  		* @param source Object The data object.
  		* @param sourceConfig Object A new object. If this argument is not passed the current configuration will be re-used. To reset the config, pass null or an empty object literal.
  		*/
  var setSource: js.UndefOr[
    js.Function2[/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Object) */
  var source: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var sourceConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.native
}

object IGrid {
  @scala.inline
  def apply(): IGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrid]
  }
  @scala.inline
  implicit class IGridOps[Self <: IGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomEditors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEditors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEditors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEditors")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRenderers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRenderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRenderers")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSource(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSource")(js.undefined)
        ret
    }
    @scala.inline
    def withInferTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withNameColumnWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveProperty(value: /* prop */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProperty(
      value: (/* prop */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* create */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProperty")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSource(value: (/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

