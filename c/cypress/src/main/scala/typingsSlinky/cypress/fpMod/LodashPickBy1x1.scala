package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Dictionary
import typingsSlinky.cypress.lodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPickBy1x1[T, S] extends js.Object {
  def apply(): Dictionary[S] = js.native
  def apply(`object`: Dictionary[T]): Dictionary[S] = js.native
  def apply(`object`: NumericDictionary[T]): NumericDictionary[S] = js.native
}

