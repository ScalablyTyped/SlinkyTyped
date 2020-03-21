package typingsSlinky.libxslt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalTypesMod {
  type ApplyCallback = js.Function2[
    /* err */ js.Error, 
    /* result */ typingsSlinky.libxslt.internalTypesMod.ApplyResult, 
    scala.Unit
  ]
  type ApplyDocumentCallback = js.Function2[/* err */ js.Error, /* result */ typingsSlinky.libxmljs.mod.Document, scala.Unit]
  type ApplyResult = java.lang.String | typingsSlinky.libxmljs.mod.Document
  type ApplyStringCallback = js.Function2[/* err */ js.Error, /* result */ java.lang.String, scala.Unit]
  type ParseCallback = js.Function2[
    /* err */ js.Error, 
    /* stylesheet */ typingsSlinky.libxslt.mod.Stylesheet, 
    scala.Unit
  ]
}
