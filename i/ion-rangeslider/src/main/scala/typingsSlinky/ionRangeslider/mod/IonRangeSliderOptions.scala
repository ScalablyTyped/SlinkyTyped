package typingsSlinky.ionRangeslider.mod

import typingsSlinky.ionRangeslider.ionRangesliderStrings.big
import typingsSlinky.ionRangeslider.ionRangesliderStrings.flat
import typingsSlinky.ionRangeslider.ionRangesliderStrings.modern
import typingsSlinky.ionRangeslider.ionRangesliderStrings.round
import typingsSlinky.ionRangeslider.ionRangesliderStrings.sharp
import typingsSlinky.ionRangeslider.ionRangesliderStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRangeSliderOptions extends js.Object {
     // Locks slider and makes it inactive. Input is disabled too. Invisible to forms [Default: false]
  var block: js.UndefOr[Boolean] = js.native
      // Special postfix, used only for maximum value. Will be showed after handle will reach maximum right position. For example **0 — 100+** [Default: ]
  var decorate_both: js.UndefOr[Boolean] = js.native
      // Separator for **double** values in input value property. `<input value="25;42"> [Default:  ; ]
  var disable: js.UndefOr[Boolean] = js.native
      // Set minimum maximum between sliders. Only for **double** type [Default: -]
  var drag_interval: js.UndefOr[Boolean] = js.native
     // Locks slider and makes it inactive. Input is NOT disabled. Can be send with forms [Default: false]
  var extra_classes: js.UndefOr[String] = js.native
   // Set up your own prettify function. Can be anything. For example, you can set up unix time as slider values and than transform them to cool looking dates [Default: null]
  var force_edges: js.UndefOr[Boolean] = js.native
      // Set slider maximum value [Default: 100]
  var from: js.UndefOr[Double] = js.native
       // Set up your own array of possible slider values. They could be numbers or strings. If the values array is set up, min, max and step param, can no longer be changed [Default: []]
  var from_fixed: js.UndefOr[Boolean] = js.native
      // Set minimum limit for left (or single) handle [Default: min]
  var from_max: js.UndefOr[Double] = js.native
     // Fix position of left (or single) handle [Default: false]
  var from_min: js.UndefOr[Double] = js.native
      // Set maximum limit for left (or single) handle [Default: max]
  var from_shadow: js.UndefOr[Boolean] = js.native
     // Activates keyboard controls. Move left: &larr;, &darr;, A, S. Move right: &rarr;, &uarr;, W, D. [Default: true]
  var grid: js.UndefOr[Boolean] = js.native
     // Enables grid of values above the slider [Default: true]
  var grid_margin: js.UndefOr[Boolean] = js.native
     // Set left and right grid gaps [Default: true]
  var grid_num: js.UndefOr[Double] = js.native
      // Number of grid units [Default: 4]
  var grid_snap: js.UndefOr[Boolean] = js.native
     // Hides **min** and **max** labels [Default: false]
  var hide_from_to: js.UndefOr[Boolean] = js.native
     // Snap grid to sliders step (step param). If activated, grid_num will not be used. Max steps = 50 [Default: false]
  var hide_min_max: js.UndefOr[Boolean] = js.native
      // Set your own separator for close values. Used for **double** type. Default: **10 — 100**. Or you may set: **10 to 100, 10 + 100, 10 &rarr; 100** etc. [Default:  - ]
  var input_values_separator: js.UndefOr[String] = js.native
     // Sliders handles and tooltips will be always inside it's container [Default: false]
  var keyboard: js.UndefOr[Boolean] = js.native
      // Set slider minimum value [Default: 10]
  var max: js.UndefOr[Double] = js.native
      // Set minimum diapason between sliders. Only for **double** type [Default: -]
  var max_interval: js.UndefOr[Double] = js.native
      // Set postfix for values. Will be set up right after the number: 100**k** [Default: ]
  var max_postfix: js.UndefOr[String] = js.native
      // Choose slider type, could be `single` - for one handle, or `double` for two handles [Default: single]
  var min: js.UndefOr[Double] = js.native
      // Set sliders step. Always > 0. Could be fractional [Default: 1]
  var min_interval: js.UndefOr[Double] = js.native
   // Callback. Is called on slider start. Gets all slider data as a 1st attribute [Default: null]
  var onChange: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
   // Callback. IS called on each values change. Gets all slider data as a 1st attribute [Default: null]
  var onFinish: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
         // Scope for callbacks. Pass any object [Default: null]
  var onStart: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
   // Callback. Is called when user releases handle. Gets all slider data as a 1st attribute [Default: null]
  var onUpdate: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.native
      // Set prefix for values. Will be set up right before the number: **$**100 [Default: ]
  var postfix: js.UndefOr[String] = js.native
     // Hides **from** and **to** labels [Default: false]
  var prefix: js.UndefOr[String] = js.native
      // Set up your own separator for long numbers: 10000000 &rarr; 10,000,000 etc. [Default:  ]
  var prettify: js.UndefOr[js.Function1[/* num */ Double, String]] = js.native
     // Highlight the right handle [Default: false]
  var prettify_enabled: js.UndefOr[Boolean] = js.native
     // Improve readability of long numbers: 10000000 &rarr; 10 000 000 [Default: true]
  var prettify_separator: js.UndefOr[String] = js.native
      // Traverse extra CSS-classes to sliders container [Default: —]
  var scope: js.UndefOr[js.Any] = js.native
  var skin: js.UndefOr[flat | big | modern | round | sharp | square] = js.native
      // Set start position for right handle [Default: max]
  var step: js.UndefOr[Double] = js.native
      // Set start position for left handle (or for single handle) [Default: min]
  var to: js.UndefOr[Double] = js.native
     // Highlight the limits for left handle [Default: false]
  var to_fixed: js.UndefOr[Boolean] = js.native
      // Set minimum limit for right handle [Default: min]
  var to_max: js.UndefOr[Double] = js.native
     // Fix position of right handle [Default: false]
  var to_min: js.UndefOr[Double] = js.native
      // Set maximum limit for right handle [Default: max]
  var to_shadow: js.UndefOr[Boolean] = js.native
   // Set slider theme [Default: flat]
  var `type`: js.UndefOr[String] = js.native
     // Allow user to drag whole range. Only for **double** type [Default: false]
  var values: js.UndefOr[js.Array[_]] = js.native
     // Used for **double** type and only if prefix or postfix was set up. Determine how to decorate close values. For example: **$10k — $100k** or **$10 — 100k** [Default: true]
  var values_separator: js.UndefOr[String] = js.native
}

