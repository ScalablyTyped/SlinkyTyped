package typingsSlinky.cypress.typesLodashFpMod

import typingsSlinky.cypress.typesLodashMod.Dictionary
import typingsSlinky.cypress.typesLodashMod.List
import typingsSlinky.cypress.typesLodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSample extends js.Object {
  def apply[T /* <: js.Object */](): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T /* <: js.Object */](collection: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](collection: Dictionary[T]): js.UndefOr[T] = js.native
  def apply[T](collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](collection: NumericDictionary[T]): js.UndefOr[T] = js.native
}

