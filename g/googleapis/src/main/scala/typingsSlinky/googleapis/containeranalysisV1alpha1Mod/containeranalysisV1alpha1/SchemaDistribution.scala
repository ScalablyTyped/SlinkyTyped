package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particular channel of distribution for a given package.
  * e.g. Debian&#39;s jessie-backports dpkg mirror
  */
@js.native
trait SchemaDistribution extends js.Object {
  /**
    * The CPU architecture for which packages in this distribution channel were
    * built
    */
  var architecture: js.UndefOr[String] = js.native
  /**
    * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
    * denoting the package manager version distributing a package.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * The distribution channel-specific description of this package.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The latest available version of this package in this distribution
    * channel.
    */
  var latestVersion: js.UndefOr[SchemaVersion] = js.native
  /**
    * A freeform string denoting the maintainer of this package.
    */
  var maintainer: js.UndefOr[String] = js.native
  /**
    * The distribution channel-specific homepage for this package.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaDistribution {
  @scala.inline
  def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  @scala.inline
  implicit class SchemaDistributionOps[Self <: SchemaDistribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withCpeUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpeUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpeUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpeUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestVersion(value: SchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainer")(js.undefined)
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

