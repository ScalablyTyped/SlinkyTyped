package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapFormLayoutItem extends js.Object {
  val formLayout: BootstrapFormLayout | Null = js.native
  val instance: js.Any = js.native
  val name: String = js.native
  val parent: BootstrapFormLayoutItem | Null = js.native
  def getCaption(): String = js.native
  def getItemByName(name: String): BootstrapFormLayoutItem | Null = js.native
  def getVisible(): Boolean = js.native
  def setCaption(caption: String): Unit = js.native
  def setVisible(value: Boolean): Unit = js.native
}

object BootstrapFormLayoutItem {
  @scala.inline
  def apply(
    getCaption: () => String,
    getItemByName: String => BootstrapFormLayoutItem | Null,
    getVisible: () => Boolean,
    instance: js.Any,
    name: String,
    setCaption: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapFormLayoutItem = {
    val __obj = js.Dynamic.literal(getCaption = js.Any.fromFunction0(getCaption), getItemByName = js.Any.fromFunction1(getItemByName), getVisible = js.Any.fromFunction0(getVisible), instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCaption = js.Any.fromFunction1(setCaption), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapFormLayoutItem]
  }
  @scala.inline
  implicit class BootstrapFormLayoutItemOps[Self <: BootstrapFormLayoutItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCaption(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemByName(value: String => BootstrapFormLayoutItem | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCaption(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCaption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormLayout(value: BootstrapFormLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormLayoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLayout")(null)
        ret
    }
    @scala.inline
    def withParent(value: BootstrapFormLayoutItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

