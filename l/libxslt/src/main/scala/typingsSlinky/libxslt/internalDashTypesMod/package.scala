package typingsSlinky.libxslt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalDashTypesMod {
  import typingsSlinky.libxmljs.libxmljsMod.Document
  import typingsSlinky.libxslt.libxsltMod.Stylesheet

  type ApplyCallback = js.Function2[/* err */ js.Error, /* result */ ApplyResult, Unit]
  type ApplyDocumentCallback = js.Function2[/* err */ js.Error, /* result */ Document, Unit]
  type ApplyResult = String | Document
  type ApplyStringCallback = js.Function2[/* err */ js.Error, /* result */ String, Unit]
  type ParseCallback = js.Function2[/* err */ js.Error, /* stylesheet */ Stylesheet, Unit]
}
