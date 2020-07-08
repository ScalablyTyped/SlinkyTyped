package typingsSlinky.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigType = java.lang.String | scala.Double | js.Date | typingsSlinky.dayjs.mod.Dayjs
  type OptionType = typingsSlinky.dayjs.anon.Format | java.lang.String
  type PluginFunc[T] = js.Function3[
    /* option */ T, 
    /* c */ org.scalablytyped.runtime.Instantiable1[
      /* config */ js.UndefOr[typingsSlinky.dayjs.mod.ConfigType], 
      typingsSlinky.dayjs.mod.Dayjs
    ], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    scala.Unit
  ]
}
