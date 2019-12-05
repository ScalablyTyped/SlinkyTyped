package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`1`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.keyword
import typingsSlinky.colorDashConvert.conversionsMod.KEYWORD
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkeyword extends js.Object {
  val channels: `1`
  val labels: js.Array[keyword]
  def rgb(keyword: KEYWORD): RGB
}

object Typeofkeyword {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[keyword], rgb: KEYWORD => RGB): Typeofkeyword = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofkeyword]
  }
}

