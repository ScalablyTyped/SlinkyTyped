package typingsSlinky.datatablesNetColreorder

import typingsSlinky.datatablesNetColreorder.DataTables.Api
import typingsSlinky.datatablesNetColreorder.datatablesNetColreorderStrings.fromCurrent
import typingsSlinky.datatablesNetColreorder.datatablesNetColreorderStrings.fromOriginal
import typingsSlinky.datatablesNetColreorder.datatablesNetColreorderStrings.toCurrent
import typingsSlinky.datatablesNetColreorder.datatablesNetColreorderStrings.toOriginal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Move extends StObject {
    
    /*
      * Programmatically reorder columns
      */
    def move(from: Double, to: Double, drop: Boolean, invalidate: Boolean): Api = js.native
    
    /*
      * Get / set column order
      */
    def order(): Api = js.native
    def order(newOrder: js.UndefOr[scala.Nothing], originalIndexes: Boolean): Api = js.native
    def order(newOrder: js.Array[Double]): Api = js.native
    def order(newOrder: js.Array[Double], originalIndexes: Boolean): Api = js.native
    
    /*
      * Restore the loaded column order
      */
    def reset(): Api = js.native
    
    /*
      * Convert one or more column indexes to and from current and original indexes
      */
    def transpose(): Api = js.native
    def transpose(idx: js.Array[Double]): Api = js.native
    def transpose(idx: Double): Api = js.native
    @JSName("transpose")
    def transpose_fromCurrent(idx: js.UndefOr[scala.Nothing], direction: fromCurrent): Api = js.native
    @JSName("transpose")
    def transpose_fromCurrent(idx: js.Array[Double], direction: fromCurrent): Api = js.native
    @JSName("transpose")
    def transpose_fromCurrent(idx: Double, direction: fromCurrent): Api = js.native
    @JSName("transpose")
    def transpose_fromOriginal(idx: js.UndefOr[scala.Nothing], direction: fromOriginal): Api = js.native
    @JSName("transpose")
    def transpose_fromOriginal(idx: js.Array[Double], direction: fromOriginal): Api = js.native
    @JSName("transpose")
    def transpose_fromOriginal(idx: Double, direction: fromOriginal): Api = js.native
    @JSName("transpose")
    def transpose_toCurrent(idx: js.UndefOr[scala.Nothing], direction: toCurrent): Api = js.native
    @JSName("transpose")
    def transpose_toCurrent(idx: js.Array[Double], direction: toCurrent): Api = js.native
    @JSName("transpose")
    def transpose_toCurrent(idx: Double, direction: toCurrent): Api = js.native
    @JSName("transpose")
    def transpose_toOriginal(idx: js.UndefOr[scala.Nothing], direction: toOriginal): Api = js.native
    @JSName("transpose")
    def transpose_toOriginal(idx: js.Array[Double], direction: toOriginal): Api = js.native
    @JSName("transpose")
    def transpose_toOriginal(idx: Double, direction: toOriginal): Api = js.native
  }
}
