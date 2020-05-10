package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The app type the restriction applies to for mobile device.
  */
@js.native
trait SchemaAppContext extends js.Object {
  /**
    * The app types this restriction applies to.
    */
  var appTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAppContext {
  @scala.inline
  def apply(): SchemaAppContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppContext]
  }
  @scala.inline
  implicit class SchemaAppContextOps[Self <: SchemaAppContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appTypes")(js.undefined)
        ret
    }
  }
  
}

