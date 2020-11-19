package typingsSlinky.pulumiKubernetes.kustomizeKustomizeMod

import typingsSlinky.pulumiKubernetes.yamlMod.CollectionComponentResource
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/kustomize/kustomize", "Directory")
@js.native
class Directory protected () extends CollectionComponentResource {
  /**
    * Create an instance of the specified kustomize directory.
    *
    * @param name Name of the kustomization (e.g., nginx-ingress).
    * @param config Configuration options for the kustomization.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, config: DirectoryOpts) = this()
  def this(name: String, config: DirectoryOpts, opts: ComponentResourceOptions) = this()
}
