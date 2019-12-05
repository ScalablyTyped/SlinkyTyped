package typingsSlinky.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dayjsMod {
  import org.scalablytyped.runtime.Instantiable1
  import typingsSlinky.dayjs.Anon_Format

  type ConfigType = String | Double | js.Date | Dayjs
  type OptionType = Anon_Format | String
  type PluginFunc = js.Function3[
    /* option */ js.Any, 
    /* c */ Instantiable1[js.UndefOr[/* config */ ConfigType], Dayjs], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    Unit
  ]
}
