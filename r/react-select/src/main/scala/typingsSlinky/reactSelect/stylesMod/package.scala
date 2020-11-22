package typingsSlinky.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stylesMod {
  
  type GetStyles = js.Function2[
    /* a */ java.lang.String, 
    /* b */ typingsSlinky.reactSelect.stylesMod.Props, 
    typingsSlinky.react.mod.CSSProperties
  ]
  
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type StylesConfigFunction[Props] = js.Function2[
    /* base */ typingsSlinky.react.mod.CSSProperties, 
    /* props */ Props, 
    typingsSlinky.react.mod.CSSProperties
  ]
}
