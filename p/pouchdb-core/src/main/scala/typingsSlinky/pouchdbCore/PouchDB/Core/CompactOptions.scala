package typingsSlinky.pouchdbCore.PouchDB.Core

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactOptions extends Options {
  var interval: js.UndefOr[Double] = js.undefined
}

object CompactOptions {
  @scala.inline
  def apply(
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[org.scalajs.dom.experimental.Response] = null,
    interval: Int | Double = null
  ): CompactOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactOptions]
  }
}

