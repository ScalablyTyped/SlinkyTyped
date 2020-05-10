package typingsSlinky.pulumiAws.lbGetTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.lb.GetTargetGroupHealthCheck
import typingsSlinky.pulumiAws.outputMod.lb.GetTargetGroupStickiness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTargetGroupResult extends js.Object {
  val arn: String = js.native
  val arnSuffix: String = js.native
  val deregistrationDelay: Double = js.native
  val healthCheck: GetTargetGroupHealthCheck = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val lambdaMultiValueHeadersEnabled: Boolean = js.native
  val name: String = js.native
  val port: Double = js.native
  val protocol: String = js.native
  val proxyProtocolV2: Boolean = js.native
  val slowStart: Double = js.native
  val stickiness: GetTargetGroupStickiness = js.native
  val tags: StringDictionary[js.Any] = js.native
  val targetType: String = js.native
  val vpcId: String = js.native
}

object GetTargetGroupResult {
  @scala.inline
  def apply(
    arn: String,
    arnSuffix: String,
    deregistrationDelay: Double,
    healthCheck: GetTargetGroupHealthCheck,
    id: String,
    lambdaMultiValueHeadersEnabled: Boolean,
    name: String,
    port: Double,
    protocol: String,
    proxyProtocolV2: Boolean,
    slowStart: Double,
    stickiness: GetTargetGroupStickiness,
    tags: StringDictionary[js.Any],
    targetType: String,
    vpcId: String
  ): GetTargetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], deregistrationDelay = deregistrationDelay.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], proxyProtocolV2 = proxyProtocolV2.asInstanceOf[js.Any], slowStart = slowStart.asInstanceOf[js.Any], stickiness = stickiness.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupResult]
  }
  @scala.inline
  implicit class GetTargetGroupResultOps[Self <: GetTargetGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArnSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arnSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeregistrationDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deregistrationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheck(value: GetTargetGroupHealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambdaMultiValueHeadersEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaMultiValueHeadersEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyProtocolV2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyProtocolV2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlowStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStickiness(value: GetTargetGroupStickiness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

