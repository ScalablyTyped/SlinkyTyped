package typingsSlinky.awsSdkTypes.clientMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationPropertyDefinition[InputType, ResolvedType /* <: InputType */, ServiceConfiguration /* <: StringDictionary[js.Any] */, ResolvedConfiguration /* <: ServiceConfiguration */] extends js.Object {
  /**
    * A function that finalizes the value supplied and/or alters the client
    * configuration or middleware stack in reaction to it.
    */
  @JSName("apply")
  var apply: js.UndefOr[ConfigApplicator[ResolvedConfiguration]] = js.native
  /**
    * A function that returns a default value for this property. It will be
    * called if no value is supplied.
    */
  var defaultProvider: js.UndefOr[js.Function1[/* config */ ResolvedConfiguration, ResolvedType]] = js.native
  /**
    * A static value to use as the default should none be supplied.
    */
  var defaultValue: js.UndefOr[ResolvedType] = js.native
  /**
    * A function that normalizes input to the subtype expected by the SDK.
    */
  var normalize: js.UndefOr[
    js.Function2[/* value */ InputType, /* config */ Partial[ResolvedConfiguration], ResolvedType]
  ] = js.native
  /**
    * Whether this property must be supplied by the user of a client. If value
    * must be resolved but a default is available, this property should be
    * `false` or undefined.
    */
  var required: js.UndefOr[Boolean] = js.native
}

object ConfigurationPropertyDefinition {
  @scala.inline
  def apply[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration](): ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]]
  }
  @scala.inline
  implicit class ConfigurationPropertyDefinitionOps[Self[inputtype, resolvedtype, serviceconfiguration, resolvedconfiguration] <: ConfigurationPropertyDefinition[inputtype, resolvedtype, serviceconfiguration, resolvedconfiguration], InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] (val x: Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]) with Other]
    @scala.inline
    def withApply(
      value: (ResolvedConfiguration, /* clientMiddlewareStack */ MiddlewareStack[js.Any, js.Any, js.Any]) => Unit
    ): Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutApply: Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultProvider(value: /* config */ ResolvedConfiguration => ResolvedType): Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDefaultProvider: Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: ResolvedType): Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: (/* value */ InputType, /* config */ Partial[ResolvedConfiguration]) => ResolvedType): Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

