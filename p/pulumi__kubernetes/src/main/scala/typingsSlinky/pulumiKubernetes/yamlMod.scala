package typingsSlinky.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiKubernetes.yamlYamlMod.ConfigFileOpts
import typingsSlinky.pulumiKubernetes.yamlYamlMod.ConfigGroupOpts
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yamlMod {
  
  @JSImport("@pulumi/kubernetes/yaml", "CollectionComponentResource")
  @js.native
  abstract class CollectionComponentResource protected ()
    extends typingsSlinky.pulumiKubernetes.yamlYamlMod.CollectionComponentResource {
    protected def this(resourceType: String, name: String, config: js.Any) = this()
    protected def this(resourceType: String, name: String, config: js.Any, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/kubernetes/yaml", "ConfigFile")
  @js.native
  class ConfigFile protected ()
    extends typingsSlinky.pulumiKubernetes.yamlYamlMod.ConfigFile {
    /**
      * Create a ConfigFile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param config The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, config: ConfigFileOpts) = this()
    def this(name: String, config: js.UndefOr[scala.Nothing], opts: ComponentResourceOptions) = this()
    def this(name: String, config: ConfigFileOpts, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/kubernetes/yaml", "ConfigGroup")
  @js.native
  class ConfigGroup protected ()
    extends typingsSlinky.pulumiKubernetes.yamlYamlMod.ConfigGroup {
    /**
      * Create a ConfigGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param config The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, config: ConfigGroupOpts) = this()
    def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/kubernetes/yaml", "parse")
  @js.native
  def parse(config: ConfigGroupOpts): Output_[StringDictionary[CustomResource]] = js.native
  @JSImport("@pulumi/kubernetes/yaml", "parse")
  @js.native
  def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
}
