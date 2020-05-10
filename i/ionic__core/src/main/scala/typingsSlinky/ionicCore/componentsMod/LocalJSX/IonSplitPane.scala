package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSplitPane extends js.Object {
  /**
    * The content `id` of the split-pane's main content. This property can be used instead of the `[main]` attribute to select the `main` content of the split-pane.
    */
  var contentId: js.UndefOr[String] = js.native
  /**
    * If `true`, the split pane will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Expression to be called when the split-pane visibility has changed
    */
  var onIonSplitPaneVisible: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  var when: js.UndefOr[String | Boolean] = js.native
}

object IonSplitPane {
  @scala.inline
  def apply(): IonSplitPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSplitPane]
  }
  @scala.inline
  implicit class IonSplitPaneOps[Self <: IonSplitPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSplitPaneVisible(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSplitPaneVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSplitPaneVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSplitPaneVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withWhen(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

