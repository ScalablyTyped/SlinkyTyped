package typingsSlinky.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object valueMod {
  
  type Value = scala.Double | java.lang.String | typingsSlinky.popmotion.valueMod.ValueMap | typingsSlinky.popmotion.valueMod.ValueList
  
  type ValueList = js.Array[scala.Double | java.lang.String]
  
  type ValueMap = org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
}
