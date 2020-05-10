package typingsSlinky.packageJson.mod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.packageJson.packageJsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Overwrite the `agent` option that is passed down to [`got`](https://github.com/sindresorhus/got#agent). This might be useful to add [proxy support](https://github.com/sindresorhus/got#proxies).
  		*/
  val agent: js.UndefOr[Agent | typingsSlinky.node.httpsMod.Agent | Agents | `false`] = js.native
  /**
  		Return the [main entry](https://registry.npmjs.org/ava) containing all versions.
  		@default false
  		*/
  val allVersions: js.UndefOr[Boolean] = js.native
  /**
  		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
  		@default false
  		*/
  val fullMetadata: js.UndefOr[Boolean] = js.native
  /**
  		The registry URL is by default inferred from the npm defaults and `.npmrc`. This is beneficial as `package-json` and any project using it will work just like npm. This option is*only** intended for internal tools. You should*not** use this option in reusable packages. Prefer just using `.npmrc` whenever possible.
  		*/
  val registryUrl: js.UndefOr[String] = js.native
  /**
  		Package version such as `1.0.0` or a [dist tag](https://docs.npmjs.com/cli/dist-tag) such as `latest`.
  		The version can also be in any format supported by the [semver](https://github.com/npm/node-semver) module. For example:
  		- `1` - Get the latest `1.x.x`
  		- `1.2` - Get the latest `1.2.x`
  		- `^1.2.3` - Get the latest `1.x.x` but at least `1.2.3`
  		- `~1.2.3` - Get the latest `1.2.x` but at least `1.2.3`
  		@default 'latest'
  		*/
  val version: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent | typingsSlinky.node.httpsMod.Agent | Agents | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAllVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withFullMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryUrl")(js.undefined)
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

