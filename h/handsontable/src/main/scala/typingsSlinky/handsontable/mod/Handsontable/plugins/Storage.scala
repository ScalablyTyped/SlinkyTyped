package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var prefix: String = js.native
  var rootWindow: Window_ = js.native
  var savedKeys: js.Array[String] = js.native
  def clearSavedKeys(): Unit = js.native
  def loadSavedKeys(): Unit = js.native
  def loadValue(key: String, defaultValue: js.Object): js.Any = js.native
  def resetAll(): Unit = js.native
  def saveSavedKeys(): Unit = js.native
  def saveValue(key: String, value: js.Any): Unit = js.native
}

object Storage {
  @scala.inline
  def apply(
    clearSavedKeys: () => Unit,
    loadSavedKeys: () => Unit,
    loadValue: (String, js.Object) => js.Any,
    prefix: String,
    resetAll: () => Unit,
    rootWindow: Window_,
    saveSavedKeys: () => Unit,
    saveValue: (String, js.Any) => Unit,
    savedKeys: js.Array[String]
  ): Storage = {
    val __obj = js.Dynamic.literal(clearSavedKeys = js.Any.fromFunction0(clearSavedKeys), loadSavedKeys = js.Any.fromFunction0(loadSavedKeys), loadValue = js.Any.fromFunction2(loadValue), prefix = prefix.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), rootWindow = rootWindow.asInstanceOf[js.Any], saveSavedKeys = js.Any.fromFunction0(saveSavedKeys), saveValue = js.Any.fromFunction2(saveValue), savedKeys = savedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearSavedKeys(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSavedKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadSavedKeys(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSavedKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadValue(value: (String, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRootWindow(value: Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveSavedKeys(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveSavedKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveValue(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSavedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

