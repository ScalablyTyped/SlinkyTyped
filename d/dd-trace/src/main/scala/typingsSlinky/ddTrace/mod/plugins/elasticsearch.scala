package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [elasticsearch](https://github.com/elastic/elasticsearch-js) module.
  */
@js.native
trait elasticsearch
  extends Integration
     with Analyzable

object elasticsearch {
  @scala.inline
  def apply(): elasticsearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[elasticsearch]
  }
}

