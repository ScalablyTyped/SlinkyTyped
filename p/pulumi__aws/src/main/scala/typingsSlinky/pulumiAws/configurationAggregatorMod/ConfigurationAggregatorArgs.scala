package typingsSlinky.pulumiAws.configurationAggregatorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.cfg.ConfigurationAggregatorAccountAggregationSource
import typingsSlinky.pulumiAws.inputMod.cfg.ConfigurationAggregatorOrganizationAggregationSource
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregatorArgs extends js.Object {
  /**
    * The account(s) to aggregate config data from as documented below.
    */
  val accountAggregationSource: js.UndefOr[Input[ConfigurationAggregatorAccountAggregationSource]] = js.native
  /**
    * The name of the configuration aggregator.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The organization to aggregate config data from as documented below.
    */
  val organizationAggregationSource: js.UndefOr[Input[ConfigurationAggregatorOrganizationAggregationSource]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ConfigurationAggregatorArgs {
  @scala.inline
  def apply(): ConfigurationAggregatorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationAggregatorArgs]
  }
  @scala.inline
  implicit class ConfigurationAggregatorArgsOps[Self <: ConfigurationAggregatorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAggregationSource(value: Input[ConfigurationAggregatorAccountAggregationSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAggregationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAggregationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAggregationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationAggregationSource(value: Input[ConfigurationAggregatorOrganizationAggregationSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationAggregationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationAggregationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationAggregationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

