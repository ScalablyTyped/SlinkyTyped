package typingsSlinky.popperjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object offsetMod {
  
  type Offset = typingsSlinky.popperjsCore.offsetMod.OffsetsFunction | (js.Tuple2[js.UndefOr[scala.Double | scala.Null], js.UndefOr[scala.Double | scala.Null]])
  
  type OffsetModifier = typingsSlinky.popperjsCore.typesMod.Modifier[
    typingsSlinky.popperjsCore.popperjsCoreStrings.offset, 
    typingsSlinky.popperjsCore.offsetMod.Options
  ]
  
  type OffsetsFunction = js.Function1[
    /* arg0 */ typingsSlinky.popperjsCore.anon.Placement, 
    js.Tuple2[js.UndefOr[scala.Double | scala.Null], js.UndefOr[scala.Double | scala.Null]]
  ]
}
