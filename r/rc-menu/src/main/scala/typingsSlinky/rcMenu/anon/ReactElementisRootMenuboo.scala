package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ReactElement & {  isRootMenu :boolean,   subMenuInstance :react.react.ReactInstance} */
trait ReactElementisRootMenuboo extends js.Object {
  var isRootMenu: Boolean
  var key: typingsSlinky.react.mod.Key | Null
  var props: js.Any
  var subMenuInstance: ReactInstance
  var `type`: js.Any
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsRootMenu(value: Boolean): Self = this.set("isRootMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuInstanceElement(value: Element): Self = this.set("subMenuInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuInstanceComponent(value: ReactComponentClass[js.Any]): Self = this.set("subMenuInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuInstance(value: ReactInstance): Self = this.set("subMenuInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
  
}

