package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMemento extends IBase {
  /** [Method] Captures the specified properties from the target object in this memento
  		* @param props String/String[] The property or array of properties to capture.
  		* @param target Object The object from which to capture properties.
  		*/
  var capture: js.UndefOr[
    js.Function2[/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Removes the specified properties from this memento
  		* @param props String/String[] The property or array of properties to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Restores the specified properties from this memento to the target object
  		* @param props String/String[] The property or array of properties to restore.
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restore: js.UndefOr[
    js.Function3[
      /* props */ js.UndefOr[js.Any], 
      /* clear */ js.UndefOr[Boolean], 
      /* target */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Restores all captured properties in this memento to the target object
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restoreAll: js.UndefOr[
    js.Function2[/* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Property] (Object) */
  var target: js.UndefOr[js.Any] = js.native
}

object IMemento {
  @scala.inline
  def apply(): IMemento = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemento]
  }
  @scala.inline
  implicit class IMementoOps[Self <: IMemento] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture(value: (/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* props */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRestore(
      value: (/* props */ js.UndefOr[js.Any], /* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreAll(value: (/* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRestoreAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreAll")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

