package typingsSlinky.cliDashTable.cliDashTableMod

import typingsSlinky.cliDashTable.Anon_Border
import typingsSlinky.cliDashTable.cliDashTableStrings.`bottom-left`
import typingsSlinky.cliDashTable.cliDashTableStrings.`bottom-mid`
import typingsSlinky.cliDashTable.cliDashTableStrings.`bottom-right`
import typingsSlinky.cliDashTable.cliDashTableStrings.`left-mid`
import typingsSlinky.cliDashTable.cliDashTableStrings.`mid-mid`
import typingsSlinky.cliDashTable.cliDashTableStrings.`right-mid`
import typingsSlinky.cliDashTable.cliDashTableStrings.`top-left`
import typingsSlinky.cliDashTable.cliDashTableStrings.`top-mid`
import typingsSlinky.cliDashTable.cliDashTableStrings.`top-right`
import typingsSlinky.cliDashTable.cliDashTableStrings.bottom
import typingsSlinky.cliDashTable.cliDashTableStrings.left
import typingsSlinky.cliDashTable.cliDashTableStrings.mid
import typingsSlinky.cliDashTable.cliDashTableStrings.middle
import typingsSlinky.cliDashTable.cliDashTableStrings.right
import typingsSlinky.cliDashTable.cliDashTableStrings.top
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var chars: Partial[
    Record[
      top | `top-mid` | `top-left` | `top-right` | bottom | `bottom-mid` | `bottom-left` | `bottom-right` | left | `left-mid` | mid | `mid-mid` | right | `right-mid` | middle, 
      String
    ]
  ]
  var colAligns: js.Array[left | middle | right]
  var colWidths: js.Array[Double]
  var colors: Boolean
  var head: js.Array[String]
  var style: Partial[Anon_Border]
  var truncate: String
}

object TableOptions {
  @scala.inline
  def apply(
    chars: Partial[
      Record[
        top | `top-mid` | `top-left` | `top-right` | bottom | `bottom-mid` | `bottom-left` | `bottom-right` | left | `left-mid` | mid | `mid-mid` | right | `right-mid` | middle, 
        String
      ]
    ],
    colAligns: js.Array[left | middle | right],
    colWidths: js.Array[Double],
    colors: Boolean,
    head: js.Array[String],
    style: Partial[Anon_Border],
    truncate: String
  ): TableOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableOptions]
  }
}

