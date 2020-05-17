package typingsSlinky.intlFormatCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MemoizeFormatConstructorFn = js.Function2[
    /* constructor */ typingsSlinky.intlFormatCache.anon.Instantiable, 
    /* cache */ js.UndefOr[
      typingsSlinky.std.Record[java.lang.String, typingsSlinky.intlFormatCache.mod.CacheValue]
    ], 
    js.Function1[
      /* args */ typingsSlinky.std.ConstructorParameters[typingsSlinky.intlFormatCache.anon.Instantiable], 
      js.Any
    ]
  ]
}
