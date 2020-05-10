package typingsSlinky.pdfViewerReactjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlertHandler = js.Function1[/* err */ typingsSlinky.pdfViewerReactjs.mod.Err, slinky.core.TagMod[scala.Any]]
  type BtnClickHandler = js.Function1[/* page */ scala.Double, scala.Unit]
  type DocClickHandler = js.Function0[scala.Unit]
  type RotationClickHandler = js.Function1[/* angle */ scala.Double, scala.Unit]
  type ZoomClickHandler = js.Function1[/* scale */ scala.Double, scala.Unit]
}
