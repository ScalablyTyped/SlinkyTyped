package typingsSlinky.pulumiKubernetes.mod

import typingsSlinky.pulumiKubernetes.kustomizeKustomizeMod.DirectoryOpts
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes", "kustomize")
@js.native
object kustomize extends js.Object {
  
  @js.native
  class Directory protected ()
    extends typingsSlinky.pulumiKubernetes.kustomizeMod.Directory {
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
}
