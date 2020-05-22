package typingsSlinky.ipp.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintJobRequest extends js.Object {
  var data: Buffer
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  var `operation-attributes-tag`: typingsSlinky.ipp.anon.Compression
}

object PrintJobRequest {
  @scala.inline
  def apply(
    data: Buffer,
    `operation-attributes-tag`: typingsSlinky.ipp.anon.Compression,
    `job-attributes-tag`: JobTemplateAttributes = null
  ): PrintJobRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    if (`job-attributes-tag` != null) __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobRequest]
  }
}

