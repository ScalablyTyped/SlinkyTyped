package typingsSlinky.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXEntityResolver interface */
@js.native
trait IVBSAXEntityResolver extends js.Object {
  @JSName("MSXML2.IVBSAXEntityResolver_typekey")
  var MSXML2DotIVBSAXEntityResolver_typekey: IVBSAXEntityResolver = js.native
  /** Allow the application to resolve external entities. */
  def resolveEntity(strPublicId: String, strSystemId: String): js.Any = js.native
}

object IVBSAXEntityResolver {
  @scala.inline
  def apply(
    MSXML2DotIVBSAXEntityResolver_typekey: IVBSAXEntityResolver,
    resolveEntity: (String, String) => js.Any
  ): IVBSAXEntityResolver = {
    val __obj = js.Dynamic.literal(resolveEntity = js.Any.fromFunction2(resolveEntity))
    __obj.updateDynamic("MSXML2.IVBSAXEntityResolver_typekey")(MSXML2DotIVBSAXEntityResolver_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXEntityResolver]
  }
  @scala.inline
  implicit class IVBSAXEntityResolverOps[Self <: IVBSAXEntityResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSXML2DotIVBSAXEntityResolver_typekey(value: IVBSAXEntityResolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSXML2.IVBSAXEntityResolver_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveEntity(value: (String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveEntity")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

