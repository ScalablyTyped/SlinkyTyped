package typingsSlinky.minimistOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BooleanArrayOption = typingsSlinky.minimistOptions.mod.BaseOption[
    typingsSlinky.minimistOptions.minimistOptionsStrings.`boolean-array`, 
    js.Array[scala.Boolean]
  ]
  type BooleanOption = typingsSlinky.minimistOptions.mod.BaseOption[typingsSlinky.minimistOptions.minimistOptionsStrings.boolean, scala.Boolean]
  type DefaultArrayOption = typingsSlinky.minimistOptions.mod.BaseOption[
    typingsSlinky.minimistOptions.minimistOptionsStrings.array, 
    js.Array[java.lang.String]
  ]
  type MinimistOption = typingsSlinky.std.NonNullable[
    js.UndefOr[scala.Boolean | (js.Function1[/* arg */ java.lang.String, scala.Boolean])]
  ]
  type NumberArrayOption = typingsSlinky.minimistOptions.mod.BaseOption[
    typingsSlinky.minimistOptions.minimistOptionsStrings.`number-array`, 
    js.Array[scala.Double]
  ]
  type NumberOption = typingsSlinky.minimistOptions.mod.BaseOption[typingsSlinky.minimistOptions.minimistOptionsStrings.number, scala.Double]
  type Options = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.minimistOptions.mod.OptionType | typingsSlinky.minimistOptions.mod.StringOption | typingsSlinky.minimistOptions.mod.BooleanOption | typingsSlinky.minimistOptions.mod.NumberOption | typingsSlinky.minimistOptions.mod.DefaultArrayOption | typingsSlinky.minimistOptions.mod.StringArrayOption | typingsSlinky.minimistOptions.mod.BooleanArrayOption | typingsSlinky.minimistOptions.mod.NumberArrayOption | typingsSlinky.minimistOptions.mod.MinimistOption
  ]
  type StringArrayOption = typingsSlinky.minimistOptions.mod.BaseOption[
    typingsSlinky.minimistOptions.minimistOptionsStrings.`string-array`, 
    js.Array[java.lang.String]
  ]
  type StringOption = typingsSlinky.minimistOptions.mod.BaseOption[typingsSlinky.minimistOptions.minimistOptionsStrings.string, java.lang.String]
}
