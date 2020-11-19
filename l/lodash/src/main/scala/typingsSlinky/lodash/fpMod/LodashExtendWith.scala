package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.AssignCustomizer
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashExtendWith extends LodashConvertible {
  
  def apply(customizer: AssignCustomizer): LodashExtendWith1x1 = js.native
  def apply[TObject](customizer: AssignCustomizer, `object`: TObject): LodashExtendWith1x3[TObject] = js.native
  def apply[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashExtendWith1x5[TSource] = js.native
  def apply[TObject](customizer: __, `object`: TObject): LodashExtendWith1x2[TObject] = js.native
  def apply[TSource](customizer: __, `object`: __, source: TSource): LodashExtendWith1x4[TSource] = js.native
  def apply[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def apply[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashExtendWith1x6[TObject, TSource] = js.native
}
