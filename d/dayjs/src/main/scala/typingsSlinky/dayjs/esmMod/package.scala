package typingsSlinky.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esmMod {
  
  type ConfigType = java.lang.String | scala.Double | js.Date | typingsSlinky.dayjs.esmMod.Dayjs
  
  type MonthNames = js.Tuple12[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]
  
  type OptionType = typingsSlinky.dayjs.anon.Format | java.lang.String | js.Array[java.lang.String]
  
  type PluginFunc[T] = js.Function3[
    /* option */ T, 
    /* c */ org.scalablytyped.runtime.Instantiable1[
      /* config */ js.UndefOr[typingsSlinky.dayjs.esmMod.ConfigType], 
      typingsSlinky.dayjs.esmMod.Dayjs
    ], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    scala.Unit
  ]
  
  type WeekdayNames = js.Tuple7[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]
}
