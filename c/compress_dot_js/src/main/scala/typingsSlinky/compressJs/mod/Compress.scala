package typingsSlinky.compressJs.mod

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compress extends js.Object {
  def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
  def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
}

object Compress {
  @scala.inline
  def apply(
    attach: (String, CompressOptions) => js.Promise[js.Array[CompressResult]],
    compress: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]
  ): Compress = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction2(attach), compress = js.Any.fromFunction2(compress))
    __obj.asInstanceOf[Compress]
  }
  @scala.inline
  implicit class CompressOps[Self <: Compress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttach(value: (String, CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCompress(value: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

