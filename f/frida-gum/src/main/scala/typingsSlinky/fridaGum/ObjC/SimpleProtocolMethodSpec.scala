package typingsSlinky.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleProtocolMethodSpec extends ProtocolMethodSpec {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.native
  /**
    * Return type.
    */
  var retType: String = js.native
}

object SimpleProtocolMethodSpec {
  @scala.inline
  def apply(argTypes: js.Array[String], retType: String): SimpleProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleProtocolMethodSpec]
  }
  @scala.inline
  implicit class SimpleProtocolMethodSpecOps[Self <: SimpleProtocolMethodSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
  }
  
}

