package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target Window.
  */
@js.native
trait SchemaTargetWindow extends js.Object {
  /**
    * User-entered value.
    */
  var customHtml: js.UndefOr[String] = js.native
  /**
    * Type of browser window for which the backup image of the flash creative
    * can be displayed.
    */
  var targetWindowOption: js.UndefOr[String] = js.native
}

object SchemaTargetWindow {
  @scala.inline
  def apply(): SchemaTargetWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetWindow]
  }
  @scala.inline
  implicit class SchemaTargetWindowOps[Self <: SchemaTargetWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetWindowOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindowOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWindowOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWindowOption")(js.undefined)
        ret
    }
  }
  
}

