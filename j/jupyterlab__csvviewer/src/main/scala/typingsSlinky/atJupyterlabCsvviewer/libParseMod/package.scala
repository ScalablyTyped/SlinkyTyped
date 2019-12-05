package typingsSlinky.atJupyterlabCsvviewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libParseMod {
  import typingsSlinky.atJupyterlabCsvviewer.libParseMod.IParser.IOptions
  import typingsSlinky.atJupyterlabCsvviewer.libParseMod.IParser.IResults

  type IParser = js.Function1[/* options */ IOptions, IResults]
}
