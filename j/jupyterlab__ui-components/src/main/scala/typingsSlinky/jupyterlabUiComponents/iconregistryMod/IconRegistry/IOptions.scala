package typingsSlinky.jupyterlabUiComponents.iconregistryMod.IconRegistry

import typingsSlinky.jupyterlabUiComponents.interfacesMod.Icon.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an icon registry.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * If the debug flag is set, missing icons will raise a warning
    * and be visually marked with an "X". Otherwise, missing icons
    * will fail silently.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * The initial icons for the registry.
    * The [[Icon.defaultIcons]] will be used if not given.
    */
  var initialIcons: js.UndefOr[js.Array[IModel]] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIcons(value: js.Array[IModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIcons")(js.undefined)
        ret
    }
  }
  
}

