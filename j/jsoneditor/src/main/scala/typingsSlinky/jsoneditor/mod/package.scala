package typingsSlinky.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AutoCompleteCompletion = scala.Null | js.Array[java.lang.String] | typingsSlinky.jsoneditor.AnonOptions
  type AutoCompleteOptionsGetter = js.Function4[
    /* text */ java.lang.String, 
    /* path */ typingsSlinky.jsoneditor.mod.JSONPath, 
    /* input */ java.lang.String, 
    /* editor */ typingsSlinky.jsoneditor.mod.JSONEditor, 
    typingsSlinky.jsoneditor.mod.AutoCompleteCompletion | js.Promise[typingsSlinky.jsoneditor.mod.AutoCompleteCompletion]
  ]
  type JSONPath = js.Array[java.lang.String | scala.Double]
}
