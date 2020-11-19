package typingsSlinky.pulumiCloud.mod

import typingsSlinky.pulumiCloud.serviceMod.ServiceArguments
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/cloud", "Service")
@js.native
class ServiceCls protected ()
  extends typingsSlinky.pulumiCloud.serviceMod.Service {
  /**
    * Construct a new Service, which is one or more managed replicas of a group of one or more Containers.
    *
    * @param name The unique name of the service.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String, args: ServiceArguments) = this()
  def this(name: String, args: ServiceArguments, opts: ResourceOptions) = this()
}
