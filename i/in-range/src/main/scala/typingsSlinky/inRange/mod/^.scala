package typingsSlinky.inRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("in-range", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Check if a number is in a given range.
  @example
  ```
  import inRange = require('in-range');
  inRange(30, {end: 100}); // 0..100
  //=> true
  inRange(30, {start: 10, end: 100}); // 10..100
  //=> true
  inRange(30, {start: 100, end: 10}); // 10..100
  //=> true
  inRange(30, {end: 10}); // 0..10
  //=> false
  ```
  */
  def apply(number: Double, range: Range): Boolean = js.native
}
