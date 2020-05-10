package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An onclick action (e.g. open a link).
  */
@js.native
trait SchemaOnClick extends js.Object {
  /**
    * A form action will be trigger by this onclick if specified.
    */
  var action: js.UndefOr[SchemaFormAction] = js.native
  /**
    * This onclick triggers an open link action if specified.
    */
  var openLink: js.UndefOr[SchemaOpenLink] = js.native
}

object SchemaOnClick {
  @scala.inline
  def apply(): SchemaOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnClick]
  }
  @scala.inline
  implicit class SchemaOnClickOps[Self <: SchemaOnClick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: SchemaFormAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenLink(value: SchemaOpenLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLink")(js.undefined)
        ret
    }
  }
  
}

