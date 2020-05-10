package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockable extends IBase {
  /** [Config Option] (Object) */
  var lockedGridConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var lockedViewConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var normalGridConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var normalViewConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var scrollDelta: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var subGridXType: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var syncRowHeight: js.UndefOr[Boolean] = js.native
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.native
}

object ILockable {
  @scala.inline
  def apply(): ILockable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockable]
  }
  @scala.inline
  implicit class ILockableOps[Self <: ILockable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLockedGridConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedGridConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedGridConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedGridConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLockedViewConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedViewConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedViewConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedViewConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalGridConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalGridConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalGridConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalGridConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalViewConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalViewConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalViewConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalViewConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withSubGridXType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGridXType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubGridXType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGridXType")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncRowHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncRowHeights(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeights")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSyncRowHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeights")(js.undefined)
        ret
    }
  }
  
}

