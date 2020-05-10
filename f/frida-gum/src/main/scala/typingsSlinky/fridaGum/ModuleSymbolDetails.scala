package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleSymbolDetails extends js.Object {
  /**
    * Absolute address.
    */
  var address: NativePointer = js.native
  /**
    * Whether symbol is globally visible.
    */
  var isGlobal: Boolean = js.native
  /**
    * Symbol name.
    */
  var name: String = js.native
  /**
    * Which section this symbol resides in, if available.
    */
  var section: js.UndefOr[ModuleSymbolSectionDetails] = js.native
  /**
    * Size in bytes, if available.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * The kind of symbol.
    */
  var `type`: ModuleSymbolType = js.native
}

object ModuleSymbolDetails {
  @scala.inline
  def apply(address: NativePointer, isGlobal: Boolean, name: String, `type`: ModuleSymbolType): ModuleSymbolDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isGlobal = isGlobal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSymbolDetails]
  }
  @scala.inline
  implicit class ModuleSymbolDetailsOps[Self <: ModuleSymbolDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ModuleSymbolType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSection(value: ModuleSymbolSectionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

