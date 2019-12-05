package typingsSlinky.jsonld.jsonldMod.Options

import typingsSlinky.jsonld.jsonldDashSpecMod.Context
import typingsSlinky.jsonld.jsonldDashSpecMod.RemoteDocument
import typingsSlinky.jsonld.jsonldDashSpecMod.Url
import typingsSlinky.jsonld.jsonldMod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRdf extends Common {
  var format: js.UndefOr[MimeNQuad] = js.undefined
  var produceGeneralizedRdf: js.UndefOr[Boolean] = js.undefined
  var skipExpansion: js.UndefOr[Boolean] = js.undefined
}

object ToRdf {
  @scala.inline
  def apply(
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null,
    expandContext: Context = null,
    format: MimeNQuad = null,
    produceGeneralizedRdf: js.UndefOr[Boolean] = js.undefined,
    skipExpansion: js.UndefOr[Boolean] = js.undefined
  ): ToRdf = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(produceGeneralizedRdf)) __obj.updateDynamic("produceGeneralizedRdf")(produceGeneralizedRdf.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToRdf]
  }
}

