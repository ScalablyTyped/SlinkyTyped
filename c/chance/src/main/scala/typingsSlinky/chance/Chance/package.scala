package typingsSlinky.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Chance {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chance.chanceBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.chance.chanceNumbers.`0`
    - scala.Double
    - typingsSlinky.chance.chanceStrings._empty
  */
  type FalsyType = js.UndefOr[typingsSlinky.chance.Chance._FalsyType | scala.Null | scala.Double]
  
  type MixinDescriptor = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  // A more rigorous approach might be to produce
  // the correct options interfaces for each method
  type Options = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Seed = scala.Double | java.lang.String
}
