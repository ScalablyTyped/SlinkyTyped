package typingsSlinky.jupyterlabApputils.clientsessionMod.ClientSession

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IModel
import typingsSlinky.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for populating a kernel selector.
  */
@js.native
trait IKernelSearch extends js.Object {
  /**
    * The kernel preference.
    */
  var preference: IKernelPreference = js.native
  /**
    * The current running sessions.
    */
  var sessions: js.UndefOr[IterableOrArrayLike[IModel]] = js.native
  /**
    * The Kernel specs.
    */
  var specs: ISpecModels | Null = js.native
}

object IKernelSearch {
  @scala.inline
  def apply(preference: IKernelPreference): IKernelSearch = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelSearch]
  }
  @scala.inline
  implicit class IKernelSearchOps[Self <: IKernelSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreference(value: IKernelPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessions(value: IterableOrArrayLike[IModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecs(value: ISpecModels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(null)
        ret
    }
  }
  
}

