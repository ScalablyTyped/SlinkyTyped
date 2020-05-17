package typingsSlinky.blueprintjsCore.htmlSelectMod

import org.scalajs.dom.raw.HTMLSelectElement
import typingsSlinky.blueprintjsCore.anon.PartialIIconProps
import typingsSlinky.blueprintjsCore.htmlMod.IElementRefProps
import typingsSlinky.blueprintjsCore.propsMod.IOptionProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.SelectHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLSelectProps
  extends SelectHTMLAttributes[HTMLSelectElement]
     with IElementRefProps[HTMLSelectElement] {
  /** Whether this element should fill its container. */
  var fill: js.UndefOr[Boolean] = js.native
  /** Props to spread to the `<Icon>` element. */
  var iconProps: js.UndefOr[PartialIIconProps] = js.native
  /** Whether to use large styles. */
  var large: js.UndefOr[Boolean] = js.native
  /** Whether to use minimal styles. */
  var minimal: js.UndefOr[Boolean] = js.native
  /** Change event handler. Use `event.currentTarget.value` to access the new value. */
  @JSName("onChange")
  var onChange_IHTMLSelectProps: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.native
  /**
    * Shorthand for supplying options: an array of basic types or
    * `{ label?, value }` objects. If no `label` is supplied, `value`
    * will be used as the label.
    */
  var options: js.UndefOr[js.Array[String | Double | IOptionProps]] = js.native
  /** Controlled value of this component. */
  @JSName("value")
  var value_IHTMLSelectProps: js.UndefOr[String | Double] = js.native
}

object IHTMLSelectProps {
  @scala.inline
  def apply(): IHTMLSelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHTMLSelectProps]
  }
  @scala.inline
  implicit class IHTMLSelectPropsOps[Self <: IHTMLSelectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withIconProps(value: PartialIIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: ChangeEvent[HTMLSelectElement] => Unit): Self = {
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
    def withOptions(value: js.Array[String | Double | IOptionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
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

