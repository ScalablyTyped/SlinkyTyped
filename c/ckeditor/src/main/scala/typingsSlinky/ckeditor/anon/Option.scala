package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.htmlParser.rule
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.ruleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var option: ruleOptions
  var priority: Double
  var value: rule
}

object Option {
  @scala.inline
  def apply(option: ruleOptions, priority: Double, value: rule): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

