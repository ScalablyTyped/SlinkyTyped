package typingsSlinky.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Column settings inherit grid settings but overload the meaning of `data` to be specific to each column.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof handsontable.handsontable.Handsontable.GridSettings ]: P} & {[ P in 'data' ]: never} & {[x: string] : never, [x: number] : never}[keyof handsontable.handsontable.Handsontable.GridSettings] ]: handsontable.handsontable.Handsontable.GridSettings[P]} */ @js.native
trait ColumnSettings
  extends /**
  * Column and cell meta data is extensible, developers can add any properties they want.
  */
/* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[String | Double | ColumnDataGetterSetterFunction] = js.native
}

object ColumnSettings {
  @scala.inline
  def apply(): ColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSettings]
  }
  @scala.inline
  implicit class ColumnSettingsOps[Self <: ColumnSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | Double | ColumnDataGetterSetterFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

