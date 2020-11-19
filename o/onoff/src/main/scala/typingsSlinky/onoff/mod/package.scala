package typingsSlinky.onoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BinaryValue = typingsSlinky.onoff.mod.High | typingsSlinky.onoff.mod.Low
  
  type High = typingsSlinky.onoff.onoffNumbers.`1`
  
  type Low = typingsSlinky.onoff.onoffNumbers.`0`
  
  type ValueCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* value */ typingsSlinky.onoff.mod.BinaryValue, 
    scala.Unit
  ]
}
