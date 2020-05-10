package typingsSlinky.lodashDecorators.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceChainData extends js.Object {
  var fns: js.Array[js.Function] = js.native
  var isGetter: Boolean = js.native
  var isMethod: Boolean = js.native
  var isProperty: Boolean = js.native
  var isSetter: Boolean = js.native
  var properties: js.Array[String] = js.native
}

object InstanceChainData {
  @scala.inline
  def apply(
    fns: js.Array[js.Function],
    isGetter: Boolean,
    isMethod: Boolean,
    isProperty: Boolean,
    isSetter: Boolean,
    properties: js.Array[String]
  ): InstanceChainData = {
    val __obj = js.Dynamic.literal(fns = fns.asInstanceOf[js.Any], isGetter = isGetter.asInstanceOf[js.Any], isMethod = isMethod.asInstanceOf[js.Any], isProperty = isProperty.asInstanceOf[js.Any], isSetter = isSetter.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceChainData]
  }
  @scala.inline
  implicit class InstanceChainDataOps[Self <: InstanceChainData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFns(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGetter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSetter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

