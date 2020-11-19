package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.PartialDeep
import typingsSlinky.lodash.mod.PropertyPath
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPick extends LodashConvertible {
  
  def apply(props: PropertyPath): LodashPick2x1 = js.native
  def apply[T](props: PropertyPath, `object`: T): PartialDeep[T] = js.native
  def apply[T](props: __): LodashPick2x2[T] = js.native
  def apply[T](props: __, `object`: T): LodashPick2x2[T] = js.native
}
