package typingsSlinky.reactBase16Styling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type StylingFunction = js.Function2[
    /* keys */ js.UndefOr[
      java.lang.String | typingsSlinky.reactBase16Styling.reactBase16StylingBooleans.`false` | (js.Array[
        js.UndefOr[
          java.lang.String | typingsSlinky.reactBase16Styling.reactBase16StylingBooleans.`false`
        ]
      ])
    ], 
    /* repeated */ js.Any, 
    typingsSlinky.reactBase16Styling.typesMod.Styling
  ]
  
  type StylingValue = java.lang.String | (typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]) | typingsSlinky.reactBase16Styling.typesMod.StylingValueFunction
  
  type StylingValueFunction = js.Function2[
    /* styling */ typingsSlinky.reactBase16Styling.typesMod.Styling, 
    /* repeated */ js.Any, 
    typingsSlinky.reactBase16Styling.anon.PartialStyling
  ]
  
  type Theme = java.lang.String | typingsSlinky.base16.mod.Base16Theme | typingsSlinky.reactBase16Styling.typesMod.StylingConfig
}