object IonRangeSliderOptions {
  @scala.inline
  def apply(): IonRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRangeSliderOptions]
  }
  @scala.inline
  implicit class IonRangeSliderOptionsOps[Self <: IonRangeSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorate_both(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorate_both")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorate_both: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorate_both")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag_interval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrag_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra_classes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_classes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_classes")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_edges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_edges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_edges")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom_fixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom_fixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_max")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_min")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom_shadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom_shadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid_margin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid_margin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_margin")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid_num(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_num")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid_num: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_num")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid_snap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid_snap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid_snap")(js.undefined)
        ret
    }
    @scala.inline
    def withHide_from_to(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_from_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide_from_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_from_to")(js.undefined)
        ret
    }
    @scala.inline
    def withHide_min_max(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_min_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide_min_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_min_max")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_values_separator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_values_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_values_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_values_separator")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_interval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_postfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_postfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_postfix")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMin_interval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* obj */ IonRangeSliderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinish(value: /* obj */ IonRangeSliderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* obj */ IonRangeSliderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* obj */ IonRangeSliderEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPostfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettify(value: /* num */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrettify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettify_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettify_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettify_separator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettify_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettify_separator")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: flat | big | modern | round | sharp | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withTo_fixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo_fixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withTo_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_max")(js.undefined)
        ret
    }
    @scala.inline
    def withTo_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_min")(js.undefined)
        ret
    }
    @scala.inline
    def withTo_shadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo_shadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withValues_separator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values_separator")(js.undefined)
        ret
    }
  }
  
}

