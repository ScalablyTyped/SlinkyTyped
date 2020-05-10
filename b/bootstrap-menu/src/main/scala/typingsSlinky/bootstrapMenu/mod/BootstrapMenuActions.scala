package typingsSlinky.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Every function attribute is called before rendering the menu each time it is opened.
  * If `fetchElementData` was defined, these functions will receive as first argument its returned value for the currently selected element.
  */
@js.native
trait BootstrapMenuActions extends js.Object {
  /**
    * Optional, classes to add to the action.
    */
  var classNames: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.native
  /**
    * Optional, Font Awesome class of the icon to show for the action.
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Optional, decides if the action should appear enabled or disabled in the context menu.
    */
  var isEnabled: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.native
  /**
    * Optional, decides if the action should be shown or hidden in the context menu.
    */
  var isShown: js.UndefOr[js.Function1[/* rowElement */ BootstrapMenuRowElement, Boolean]] = js.native
  /**
    * The name of the action.
    */
  var name: String = js.native
  /**
    * Handler to run when an action is clicked.
    */
  def onClick(rowElement: BootstrapMenuRowElement): Unit = js.native
}

object BootstrapMenuActions {
  @scala.inline
  def apply(name: String, onClick: BootstrapMenuRowElement => Unit): BootstrapMenuActions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[BootstrapMenuActions]
  }
  @scala.inline
  implicit class BootstrapMenuActionsOps[Self <: BootstrapMenuActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: BootstrapMenuRowElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClassNamesFunction0(value: () => String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClassNames(value: String | js.Object | (js.Function0[String | js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnabled(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsShown(value: /* rowElement */ BootstrapMenuRowElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShown")(js.undefined)
        ret
    }
  }
  
}

