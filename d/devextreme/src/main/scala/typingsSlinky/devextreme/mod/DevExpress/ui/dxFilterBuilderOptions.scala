package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonAnd
import typingsSlinky.devextreme.AnonContains
import typingsSlinky.devextreme.AnonEditorElement
import typingsSlinky.devextreme.AnonEditorName
import typingsSlinky.devextreme.AnonModelPreviousValue
import typingsSlinky.devextreme.devextremeStrings.and
import typingsSlinky.devextreme.devextremeStrings.notAnd
import typingsSlinky.devextreme.devextremeStrings.notOr
import typingsSlinky.devextreme.devextremeStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFilterBuilderOptions extends WidgetOptions[dxFilterBuilder] {
  /** Specifies whether the widget can display hierarchical data fields. */
  var allowHierarchicalFields: js.UndefOr[Boolean] = js.native
  /** Configures custom filter operations. */
  var customOperations: js.UndefOr[js.Array[dxFilterBuilderCustomOperation]] = js.native
  /** Configures fields. */
  var fields: js.UndefOr[js.Array[dxFilterBuilderField]] = js.native
  /** Specifies filter operation descriptions. */
  var filterOperationDescriptions: js.UndefOr[AnonContains] = js.native
  /** Specifies group operation descriptions. */
  var groupOperationDescriptions: js.UndefOr[AnonAnd] = js.native
  /** Specifies a set of available group operations. */
  var groupOperations: js.UndefOr[js.Array[and | or | notAnd | notOr]] = js.native
  /** Specifies groups' maximum nesting level. */
  var maxGroupLevel: js.UndefOr[Double] = js.native
  /** A function that is executed after an editor is created. */
  var onEditorPrepared: js.UndefOr[js.Function1[/* e */ AnonEditorElement, _]] = js.native
  /** A function that is executed before an editor is created. */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ AnonEditorName, _]] = js.native
  /** A function that is executed after the widget's value is changed. */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ AnonModelPreviousValue, _]] = js.native
  /** Allows you to specify a filter. */
  var value: js.UndefOr[String | js.Array[_] | js.Function] = js.native
}

object dxFilterBuilderOptions {
  @scala.inline
  def apply(): dxFilterBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderOptions]
  }
  @scala.inline
  implicit class dxFilterBuilderOptionsOps[Self <: dxFilterBuilderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHierarchicalFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHierarchicalFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHierarchicalFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHierarchicalFields")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomOperations(value: js.Array[dxFilterBuilderCustomOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[dxFilterBuilderField]): Self = {
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
    @scala.inline
    def withFilterOperationDescriptions(value: AnonContains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperationDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOperationDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperationDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOperationDescriptions(value: AnonAnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOperationDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOperationDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOperationDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOperations(value: js.Array[and | or | notAnd | notOr]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxGroupLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGroupLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxGroupLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGroupLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorPrepared(value: /* e */ AnonEditorElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorPreparing(value: /* e */ AnonEditorName => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorPreparing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* e */ AnonModelPreviousValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | js.Array[_] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

