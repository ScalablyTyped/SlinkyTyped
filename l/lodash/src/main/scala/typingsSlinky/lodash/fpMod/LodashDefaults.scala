package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.__
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDefaults extends LodashConvertible {
  def apply[TSource](source: TSource): LodashDefaults1x1[TSource] = js.native
  def apply[TObject](source: __, `object`: TObject): LodashDefaults1x2[TObject] = js.native
  def apply[TObject, TSource](source: TSource, `object`: TObject): NonNullable[TSource with TObject] = js.native
}

