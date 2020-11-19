package typingsSlinky.reactCssThemr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TMapThemrProps[P] = js.Function2[
    /* ownProps */ P, 
    /* theme */ typingsSlinky.reactCssThemr.mod.TReactCSSThemrTheme, 
    P with typingsSlinky.reactCssThemr.anon.Theme
  ]
  
  type ThemedComponent[P, S] = slinky.core.ReactComponentClass[P]
}
