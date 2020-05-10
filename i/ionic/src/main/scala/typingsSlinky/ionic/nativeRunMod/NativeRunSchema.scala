package typingsSlinky.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeRunSchema extends js.Object {
  var forwardedPorts: js.UndefOr[js.Array[String | Double]] = js.native
  var packagePath: String = js.native
  var platform: String = js.native
}

object NativeRunSchema {
  @scala.inline
  def apply(packagePath: String, platform: String): NativeRunSchema = {
    val __obj = js.Dynamic.literal(packagePath = packagePath.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeRunSchema]
  }
  @scala.inline
  implicit class NativeRunSchemaOps[Self <: NativeRunSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardedPorts(value: js.Array[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedPorts")(js.undefined)
        ret
    }
  }
  
}

