package typingsSlinky.atNivoChord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoChordMod {
  import slinky.web.SyntheticMouseEvent
  import typingsSlinky.atNivoChord.OmitArcDataformattedValuelabel
  import typingsSlinky.atNivoChord.OmitArcDatalabel

  type ChordArcMouseHandler = js.Function2[/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any], Unit]
  type ChordRibbonMouseHandler = js.Function2[/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any], Unit]
  type LabelAccessor = js.Function1[/* datum */ OmitArcDatalabel, String]
  type ValueFormatter = js.Function1[/* datum */ OmitArcDataformattedValuelabel, String | Double]
}
