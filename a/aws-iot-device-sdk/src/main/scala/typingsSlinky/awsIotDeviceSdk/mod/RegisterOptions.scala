package typingsSlinky.awsIotDeviceSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOptions extends js.Object {
  /**
    * set to false to allow receiving messages with old version
    * numbers (default true)
    */
  var discardStale: js.UndefOr[Boolean] = js.native
  /** set to true to send version numbers with shadow updates (default true) */
  var enableVersioning: js.UndefOr[Boolean] = js.native
  /**
    * set to true to not subscribe to the delta sub-topic for this
    * Thing Shadow; used in cases where the application is not interested in
    * changes (e.g. update only.) (default false)
    */
  var ignoreDeltas: js.UndefOr[Boolean] = js.native
  /**
    * set to false to unsubscribe from all operation sub-topics while not
    * performing an operation (default true)
    */
  var persistentSubscribe: js.UndefOr[Boolean] = js.native
}

object RegisterOptions {
  @scala.inline
  def apply(): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOptions]
  }
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscardStale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardStale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscardStale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardStale")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVersioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVersioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVersioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVersioning")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDeltas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDeltas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeltas")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentSubscribe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentSubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentSubscribe")(js.undefined)
        ret
    }
  }
  
}

