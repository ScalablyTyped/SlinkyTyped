package typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A kernel preference.
  */
@js.native
trait IKernelPreference extends js.Object {
  /**
    * Whether to auto-start the default kernel if no matching kernel is found.
    */
  val autoStartDefault: js.UndefOr[Boolean] = js.native
  /**
    * Whether a kernel can be started.
    */
  val canStart: js.UndefOr[Boolean] = js.native
  /**
    * The id of an existing kernel.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The preferred kernel language.
    */
  val language: js.UndefOr[String] = js.native
  /**
    * The name of the kernel.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Whether to prefer starting a kernel.
    */
  val shouldStart: js.UndefOr[Boolean] = js.native
  /**
    * Whether a kernel needs to be close with the associated session
    */
  val shutdownOnClose: js.UndefOr[Boolean] = js.native
}

object IKernelPreference {
  @scala.inline
  def apply(): IKernelPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKernelPreference]
  }
  @scala.inline
  implicit class IKernelPreferenceOps[Self <: IKernelPreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoStartDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStartDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStartDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStartDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withCanStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStart")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
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
    def withShouldStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStart")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdownOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdownOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownOnClose")(js.undefined)
        ret
    }
  }
  
}

