package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugSymbol extends js.Object {
  /**
    * Address that this symbol is for.
    */
  var address: NativePointer = js.native
  /**
    * File name owning this symbol, or `null` if unknown.
    */
  var fileName: String | Null = js.native
  /**
    * Line number in `fileName`, or `null` if unknown.
    */
  var lineNumber: Double | Null = js.native
  /**
    * Module name owning this symbol, or `null` if unknown.
    */
  var moduleName: String | Null = js.native
  /**
    * Name of the symbol, or `null` if unknown.
    */
  var name: String | Null = js.native
}

object DebugSymbol {
  @scala.inline
  def apply(address: NativePointer): DebugSymbol = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSymbol]
  }
  @scala.inline
  implicit class DebugSymbolOps[Self <: DebugSymbol] (val x: Self) extends AnyVal {
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
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(null)
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(null)
        ret
    }
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

