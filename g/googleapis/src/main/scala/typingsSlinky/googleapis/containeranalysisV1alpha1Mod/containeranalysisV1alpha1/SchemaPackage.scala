package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particular package that is distributed over various
  * channels. e.g. glibc (aka libc6) is distributed by many, at various
  * versions.
  */
@js.native
trait SchemaPackage extends js.Object {
  /**
    * The various channels by which a package is distributed.
    */
  var distribution: js.UndefOr[js.Array[SchemaDistribution]] = js.native
  /**
    * The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPackage {
  @scala.inline
  def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  @scala.inline
  implicit class SchemaPackageOps[Self <: SchemaPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistribution(value: js.Array[SchemaDistribution]): Self = {
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
  }
  
}

