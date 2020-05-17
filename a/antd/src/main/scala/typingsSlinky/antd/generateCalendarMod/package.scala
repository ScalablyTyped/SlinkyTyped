package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object generateCalendarMod {
  type HeaderRender[DateType] = js.Function1[
    /* config */ typingsSlinky.antd.anon.OnChange[DateType], 
    slinky.core.TagMod[scala.Any]
  ]
  type InjectDefaultProps[Props] = (typingsSlinky.std.Omit[
    Props, 
    typingsSlinky.antd.antdStrings.locale | typingsSlinky.antd.antdStrings.generateConfig | typingsSlinky.antd.antdStrings.prevIcon | typingsSlinky.antd.antdStrings.nextIcon | typingsSlinky.antd.antdStrings.superPrevIcon | typingsSlinky.antd.antdStrings.superNextIcon
  ]) with typingsSlinky.antd.anon.Locale
}
