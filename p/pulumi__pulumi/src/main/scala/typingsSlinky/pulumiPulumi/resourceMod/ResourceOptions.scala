package typingsSlinky.pulumiPulumi.resourceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceOptions extends js.Object {
  /**
    * An optional list of aliases to treat this resource as matching.
    */
  var aliases: js.UndefOr[js.Array[Input[URN | Alias]]] = js.native
  /**
    * An optional customTimeouts configuration block.
    */
  var customTimeouts: js.UndefOr[CustomTimeouts] = js.native
  /**
    * An optional additional explicit dependencies on other resources.
    */
  var dependsOn: js.UndefOr[Input[js.Array[Input[Resource]] | Resource]] = js.native
  /**
    * An optional existing ID to load, rather than create.
    */
  var id: js.UndefOr[Input[ID]] = js.native
  /**
    * Ignore changes to any of the specified properties.
    */
  var ignoreChanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional parent resource to which this resource belongs.
    */
  var parent: js.UndefOr[Resource] = js.native
  /**
    * When set to true, protect ensures this resource cannot be deleted.
    */
  var protect: js.UndefOr[Boolean] = js.native
  /**
    * An optional provider to use for this resource's CRUD operations. If no provider is supplied,
    * the default provider for the resource's package will be used. The default provider is pulled
    * from the parent's provider bag (see also ComponentResourceOptions.providers).
    *
    * If this is a [ComponentResourceOptions] do not provide both [provider] and [providers]
    */
  var provider: js.UndefOr[ProviderResource] = js.native
  /**
    * Optional list of transformations to apply to this resource during construction. The
    * transformations are applied in order, and are applied prior to transformation applied to
    * parents walking from the resource up to the stack.
    */
  var transformations: js.UndefOr[js.Array[ResourceTransformation]] = js.native
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when operating on
    * this resource. This version overrides the version information inferred from the current package and should
    * rarely be used.
    */
  var version: js.UndefOr[String] = js.native
}

object ResourceOptions {
  @scala.inline
  def apply(): ResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceOptions]
  }
  @scala.inline
  implicit class ResourceOptionsOps[Self <: ResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[Input[URN | Alias]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomTimeouts(value: CustomTimeouts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTimeouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTimeouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTimeouts")(js.undefined)
        ret
    }
    @scala.inline
    def withDependsOn(value: Input[js.Array[Input[Resource]] | Resource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependsOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Input[ID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreChanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withProtect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protect")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: ProviderResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformations(value: js.Array[ResourceTransformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

