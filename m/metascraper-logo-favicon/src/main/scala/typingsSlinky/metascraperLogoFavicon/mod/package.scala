package typingsSlinky.metascraperLogoFavicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PickDefaultFunction = js.Function1[
    /* sizes */ js.Array[typingsSlinky.metascraperLogoFavicon.mod.FaviconSize], 
    typingsSlinky.metascraperLogoFavicon.mod.FaviconSize
  ]
  
  type PickFunction = js.Function2[
    /* sizes */ js.Array[typingsSlinky.metascraperLogoFavicon.mod.FaviconSize], 
    /* pickDefault */ typingsSlinky.metascraperLogoFavicon.mod.PickDefaultFunction, 
    typingsSlinky.metascraperLogoFavicon.mod.FaviconSize
  ]
}
