package typingsSlinky.basicscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimatedType = scala.Double | java.lang.String | scala.Null
  
  type CallbackFunction = js.Function3[
    /* instance */ typingsSlinky.basicscroll.mod.BasicScroll, 
    /* percentage */ scala.Double, 
    /* props */ typingsSlinky.basicscroll.mod.Props, 
    scala.Unit
  ]
  
  type Props = org.scalablytyped.runtime.StringDictionary[typingsSlinky.basicscroll.anon.From]
  
  type TimingFunction = js.Function1[/* t */ scala.Double, scala.Double]
}
