package typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes HttpsTrigger, could be used to connect web hooks to function.
  */
@js.native
trait SchemaHttpsTrigger extends js.Object {
  /**
    * Output only. The deployed url for the function.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaHttpsTrigger {
  @scala.inline
  def apply(): SchemaHttpsTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpsTrigger]
  }
  @scala.inline
  implicit class SchemaHttpsTriggerOps[Self <: SchemaHttpsTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

