package typingsSlinky.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageDist extends js.Object {
  /**
    * Number of files in the tarball.
    */
  var fileCount: js.UndefOr[Double] = js.native
  /**
    * The integrity SRI string for the artifact. This may not be present for
    * older packages on the npm registry. (Copied by Pacote to
    * `manifest._integrity`.)
    */
  var integrity: js.UndefOr[String] = js.native
  /**
    * A signature of the package by the
    * [`npmregistry`](https://keybase.io/npmregistry) Keybase account.
    * (Obviously only present for packages published to
    * https://registry.npmjs.org.)
    */
  var `npm-signature`: js.UndefOr[String] = js.native
  /**
    * Legacy integrity value. Hexadecimal-encoded sha1 hash. (Converted to an
    * SRI string and copied by Pacote to `manifest._integrity` when
    * `dist.integrity` is not present.)
    */
  var shasum: js.UndefOr[String] = js.native
  /**
    * The url to the associated package artifact. (Copied by Pacote to
    * `manifest._resolved`.)
    */
  var tarball: String = js.native
  /**
    * Size on disk of the package when unpacked.
    */
  var unpackedSize: js.UndefOr[Double] = js.native
}

object PackageDist {
  @scala.inline
  def apply(tarball: String): PackageDist = {
    val __obj = js.Dynamic.literal(tarball = tarball.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageDist]
  }
  @scala.inline
  implicit class PackageDistOps[Self <: PackageDist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarball(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tarball")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
    @scala.inline
    def `withNpm-signature`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npm-signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNpm-signature`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npm-signature")(js.undefined)
        ret
    }
    @scala.inline
    def withShasum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shasum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShasum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shasum")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpackedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpackedSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackedSize")(js.undefined)
        ret
    }
  }
  
}

