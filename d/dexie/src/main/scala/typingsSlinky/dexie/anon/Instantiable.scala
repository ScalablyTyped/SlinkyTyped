package typingsSlinky.dexie.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable extends Instantiable0[IDBKeyRange] {
  
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  def bound(lower: js.Any, upper: js.Any): IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.UndefOr[scala.Nothing], upperOpen: Boolean): IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: Boolean): IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: Boolean, upperOpen: Boolean): IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
    */
  def lowerBound(lower: js.Any): IDBKeyRange = js.native
  def lowerBound(lower: js.Any, open: Boolean): IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange spanning only key.
    */
  def only(value: js.Any): IDBKeyRange = js.native
  
  /**
    * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
    */
  def upperBound(upper: js.Any): IDBKeyRange = js.native
  def upperBound(upper: js.Any, open: Boolean): IDBKeyRange = js.native
}
