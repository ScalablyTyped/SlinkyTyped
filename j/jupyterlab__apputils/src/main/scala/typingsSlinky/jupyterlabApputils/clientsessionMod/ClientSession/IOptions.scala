package typingsSlinky.jupyterlabApputils.clientsessionMod.ClientSession

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IManager
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a context.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.native
  /**
    * A session manager instance.
    */
  var manager: IManager = js.native
  /**
    * The name of the session.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The initial path of the file.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * A function to call when the session becomes busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
  /**
    * The type of the session.
    */
  var `type`: js.UndefOr[String] = js.native
}

object IOptions {
  @scala.inline
  def apply(manager: IManager): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManager(value: IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelPreference(value: IKernelPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBusy(value: () => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetBusy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

