package typingsSlinky.pdfjsDist.mod

import typingsSlinky.pdfjsDist.AnonCMapData
import typingsSlinky.pdfjsDist.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMapReader extends js.Object {
  def fetch(params: AnonName): js.Promise[AnonCMapData] = js.native
}

object CMapReader {
  @scala.inline
  def apply(fetch: AnonName => js.Promise[AnonCMapData]): CMapReader = {
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
    def withFetch(value: AnonName => js.Promise[AnonCMapData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

