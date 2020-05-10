package typingsSlinky.antd

import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTarget extends js.Object {
  var target: js.Function0[
    (Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ] = js.native
}

object AnonTarget {
  @scala.inline
  def apply(
    target: () => (Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ): AnonTarget = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[AnonTarget]
  }
  @scala.inline
  implicit class AnonTargetOps[Self <: AnonTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(
      value: () => (Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

