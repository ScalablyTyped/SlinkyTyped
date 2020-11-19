package typingsSlinky.emotionCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ClassNamesArg = js.UndefOr[
    scala.Null | java.lang.String | scala.Boolean | (org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean | scala.Null]]) | typingsSlinky.emotionCore.mod.ArrayClassNamesArg
  ]
  
  type InterpolationWithTheme[Theme] = typingsSlinky.emotionSerialize.mod.Interpolation[js.UndefOr[scala.Nothing]] | (js.Function1[
    /* theme */ Theme, 
    typingsSlinky.emotionSerialize.mod.Interpolation[js.UndefOr[scala.Nothing]]
  ])
}
