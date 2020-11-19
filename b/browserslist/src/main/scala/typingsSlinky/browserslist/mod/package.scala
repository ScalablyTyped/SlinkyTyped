package typingsSlinky.browserslist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** statistics from `Browserslist` files */
  type MyStats = typingsSlinky.browserslist.browserslistStrings.`my stats`
  
  type Stats = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]]
  
  /**
    * Which statistics should be used.
    * Country code or custom statistics.
    * Pass `"my stats"` to load statistics
    * from `Browserslist` files
    */
  type StatsOptions = java.lang.String | typingsSlinky.browserslist.mod.MyStats | typingsSlinky.browserslist.mod.Stats
}
