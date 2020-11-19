package typingsSlinky.errCode

import typingsSlinky.errCode.anon.Code
import typingsSlinky.errCode.anon.CodeNonNullable
import typingsSlinky.errCode.anon.`0`
import typingsSlinky.errCode.anon.`1`
import typingsSlinky.errCode.anon.`2`
import typingsSlinky.errCode.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("err-code", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err): Err with Props = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: js.UndefOr[scala.Nothing], props: Props): Err with Props with `3` = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: String): Err with Props with CodeNonNullable = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: String, props: Props): Err with Props with CodeNonNullable = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: js.BigInt): Err with Props with `1` = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: js.BigInt, props: Props): Err with Props with `1` = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: Boolean): Err with Props with `0` = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: Boolean, props: Props): Err with Props with `0` = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: Double): Err with Props with Code = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: Double, props: Props): Err with Props with Code = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, code: Null, props: Props): Err with Props with `2` = js.native
  def apply[Props /* <: js.Object */, Err /* <: js.Error */](error: Err, props: Props): Err with Props = js.native
  
  type Scalar = js.UndefOr[Double | String | Boolean | js.BigInt | Null]
}
