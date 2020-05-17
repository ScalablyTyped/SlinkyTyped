package typingsSlinky.node.anon

import typingsSlinky.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.fs.MakeDirectoryOptions & {  recursive  :true} */
@js.native
trait MakeDirectoryOptionsrecur extends js.Object {
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777
    */
  var mode: js.UndefOr[Double | String] = js.native
  /**
    * Indicates whether parent folders should be created.
    * If a folder was created, the path to the first created folder will be returned.
    * @default false
    */
  var recursive: js.UndefOr[Boolean with `true`] = js.native
}

object MakeDirectoryOptionsrecur {
  @scala.inline
  def apply(): MakeDirectoryOptionsrecur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeDirectoryOptionsrecur]
  }
  @scala.inline
  implicit class MakeDirectoryOptionsrecurOps[Self <: MakeDirectoryOptionsrecur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
  }
  
}

