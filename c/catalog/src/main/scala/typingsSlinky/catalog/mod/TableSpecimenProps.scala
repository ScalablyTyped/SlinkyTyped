package typingsSlinky.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableSpecimenProps extends js.Object {
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var rows: js.Array[StringDictionary[TagMod[Any]]]
}

object TableSpecimenProps {
  @scala.inline
  def apply(rows: js.Array[StringDictionary[TagMod[Any]]], columns: js.Array[String] = null): TableSpecimenProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSpecimenProps]
  }
}

