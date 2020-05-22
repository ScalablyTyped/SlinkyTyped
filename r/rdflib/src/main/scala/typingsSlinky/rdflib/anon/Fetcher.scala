package typingsSlinky.rdflib.anon

import typingsSlinky.rdflib.fetcherMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fetcher extends js.Object {
  var fetcher: default
}

object Fetcher {
  @scala.inline
  def apply(fetcher: default): Fetcher = {
    val __obj = js.Dynamic.literal(fetcher = fetcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fetcher]
  }
}

