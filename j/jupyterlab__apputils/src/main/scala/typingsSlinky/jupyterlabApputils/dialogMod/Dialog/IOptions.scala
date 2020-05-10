package typingsSlinky.jupyterlabApputils.dialogMod.Dialog

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a dialog.
  */
@js.native
trait IOptions[T] extends js.Object {
  /**
    * The main body element for the dialog or a message to display.
    * Defaults to an empty string.
    *
    * #### Notes
    * If a widget is given as the body, it will be disposed after the
    * dialog is resolved.  If the widget has a `getValue()` method,
    * the method will be called prior to disposal and the value
    * will be provided as part of the dialog result.
    * A string argument will be used as raw `textContent`.
    * All `input` and `select` nodes will be wrapped and styled.
    */
  var body: Body[T] = js.native
  /**
    * The buttons to display. Defaults to cancel and accept buttons.
    */
  var buttons: js.Array[IButton] = js.native
  /**
    * The index of the default button.  Defaults to the last button.
    */
  var defaultButton: Double = js.native
  /**
    * A selector for the primary element that should take focus in the dialog.
    * Defaults to an empty string, causing the [[defaultButton]] to take
    * focus.
    */
  var focusNodeSelector: String = js.native
  /**
    * The host element for the dialog. Defaults to `document.body`.
    */
  var host: HTMLElement = js.native
  /**
    * An optional renderer for dialog items.  Defaults to a shared
    * default renderer.
    */
  var renderer: IRenderer = js.native
  /**
    * The top level text for the dialog.  Defaults to an empty string.
    */
  var title: Header = js.native
}

object IOptions {
  @scala.inline
  def apply[T](
    body: Body[T],
    buttons: js.Array[IButton],
    defaultButton: Double,
    focusNodeSelector: String,
    host: HTMLElement,
    renderer: IRenderer,
    title: Header
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any], focusNodeSelector = focusNodeSelector.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBodyReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Body[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[IButton]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultButton(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusNodeSelector(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNodeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: IRenderer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Header): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

