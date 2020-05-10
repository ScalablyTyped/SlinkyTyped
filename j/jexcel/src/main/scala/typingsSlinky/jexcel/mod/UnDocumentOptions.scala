package typingsSlinky.jexcel.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnDocumentOptions extends js.Object {
  var footers: js.UndefOr[
    js.Array[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ title in string | number ]: jexcel.jexcel.CellValue}
    */ typingsSlinky.jexcel.jexcelStrings.UnDocumentOptions with TopLevel[js.Any]) | js.Array[CellValue]
    ]
  ] = js.native
}

object UnDocumentOptions {
  @scala.inline
  def apply(): UnDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnDocumentOptions]
  }
  @scala.inline
  implicit class UnDocumentOptionsOps[Self <: UnDocumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooters(
      value: js.Array[
          (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ title in string | number ]: jexcel.jexcel.CellValue}
      */ typingsSlinky.jexcel.jexcelStrings.UnDocumentOptions with TopLevel[js.Any]) | js.Array[CellValue]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footers")(js.undefined)
        ret
    }
  }
  
}

