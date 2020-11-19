package typingsSlinky.mnemonist.suffixArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/suffix-array", "GeneralizedSuffixArray")
@js.native
class GeneralizedSuffixArray protected () extends js.Object {
  // Constructor
  def this(strings: js.Array[js.Array[String] | String]) = this()
  
  // Members
  var array: js.Array[Double] = js.native
  
  def inspect(): js.Any = js.native
  
  var length: Double = js.native
  
  // Methods
  def longestCommonSubsequence(): String | js.Array[String] = js.native
  
  var size: Double = js.native
  
  var text: String | js.Array[String] = js.native
  
  def toJSON(): js.Array[Double] = js.native
}
