package typingsSlinky.gulpCheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* $ */ typingsSlinky.cheerio.CheerioStatic, 
    /* file */ typingsSlinky.vinyl.mod.File, 
    /* done */ js.UndefOr[js.Function], 
    js.Any
  ]
}
