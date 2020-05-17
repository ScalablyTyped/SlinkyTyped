package typingsSlinky.reactAsync.mod

import typingsSlinky.reactAsync.anon.Dictmeta
import typingsSlinky.reactAsync.reactAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type  :'start', payload (): std.Promise<void>} */
@js.native
trait Start
  extends AsyncAction[js.Any] {
  var meta: Dictmeta = js.native
  var `type`: String with start = js.native
  def payload(): js.Promise[Unit] = js.native
}

object Start {
  @scala.inline
  def apply(meta: Dictmeta, payload: () => js.Promise[Unit], `type`: String with start): Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  @scala.inline
  implicit class StartOps[Self <: Start] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeta(value: Dictmeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: String with start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

