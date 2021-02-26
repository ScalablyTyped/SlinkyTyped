package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.PropertyPath
import typingsSlinky.lodash.mod.SetWithCustomizer
import typingsSlinky.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashUpdateWith extends StObject {
  
  def apply(customizer: __, path: PropertyPath): LodashUpdateWith1x2 = js.native
  def apply(customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x6 = js.native
  def apply(customizer: __, path: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x4 = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashUpdateWith1x1[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath): LodashUpdateWith1x3[T] = js.native
  def apply[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): LodashUpdateWith1x7[T] = js.native
  def apply[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    `object`: T
  ): T = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, updater: __, `object`: T): LodashUpdateWith1x11[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x5[T] = js.native
  def apply[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: __,
    updater: js.Function1[/* oldValue */ js.Any, _],
    `object`: T
  ): LodashUpdateWith1x13[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, updater: __, `object`: T): LodashUpdateWith1x9[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): LodashUpdateWith1x14[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: PropertyPath, updater: __, `object`: T): LodashUpdateWith1x10[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: __, updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): LodashUpdateWith1x12[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: __, updater: __, `object`: T): LodashUpdateWith1x8[T] = js.native
}
