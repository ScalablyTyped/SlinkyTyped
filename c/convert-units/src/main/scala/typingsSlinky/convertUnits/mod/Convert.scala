package typingsSlinky.convertUnits.mod

import typingsSlinky.convertUnits.anon.Abbr
import typingsSlinky.convertUnits.anon.CutOffNumber
import typingsSlinky.convertUnits.anon.Measure
import typingsSlinky.convertUnits.anon.Plural
import typingsSlinky.convertUnits.anon.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convert extends StObject {
  
  def describe[T /* <: unit */](abbr: T): Measure[T] = js.native
  
  def from(from: unit): this.type = js.native
  
  def getUnit[T /* <: unit */](abbr: T): Abbr[T] = js.native
  
  def list(): js.Array[System] = js.native
  def list(measure: measure): js.Array[System] = js.native
  
  def measures(): js.Array[measure] = js.native
  
  def possibilities(): js.Array[unit] = js.native
  def possibilities(measure: measure): js.Array[unit] = js.native
  
  /* private */ def throwUnsupportedUnitError(what: String): Unit = js.native
  
  def to(to: unit): Double = js.native
  
  def toBest(): Plural = js.native
  def toBest(options: CutOffNumber): Plural = js.native
}
