package typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React properties for collapsible section component.
  */
@js.native
trait IProperties extends js.Object {
  /**
    * If given, this will be diplayed instead of the children.
    */
  var errorMessage: js.UndefOr[String | Null] = js.native
  /**
    * The header string for section list.
    */
  var header: String = js.native
  /**
    * Any additional elements to add to the header.
    */
  var headerElements: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Whether the view will be expanded or collapsed initially, defaults to open.
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Handle collapse event.
    */
  var onCollapse: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
}

object IProperties {
  @scala.inline
  def apply(header: String): IProperties = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(null)
        ret
    }
    @scala.inline
    def withHeaderElementsReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderElements(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerElements")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(value: /* isOpen */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
  }
  
}

