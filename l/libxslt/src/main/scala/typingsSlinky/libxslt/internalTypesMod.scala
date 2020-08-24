package typingsSlinky.libxslt

import typingsSlinky.libxmljs.mod.Document
import typingsSlinky.libxslt.mod.Stylesheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxslt/internal-types", JSImport.Namespace)
@js.native
object internalTypesMod extends js.Object {
  type ApplyCallback = js.Function2[/* err */ js.Error | Null, /* result */ String | Document, Unit]
  type ApplyDocumentCallback = js.Function2[/* err */ js.Error | Null, /* result */ Document, Unit]
  type ApplyStringCallback = js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]
  type ParseCallback = js.Function2[/* err */ js.Error | Null, /* stylesheet */ Stylesheet, Unit]
}

