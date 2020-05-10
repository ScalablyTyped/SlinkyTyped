package typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A repository (or repo) is a Git repository storing versioned source
  * content.
  */
@js.native
trait SchemaRepo extends js.Object {
  /**
    * How this repository mirrors a repository managed by another service.
    * Read-only field.
    */
  var mirrorConfig: js.UndefOr[SchemaMirrorConfig] = js.native
  /**
    * Resource name of the repository, of the form
    * `projects/&lt;project&gt;/repos/&lt;repo&gt;`.  The repo name may contain
    * slashes. eg, `projects/myproject/repos/name/with/slash`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * How this repository publishes a change in the repository through Cloud
    * Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[SchemaPubsubConfig]] = js.native
  /**
    * The disk usage of the repo, in bytes. Read-only field. Size is only
    * returned by GetRepo.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * URL to clone the repository from Google Cloud Source Repositories.
    * Read-only field.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaRepo {
  @scala.inline
  def apply(): SchemaRepo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepo]
  }
  @scala.inline
  implicit class SchemaRepoOps[Self <: SchemaRepo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMirrorConfig(value: SchemaMirrorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirrorConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorConfig")(js.undefined)
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
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

