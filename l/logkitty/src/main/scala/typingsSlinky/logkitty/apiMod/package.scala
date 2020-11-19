package typingsSlinky.logkitty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiMod {
  
  type FilterCreator = js.Function3[
    /* platform */ typingsSlinky.logkitty.typesMod.Platform, 
    /* minPriority */ js.UndefOr[scala.Double], 
    /* adbPath */ js.UndefOr[java.lang.String], 
    typingsSlinky.logkitty.typesMod.IFilter
  ]
}
