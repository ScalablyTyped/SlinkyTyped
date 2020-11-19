package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojkeysetMod.ExpandAllKeySet
import typingsSlinky.oracleOraclejet.ojkeysetMod.ExpandedKeySet
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojknockout-keyset", JSImport.Namespace)
@js.native
object ojknockoutKeysetMod extends js.Object {
  
  @js.native
  class ObservableExpandedKeySet[K] () extends js.Object {
    def this(initialValue: ExpandAllKeySet[K]) = this()
    def this(initialValue: ExpandedKeySet[K]) = this()
    
    def add(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
    def add(keys: Set[K]): ObservableExpandedKeySet[K] = js.native
    
    def addAll(): ObservableExpandedKeySet[K] = js.native
    
    def clear(): ObservableExpandedKeySet[K] = js.native
    
    def delete(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
    def delete(keys: Set[K]): ObservableExpandedKeySet[K] = js.native
  }
}
