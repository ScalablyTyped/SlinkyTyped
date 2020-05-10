package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.dojo.dijit.PaletteMixin.Dye
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPaletteMixin extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_PaletteMixin.__Dye.html
    *
    * Interface for the JS Object associated with a palette cell (i.e. DOMNode)
    * 
    * @param alias     
    * @param row     
    * @param col     
    */
  var __Dye: Instantiable3[/* alias */ String, /* row */ js.Any, /* col */ js.Any, Dye] = js.native
}

object TypeofPaletteMixin {
  @scala.inline
  def apply(__Dye: Instantiable3[/* alias */ String, /* row */ js.Any, /* col */ js.Any, Dye]): TypeofPaletteMixin = {
    val __obj = js.Dynamic.literal(__Dye = __Dye.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaletteMixin]
  }
  @scala.inline
  implicit class TypeofPaletteMixinOps[Self <: TypeofPaletteMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__Dye(value: Instantiable3[/* alias */ String, /* row */ js.Any, /* col */ js.Any, Dye]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__Dye")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

