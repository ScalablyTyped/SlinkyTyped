package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared request debug options for all cloudsearch RPC methods.
  */
@js.native
trait SchemaDebugOptions extends js.Object {
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  var enableDebugging: js.UndefOr[Boolean] = js.native
}

object SchemaDebugOptions {
  @scala.inline
  def apply(): SchemaDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDebugOptions]
  }
  @scala.inline
  implicit class SchemaDebugOptionsOps[Self <: SchemaDebugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableDebugging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebugging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDebugging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebugging")(js.undefined)
        ret
    }
  }
  
}

