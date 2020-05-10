package typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Source Repositories configuration of a project.
  */
@js.native
trait SchemaProjectConfig extends js.Object {
  /**
    * Reject a Git push that contains a private key.
    */
  var enablePrivateKeyCheck: js.UndefOr[Boolean] = js.native
  /**
    * The name of the project. Values are of the form
    * `projects/&lt;project&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * How this project publishes a change in the repositories through Cloud
    * Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[SchemaPubsubConfig]] = js.native
}

object SchemaProjectConfig {
  @scala.inline
  def apply(): SchemaProjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectConfig]
  }
  @scala.inline
  implicit class SchemaProjectConfigOps[Self <: SchemaProjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnablePrivateKeyCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateKeyCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePrivateKeyCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateKeyCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withPubsubConfigs(value: StringDictionary[SchemaPubsubConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubsubConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubConfigs")(js.undefined)
        ret
    }
  }
  
}

