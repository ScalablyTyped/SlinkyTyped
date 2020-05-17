package typingsSlinky.antd.anon

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var target: js.Function0[
    (Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ] = js.native
}

object Target {
  @scala.inline
  def apply(
    target: () => (Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ): Target = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(
      value: () => (Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

