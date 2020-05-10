package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutClusterCapacityProvidersRequest extends js.Object {
  /**
    * The name of one or more capacity providers to associate with the cluster. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a AWS Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used.
    */
  var capacityProviders: StringList = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings for. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: String = js.native
  /**
    * The capacity provider strategy to use by default for the cluster. When creating a service or running a task on a cluster, if no capacity provider or launch type is specified then the default capacity provider strategy for the cluster is used. A capacity provider strategy consists of one or more capacity providers along with the base and weight to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an ACTIVE or UPDATING status can be used. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a AWS Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used.
    */
  var defaultCapacityProviderStrategy: CapacityProviderStrategy = js.native
}

object PutClusterCapacityProvidersRequest {
  @scala.inline
  def apply(
    capacityProviders: StringList,
    cluster: String,
    defaultCapacityProviderStrategy: CapacityProviderStrategy
  ): PutClusterCapacityProvidersRequest = {
    val __obj = js.Dynamic.literal(capacityProviders = capacityProviders.asInstanceOf[js.Any], cluster = cluster.asInstanceOf[js.Any], defaultCapacityProviderStrategy = defaultCapacityProviderStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClusterCapacityProvidersRequest]
  }
  @scala.inline
  implicit class PutClusterCapacityProvidersRequestOps[Self <: PutClusterCapacityProvidersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityProviders(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCapacityProviderStrategy(value: CapacityProviderStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCapacityProviderStrategy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

