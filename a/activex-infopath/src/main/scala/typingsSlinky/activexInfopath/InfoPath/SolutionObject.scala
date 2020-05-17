package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionObject extends js.Object {
  val DOM: IXMLDOMDocument = js.native
  @JSName("InfoPath.SolutionObject_typekey")
  var InfoPathDotSolutionObject_typekey: SolutionObject = js.native
  val PackageURL: String = js.native
  val URI: String = js.native
  val Version: String = js.native
}

object SolutionObject {
  @scala.inline
  def apply(
    DOM: IXMLDOMDocument,
    InfoPathDotSolutionObject_typekey: SolutionObject,
    PackageURL: String,
    URI: String,
    Version: String
  ): SolutionObject = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], PackageURL = PackageURL.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SolutionObject_typekey")(InfoPathDotSolutionObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionObject]
  }
  @scala.inline
  implicit class SolutionObjectOps[Self <: SolutionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOM(value: IXMLDOMDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotSolutionObject_typekey(value: SolutionObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.SolutionObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PackageURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

