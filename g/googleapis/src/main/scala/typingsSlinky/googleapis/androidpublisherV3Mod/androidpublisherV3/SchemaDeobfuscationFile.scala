package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a deobfuscation file.
  */
@js.native
trait SchemaDeobfuscationFile extends js.Object {
  /**
    * The type of the deobfuscation file.
    */
  var symbolType: js.UndefOr[String] = js.native
}

object SchemaDeobfuscationFile {
  @scala.inline
  def apply(): SchemaDeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFile]
  }
  @scala.inline
  implicit class SchemaDeobfuscationFileOps[Self <: SchemaDeobfuscationFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSymbolType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(js.undefined)
        ret
    }
  }
  
}

