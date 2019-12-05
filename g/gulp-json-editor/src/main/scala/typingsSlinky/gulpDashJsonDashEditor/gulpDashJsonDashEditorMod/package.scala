package typingsSlinky.gulpDashJsonDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashJsonDashEditorMod {
  import typingsSlinky.jsDashBeautify.JsBeautifyOptions
  import typingsSlinky.node.NodeJS.ReadWriteStream

  type JEditor = js.Function2[
    /* mergeWith */ js.Any | (js.Function1[/* json */ js.Any, js.Any]), 
    /* jsBeautifyOptions */ js.UndefOr[JsBeautifyOptions], 
    ReadWriteStream
  ]
}
