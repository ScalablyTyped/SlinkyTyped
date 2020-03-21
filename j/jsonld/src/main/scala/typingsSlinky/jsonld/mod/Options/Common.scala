package typingsSlinky.jsonld.mod.Options

import typingsSlinky.jsonld.jsonldSpecMod.Context
import typingsSlinky.jsonld.jsonldSpecMod.RemoteDocument
import typingsSlinky.jsonld.jsonldSpecMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Common extends DocLoader {
  var base: js.UndefOr[String] = js.undefined
  var expandContext: js.UndefOr[Context] = js.undefined
}

object Common {
  @scala.inline
  def apply(
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null,
    expandContext: Context = null
  ): Common = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
}

