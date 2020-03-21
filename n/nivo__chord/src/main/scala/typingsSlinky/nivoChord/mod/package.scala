package typingsSlinky.nivoChord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChordArcMouseHandler = js.Function2[
    /* arc */ typingsSlinky.nivoChord.mod.ArcData, 
    /* event */ slinky.web.SyntheticMouseEvent[js.Any], 
    scala.Unit
  ]
  type ChordRibbonMouseHandler = js.Function2[
    /* ribbon */ typingsSlinky.nivoChord.mod.RibbonData, 
    /* event */ slinky.web.SyntheticMouseEvent[js.Any], 
    scala.Unit
  ]
  type LabelAccessor = js.Function1[/* datum */ typingsSlinky.nivoChord.OmitArcDatalabel, java.lang.String]
  type ValueFormatter = js.Function1[
    /* datum */ typingsSlinky.nivoChord.OmitArcDataformattedValue, 
    java.lang.String | scala.Double
  ]
}
