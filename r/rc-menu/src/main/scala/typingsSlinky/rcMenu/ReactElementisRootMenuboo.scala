package typingsSlinky.rcMenu

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ReactElement & {  isRootMenu  :boolean,   subMenuInstance  :react.react.ReactInstance} */
@js.native
trait ReactElementisRootMenuboo extends js.Object {
  var isRootMenu: Boolean = js.native
  var key: Key | Null = js.native
  var props: js.Any = js.native
  var subMenuInstance: ReactInstance = js.native
  var `type`: js.Any = js.native
}

object ReactElementisRootMenuboo {
  @scala.inline
  def apply(isRootMenu: Boolean, props: js.Any, subMenuInstance: ReactInstance, `type`: js.Any): ReactElementisRootMenuboo = {
    val __obj = js.Dynamic.literal(isRootMenu = isRootMenu.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], subMenuInstance = subMenuInstance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElementisRootMenuboo]
  }
  @scala.inline
  implicit class ReactElementisRootMenubooOps[Self <: ReactElementisRootMenuboo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRootMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRootMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuInstanceElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuInstanceComponent(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuInstance(value: ReactInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
  }
  
}

