package typingsSlinky.officeUiFabricReact.ratingTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRatingProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Allow the rating value to be set to 0 instead of a minimum of 1.
    */
  var allowZeroStars: js.UndefOr[Boolean] = js.native
  /**
    * Optional label format for a rating star that will be read by screen readers.
    * Can be used like "\{0\} of \{1\} stars selected",
    * where \{0\} will be substituted by the current rating and \{1\} will be substituted by the max rating.
    * @defaultvalue empty string.
    */
  var ariaLabelFormat: js.UndefOr[String] = js.native
  /**
    * Deprecated: Optional id of label describing this instance of Rating.
    * @deprecated Use `getAriaLabel` instead.
    */
  var ariaLabelId: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IRating interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IRating]] = js.native
  var getAriaLabel: js.UndefOr[js.Function2[/* rating */ Double, /* max */ Double, String]] = js.native
  /**
    * Custom icon
    * @defaultvalue FavoriteStarFill
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Maximum rating, defaults to 5, has to be \>= min
    */
  @JSName("max")
  var max_IRatingProps: js.UndefOr[Double] = js.native
  /**
    * Minimum rating, defaults to 1, has to be \>= 0
    * @deprecated No longer used.
    */
  @JSName("min")
  var min_IRatingProps: js.UndefOr[Double] = js.native
  /**
    * Callback issued when the rating changes.
    */
  @JSName("onChange")
  var onChange_IRatingProps: js.UndefOr[
    js.Function2[/* event */ SyntheticFocusEvent[HTMLElement], /* rating */ js.UndefOr[Double], Unit]
  ] = js.native
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
  /**
    * Selected rating, has to be an integer between min and max
    */
  var rating: js.UndefOr[Double] = js.native
  /**
    * Size of rating, defaults to small
    */
  @JSName("size")
  var size_IRatingProps: js.UndefOr[RatingSize] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]] = js.native
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Custom icon for unselected rating elements.
    * @defaultvalue FavoriteStar
    */
  var unselectedIcon: js.UndefOr[String] = js.native
}

object IRatingProps {
  @scala.inline
  def apply(): IRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRatingProps]
  }
  @scala.inline
  implicit class IRatingPropsOps[Self <: IRatingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowZeroStars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZeroStars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowZeroStars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZeroStars")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelId")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IRating | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IRating]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IRating]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAriaLabel(value: (/* rating */ Double, /* max */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAriaLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAriaLabel")(js.undefined)
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
    def withOnChange(value: (/* event */ SyntheticFocusEvent[HTMLElement], /* rating */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(value: /* rating */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: RatingSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IRatingStyleProps => Partial[IRatingStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectedIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedIcon")(js.undefined)
        ret
    }
  }
  
}

