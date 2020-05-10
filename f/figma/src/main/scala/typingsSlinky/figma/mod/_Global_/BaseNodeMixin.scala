package typingsSlinky.figma.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Mixins
@js.native
trait BaseNodeMixin extends js.Object {
  val id: String = js.native
  var name: String = js.native
  val parent: (BaseNode with ChildrenMixin) | Null = js.native
   // Note: setting this also sets `autoRename` to false on TextNodes
  val removed: Boolean = js.native
  def getPluginData(key: String): String = js.native
  // Namespace is a string that must be at least 3 alphanumeric characters, and should
  // be a name related to your plugin. Other plugins will be able to read this data.
  def getSharedPluginData(namespace: String, key: String): String = js.native
  def remove(): Unit = js.native
  def setPluginData(key: String, value: String): Unit = js.native
  def setRelaunchData(data: StringDictionary[/* description */ String]): Unit = js.native
  def setSharedPluginData(namespace: String, key: String, value: String): Unit = js.native
}

object BaseNodeMixin {
  @scala.inline
  def apply(
    getPluginData: String => String,
    getSharedPluginData: (String, String) => String,
    id: String,
    name: String,
    remove: () => Unit,
    removed: Boolean,
    setPluginData: (String, String) => Unit,
    setRelaunchData: StringDictionary[/* description */ String] => Unit,
    setSharedPluginData: (String, String, String) => Unit
  ): BaseNodeMixin = {
    val __obj = js.Dynamic.literal(getPluginData = js.Any.fromFunction1(getPluginData), getSharedPluginData = js.Any.fromFunction2(getSharedPluginData), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], setPluginData = js.Any.fromFunction2(setPluginData), setRelaunchData = js.Any.fromFunction1(setRelaunchData), setSharedPluginData = js.Any.fromFunction3(setSharedPluginData))
    __obj.asInstanceOf[BaseNodeMixin]
  }
  @scala.inline
  implicit class BaseNodeMixinOps[Self <: BaseNodeMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPluginData(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPluginData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSharedPluginData(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSharedPluginData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPluginData(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPluginData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetRelaunchData(value: StringDictionary[/* description */ String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRelaunchData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSharedPluginData(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSharedPluginData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withParent(value: BaseNode with ChildrenMixin): Self = {
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

