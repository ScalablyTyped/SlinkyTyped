package typingsSlinky.builderUtilRuntime.publishOptionsMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.bintray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BintrayOptions
  extends AllPublishOptions
     with PublishConfiguration {
  /**
    * The Bintray package name.
    */
  @JSName("package")
  val _package: js.UndefOr[String | Null] = js.native
  /**
    * The Bintray component (Debian only).
    */
  val component: js.UndefOr[String | Null] = js.native
  /**
    * The Bintray distribution (Debian only).
    * @default stable
    */
  val distribution: js.UndefOr[String | Null] = js.native
  /**
    * The owner.
    */
  val owner: js.UndefOr[String | Null] = js.native
  /**
    * The provider. Must be `bintray`.
    */
  @JSName("provider")
  val provider_BintrayOptions: bintray = js.native
  /**
    * The Bintray repository name.
    * @default generic
    */
  val repo: js.UndefOr[String | Null] = js.native
  val token: js.UndefOr[String | Null] = js.native
  /**
    * The Bintray user account. Used in cases where the owner is an organization.
    */
  val user: js.UndefOr[String | Null] = js.native
}

object BintrayOptions {
  @scala.inline
  def apply(provider: bintray): BintrayOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BintrayOptions]
  }
  @scala.inline
  implicit class BintrayOptionsOps[Self <: BintrayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: bintray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def with_packageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(null)
        ret
    }
    @scala.inline
    def withComponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(null)
        ret
    }
    @scala.inline
    def withDistribution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(null)
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(null)
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(null)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(null)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(null)
        ret
    }
  }
  
}

