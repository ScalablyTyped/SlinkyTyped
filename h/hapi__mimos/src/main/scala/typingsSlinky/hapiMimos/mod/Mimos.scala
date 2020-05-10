package typingsSlinky.hapiMimos.mod

import typingsSlinky.mimeDb.mod.MimeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mimos extends js.Object {
  /**
    * Returns mime object
    */
  def path(path: String): MimosOptionsValue = js.native
  /**
    * Returns mime object
    */
  def `type`(`type`: String): MimeEntry = js.native
}

object Mimos {
  @scala.inline
  def apply(path: String => MimosOptionsValue, `type`: String => MimeEntry): Mimos = {
    val __obj = js.Dynamic.literal(path = js.Any.fromFunction1(path))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Mimos]
  }
  @scala.inline
  implicit class MimosOps[Self <: Mimos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String => MimosOptionsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: String => MimeEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

