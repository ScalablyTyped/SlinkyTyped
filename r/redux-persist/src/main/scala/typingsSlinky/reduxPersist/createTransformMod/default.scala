package typingsSlinky.reduxPersist.createTransformMod

import typingsSlinky.reduxPersist.typesMod.Transform
import typingsSlinky.reduxPersist.typesMod.TransformInbound
import typingsSlinky.reduxPersist.typesMod.TransformOutbound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist/es/createTransform", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](
    inbound: js.UndefOr[scala.Nothing],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: Null, outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: js.UndefOr[scala.Nothing],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def apply[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
}
