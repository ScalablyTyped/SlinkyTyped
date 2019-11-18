package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashMod.PartialDeep
import typingsSlinky.lodash.lodashMod.PropertyPath
import typingsSlinky.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPick extends js.Object {
  def apply(props: PropertyPath): LodashPick2x1 = js.native
  def apply[T](props: PropertyPath, `object`: T): PartialDeep[T] = js.native
  def apply[T](props: __): LodashPick2x2[T] = js.native
  def apply[T /* <: js.Object */](props: __, `object`: T): LodashPick1x2[T] = js.native
}

