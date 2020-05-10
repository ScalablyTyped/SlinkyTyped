package typingsSlinky.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUuidGenerator extends IIdGenerator {
  /** [Method] Reconfigures this generator given new config properties
  		* @param config Object
  		*/
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.native
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var version: js.UndefOr[Double] = js.native
}

object IUuidGenerator {
  @scala.inline
  def apply(): IUuidGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUuidGenerator]
  }
  @scala.inline
  implicit class IUuidGeneratorOps[Self <: IUuidGenerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReconfigure(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReconfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigure")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

