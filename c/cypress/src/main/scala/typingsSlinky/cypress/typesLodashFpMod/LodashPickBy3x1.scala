package typingsSlinky.cypress.typesLodashFpMod

import typingsSlinky.cypress.typesLodashMod.Dictionary
import typingsSlinky.cypress.typesLodashMod.NumericDictionary
import typingsSlinky.cypress.typesLodashMod.PartialObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy3x1[T] extends js.Object {
  def apply(): NumericDictionary[T] = js.native
  def apply(`object`: Dictionary[T]): Dictionary[T] = js.native
  def apply(`object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def apply[T1 /* <: js.Object */](`object`: T1): PartialObject[T1] = js.native
}

