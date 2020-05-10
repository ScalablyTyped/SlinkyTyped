package typingsSlinky.reactToolbox.navigationNavigationMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactToolbox.componentsMod.ReactToolbox.Props
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
  var children: js.UndefOr[TagMod[Any]] = js.native
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
    def withActions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: NavigationTheme): Self = {
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
    def withType(value: vertical | horizontal): Self = {
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
  }
  
}

