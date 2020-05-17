package typingsSlinky.incrementalDom.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("incremental-dom", "patchOuter")
@js.native
object patchOuter
  extends TopLevel[
      js.Function3[
        /* node */ Element, 
        /* fn */ js.Function1[/* data */ js.Any, Unit], 
        /* data */ js.UndefOr[js.Any], 
        Node | Null
      ]
    ]

