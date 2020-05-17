package typingsSlinky.pdfjsDist.mod

import typingsSlinky.pdfjsDist.anon.CMapData
import typingsSlinky.pdfjsDist.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMapReader extends js.Object {
  def fetch(params: Name): js.Promise[CMapData] = js.native
}

object CMapReader {
  @scala.inline
  def apply(fetch: Name => js.Promise[CMapData]): CMapReader = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[CMapReader]
  }
  @scala.inline
  implicit class CMapReaderOps[Self <: CMapReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetch(value: Name => js.Promise[CMapData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

