package typingsSlinky.activexLibreoffice.com_.sun.star.ui.test

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XUIObject extends js.Object {
  val Children: SafeArray[String] = js.native
  val State: PropertyValues = js.native
  val Type: String = js.native
  def executeAction(action: String, propValues: PropertyValues): Unit = js.native
  def getChild(id: String): XUIObject = js.native
  def getChildren(): SafeArray[String] = js.native
  def getState(): PropertyValues = js.native
  def getType(): String = js.native
}

object XUIObject {
  @scala.inline
  def apply(
    Children: SafeArray[String],
    State: PropertyValues,
    Type: String,
    executeAction: (String, PropertyValues) => Unit,
    getChild: String => XUIObject,
    getChildren: () => SafeArray[String],
    getState: () => PropertyValues,
    getType: () => String
  ): XUIObject = {
    val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], executeAction = js.Any.fromFunction2(executeAction), getChild = js.Any.fromFunction1(getChild), getChildren = js.Any.fromFunction0(getChildren), getState = js.Any.fromFunction0(getState), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[XUIObject]
  }
  @scala.inline
  implicit class XUIObjectOps[Self <: XUIObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: PropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteAction(value: (String, PropertyValues) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetChild(value: String => XUIObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildren(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => PropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

