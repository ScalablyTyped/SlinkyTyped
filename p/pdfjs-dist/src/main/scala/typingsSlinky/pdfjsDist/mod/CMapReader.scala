package typingsSlinky.pdfjsDist.mod

import typingsSlinky.pdfjsDist.AnonCMapData
import typingsSlinky.pdfjsDist.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMapReader extends js.Object {
  def fetch(params: AnonName): js.Promise[AnonCMapData]
}

object CMapReader {
  @scala.inline
  def apply(fetch: AnonName => js.Promise[AnonCMapData]): CMapReader = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
  
    __obj.asInstanceOf[CMapReader]
  }
}

