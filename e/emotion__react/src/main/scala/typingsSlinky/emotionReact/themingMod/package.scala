package typingsSlinky.emotionReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object themingMod {
  
  type ThemeProvider = js.Function1[
    /* props */ typingsSlinky.emotionReact.themingMod.ThemeProviderProps, 
    slinky.core.facade.ReactElement
  ]
  
  type WithTheme_[P, T] = (P with typingsSlinky.emotionReact.anon.ThemeT[T]) | (P with typingsSlinky.emotionReact.anon.ThemeExclude)
  
  type withTheme = js.Function1[
    /* component */ js.Any, 
    slinky.core.ReactComponentClass[
      (typingsSlinky.emotionReact.helperMod.DistributiveOmit[
        typingsSlinky.emotionReact.helperMod.PropsOf[_], 
        typingsSlinky.emotionReact.emotionReactStrings.theme
      ]) with typingsSlinky.emotionReact.anon.Theme
    ]
  ]
}
