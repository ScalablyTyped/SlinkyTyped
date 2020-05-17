package typingsSlinky.inkTestingLibrary.mod

import typingsSlinky.inkTestingLibrary.anon.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderResponse extends js.Object {
  var frames: js.Array[String] = js.native
  var stdin: Write = js.native
  def lastFrame(): String = js.native
  def rerender(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any
  ): Unit = js.native
  def unmount(): Unit = js.native
}

object RenderResponse {
  @scala.inline
  def apply(
    frames: js.Array[String],
    lastFrame: () => String,
    rerender: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any => Unit,
    stdin: Write,
    unmount: () => Unit
  ): RenderResponse = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], lastFrame = js.Any.fromFunction0(lastFrame), rerender = js.Any.fromFunction1(rerender), stdin = stdin.asInstanceOf[js.Any], unmount = js.Any.fromFunction0(unmount))
    __obj.asInstanceOf[RenderResponse]
  }
  @scala.inline
  implicit class RenderResponseOps[Self <: RenderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastFrame(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRerender(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStdin(value: Write): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

