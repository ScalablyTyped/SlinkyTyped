package typingsSlinky.fortawesomeFontawesomeSvgCore.mod

import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconLookup
import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconName
import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconName
  - js.Tuple2[
typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconPrefix, 
typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconName]
  - typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconLookup
*/
trait IconProp extends js.Object

object IconProp {
  @scala.inline
  implicit def apply(value: IconLookup): IconProp = value.asInstanceOf[IconProp]
  @scala.inline
  implicit def apply(value: IconName): IconProp = value.asInstanceOf[IconProp]
  @scala.inline
  implicit def apply(value: js.Tuple2[IconPrefix, IconName]): IconProp = value.asInstanceOf[IconProp]
}

