package typingsSlinky.jsts.jsts.io

import typingsSlinky.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OL3Parser extends js.Object {
  def read(geometry: js.Any): Geometry = js.native
  def write(geometry: Geometry): js.Any = js.native
}

object OL3Parser {
  @scala.inline
  def apply(read: js.Any => Geometry, write: Geometry => js.Any): OL3Parser = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[OL3Parser]
  }
  @scala.inline
  implicit class OL3ParserOps[Self <: OL3Parser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: js.Any => Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: Geometry => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

