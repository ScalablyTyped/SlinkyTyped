package typingsSlinky.atom.toolBarMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atom.anon.Class
import typingsSlinky.atom.anon.Item
import typingsSlinky.atom.atomStrings.devicon
import typingsSlinky.atom.atomStrings.fa
import typingsSlinky.atom.atomStrings.fab
import typingsSlinky.atom.atomStrings.fi
import typingsSlinky.atom.atomStrings.icomoon
import typingsSlinky.atom.atomStrings.ion
import typingsSlinky.atom.atomStrings.mdi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOptions extends js.Object {
  /** (optional) Color of the button's background */
  var background: js.UndefOr[String] = js.native
  /** (mandatory)
    * The callback must be either:
    * - Atom command: a string or array of  strings,
    * - a custom callback function,
    * - or an object where the keys are key modifiers (alt, ctrl or shift) and the values are commands or custom functions
    *
    * ## Example:
    * ```ts
    * callback: 'application:about',
    * ```
    *
    *
    * ## Example - Callback with modifiers
    * ```ts
    * callback: {
    *    '': 'application:cmd-1',      // Without modifiers is default action
    *    'alt': 'application:cmd-2',
    *    'ctrl': 'application:cmd-3',  // With function callback
    *    'shift'(data) {
    *      console.log(data);
    *    },
    *    'alt+shift': 'application:cmd-5',       // Multiple modifiers
    *    'alt+ctrl+shift': 'application:cmd-6'   // All modifiers
    *  },
    * data: 'foo'
    * ```
    */
  var callback: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String]) = js.native
  /** Buttons can be styled with arbitrary CSS through classes.
    * An example of how the class can be used is show below.
    *
    * ## Example:
    * ```ts
    * class: 'my-awesome-class'
    * ```
    *
    * ## Example:
    * ```ts
    * class: ['multiple', 'classes', 'also', 'works']
    * ```
    */
  var `class`: js.UndefOr[String | js.Array[String]] = js.native
  /** (optional) Color of the button */
  var color: js.UndefOr[String] = js.native
  /** `data` can be passed as the input argument of callback,  If callback is of type
    * - `(data: any) => void)` or
    * - `{ [modifier: string]: ((data: any) => void) }`,
    *
    */
  var data: js.UndefOr[js.Any] = js.native
  /** (optional)
    * if set to `true`, `text` will be rendered as HTML
    * ## Example:
    * ```ts
    * text: '<b>BIG</b> button',
    * html: true,
    * ```
    */
  var html: js.UndefOr[Boolean] = js.native
  /** (optional)
    *  icon name
    * ## Example:
    * ```js
    * icon: 'octoface',
    * ```
    */
  var icon: js.UndefOr[String] = js.native
  /** (optional)
    * icon set name.
    * It can be chosen among these:
    *    - not given : if `iconset` is not given Octicons (default Atom's flavour) is chosen
    *    - `ion` with `ios-` and `md- `prefixes for the icon names (Ionicons)
    *    - `fa` and fab for brands (FontAwesome)
    *    - `fi` (Foundation)
    *    - `icomoon` (IcoMoon)
    *    - `devicon` (Devicon)
    *    - `mdi` (MaterialDesignIcons)
    *
    * ## Example:
    * ```ts
    *     icon: 'ios-gear-a',
    *     iconset: 'ion'
    * ```
    */
  var iconset: js.UndefOr[ion | fa | fab | fi | icomoon | devicon | mdi] = js.native
  /** (optional) defaults to `50` */
  var priority: js.UndefOr[Double] = js.native
  /** (optional)
    * You can use `text` to:
    * - add text as a button, or
    *
    * ## Example:
    * ```ts
    * text: 'hello',
    * ```
    * - use HTML for a button. Needs `html` to be set to `true`
    *
    * ## Example:
    * ```ts
    * text: '<b>BIG</b> button',
    * html: true,
    * ```
    */
  var text: js.UndefOr[String] = js.native
  /** (optional)
    * The tooltip option may be a string or an object that is passed to Atom's TooltipManager
    */
  var tooltip: js.UndefOr[String | Item | Class] = js.native
}

object ButtonOptions {
  @scala.inline
  def apply(
    callback: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String])
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackFunction1(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCallback(
      value: String | js.Array[String] | (js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | (StringDictionary[(js.Function1[/* data */ js.UndefOr[js.Any], Unit]) | String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
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
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconset(value: ion | fa | fab | fi | icomoon | devicon | mdi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconset")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String | Item | Class): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

