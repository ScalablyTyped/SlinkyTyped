package typingsSlinky.reactToolbox.navigationNavigationMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactToolbox.mod.ReactToolbox.Props
import typingsSlinky.reactToolbox.reactToolboxStrings.horizontal
import typingsSlinky.reactToolbox.reactToolboxStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProps extends Props {
  /**
    * Array of objects that will be represented as <Button/> so the keys will be transferred as properties the Button Component.
    */
  var actions: js.UndefOr[js.Array[_]] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactElement] = js.native
  /**
    * Array of objects similar to actions but that will be rendered as <Link/> component definition.
    */
  var routes: js.UndefOr[js.Array[_]] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[NavigationTheme] = js.native
  /**
    * Type of the navigation, it can be vertical or horizontal.
    * @default horizontal
    */
  var `type`: js.UndefOr[vertical | horizontal] = js.native
}

object NavigationProps {
  @scala.inline
  def apply(): NavigationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationProps]
  }
  @scala.inline
  implicit class NavigationPropsOps[Self <: NavigationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: js.Any*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[_]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: js.Any*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[_]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setTheme(value: NavigationTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: vertical | horizontal): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

