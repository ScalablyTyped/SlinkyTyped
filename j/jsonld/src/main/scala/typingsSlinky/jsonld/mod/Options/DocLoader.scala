package typingsSlinky.jsonld.mod.Options

import typingsSlinky.jsonld.jsonldSpecMod.RemoteDocument
import typingsSlinky.jsonld.jsonldSpecMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocLoader extends js.Object {
  var documentLoader: js.UndefOr[
    js.Function2[
      /* url */ Url, 
      /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit], 
      js.Promise[RemoteDocument]
    ]
  ] = js.undefined
}

object DocLoader {
  @scala.inline
  def apply(
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null
  ): DocLoader = {
    val __obj = js.Dynamic.literal()
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    __obj.asInstanceOf[DocLoader]
  }
}

