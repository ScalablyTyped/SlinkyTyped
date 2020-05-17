package typingsSlinky.appBuilderLib.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.builderUtilRuntime.updateInfoMod.PackageFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Packages extends js.Object {
  var packages: StringDictionary[PackageFileInfo] = js.native
}

object Packages {
  @scala.inline
  def apply(packages: StringDictionary[PackageFileInfo]): Packages = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packages]
  }
  @scala.inline
  implicit class PackagesOps[Self <: Packages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackages(value: StringDictionary[PackageFileInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

